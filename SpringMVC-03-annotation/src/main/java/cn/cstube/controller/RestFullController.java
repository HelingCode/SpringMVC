package cn.cstube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther heling
 * @date 2021/6/23
 */
@Controller
public class RestFullController {
//    @RequestMapping(value = "/add/{a}/{b}")
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a , @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果1为"+res);

        return "hello";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a , @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果2为"+res);

        return "hello";
    }
}
