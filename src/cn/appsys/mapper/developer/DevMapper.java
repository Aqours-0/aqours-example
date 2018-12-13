package cn.appsys.mapper.developer;

import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevMapper {
    DevUser doLogin(@Param("userCode") String code,@Param("userPassword") String pwd);
}
