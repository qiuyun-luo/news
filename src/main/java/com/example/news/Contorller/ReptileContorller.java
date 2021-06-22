package com.example.news.Contorller;

import com.example.news.Pojo.News;
import com.example.news.Pojo.Reptile;
import com.example.news.Reptile.JsoupTest;
import com.example.news.Service.ReptileService;
import com.example.news.Vo.NewsVo;
import com.example.news.Vo.SysResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@Api("外站新闻管理")
@RequestMapping("reptile")
public class ReptileContorller {
    @Autowired
    ReptileService reptileService;
    @GetMapping("insterReptile")
    public void insterReptile() throws IOException {
       /* List<Reptile> reptiles=JsoupTest.jsoupTest();
        for(Reptile reptile:reptiles) {
            reptileService.inster(reptile);
        }*/
    }
    @GetMapping("/getReptile")
    public SysResult getNews(Reptile reptile){

        return SysResult.success(null);
    }
    @DeleteMapping("/deleteReptile")
    @Transactional
    public SysResult deleteNews(Integer id){
        return SysResult.success(null);
    }
    @GetMapping("index")
    public SysResult index(String type){
        return SysResult.success(null);
    }
    @GetMapping("reptileList")
    public SysResult reptileList(){
        return SysResult.success(null);
    }
}
