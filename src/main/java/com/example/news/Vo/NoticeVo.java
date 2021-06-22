package com.example.news.Vo;

import com.example.news.Pojo.Notice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class NoticeVo {
    private Notice notice;
    private String userType;
}
