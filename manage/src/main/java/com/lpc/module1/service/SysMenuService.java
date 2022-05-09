package com.lpc.module1.service;

import com.lpc.module1.mapper.tk.SysMenuMapperTk;
import com.lpc.module1.model.SysMenu;
import com.lpc.module1.pojo.LayuiRespone;
import com.lpc.module1.pojo.MenuVo;
import com.lpc.module1.util.CommonParams;
import com.lpc.module1.util.TreeUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.SysMenuMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

@Service
@Transactional
public class SysMenuService{

    @Resource
    private SysMenuMapper sysMenuMapper;
    @Resource
    private SysMenuMapperTk sysMenuMapperTk;

    public LayuiRespone<SysMenu> getAllMenu(){
        List<SysMenu> menus = sysMenuMapperTk.selectAll();
        LayuiRespone<SysMenu> respone = new LayuiRespone<>();
        if(menus.size() > 0){
            respone.setCode(0);
            respone.setData(menus);
            respone.setMessage("成功");
            respone.setCount(sysMenuMapperTk.selectCount(null));
        }else{
            respone.setCount(400);
            respone.setData(null);
            respone.setMessage("无数据");
            respone.setCount(0);
        }
        return respone;
    }

    public Map<String,Object> init(String userName){
        Map<String, Object> map = new HashMap<>();
        Map<String,Object> home = new HashMap<>();
        Map<String,Object> logo = new HashMap<>();
        List<SysMenu> menuList = sysMenuMapper.selectByUserId(userName);
        List<MenuVo> menuInfo = new ArrayList<MenuVo>();
        for (SysMenu sMenu: menuList) {
            MenuVo menuVO = new MenuVo();
            menuVO.setId(sMenu.getId());
            menuVO.setPid(sMenu.getPid());
            menuVO.setHref(sMenu.getHref());
            menuVO.setTitle(sMenu.getTitle());
            menuVO.setIcon(sMenu.getIcon());
            menuVO.setTarget(sMenu.getTarget());
            menuInfo.add(menuVO);
        }
        map.put("menuInfo", TreeUtil.toTree(menuInfo, 0L));
        home.put("title","首页");
        home.put("href", CommonParams.ROOT_URL+"/welcome");//控制器路由,自行定义
        logo.put("title","校园管理系统");
        logo.put("image",CommonParams.ROOT_URL+"/static/img/logo.png");//静态资源文件路径,可使用默认的logo.png
        logo.put("href",CommonParams.ROOT_URL+"/index");
        map.put("homeInfo", home);
        map.put("logoInfo", logo);
        return map;
    }
}
