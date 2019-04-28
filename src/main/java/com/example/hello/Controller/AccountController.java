package com.example.hello.Controller;

import com.example.hello.Entity.Account;
import com.example.hello.Service.IAccountService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/4/27.
 */
@RestController
public class AccountController {
    @Autowired
    IAccountService iAccountService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String postAccount(@RequestParam("id") int id,@RequestParam("name") String name,
                              @RequestParam("money") double money){
        int t = iAccountService.add(id, name, money);
        if (t==1)
            return "True";
        else
            return "Fail";
    }


}
