package com.maycon.clientswallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maycon.clientswallet.entity.Client;

@Repository
public interface ClientReposiroty extends JpaRepository<Client, Long>{

}
