package com.sahabaz.springbootcrud.controller;

import com.sahabaz.springbootcrud.dao.EmployeeRepo;
import com.sahabaz.springbootcrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping ("/addEmployee")
    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "home.jsp";
    }
    @RequestMapping("/getEmployee")
    public ModelAndView getEmployee(@RequestParam int empId){
        ModelAndView mv = new ModelAndView("showData.jsp");
        Employee employee = employeeRepo.findById(empId).orElse(new Employee());
        mv.addObject(employee);
        return mv;
    }

    @RequestMapping("/getEmployees")
    @ResponseBody
    public String getEmployees(){
        return employeeRepo.findAll().toString();
    }

    @RequestMapping("/getEmployeesSort")
    @ResponseBody
    public String getEmployeesSort(){
        return employeeRepo.findAll(Sort.by("empName")).toString();
    }

    @RequestMapping("/delEmployees")
    @ResponseBody
    public void delEmployees(){
         employeeRepo.deleteAllInBatch();
    }
}

