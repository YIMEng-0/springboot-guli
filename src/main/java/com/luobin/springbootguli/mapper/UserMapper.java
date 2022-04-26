package com.luobin.springbootguli.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luobin.springbootguli.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Doraemon
 * @date 2022/4/26 4:43 下午
 * @version 1.0
 */
@Component
public interface UserMapper extends BaseMapper<User> {
    // BaseMapper 里面是有一些增删改查的相关方法的；
}
