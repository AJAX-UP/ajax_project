package com.servicefeign.servicefeign.service.fallback;

import com.servicefeign.servicefeign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author guangjiechen
 * @createDate 2019/7/12 14:59
 */
@Component
public class SchedualServiceHiHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }
}
