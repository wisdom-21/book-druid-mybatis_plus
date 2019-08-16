package wisdom21.model.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wisdom21.model.system.entity.User1Entity;
import wisdom21.model.system.entity.User2Entity;
import wisdom21.model.system.entity.User3Entity;
import wisdom21.model.system.mapper.db1.User1Mapper;
import wisdom21.model.system.mapper.db2.User2Mapper;
import wisdom21.model.system.mapper.db3.User3Mapper;
import wisdom21.model.system.service.UserService;

/**
 * @author Joaz
 * @date 2019/8/16 15:38
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @Autowired
    private User3Mapper user3Mapper;

    @Override
    public String test() {
        User1Entity user1Entity1 = user1Mapper.selectById(1);
        User2Entity user1Entity2 = user2Mapper.selectById(1);
        User3Entity user1Entity3 = user3Mapper.selectById(1);

        return user1Entity1.toString() + "<br/>" + user1Entity2.toString() + "<br/>" + user1Entity3.toString();
    }
}
