package wisdom21.model.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wisdom21.model.system.entity.User1Entity;
import wisdom21.model.system.entity.User2Entity;
import wisdom21.model.system.entity.User3Entity;
import wisdom21.model.system.mapper.db1.User1Mapper;
import wisdom21.model.system.mapper.db2.User2Mapper;
import wisdom21.model.system.mapper.db3.User3Mapper;
import wisdom21.model.system.service.UserService;

/**
 * @author Joaz
 * @date 2019/8/16 15:26
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(){
        String str = userService.test();
        return str;
    }
}
