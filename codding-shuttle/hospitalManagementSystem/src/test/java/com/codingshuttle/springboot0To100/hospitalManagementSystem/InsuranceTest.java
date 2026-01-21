package com.codingshuttle.springboot0To100.hospitalManagementSystem;

import com.codingshuttle.springboot0To100.hospitalManagementSystem.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testAssignInsuranceToPatient(){

    }
}
