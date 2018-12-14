package cn.appsys.service.impl;

import cn.appsys.mapper.developer.DevMapper;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("devService")
public class DevServiceImpl implements DevService {
    @Autowired
    private DevMapper devMapper;
    @Override
    public DevUser doLogin(String code, String pwd) {
        return devMapper.doLogin(code,pwd);
    }
}
