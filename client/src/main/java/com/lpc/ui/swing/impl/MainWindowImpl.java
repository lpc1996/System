package com.lpc.ui.swing.impl;

import com.lpc.client.AuthorityClient;
import com.lpc.client.impl.AuthorityClientImpl;
import com.lpc.config.Current;
import com.lpc.model.Menu;
import com.lpc.ui.swing.MainWindow;
import com.lpc.util.SpringUtil;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/23
 */
public class MainWindowImpl extends JFrame implements MainWindow {

    public MainWindowImpl(){

        setTitle("校园管理系统");
        setSize(800,600);
        setMinimumSize(new Dimension(800,600));
        //设置退出进程的方法
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //退出进程有四种方法，大家可以按住ctrl，鼠标点击类名或方法名进行查看哦~
        setResizable(false);
        //设置居中显示
        setLocationRelativeTo(null);

        setJMenuBar(createJMenuBar() );
        
        pack();

//        createContentPane();
    }

    public JMenuBar createJMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        ApplicationContext context = SpringUtil.getApplicationContext();
        AuthorityClient authorityClient = context.getBean("authorityClientImpl", AuthorityClientImpl.class);
        List<Menu> menuList = authorityClient.getMenuByUser(context.getBean("currentImpl",Current.class).getCurrentUser().getId());
        for(Menu menu:menuList){
            if(menu.getLevel() == 1){
                JMenu jMenu = new JMenu(menu.getName());
                for(Menu menu1:menuList){
                    if (menu1.getLevel() == 2 && menu1.getParentId().equals(menu.getId()) ){
                        JMenuItem jMenuItem = new JMenuItem();
                        jMenuItem.setText(menu1.getName());
                        jMenuItem.addActionListener(e -> {
                            JPanel jpanel = (JPanel)context.getBean(menu1.getMenuCode());
                            setContentPane(jpanel);
                            validate();
                        });
                        jMenu.add(jMenuItem);
                    }
                }
                jMenu.repaint();
                menuBar.add(jMenu);
            }
        }
        return menuBar;
    }

    public void createContentPane(){
//        "dictPanelImpl",DictPanelImpl.class
        setContentPane((DictPanelImpl)SpringUtil.getApplicationContext().getBean("dictPanelImpl"));
    }

    @Override
    public void showWindow() {

    }
}
