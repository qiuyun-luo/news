package com.example.news.Pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@TableName("advertisement")
public class Advertisement {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String src;
    private Date date;
    private String img;
}
