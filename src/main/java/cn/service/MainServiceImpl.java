package cn.service;

import cn.entity.Main;
import cn.mapper.MainMapper;
import cn.page.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
@Service
@Transactional
public class MainServiceImpl implements MainService{
    @Resource
    private MainMapper mainMapper;

    @Override
    public String findAllByConditon(Integer id,Integer pageNo) {
        if (id==null||id==0){
            id=null;
        }
        Integer count = mainMapper.findCount(id);
        PageBean p = new PageBean(pageNo,3,count);
        List<Main> list = mainMapper.findAllByConditon(id,p);
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.
                        getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();//创建session对象
        session.setAttribute("list",list);
        session.setAttribute("p",p);
        return "main";
    }

    @Override
    public Integer findCount(Integer id) {
        return null;
    }

    @Override
    public Integer addMain(Main main) {
        return null;
    }
}
