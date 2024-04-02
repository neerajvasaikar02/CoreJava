package com.abc.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.example.mapping.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	Address findByZipCode(String id) ;

}
