package com.lpc.ui.swing.impl;

import com.lpc.ui.swing.PersonInfoPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author 濃霧-遠方
 * @date 2021/11/23
 */
public class PersonInfoPanelImpl extends JPanel implements PersonInfoPanel {

    private JTabbedPane jTabbedPane;

    public PersonInfoPanelImpl(){

        initPane();
    }

    @Override
    public void initPane(){
        jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("账户信息",createAccountInfo());

        add(jTabbedPane);
    }

    /**
     * 创建账户信息面板
     * @return 返回一个JPanel对象
     */
    private JPanel createAccountInfo(){
        JPanel accountInfoPanel = new JPanel();
//        GroupLayout groupLayout = new GroupLayout();
//        accountInfoPanel.setLayout(groupLayout);
        return accountInfoPanel;
    }
}
