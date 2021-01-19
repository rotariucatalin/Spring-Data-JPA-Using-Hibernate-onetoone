package com.example.onetoone.repositories;

import com.example.onetoone.models.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License, Integer> {


}
