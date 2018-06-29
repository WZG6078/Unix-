package com.wzg.cost.domain;


import java.security.Timestamp;

/**
 * @author wzeg@foxmail.com
 * @date 2018/6/27 16:49
 * @description : I am a slow walker,but I never walk backwards.
 */
public class Cost {
    private Integer cost_id;
    private String name;
    private Integer base_duration;
    private Double base_cost;
    private Double unit_cost;
    private String status;
    private String descr;
    private Timestamp creatime;
    private Timestamp startime;
    private String cost_type;

    public Cost() {
    }

    public Cost(Integer cost_id, String name, Integer base_duration, Double base_cost, Double unit_cost, String status, String descr, Timestamp creatime, Timestamp startime, String cost_type) {
        this.cost_id = cost_id;
        this.name = name;
        this.base_duration = base_duration;
        this.base_cost = base_cost;
        this.unit_cost = unit_cost;
        this.status = status;
        this.descr = descr;
        this.creatime = creatime;
        this.startime = startime;
        this.cost_type = cost_type;
    }

    public Integer getCost_id() {
        return cost_id;
    }

    public Cost setCost_id(Integer cost_id) {
        this.cost_id = cost_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cost setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBase_duration() {
        return base_duration;
    }

    public Cost setBase_duration(Integer base_duration) {
        this.base_duration = base_duration;
        return this;
    }

    public Double getBase_cost() {
        return base_cost;
    }

    public Cost setBase_cost(Double base_cost) {
        this.base_cost = base_cost;
        return this;
    }

    public Double getUnit_cost() {
        return unit_cost;
    }

    public Cost setUnit_cost(Double unit_cost) {
        this.unit_cost = unit_cost;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Cost setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDescr() {
        return descr;
    }

    public Cost setDescr(String descr) {
        this.descr = descr;
        return this;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public Cost setCreatime(Timestamp creatime) {
        this.creatime = creatime;
        return this;
    }

    public Timestamp getStartime() {
        return startime;
    }

    public Cost setStartime(Timestamp startime) {
        this.startime = startime;
        return this;
    }

    public String getCost_type() {
        return cost_type;
    }

    public Cost setCost_type(String cost_type) {
        this.cost_type = cost_type;
        return this;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "cost_id=" + cost_id +
                ", name='" + name + '\'' +
                ", base_duration=" + base_duration +
                ", base_cost=" + base_cost +
                ", unit_cost=" + unit_cost +
                ", status='" + status + '\'' +
                ", descr='" + descr + '\'' +
                ", creatime=" + creatime +
                ", startime=" + startime +
                ", cost_type='" + cost_type + '\'' +
                '}';
    }
}
