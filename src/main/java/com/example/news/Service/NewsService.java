package com.example.news.Service;

import com.example.news.Pojo.News;

public interface NewsService {
    int insterNews(News news);
    News selectNews(Integer id);
}
