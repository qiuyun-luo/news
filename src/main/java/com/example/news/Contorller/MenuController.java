package com.example.news.Contorller;

import com.example.news.Service.MenuService;
import com.example.news.Vo.SysResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api("导航栏")
public class MenuController {
    @Autowired
    MenuService menuService;
    @GetMapping("menu/{status}")
    public SysResult getMenu(String status){

        return SysResult.success(menuService.getMenu(status));
    }
}
