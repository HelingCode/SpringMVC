package cn.cstube.controller;

import cn.cstube.pojo.User;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther heling
 * @date 2021/6/24
 */
@RestController//它就不会走视图解析器，会直接返回一个字符串
public class UserController {

    @RequestMapping("j1")
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("Heling",3,"男");

        return mapper.writeValueAsString(user);
    }

    @RequestMapping("j2")
    public String json2() throws JsonProcessingException {

        List<User> userList = new ArrayList<>();

        User user = new User("Heling",3,"男");
        User user2 = new User("Heling",3,"男");
        User user3 = new User("Heling",3,"男");

        userList.add(user);
        userList.add(user3);
        userList.add(user2);

        String string = JSON.toJSONString(userList);

        return string;
    }
}
