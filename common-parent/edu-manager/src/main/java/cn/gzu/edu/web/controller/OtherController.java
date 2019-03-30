package cn.gzu.edu.web.controller;

import cn.gzu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("other")
public class OtherController {

    @Autowired
    private IUserService userService;

    @RequestMapping("manage")
    public String manage(){
        return "Center";
    }
}
