package com.lpc.module1.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @package:com.lpc.module1.configure
 * @Author:旁观者
 * @Date:2022/5/5-17:42
 * @By:IntelliJ IDEA
 * @FileName:ThymeleafConfigure.java
 */
@Component
public class ThymeleafConfigure implements WebMvcConfigurer {

    @Resource(name="thymeleafViewResolver")
    private ThymeleafViewResolver thymeleafViewResolver;

    @Value("${rootUrl}")
    private String rootUrl = "school_manager";

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
        if (thymeleafViewResolver != null) {
            Map<String, Object> vars = new HashMap<>();
            vars.put("rootUrl",rootUrl);
            thymeleafViewResolver.setStaticVariables(vars);
        }
        WebMvcConfigurer.super.configureViewResolvers(registry);
    }
}
