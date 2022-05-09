package com.lpc.module1.util;

import com.lpc.module1.pojo.MenuVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @package:com.lpc.module1.util
 * @Author:旁观者
 * @Date:2022/5/5-20:07
 * @By:IntelliJ IDEA
 * @FileName:TreeUtil.java
 */
public class TreeUtil {

    public static List<MenuVo> toTree(List<MenuVo> treeList,Long pid){
        List<MenuVo> retList = new ArrayList<MenuVo>();
        for (MenuVo parent : treeList) {
            if (pid.equals(parent.getPid())) {
                retList.add(findChildren(parent, treeList));
            }
        }
        return retList;
    }

    private static MenuVo findChildren(MenuVo parent, List<MenuVo> treeList) {
        for (MenuVo child : treeList) {
            if (parent.getId().equals(child.getPid())) {
                if (parent.getChild() == null) {
                    parent.setChild(new ArrayList<>());
                }
                parent.getChild().add(findChildren(child, treeList));
            }
        }
        return parent;
    }
}
