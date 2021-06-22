package com.example.news.ServiceImpl;

import com.example.news.Mapper.ReptileMapper;
import com.example.news.Pojo.Reptile;
import com.example.news.Service.ReptileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReptileServiceImpl implements ReptileService {
    @Autowired
    ReptileMapper reptileMapper;
    @Override
    public int inster(Reptile reptile) {
        return reptileMapper.insert(reptile);
    }
}
