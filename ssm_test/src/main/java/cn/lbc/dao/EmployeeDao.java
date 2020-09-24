package cn.lbc.dao;

import cn.lbc.domain.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 时间
 * dao接口
 * @date 2020/9/23 15:53
 */
@Repository
public interface EmployeeDao {
    //查询所有
    @Select("select * from employee")
    public List<Employee> findAll();

    @Select("delete * from employee where id = #{id}")
    public void delete(Integer id);
}
