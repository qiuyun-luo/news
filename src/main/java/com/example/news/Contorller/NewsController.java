package com.example.news.Contorller;

import com.example.news.Pojo.News;
import com.example.news.Service.NewsService;
import com.example.news.Transformation.Doc_Html;
import com.example.news.Transformation.Html_String;
import com.example.news.Vo.NewsVo;
import com.example.news.Vo.SysResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "*")
@Api(value = "新闻管理a")
@RequestMapping("news")
public class NewsController {
    @Autowired
    NewsService newsService;
    @PostMapping("/newsUpload/{id}/{title}")
    @Transactional
    public SysResult newsUpload(MultipartFile file,Integer id,String title) throws IOException {
     /*   String string=Doc_Html.Word2007("BUG集.docx");
        String string1=Html_String.htmltoString(string);
        News news=new News();
        news.setTitle("BUG集");
        news.setHtmltext(string1);
        newsService.insterNews(news);*/
        return  SysResult.success(null);
    }
    @GetMapping("/getNews")
    public SysResult getNews(News news){

        return SysResult.success(null);
    }
    @DeleteMapping("/deleteNews")
    @Transactional
    public SysResult deleteNews(Integer id){
        return SysResult.success(null);
    }
    @PutMapping("updateNews")
    @Transactional
    public SysResult updateNews(NewsVo newsVo){
        return SysResult.success(null);
    }
    @GetMapping("index")
    public SysResult index(){
        return SysResult.success(null);
    }
    @GetMapping("newsList")
    public SysResult newList(){
        return SysResult.success(null);
    }
}
