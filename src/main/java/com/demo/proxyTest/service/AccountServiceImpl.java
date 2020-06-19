package com.demo.proxyTest.service;


import com.demo.proxyTest.dao.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

   /* @Autowired
    UserService userService;*/

    @Autowired
    CommonMapper commonMapper;

    @Override
    public String queryAccount(String id) {
        return null;
    }

    /*
    * 如果一个程序员，如果要在业务代码关心怎么选择数据源的问题，或者说架构就是失败的
    *
    * */
   /* @Transactional
    @TargetSource("ds1")
    @Override
    public String queryAccount(String id) {
        System.out.println("==========AccountServiceImpl.queryAccount");
        List<ConsultConfigArea> areas = commonMapper.queryAreaByAreaCode(new HashMap());
        return "==========AccountServiceImpl.queryAccount";
    }*/


}
