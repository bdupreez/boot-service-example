package discovery.bms.ui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/")
public class BaseController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAppConfig() throws UnknownHostException {

        return "hello";
    }


}
