package com.lpc.mapper.impl;

import com.lpc.mapper.Mapper;
import com.lpc.mapper.UserMapper;
import com.lpc.model.User;
import lombok.Setter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
@Repository
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper, Mapper {

    @Autowired(required = false)
    @Qualifier("sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sessionTemplate){
        super.setSqlSessionTemplate(sessionTemplate);
    }

    @Override
    public UserMapper getMapper() {
        return getSqlSession().getMapper(UserMapper.class);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record,String pass) {
        return getMapper().insert(record,pass);
    }

    @Override
    public int insertSelective(User record,String pass) {
        return getMapper().insertSelective(record,pass);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public int ifNullByPrimaryKey(String id) {
        return getMapper().ifNullByPrimaryKey(id);
    }

    @Override
    public int ifNullByPrimaryKeyAndPass(String id, String pass) {
        return getMapper().ifNullByPrimaryKeyAndPass(id,pass);
    }

    @Override
    public int updateByPrimaryKeySelective(User record,String pass) {
        return getMapper().updateByPrimaryKeySelective(record,pass);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Override
    public int updatePassByIdAndOldPass(String id, String oldPass, String newPass) {
        return getMapper().updatePassByIdAndOldPass(id,oldPass,newPass);
    }

    @Override
    public int updateNameById(String updatedName, String id) {
        return getMapper().updateNameById(updatedName,id);
    }
}
