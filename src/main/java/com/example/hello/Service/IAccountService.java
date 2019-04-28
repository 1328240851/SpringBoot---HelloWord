package com.example.hello.Service;

import com.example.hello.DAO.IAccountDAO;
import com.example.hello.Entity.Account;
import com.example.hello.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/4/27.
 */
@Service
public class IAccountService {
    @Autowired
    private IAccountDAO accountDAO;

    public int add(int id,String name,double money) {
        return accountDAO.add(id,name,money);
    }

//    public int update(Account account) {
//        return accountDAO.update(account);
//    }
}
