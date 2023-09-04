package dubbo.springboot.demo.provider;

import dubbo.springboot.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoInterfaceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
