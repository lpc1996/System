package com.lpc.ui.swing.impl;

import com.lpc.client.impl.UserClientImpl;
import com.lpc.config.Config;
import com.lpc.config.Current;
import com.lpc.config.impl.CurrentImpl;
import com.lpc.ui.swing.LoginWindow;
import com.lpc.util.SpringUtil;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @author 濃霧-遠方
 * @date 2021/11/22
 */
public class LoginWindowImpl implements LoginWindow {
    private JFrame loginJFrame;
    private JTextField userNameField;
    private JPasswordField passField;
    private JCheckBox rememberPass;
    private JCheckBox autoLogin;
    private JCheckBox safe;

    public LoginWindowImpl() {
        if (loginJFrame == null || loginJFrame.isDisplayable() ){
            showFrame();
            initData();
        }else{
            loginJFrame.repaint();
        }
    }

    public void showFrame(){
        //创捷窗体对象
        loginJFrame = new JFrame();
        loginJFrame.setTitle("登陆界面");
        loginJFrame.setSize(400,350);
        //设置退出进程的方法
        loginJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //退出进程有四种方法，大家可以按住ctrl，鼠标点击类名或方法名进行查看哦~
        loginJFrame.setResizable(false);
        //设置居中显示
        loginJFrame.setLocationRelativeTo(null);

        //流式布局管理器
        FlowLayout flow = new FlowLayout();
        loginJFrame.setLayout(flow);
        //图片
        ImageIcon image = new ImageIcon("E:\\Atrax-Desktop(Bitcoin)\\0000.jpg");
        //标签
        JLabel jla = new JLabel(image);
        //标签大小的对象
        Dimension dm1 = new Dimension(400,100);
        jla.setPreferredSize(dm1);
        //添加标签
        loginJFrame.add(jla);

        //空格回车
        JLabel huiche = new JLabel();
        Dimension dd = new Dimension(400, 50);
        huiche.setPreferredSize(dd);
        huiche.setBorder(BorderFactory.createLineBorder(Color.RED));
        //除了JFrame，其他显示都可以用这个函数呢！！！
        loginJFrame.add(huiche);

        //账号
        JLabel userNameLabel = new JLabel("用户名：");
        Dimension labelDimension = new Dimension(60,30);
        userNameLabel.setPreferredSize(labelDimension);
        loginJFrame.add(userNameLabel);

        //文本框
        userNameField = new JTextField();
        Dimension dm2 = new Dimension(250, 30);
        //除了JFrame 其他组件都可以用这个方法
        userNameField.setPreferredSize(dm2);
        loginJFrame.add(userNameField);

        //注册账号
        JLabel zhuce = new JLabel("注册账号");
        loginJFrame.add(zhuce);

        //密码
        JLabel passLabel = new JLabel("密码：");
        passLabel.setPreferredSize(labelDimension);

        loginJFrame.add(passLabel);

        //文本框
        passField = new JPasswordField();
        Dimension dm3 = new Dimension(250, 30);
        //除了JFrame 其他组件都可以用这个方法
        passField.setPreferredSize(dm3);
        loginJFrame.add(passField);

        //找回密码
        JLabel zhaohui = new JLabel("找回密码");
        loginJFrame.add(zhaohui);

        //复选框
        rememberPass = new JCheckBox("记住密码");
        autoLogin = new JCheckBox("自动登陆");
        safe = new JCheckBox("安全模式");
        loginJFrame.add(rememberPass);
        loginJFrame.add(autoLogin);
        loginJFrame.add(safe);

        //按钮
        JButton submitBtn = new JButton("登录");
        submitBtn.addActionListener(e-> {
            login();
        });
        submitBtn.setPreferredSize(dm2);
        loginJFrame.add(submitBtn);

    }

    @Override
    public void setVisible(boolean visible) {
        loginJFrame.setVisible(visible);
    }

    public void initData(){
        rememberPass.setSelected(Config.getIfRememberPass());
        if(Config.getIfRememberPass()){
            String[] arr = Config.getUserNameAndPass();
            userNameField.setText(arr[0]);
            passField.setText(arr[1]);
        }
    }

    private void login(){
        String userName = userNameField.getText();
        String pass = new String(passField.getPassword());
        try {
            ApplicationContext context = SpringUtil.getApplicationContext();
            UserClientImpl userClient = (UserClientImpl) context.getBean("userClientImpl");
            if(userClient.checkPass(userName,pass)){
                JOptionPane.showMessageDialog(null,"登陆成功");
                Current current = context.getBean("currentImpl", CurrentImpl.class);
                current.setCurrentUSer(userClient.getUser(userName));

                boolean isRememberPass = rememberPass.isSelected();
                if(isRememberPass != Config.getIfRememberPass()){
                    Config.setIfRememberPass(isRememberPass);
                    if(isRememberPass){
                        Config.setUserNameAndPass(userName,pass);

                    }
                }

                MainWindowImpl mainWindow = (MainWindowImpl) context.getBean("mainWindowImpl");
                mainWindow.setVisible(true);
                loginJFrame.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"登陆失败");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

}
