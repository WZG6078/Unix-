package com.wzg.cost.service.impl;

import com.wzg.cost.dao.CostDao;
import com.wzg.cost.domain.Cost;
import com.wzg.cost.service.CostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wzeg@foxmail.com
 * @date 2018/6/28 9:44
 * @description : I am a slow walker,but I never walk backwards.
 */
@Service
public class CostServiceImpl implements CostService {
    @Resource
    private CostDao costDao;
    public List<Cost> findAllCost() {
        return costDao.findAllCost();
    }
}
