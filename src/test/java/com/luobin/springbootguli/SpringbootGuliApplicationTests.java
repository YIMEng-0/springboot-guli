package com.luobin.springbootguli;

import com.luobin.springbootguli.entity.User;
import com.luobin.springbootguli.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootGuliApplicationTests {

    @Test
    void contextLoads() {
    }

    // 多态的一种体现，直接使用接口的引用指向具体实现对象
    // userMapper 存在的价值就是调用相关的操作数据库的方法，将数据存储到数据库中
    @Autowired
    private UserMapper userMapper;


    /**
     * 查询 User 里面的所有数据
     */
    @Test
    public void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }

    /**
     * 添加一个用户的操作
     */
    @Test
    public void addUser() {
        User user = new User();
        user.setAge(100);
        user.setEmail("test@163.com");
        user.setName("Jack112");

        // insert 可以返回变化的行数
        int insert =  userMapper.insert(user);
        System.out.println("==============*****============");
        System.out.println(insert);
    }

    /**
     *  mp 实现修改操作
     */
    @Test
    public void update() {
        User user = new User();
        user.setId(2L);
        user.setAge(120);

       int updateRow =  userMapper.updateById(user);
        System.out.println(updateRow);
    }
}
