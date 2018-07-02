package im.estore.employeePlatform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * #author      : ivanl001
 * #creator     : 2018-07-02 17:00
 * #description : abc
 **/
@Controller
@RequestMapping("/test")
public class Test001 {


    @RequestMapping("/001")
    @ResponseBody
    public String test(){
        return "Ivan is the king of world!!!!!!!";
    }



}
