package cn.lbc.service.impl;

import cn.lbc.dao.EmployeeDao;
import cn.lbc.domain.Employee;
import cn.lbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 时间
 *
 * @date 2020/9/23 15:57
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    public List<Employee> findAll() {
        System.out.println("业务逻辑层---查询所有账户");
        List<Employee> all = employeeDao.findAll();
        for (Employee employee : all){
            System.out.println(employee);
        }
        return employeeDao.findAll();
    }

    public void delete(Integer id) {
        employeeDao.delete(id);
    }
}
