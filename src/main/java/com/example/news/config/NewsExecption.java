package com.example.news.config;

import com.example.news.Vo.SysResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NewsExecption {
    @ExceptionHandler(RuntimeException.class)
    public Object handler(Exception e){
        e.printStackTrace();
        return SysResult.success();
    }
}
