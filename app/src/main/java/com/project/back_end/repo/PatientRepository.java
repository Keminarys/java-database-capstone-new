package com.project.back_end.repo;

import com.project.back_end.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Find a patient by email
    Patient findByEmail(String email);

    // Find a patient by email or phone
    Patient findByEmailOrPhone(String email, String phone);
}
