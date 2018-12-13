package cn.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dev")
public class DevController {

    @RequestMapping("/login")
    public String divLogin(){
        return "devlogin";
    }
}
