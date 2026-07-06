package com.hospital.hsm;

import com.hospital.hsm.entity.Patient;
import com.hospital.hsm.entity.type.bloodgrouptype;
import com.hospital.hsm.repository.PatientRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class patienttest {
    @Autowired
    private PatientRepository patientRepository;

   @Test
   @Disabled
    public void testFindBYBloodgroup() {
       //   List<patient> patients = patientRepository.findAll();
       // System.out.println(patients);
       //}

       //patient patients =patientRepository.findByName("shrikant");
       List<Patient> patientList = patientRepository.findByBloodGroup(bloodgrouptype.A_POSITIVE);

       for (Patient patient : patientList) {
           System.out.println(patient);
       }
   }
}
