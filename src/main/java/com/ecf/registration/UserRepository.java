package com.ecf.registration;


import com.ecf.domain.Address;
import com.ecf.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Address,Integer> {
}
