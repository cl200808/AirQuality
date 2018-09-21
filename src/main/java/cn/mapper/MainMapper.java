package cn.mapper;

import cn.entity.Main;
import cn.page.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MainMapper {
    //根据条件查询所有
    public List<Main> findAllByConditon(@Param("id")Integer id,@Param("p") PageBean p);
    //根据条件查询总数
    public Integer findCount(@Param("id")Integer id);
   //增加信息
    public Integer addMain(Main main);
}
