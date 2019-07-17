package com.yuanian.proctice.service.impl;

import com.yuanian.proctice.entity.Student;
import com.yuanian.proctice.service.UserService;
import org.springframework.stereotype.Component;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
@WebService(serviceName = "userService",  //服务名
            targetNamespace = "http://service.proctice.yuanian.com", //包名倒叙，并且和接口定义保持一致
            endpointInterface = "com.yuanian.proctice.service.UserService")//包名
public class UserServiceImpl implements UserService {
    private Map<String, Student> userMap = new HashMap<String, Student>();

    public UserServiceImpl(){
        System.out.println("==========向实体插入数据============");
        Student user = new Student();
        user.setUserId(UUID.randomUUID().toString().replace("-",""));
        user.setUserName("test1");
        user.setEmail("maplefix@163.xom");
        userMap.put(user.getUserId(), user);

        user = new Student();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUserName("test2");
        user.setEmail("maplefix@163.xom");
        userMap.put(user.getUserId(), user);

        user = new Student();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUserName("test3");
        user.setEmail("maplefix@163.xom");
        userMap.put(user.getUserId(), user);
        System.out.println(userMap.toString());
    }

    @Override
    public Student getUser(String userId) {
        Student student = userMap.get(userId);
        return student;
    }

    @Override
    public String getUserName(String userId) {
        Student student = userMap.get(userId);
        if(student==null){
            return "不存在编号为"+userId+"的学生用户";
        }
        return student.getUserName();
    }
}
