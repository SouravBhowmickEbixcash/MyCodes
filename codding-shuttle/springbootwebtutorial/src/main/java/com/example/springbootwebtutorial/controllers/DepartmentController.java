package com.example.springbootwebtutorial.controllers;

import com.example.springbootwebtutorial.dto.DepartmentDTO;
import com.example.springbootwebtutorial.services.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments(){
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.getAllDepartments());
    }

    @GetMapping(path = "/{departmentId}")
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable(name = "departmentId") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.getDepartmentById(id));
    }

    @PostMapping
    public ResponseEntity<DepartmentDTO> createNewDepartment (@RequestBody @Valid DepartmentDTO department) {
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.createDepartment(department));
    }

    @PutMapping(path = "/{departmentId}")
    public ResponseEntity<DepartmentDTO> updateDepartmentById(@PathVariable(name = "departmentId") Long id,
                                                              @RequestBody @Valid DepartmentDTO departmentDTO){
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.updateDepartmentById(id, departmentDTO));
    }

    @DeleteMapping(path = "/{departmentId}")
    public ResponseEntity<Boolean> deleteDepartmentById (@PathVariable(name = "departmentId") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.deleteDepartmentById(id));
    }
}
