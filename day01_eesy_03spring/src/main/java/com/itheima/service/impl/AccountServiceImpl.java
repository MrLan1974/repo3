package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

   //private IAccountDao accountDao = new AccountDaoImpl();
   private IAccountDao accountDao = null;


   public AccountServiceImpl(){
       System.out.println("对象创建了");
   }
    public void saveAccount() {
         accountDao.saveAccount();
     }
}
