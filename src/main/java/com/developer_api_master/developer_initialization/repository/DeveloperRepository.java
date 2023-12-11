package com.developer_api_master.developer_initialization.repository;


import com.developer_api_master.developer_initialization.model.DeveloperModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends CrudRepository<DeveloperModel,Long> {
}