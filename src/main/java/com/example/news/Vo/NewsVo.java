package com.example.news.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.web.multipart.MultipartFile;
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class NewsVo {
    public Integer id;
    public String title;
    public MultipartFile file;
}
