package druidtest.demo.controller;

import druidtest.demo.mapper.UserMapper;
import druidtest.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {
    @Autowired
    private UserMapper udao;

    @RequestMapping("/test2")
    public User test(){
        return udao.selectByPrimaryKey(1);
    }
}
