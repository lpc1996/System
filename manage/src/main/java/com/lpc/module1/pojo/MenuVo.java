package com.lpc.module1.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * @package:com.lpc.module1.pojo
 * @Author:旁观者
 * @Date:2022/5/5-20:08
 * @By:IntelliJ IDEA
 * @FileName:MenuVo.java
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuVo {

    private Long id;

    private Long pid;

    private String title;

    private String icon;

    private String href;

    private String target;

    private List<MenuVo> child;
}
