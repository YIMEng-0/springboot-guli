package com.luobin.springbootguli.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luobin.springbootguli.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Doraemon
 * @date 2022/4/26 4:43 下午
 * @version 1.0
 */

/**
 *  在 mybatis 里面，重要的是映射器，映射器整体使用 interface 以及 xml 配置或者注解组成，
 *  interface 为了创建
 */
// 关于这个接口实例化的对象在 Spring 里面的配置文件中 Mybatis MapperScannerConfigurer 自动扫描
// 将Mapper接口生成代理注入到 Spring ，方便在后面对于这个 mapper 对象里面的方法的调用
// 因为这是 mp ，继承了 BaseMapper 直接继承过来所有的增删改查的方法；
// 本质上 mapper 映射文件有 xml 以及 接口文件，接口文件在 Java 层面当做对象调用方法， xml 和数据库打交道
@Component // Spring 会在这里创建出来一个 UserMapper 对象，在测试的时候进行注入
public interface UserMapper extends BaseMapper<User> {
    // BaseMapper 里面是有一些增删改查的相关方法的；
}

/**
 * 普通的 JDBC 代码的执行流程是：
 *  1、加载数据库驱动
 *  2、连接数据库
 *  3、创建 sql 的执行环境
 *  4、执行相关的 SQL 语句
 *  5、得到查询结果的数据集合
 *  6、关闭数据库
 */
