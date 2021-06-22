package com.example.news.Pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("notice")
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
     private Integer id;
     private Integer user_id;
     private String notice_content;
     private Integer status;
}
