package com.lpc.module2.model;

import java.util.Date;
import lombok.Data;

/**
* @package:com.lpc.module2.model
* @Author:旁观者
* @Date:2022/5/2-14:05
* @By:IntelliJ IDEA
* 系统菜单表
*/
@Data
public class SysMenu {
    /**
    * ID
    */
    private Integer id;

    /**
    * 父ID
    */
    private Integer pid;

    /**
    * 名称
    */
    private String title;

    /**
    * 菜单图标
    */
    private String icon;

    /**
    * 链接
    */
    private String href;

    /**
    * 链接打开方式
    */
    private String target;

    /**
    * 菜单排序
    */
    private Integer sort;

    /**
    * 状态(0:禁用,1:启用)
    */
    private Byte status;

    /**
    * 备注信息
    */
    private String remark;

    /**
    * 创建时间
    */
    private Date createAt;

    /**
    * 更新时间
    */
    private Date updateAt;

    /**
    * 删除时间
    */
    private Date deleteAt;
}