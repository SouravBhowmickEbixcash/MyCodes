package com.codingshuttle.springboot0To100.hospitalManagementSystem;

import com.codingshuttle.springboot0To100.hospitalManagementSystem.dto.BloodGroupStats;
import com.codingshuttle.springboot0To100.hospitalManagementSystem.dto.CPatientInfo;
import com.codingshuttle.springboot0To100.hospitalManagementSystem.dto.IPatientInfo;
import com.codingshuttle.springboot0To100.hospitalManagementSystem.entity.Patient;
import com.codingshuttle.springboot0To100.hospitalManagementSystem.repository.PatientRepository;
import com.codingshuttle.springboot0To100.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatient(){
//        List<Patient> patientList = patientRepository.findAll();
//        List<IPatientInfo> iPatientList = patientRepository.getPatientInfo();
//        List<CPatientInfo> cPatientList = patientRepository.getAllPatientsInfo();
//        List<BloodGroupStats> bloodGroupStatsList = patientRepository.getBloodGroupStats();
//        for(var b : bloodGroupStatsList){
//            System.out.println(b);
//        }

//        int rowsAffected = patientRepository.updatePatientNameWithId("Anuj Sharma", 1L);
//        System.out.println(rowsAffected);
//
//        Patient patient = new Patient();
//        patientRepository.save(patient);

        patientService.testPatientTransaction();

    }
}
