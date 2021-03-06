package com.wzg.cost.service;

import com.wzg.cost.domain.Cost;

import java.util.List;

/**
 * @author wzeg@foxmail.com
 * @date 2018/6/28 9:42
 * @description : I am a slow walker,but I never walk backwards.
 */

public interface CostService {
    //查询所有Cost数据
    List<Cost> findAllCost();
    // 添加cost信息
    void addAllCost(Cost cost);
    // 根据costId进行删除
    void deleteCostById(int costId);
    // 修改时根据传过来的Id去查询对应的数据
    Cost findCurrentCost(int costId);

}
