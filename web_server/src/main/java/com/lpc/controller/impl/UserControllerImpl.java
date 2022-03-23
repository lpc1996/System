package com.lpc.controller.impl;

import com.lpc.controller.UserController;
import com.lpc.model.Archive;
import com.lpc.model.User;
import com.lpc.pojo.UpdatePassForm;
import com.lpc.pojo.UserForm;
import com.lpc.service.impl.UserServiceImpl;
import com.lpc.util.RandomCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
@RequestMapping(value = "/user")
@SessionAttributes(types = {User.class},value = {"user"})
public class UserControllerImpl implements UserController {

    private UserServiceImpl userService;
    private CookieController cookieController;

    public UserControllerImpl(UserServiceImpl userService,CookieController cookieController) {
        this.userService = userService;
        this.cookieController = cookieController;
    }

    /**
     * 登录验证
     * @param userForm
     * @param response
     * @param request
     * @return
     */
    @RequestMapping(value = "/check",method = RequestMethod.POST)
    @Override
    public ModelAndView check(ModelAndView view,UserForm userForm, HttpServletResponse response, HttpServletRequest request,Model model) {
        HttpSession session = request.getSession();
        if(!RandomCodeUtil.checkCode(userForm.getRandomCode())){
            session.setAttribute("errMsg","验证码错误");
        }else if(!userService.login(userForm.getUserName(),userForm.getPassword())){
            session.setAttribute("errMsg","登陆失败，用户名或密码错误");
        }else{
            User user = userService.getUser(userForm.getUserName());
            model.addAttribute("user",user);
            cookieController.addCookie(response,"userId",user.getId());
            cookieController.addCookie(response,"userName",user.getName());
//            view.setView(new RedirectView("/index"));
            view.setViewName("index");
            return view;
        }
        view.setViewName("user/login");
//        view.setView(new RedirectView("/user/login"));
        return view;
    }


    @Override
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(ModelAndView view,Model model) {
        view.setViewName("user/login");
        return view;
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    @Override
    public ModelAndView logout(ModelAndView view,HttpServletResponse response, HttpServletRequest request,Model model) {
        cookieController.delCookie(request,response,"userId");
        cookieController.delCookie(request,response,"userName");
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        view.setViewName("user/login");
        return view;
    }

    /**
     * 生成验证码，并返回客户端
     * @param response
     * @param session
     */
    @RequestMapping(value="/getRandomImage",method = RequestMethod.GET)
    @Override
    public void getRandomImage(HttpServletResponse response, HttpSession session) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        String code = RandomCodeUtil.drawImage(output);
        session.setAttribute("randomCodeImage",code);
        System.out.println("randomCode:"+code);
        try{
            ServletOutputStream out = response.getOutputStream();
            output.writeTo(out);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    @RequestMapping(value = "/updatePass",method = RequestMethod.GET)
    public ModelAndView updatePass(ModelAndView view,Model model) {
        view.setViewName("user/updatePass");
        return view;
    }

    /**
     * 修改密码
     * @param updatePassForm
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/checkNewPass",method = RequestMethod.POST)
    @Override
    public ModelAndView checkNewPass(ModelAndView view,UpdatePassForm updatePassForm, HttpServletRequest request, Model model) {
        if(!userService.updatePass(updatePassForm.getUserId(),updatePassForm.getOldPassword(),updatePassForm.getNewPassword())){
            model.addAttribute("errMsg","修改密码失败，请确认您输入的旧密码正确！");
            view.setViewName("user/updatePass");
            return view;
        }
        view.setViewName("user/login");
        return view;
    }

    @RequestMapping(value = "/personalInfo",method = RequestMethod.GET)
    @Override
    public ModelAndView personalInfo(ModelAndView view,HttpServletResponse response, HttpServletRequest request,Model model) {
        HttpSession session = request.getSession();
        Archive archive = userService.getArchive(((User)session.getAttribute("user")).getId());
        view.addObject("archive",archive);
        view.setViewName("user/personalInfo");
        return view;
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @Override
    public String updateUser(User user, HttpServletResponse response, HttpServletRequest request, Model model) {
        System.out.println(user.getName());
        if(user.getName() != null){
            HttpSession session = request.getSession();
            if(userService.updateUser(user)){
                cookieController.editCookie(request,response,"userName",user.getName());
                session.removeAttribute("user");
                session.setAttribute("user",user);
//                return sessionUser.getName();
            }
        }
        return "user/personalInfo";
    }

    @RequestMapping(value="/accountSetting")
    @Override
    public ModelAndView accountSettings(ModelAndView view,HttpServletResponse response, HttpServletRequest request, Model model) {
        view.setViewName("user/accountSettings");
        return view;
    }
}
