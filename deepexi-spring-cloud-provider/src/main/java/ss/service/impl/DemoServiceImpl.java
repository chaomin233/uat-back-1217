package ss.service.impl;

import ss.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "welcome!";
    }
}
