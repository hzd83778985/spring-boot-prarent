package com.markerhub.controller;

import com.markerhub.bean.User;
import com.markerhub.dao.UserDao;
import com.markerhub.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserDao userDao;

    /**
     *  使用RESTFul风格
     * @param id
     * @return
     */

    @GetMapping ("/{id}")
    public Result getUserById(@PathVariable("id") int id){
        System.out.println( " 开始了");
        User userById = userDao.getUserById(id);
        if (userById==null){
            return Result.error("查询失败");
        }
       return Result.success(userById);
    }
}
