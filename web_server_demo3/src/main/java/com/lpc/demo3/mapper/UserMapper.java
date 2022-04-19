package com.lpc.demo3.mapper;

import com.lpc.demo3.model.User;
import org.apache.ibatis.annotations.Param;


/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface UserMapper extends MyMapper {

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(@Param("record") User record,@Param("pass") String pass);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(@Param("record") User record,@Param("pass") String pass);

    /**
     * 检查用户名 id 是否存在
     * @param id
     * @return
     */
    int ifNullByPrimaryKey(String id);

    /**
     * 检查用户名和密码是否正确
     * @param id
     * @param pass
     * @return
     */
    int ifNullByPrimaryKeyAndPass(@Param("id") String id,@Param("pass") String pass);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(@Param("record") User record,@Param("pass") String pass);

    /**
     * 修改密码
     * @param id 用户Id
     * @param oldPass 旧密码
     * @param newPass 新密码
     * @return 返回受影响的行数
     */
    int updatePassByIdAndOldPass(@Param("id") String id,@Param("oldPass") String oldPass,@Param("newPass") String newPass);

    /**
     * 更新用户昵称
     * @param updatedName 新的昵称
     * @param id 用户ID
     * @return 返回受影响的行数
     */
    int updateNameById(@Param("updatedName")String updatedName,@Param("id")String id);

}