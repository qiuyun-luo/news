package com.example.news.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class SysResult {
    private Integer status;
    private String msg;
    private Object data;
    public static SysResult success(){
        return new SysResult(201,"访问失败",null);
    }
    public static SysResult success(Integer status,String msg,Object object){return new SysResult(status,msg,object); }
    public static SysResult success(Object object){
        return new SysResult(200,"访问成功",object);
    }
    public static SysResult success(String msg,Object object){
        return new SysResult(200,msg,object);
    }
}
