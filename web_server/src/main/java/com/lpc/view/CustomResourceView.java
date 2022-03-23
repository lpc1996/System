package com.lpc.view;


import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

public class CustomResourceView extends InternalResourceView {

    @Override
    public boolean checkResource(Locale locale) throws Exception {
//        File file=new File(this.getServletContext().getRealPath("/")+this.getUrl());
        return false;
    }
}
