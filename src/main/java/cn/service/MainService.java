package cn.service;

import cn.entity.Main;


public interface MainService {
    //根据条件查询所有
    public String findAllByConditon(Integer id,Integer pageNo);
    //根据条件查询总数
    public Integer findCount(Integer id);
    //增加信息
    public Integer addMain(Main main);
}
