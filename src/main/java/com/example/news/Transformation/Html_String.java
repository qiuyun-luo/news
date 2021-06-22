package com.example.news.Transformation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Html_String {
    public static String htmltoString(String filepath) throws IOException {
        File file=new File(filepath);
        BufferedReader fileReader=new BufferedReader(new FileReader(file));
        StringBuilder str=new StringBuilder();
        char[] chars=new char[(int) file.length()];
        int i=0;
        while((i=fileReader.read(chars))!=-1){
            str.append(chars);
        }
        String str1=str.toString();
        str1=str1.replaceAll("D:/newsweb1/img","img.news.com");
        fileReader.close();
        return str1;
    }
}
