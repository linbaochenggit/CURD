package cn.lbc.service;

import cn.lbc.domain.Employee;

import java.util.List;

/**
 * 时间
 * 业务层接口
 * @date 2020/9/23 15:55
 */
public interface EmployeeService {

    public List<Employee> findAll();

    public void delete(Integer id);
}
