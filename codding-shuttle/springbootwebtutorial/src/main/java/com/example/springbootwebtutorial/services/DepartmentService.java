package com.example.springbootwebtutorial.services;

import com.example.springbootwebtutorial.dto.DepartmentDTO;
import com.example.springbootwebtutorial.entities.DepartmentEntity;
import com.example.springbootwebtutorial.exceptions.ResourceNotFoundException;
import com.example.springbootwebtutorial.repositories.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final ModelMapper mapper;

    public List<DepartmentDTO> getAllDepartments () {
        return departmentRepository.findAll()
                .stream()
                .map(departmentEntity -> mapper.map(departmentEntity, DepartmentDTO.class))
                .toList();
    }


    public DepartmentDTO getDepartmentById (Long id){
        DepartmentEntity department = departmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department not found by id : "+ id));
        return mapper.map(department, DepartmentDTO.class);
    }


    public DepartmentDTO createDepartment(DepartmentDTO department) {
        DepartmentEntity toSaveEntity = mapper.map(department, DepartmentEntity.class);
        DepartmentEntity savedEntity = departmentRepository.save(toSaveEntity);

        return mapper.map(savedEntity, DepartmentDTO.class);
    }


    public DepartmentDTO updateDepartmentById (Long id, DepartmentDTO departmentDTO){
        isDepartmentExists(id);
        DepartmentEntity entityToSave = mapper.map(departmentDTO, DepartmentEntity.class);
        entityToSave.setId(id);
        DepartmentEntity savedEntity = departmentRepository.save(entityToSave);

        return mapper.map(savedEntity, DepartmentDTO.class);
    }


    public boolean deleteDepartmentById(Long id){
        isDepartmentExists(id);
        departmentRepository.deleteById(id);
        return true;
    }


    private void isDepartmentExists (Long id){
        boolean isExists = departmentRepository.existsById(id);
        if(!isExists){
            throw new ResourceNotFoundException("Department not found by Id : "+ id);
        }
    }

}
