package cn.itsource.yungou.controller;

import cn.itsource.yungou.AjaxResult;
import cn.itsource.yungou.domain.Emplyoee;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pro")
public class ProviderController {


    @RequestMapping(value = "/data",method = RequestMethod.GET)
    public AjaxResult getData(){
        return new AjaxResult();
    }


    @RequestMapping(value = "login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Emplyoee emplyoee){
        Map<String,String > hashMap = new HashMap<>();
        hashMap.put("hahaha","sadasdas");

        if ("abc".equals(emplyoee.getName())&&"123".equals(emplyoee.getPassword())){
            return new AjaxResult();
        }else {
            return  new AjaxResult().setSuccess(false).setMsg("登录失败").setObject(hashMap);
        }
    }

}
