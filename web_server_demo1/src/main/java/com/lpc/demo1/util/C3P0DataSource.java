package com.lpc.demo1.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @author 濃霧-遠方
 * @date 2021/11/6
 */
public class C3P0DataSource  extends UnpooledDataSourceFactory {
    public C3P0DataSource() {
        this.dataSource = new ComboPooledDataSource();
    }
}
