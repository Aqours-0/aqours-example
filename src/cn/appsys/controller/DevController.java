package cn.appsys.controller;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dev")
public class DevController {
    @Autowired
    private DevService devService;

    @RequestMapping("/login")
    public String divLogin(){
        return "devlogin";
    }

    @RequestMapping("dologin")
    public String devDologin(String devCode,String devPassword, HttpServletRequest request){
        DevUser user = devService.doLogin(devCode, devPassword);
        if(user==null){
            request.setAttribute("error","用户名或密码错误");
            return "devlogin";
        }else{
            request.getSession().setAttribute("user",user);
            return "developer/main";
        }
    }
}
