package com.crudspringbootmongodb2;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeedao extends MongoRepository<Employee,Integer>{

}
