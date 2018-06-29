package com.wzg.cost.controller;

import com.wzg.cost.domain.Cost;
import com.wzg.cost.service.CostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wzeg@foxmail.com
 * @date 2018/6/28 16:15
 * @description : I am a slow walker,but I never walk backwards.
 */
@Controller
public class CostController {

    @Resource
    public CostService costService;

    //查询所有的cost
    @RequestMapping(value = "/findAllCost",method = RequestMethod.GET)

    public @ResponseBody
    List<Cost> findAllCost(){
     return  costService.findAllCost();
    }
}
