package com.example.news.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.news.Mapper.MenuMapper;
import com.example.news.Pojo.Menu;
import com.example.news.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public List<Menu> getMenu(String status) {

        QueryWrapper<Menu> queryWrapper=new QueryWrapper<>();
        if(Objects.equals(status,"user")){
            queryWrapper.eq("level",3);
            return menuMapper.selectList(queryWrapper);
        }
        else if(Objects.equals(status,"author")){
            queryWrapper.gt("level",1);
            return menuMapper.selectList(queryWrapper);
        }
        else {
            return menuMapper.selectList(null);
        }

    }
}
