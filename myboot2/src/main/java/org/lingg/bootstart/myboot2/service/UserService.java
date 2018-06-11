package org.lingg.bootstart.myboot2.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lingg.bootstart.myboot2.mapper.UserMapper;
import org.lingg.bootstart.myboot2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String helloUserByUserId(Integer userId){
        User user = userMapper.selectByPrimaryKey(userId);
        return "hello"+user.toString();
    }

    public PageInfo<User> listAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo result = new PageInfo(users);
        return result;
    }
}
