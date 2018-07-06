package com.wzg.cost.controller;

import com.wzg.cost.domain.Cost;
import com.wzg.cost.service.CostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
    @RequestMapping(value = "/findAllCost",method = RequestMethod.POST)

    public @ResponseBody
    List<Cost> findAllCost(){
     return  costService.findAllCost();
    }

    //添加资费管理
    @RequestMapping(value = "/addAllCost", method = RequestMethod.POST)
    public
    @ResponseBody
    void addAllCostJson(@RequestBody Cost cost) {
        cost.setStatus("0");
        cost.setStartime(null);
        System.out.println(cost.getCreatime());

        costService.addAllCost(cost);

    }
    //根据Id删除信息
    @RequestMapping(value = "/deleteCostById", method = RequestMethod.POST)
    public
    @ResponseBody
    void addAllCostJson(@RequestBody int costId) {
        costService.deleteCostById(costId);
    }

    // 修改功能，涉及到数据的回显
    @RequestMapping(value = "/findCurrentCost", method = RequestMethod.POST)
    public
    @ResponseBody
    Cost findCurrentCost(@RequestBody int costId ,HttpSession session) {
        session.setAttribute("costId",costId);
       return costService.findCurrentCost(costId);
    }

    // modif页面数据回显
    @RequestMapping(value = "/showCurrentCost" ,method = RequestMethod.POST)
    public
    @ResponseBody
    Cost showCurrentCost(HttpSession session){
        return costService.findCurrentCost((Integer)session.getAttribute("costId"));
    }

    // 修改界面点击保存时候的
    @RequestMapping(value = "/updateCost" ,method = RequestMethod.POST)
    public
    @ResponseBody
    void updateCost(HttpSession session){
        Cost cost = new Cost();
        cost.setCost_id((Integer) session.getAttribute("costId"));
        costService.addAllCost(cost);
    }

}
