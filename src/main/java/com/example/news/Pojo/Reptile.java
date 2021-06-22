package com.example.news.Pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Accessors(chain = true)
@TableName("reptile")
@AllArgsConstructor
@NoArgsConstructor
public class Reptile {
    @TableId(type = IdType.AUTO)
    Integer id;
    String title;
    String link;
    String img;
    String news_summary;
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    Date date;
    String type;
}
