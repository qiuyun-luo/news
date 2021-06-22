package com.example.news.Contorller;

import com.example.news.Pojo.Notice;
import com.example.news.Vo.NoticeVo;
import com.example.news.Vo.SysResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("notice")
@CrossOrigin
@Api("消息通知")
public class NoticeController {
    @GetMapping("getNotice/{id}")
    public SysResult getNotice(Integer id){
        return SysResult.success(null);
    }
    @PutMapping("updateNotice/{id}/{status}")
    public SysResult updateNotice(Notice notice){
        return SysResult.success(null);
    }
    @DeleteMapping("deleteNotice/{id}")
    public SysResult deleteNotice(Integer id){
        return SysResult.success(null);
    }
    @PostMapping("insterNotice")
    public SysResult insterNotice(Notice notice){
        return SysResult.success();
    }
    @PostMapping("insterNoticeAll")
    public  SysResult insterNoticeAll(NoticeVo noticeVo){
        return SysResult.success(null);
    }
}
