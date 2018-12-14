package cn.appsys.service;

import cn.appsys.pojo.DevUser;

public interface DevService {
    DevUser doLogin(String code,String pwd);
}
