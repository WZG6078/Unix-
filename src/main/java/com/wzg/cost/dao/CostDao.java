package com.wzg.cost.dao;

import com.wzg.cost.domain.Cost;

import java.util.List;

/**
 * @author wzeg@foxmail.com
 * @date 2018/6/28 9:39
 * @description : I am a slow walker,but I never walk backwards.
 */
public interface CostDao {
    //查询所有Cost数据
   List<Cost> findAllCost();
}
