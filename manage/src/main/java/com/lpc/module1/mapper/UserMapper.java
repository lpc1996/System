package com.lpc.module1.mapper;

import com.lpc.module1.model.User;
import com.lpc.module1.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

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

    /**
     * 使用like的模糊查询
     * @param record
     * @return
     */
    List<User> selectWithLike(@Param("record") User record);

    /**
     * 获取like模糊查询的总数
     * @param record
     * @return
     */
    int selectCountWithLike(@Param("record") User record);
}