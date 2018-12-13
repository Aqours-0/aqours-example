package cn.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mge")
public class BackEndController {

    @RequestMapping("/login")
    public String bendLogin(){
        return "backendlogin";
    }
}
