package com.example.news.Reptile;


import com.example.news.Pojo.Reptile;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsoupTest {
    @Test
    public static   List<Reptile> jsoupTest() throws IOException {//新浪电竞
        List<Reptile> reptiles=new ArrayList<>();
        Document document= Jsoup.connect("http://dj.sina.com.cn/information").get();//访问url获取html
        Element element=document.body();//获取body
        Elements elements=element.getElementsByClass("main_list_onepic");//获取对于class属性的标签元素

        URL url;//
        for(Element element1:elements){//循环便利标签元素

           Elements elements1=element1.getAllElements();//获取子标签
           String content=elements1.get(6).text();//获取子标签的text内容
           String title=elements1.get(4).text();
           String link=elements1.get(2).attr("href");//获取子标签href属性的值
           String img=elements1.get(3).attr("data-src");//获取子标签data-src属性的值

            url = new URL("http:"+img);//创建图片url
            URLConnection uri = url.openConnection();//链接图片url
            BufferedInputStream inputStream=new BufferedInputStream(uri.getInputStream());//获取图片流
            img=saveImg(url.getFile(),inputStream,"xldj");
            Reptile reptile=new Reptile();
            reptile.setImg(img);
            reptile.setLink(link);
            reptile.setTitle(title);
            reptile.setNews_summary(content);
            reptile.setDate(new Date());
            reptiles.add(reptile);

       }
        return reptiles;
    }
    @Test
    public static List<Reptile> jsoupTest2() throws IOException {//游民星空
        Document document= Jsoup.connect("https://www.gamersky.com/console/").get();
        Element element=document.body();
        Elements elements2=element.getElementsByClass("img");
        List<Reptile> reptiles=new ArrayList<>();
        URL url;
        for (int i=1;i<elements2.size();i++){
            Element element1=elements2.get(i);
            Elements str=element1.getAllElements();
            String link=str.attr("href");
            String img=str.attr("src");
            String title=str.attr("title");
            String content=str.attr("title");
            url = new URL(img);
            URLConnection uri = url.openConnection();
            BufferedInputStream inputStream=new BufferedInputStream(uri.getInputStream());
            img=saveImg(url.getFile(),inputStream,"ymxk");
            Reptile reptile=new Reptile();
            reptile.setImg(img);
            reptile.setLink(link);
            reptile.setTitle(title);
            reptile.setNews_summary(content);
            reptile.setDate(new Date());
            reptiles.add(reptile);
        }
      return reptiles;
    }
    public static String saveImg(String filepath, BufferedInputStream bufferedInputStream,String type) throws IOException {
        String[] file=filepath.split("/");
        String dirdate=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String folderpath="D:/newsweb1/img/rimg/"+type+"/"+dirdate;
        filepath=folderpath+"/"+file[file.length-1];
        File file1=new File(folderpath);
        if(!file1.exists()){
            file1.mkdirs();
        }
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream(new File(filepath)));//获取写入流

        int i=0;
        while((i=bufferedInputStream.read())!=-1){
            outputStream.write(i);//写入图片
        }
        bufferedInputStream.close();
        outputStream.close();
        return filepath;
    }

}
