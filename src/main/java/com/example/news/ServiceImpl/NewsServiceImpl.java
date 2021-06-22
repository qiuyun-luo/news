package com.example.news.ServiceImpl;

import com.example.news.Mapper.NewsMapper;
import com.example.news.Pojo.News;
import com.example.news.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsMapper newsMapper;
    @Override
    public int insterNews(News news) {

        return  newsMapper.insert(news);
    }

    @Override
    public News selectNews(Integer id) {
        return newsMapper.selectById(id);
    }
}
