package cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huliang
 * @date 2019-06-17 20:10
 */
@RestController
public class WelcomeController {

    @Autowired
    private Environment environment;

    /**
     * 首页
     */
    @RequestMapping(value = "/")
    public String index() {
        String port = environment.getProperty("server.port");
        return "Server port is " + port;
    }

}
