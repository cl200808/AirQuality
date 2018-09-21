package cn.controller;

import cn.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class MainController {
    @Resource
    private MainService mainService;

    @RequestMapping("/toList.do")
    public String toList( Integer id,@RequestParam(value = "pageNo",required = false,defaultValue = "1") Integer pageNo){
        return mainService.findAllByConditon(id,pageNo);
    }



}
