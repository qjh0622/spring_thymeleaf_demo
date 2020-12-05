package com.offcn.controller;


import com.offcn.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){

        model.addAttribute("message","欢迎来到王者荣耀");
        return "index";
    }

    @RequestMapping("/findUser")
    public String findUser(Model model){
        user use = new user();
        use.setId(1L);
        use.setName("辉哥哥");
        use.setAge(20);

        Map<String,String> map = new HashMap<>();
            map.put("id","2");
            map.put("name","huihui");
            map.put("qian","9000");

        model.addAttribute("use",use);
        model.addAttribute("map",map);
        return "index02";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        user use1 = new user();
        use1.setId(1L);
        use1.setName("辉哥哥");
        use1.setAge(20);

        user use2 = new user();
        use2.setId(2L);
        use2.setName("辉2哥哥");
        use2.setAge(30);

        user use3 = new user();
        use3.setId(3L);
        use3.setName("辉哥3哥");
        use3.setAge(30);

        List list = new ArrayList();
        list.add(use1);
        list.add(use2);
        list.add(use3);


    model.addAttribute("userlist",list);

    return "index03";

    }

    @RequestMapping("/index04")
    public String index04(Model model){
           model.addAttribute("username","河北");
            return "index04";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("falge","yes");

        model.addAttribute("sasa","admin");
        model.addAttribute("menage","menage");
        return "index05";
    }



    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("date",new Date());

        model.addAttribute("double",123.233D);

        model.addAttribute("String","Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n");

        return "index06";
    }

}
