package com.example.news.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.news.Pojo.News;
import org.springframework.stereotype.Component;

import java.util.stream.BaseStream;
@Component
public interface NewsMapper extends BaseMapper<News> {

}
