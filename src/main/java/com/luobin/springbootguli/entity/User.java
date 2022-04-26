package com.luobin.springbootguli.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.objenesis.instantiator.perc.PercInstantiator;

import java.util.Date;

/**
 * @author Doraemon
 * @date 2022/4/26 4:40 下午
 * @version 1.0
 */
@Data
public class User {
    // 配置的主键自增的算法，可以自己配置 mybatis plus 默认使用的是雪花算法，设置记录的唯一 id
    /**
     * AUTO : 自动增加
     * IdType 后面选择不同的方式，使用不同的策略即可
     * ID_WORKER mybatis plus 自己携带的雪花算法，进行的 id 的计算
     *
     * 上面是主键的几种使用策略
     */
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private String name;
    private  Integer age;
    private String email;

    /**
     * 使用注解的形式，实现字段的自动填充
     */
    @TableField(fill = FieldFill.INSERT) // 自动对字段进行填充
    private Date creatTime;

    @TableField(fill = FieldFill.UPDATE) // 自动的对字段进行填充的下一种形式
    private Date updateTime;
}
