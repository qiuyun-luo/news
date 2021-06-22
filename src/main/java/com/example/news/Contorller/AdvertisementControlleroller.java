package com.example.news.Contorller;

import com.example.news.Pojo.User;
import com.example.news.Vo.AdvertisementVo;
import com.example.news.Vo.SysResult;
import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("advertisement")
@CrossOrigin
@Api("广告管理")
public class AdvertisementControlleroller {
    @DeleteMapping("/deleteAdvertisement")
    @Transactional
    public SysResult deleteAdvertisement(Integer id){
        return SysResult.success(null);
    }
    @PutMapping("updateAdvertisement")
    @Transactional
    public SysResult updateAdvertisement(AdvertisementVo advertisementVo){
        return SysResult.success(null);
    }

    @GetMapping("advertisementList")
    public SysResult advertisementList(){
        return SysResult.success(null);
    }
    @PostMapping("insterAdvertisement")
    public SysResult insterAdvertisement(AdvertisementVo advertisementVo){
        return SysResult.success(null);
    }
}
