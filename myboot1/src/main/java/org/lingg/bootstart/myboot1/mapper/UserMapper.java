package org.lingg.bootstart.myboot1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lingg.bootstart.myboot1.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}