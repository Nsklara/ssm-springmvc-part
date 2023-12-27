package com.sh.controller;

import com.sh.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: SH
 * @Date: 2023/12/24 21:20
 */

@RequestMapping("/crud")
@RestController
public class UserController {
    
    //用户数据分页展示,默认一页十个数据
    @GetMapping("user")
    public List<User> page(@RequestParam(required = false,defaultValue = "10") int size,
                           @RequestParam(required = false,defaultValue = "1") int page){//size一页多少个数据,page第几页
        //展示用户的操作
        System.out.println("size = " + size + ", page = " + page);
        return null;
    }
    
    //新增用户信息
    @PostMapping("user")
    public User saveUser(@RequestBody User user){
        return user;
    }
    
    //根据id查找用户信息
    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable int id){
        return null;
    }

    
    //根据id更新用户信息
    @PutMapping("user/{id}")
    public User updateUser(@RequestBody User user){
        //修改
        return user;
    }
    
    //根据id删除用户信息
    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable int id){
        //删除操作
        return "confirm";
    }
    
    //模糊查询
    @GetMapping("user/search")
    public List<User> search(String keyWork,
                             @RequestParam(required = false,defaultValue = "10") int size,
                             @RequestParam(required = false,defaultValue = "1") int page){
        return null;
    }
    
}
