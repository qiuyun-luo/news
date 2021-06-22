package com.example.news.Pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Accessors(chain = true)
@TableName("news")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String title;
    private String htmltext;
    private Date  date;
    private String img;
    private Integer news_number;
    private Integer status;
    private Integer user_id;
}
