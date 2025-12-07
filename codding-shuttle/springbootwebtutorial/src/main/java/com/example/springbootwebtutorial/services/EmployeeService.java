package com.example.springbootwebtutorial.services;

import com.example.springbootwebtutorial.dto.EmployeeDTO;
import com.example.springbootwebtutorial.entities.EmployeeEntity;
import com.example.springbootwebtutorial.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees(){
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities.stream().map(e -> modelMapper.map(e, EmployeeDTO.class)).toList();
    }

    public EmployeeDTO createEmployee (EmployeeDTO employeeDTO) {
        EmployeeEntity toSaveEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        EmployeeEntity savedEntity = employeeRepository.save(toSaveEntity);
        return modelMapper.map(savedEntity, EmployeeDTO.class);
    }
}
