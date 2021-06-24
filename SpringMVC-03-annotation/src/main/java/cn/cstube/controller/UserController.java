package cn.cstube.controller;

import cn.cstube.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther heling
 * @date 2021/6/23
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //1.接受前端参数
        System.out.println("接受到的前端参数为" + name);

        //2.将返回的结果传递给前端，Model
        model.addAttribute("msg",name);

        //3.视图跳转
        return "hello";
    }

    //前端传递的是一个对象
    @GetMapping("t2")
    public String test2(User user){
        System.out.println(user);
        return "hello";
    }
}
