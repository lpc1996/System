package com.lpc.module1.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.SysDictMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

@Service
@Transactional
public class SysDictService{

    @Resource
    private SysDictMapper sysDictMapper;

}
