package cn.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dev")
public class DevController {

    @RequestMapping("/login")
    public String divLogin(){
        return "devlogin";
    }

    @RequestMapping("dologin")
    public String devDologin(String devCode,String devPassword, HttpServletRequest request){

        return "developer/main";
    }
}
