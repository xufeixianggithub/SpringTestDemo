package com.demo.proxyTest.dao;

import com.demo.proxyTest.entity.PromotionSite;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommonMapper {

    @Select("select * from see_promotion_site limit 1")
    PromotionSite queryPromotion(String id);

    @Update("update see_promotion_site set name='123' where id=1")
    int updatePromotion(Integer userId);
}
