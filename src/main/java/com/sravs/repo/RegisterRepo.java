package com.sravs.repo;

import com.sravs.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterRepo extends JpaRepository<Register,Integer> {
     Optional<Register> findByEmail(String email) ;
     Optional<Register> findByEmailAndPassword(String email, String password) ;
}
