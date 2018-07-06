package com.wzg.cost.dao;

import com.wzg.cost.domain.Cost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 有时候你得多想一想
 * Created by 哈哈Laugh on 2018/7/6.
 */
@ContextConfiguration("classpath:spring-mybatis.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CostDaoTest {
    @Resource
    private CostDao costDao;

    @Test
    public void findAllCost() throws Exception {
        List<Cost> allCost = costDao.findAllCost();
        allCost.forEach(System.out::println);
    }

    @Test
    public void addAllCost() throws Exception {
        Cost cost = new Cost();
        cost.setStatus("1");
        cost.setName("20.5元套餐")
                .setBase_duration(40)
                .setBase_cost(12.00)
                .setUnit_cost(1.22)
                .setDescr("这个最划算");
        costDao.addAllCost(cost);
    }

    @Test
    public void deleteCostById() throws Exception {
        costDao.deleteCostById(14);
    }
    @Test
    public void findCurrentCost() throws Exception {
        Cost currentCost = costDao.findCurrentCost(7);
        System.out.println(currentCost.toString());

    }

}