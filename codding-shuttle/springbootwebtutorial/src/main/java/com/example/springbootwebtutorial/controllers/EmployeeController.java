package com.example.springbootwebtutorial.controllers;

import com.example.springbootwebtutorial.dto.EmployeeDTO;
import com.example.springbootwebtutorial.entities.EmployeeEntity;
import com.example.springbootwebtutorial.repositories.EmployeeRepository;
import com.example.springbootwebtutorial.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: ajsbdaos#ajiskd";
//    }

    private final EmployeeService employeeService;

    //localhost:8080/employees/12
    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return employeeService.getEmployeeById(id);
    }

    //localhost:8080/employees?inputAge=5&sortBy=name
    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                                @RequestParam(required = false) String sortBy) {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createEmployee(inputEmployee);
    }

    @PutMapping(path = "/{employeeId}")
    public EmployeeDTO updateEmployeeId(@RequestBody EmployeeDTO employeeDTO, @PathVariable(name = "employeeId") Long id){
        return employeeService.updateEmployeeById(employeeDTO, id);
    }


    @DeleteMapping(path = "/{employeeId}")
    public boolean deleteEmployeeId (@PathVariable(name = "employeeId") Long id){
        return employeeService.deleteEmployeeById(id);
    }

}
