package com.lpc.module1.mapper;

import com.lpc.module1.model.User;
import com.lpc.module1.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @package:com.lpc.module1.mapper
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

public interface UserMapper extends MyMapper {

    int ifNullByPrimaryKey(String id);

    int ifNullByPrimaryKeyAndPass(@Param("id") String id,@Param("pass") String pass);

    int updatePassByIdAndOldPass(@Param("id") String id,@Param("oldPass") String oldPass,@Param("newPass") String newPass);


}