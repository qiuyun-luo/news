package com.example.news.Contorller;

import com.example.news.Pojo.News;
import com.example.news.Pojo.User;
import com.example.news.Service.UserService;
import com.example.news.Vo.NewsVo;
import com.example.news.Vo.SysResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
@Api("用户管理")
public class UserContorller {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public SysResult login(@RequestBody User user) {
        user = userService.userOne(user);
        return SysResult.success(user);
    }

    @DeleteMapping("/deleteUser")
    @Transactional
    public SysResult deleteNews(Integer id){
        return SysResult.success(null);
    }
    @PutMapping("updateUser")
    @Transactional
    public SysResult updateUser(User user){
        return SysResult.success(null);
    }

    @GetMapping("userList")
    public SysResult userList(){
        return SysResult.success(null);
    }
    @PostMapping("insterUser")
    public SysResult insterUser(User user){
        return SysResult.success(null);
    }
}
