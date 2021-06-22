package com.example.news.Vo;

import com.example.news.Pojo.Advertisement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.web.multipart.MultipartFile;
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementVo {
    public Advertisement advertisement;
    public MultipartFile multipartFile;
}
