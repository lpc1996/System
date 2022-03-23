package com.lpc.ui.swing.impl;

import com.lpc.ui.swing.UpdatePassPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author 濃霧-遠方
 * @date 2021/12/31
 */
public class UpdatePassPanelImpl extends JPanel implements UpdatePassPanel {

    private JTextField oldPassField;
    private JTextField newPassfield;
    private JTextField checkPassField;
    private JButton submitBtn;

    public UpdatePassPanelImpl(){
        initPane();
    }

    @Override
    public void initPane() {
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(140,getHeight()));
        centerPanel.setMinimumSize(new Dimension(140,getHeight()));
        this.setLayout(new BorderLayout(50,5));

        Dimension labelSize = new Dimension(80,30);
        Dimension fieldSize = new Dimension(120,30);
        JLabel oldPassLabel = new JLabel("旧密码：");
        oldPassLabel.setPreferredSize(labelSize);
        oldPassField = new JTextField();
        oldPassField.setPreferredSize(fieldSize);
        centerPanel.add(oldPassLabel);
        centerPanel.add(oldPassField);
        JLabel newPassLabel = new JLabel("新密码：");
        newPassLabel.setPreferredSize(labelSize);
        newPassfield = new JTextField();
        newPassfield.setPreferredSize(fieldSize);
        centerPanel.add(newPassLabel);
        centerPanel.add(newPassfield);
        JLabel checkPassLabel = new JLabel("重新输入");
        checkPassLabel.setPreferredSize(labelSize);
        checkPassField = new JTextField();
        checkPassField.setPreferredSize(fieldSize);
        centerPanel.add(checkPassLabel);
        centerPanel.add(checkPassField);

        submitBtn = new JButton("重置密码");
        submitBtn.setPreferredSize(new Dimension(centerPanel.getWidth()-2,30));
        centerPanel.add(submitBtn);

        centerPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        this.add(centerPanel,BorderLayout.CENTER);

    }
}
