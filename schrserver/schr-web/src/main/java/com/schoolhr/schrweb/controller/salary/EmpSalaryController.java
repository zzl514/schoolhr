package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.RespBean;
import com.schoolhr.model.RespPageBean;
import com.schoolhr.model.SalaryAccount;
import com.schoolhr.sevice.EmployeeService;
import com.schoolhr.sevice.SalaryAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary/sobcfg")
public class EmpSalaryController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    SalaryAccountService salaryaccountService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPageSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeByPageSalary(page, size);
    }

    @GetMapping("/salaryaccounts")
    public List<SalaryAccount> getAllSalaryAccounts() {
        return salaryaccountService.getAllSalaryAccounts();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid) {
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}