package com.lpc.mybatis.mapper;
import java.util.List;

import com.lpc.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface UserMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(String id);

    /**
     * 查询数据库的所有数据
     * @return
     */
    List<User> selectAll();

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
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);

    int updatePassByIdAndOldPass(@Param("id") String id,@Param("oldPass") String oldPass,@Param("newPass") String newPass);
}