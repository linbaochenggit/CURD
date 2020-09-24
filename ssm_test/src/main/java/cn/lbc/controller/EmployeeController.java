package cn.lbc.controller;

import cn.lbc.domain.Employee;
import cn.lbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 时间
 * 表现层
 * @date 2020/9/23 16:00
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层");
        List<Employee> list = employeeService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/delete")
    public String delete(Model model,@RequestParam(name = "id",required = false) Integer roleId){
        employeeService.delete(roleId);
        List<Employee> list = employeeService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
