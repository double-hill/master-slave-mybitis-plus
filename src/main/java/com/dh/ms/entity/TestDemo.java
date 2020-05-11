package com.dh.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WeiC
 * @date 2020/5/11 10:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_test")
public class TestDemo {
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id;
    @TableField("code")
    private String name1;
}
