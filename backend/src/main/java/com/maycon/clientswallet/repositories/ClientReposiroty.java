package com.maycon.clientswallet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maycon.clientswallet.entities.Client;

@Repository
public interface ClientReposiroty extends JpaRepository<Client, Long>{

}
