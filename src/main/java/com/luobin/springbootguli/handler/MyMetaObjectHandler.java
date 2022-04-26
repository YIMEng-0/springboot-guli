package com.luobin.springbootguli.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Doraemon
 * @date 2022/4/26 5:37 下午
 * @version 1.0
 */
// 为了达到自动填充字段数据的第二部，实现了 MetaObjectHandler 这个类
@Component // 将这个类交给 Spring 进行管理，对象的创建以及对象的管理，不需要关心，减少耦合度
public class MyMetaObjectHandler implements MetaObjectHandler {
    // 当 mp 执行 Insert 操作的时候，这个方法就会执行
    @Override
    public void insertFill(MetaObject metaObject) {
        // 元数据：关于数据的数据，表中的数据是各种数字，表的名字，表的字段就是一种元数据，描述数据的数据
        this.setFieldValByName("creatTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    // mp 执行修改的时候，这个方法就会执行
    @Override
    public void updateFill(MetaObject metaObject) {
        // 创建的时间不需要自动的填充，只是修改的时间需要填充即可
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
