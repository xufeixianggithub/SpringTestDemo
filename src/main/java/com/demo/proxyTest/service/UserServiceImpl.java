package com.demo.proxyTest.service;


import com.demo.proxyTest.dao.CommonMapper;
import com.demo.proxyTest.entity.PromotionSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Lazy
@Primary
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    AccountService accountService;
    @Autowired
    CommonMapper commonMapper;

    @Override
    public String queryUser(String userId) {
        PromotionSite promotionSite=commonMapper.queryPromotion(userId);
        System.out.println("UserServiceImpl ->" + userId);
        return "UserServiceImp ->" + userId;
    }

    @Override
    public void addxx(String id) {
        System.out.println("UserServiceImpl -> addxx");
    }

    @Override
    @Transactional
    public String updatePromotionSite(Integer id) {
        commonMapper.updatePromotion(id);

        if(true){
            throw new RuntimeException("");
        }

        System.out.println("updatePromotionSite ->" + id);
        return "updatePromotionSite ->" + id;
    }

}
