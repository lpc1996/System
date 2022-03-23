package com.lpc;

import com.lpc.ui.swing.impl.LoginWindowImpl;
import com.lpc.util.SpringUtil;
import org.springframework.context.ApplicationContext;

/**
 * @author 濃霧-遠方
 * @date 2021/11/23
 */
public class Main {
    private static LoginWindowImpl loginWindow;

    public static void main(String[] args) {
        ApplicationContext context = SpringUtil.getApplicationContext();
        loginWindow = (LoginWindowImpl) context.getBean("loginWindowImpl");
        loginWindow.setVisible(true);
    }
}
