package com.wzg.dao;

import com.wzg.cost.dao.CostDao;
import com.wzg.cost.domain.Cost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wzeg@foxmail.com
 * @date 2018/6/28 13:54
 * @description : I am a slow walker,but I never walk backwards.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class CostDaoTest {
    @Resource
    public CostDao service;
    @Test
    public void findAllCost() throws Exception {
        List<Cost> allCost =  service.findAllCost();
        allCost.forEach(System.out::println);

    }

}