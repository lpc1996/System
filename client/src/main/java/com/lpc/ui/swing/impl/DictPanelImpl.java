package com.lpc.ui.swing.impl;

import com.lpc.ui.swing.DictPanel;

import javax.swing.*;

/**
 * @author 濃霧-遠方
 * @date 2021/11/24
 */
public class DictPanelImpl extends JPanel implements DictPanel {

    public DictPanelImpl(){
        initPane();
    }
    @Override
    public void initPane() {
        JLabel label = new JLabel("字典管理");
        add(label);
    }
}
