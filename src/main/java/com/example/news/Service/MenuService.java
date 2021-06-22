package com.example.news.Service;

import com.example.news.Pojo.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu(String status);
}
