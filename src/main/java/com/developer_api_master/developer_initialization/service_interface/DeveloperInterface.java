package com.developer_api_master.developer_initialization.service_interface;

import java.util.Optional;
import com.developer_api_master.developer_initialization.model.DeveloperModel;

import java.util.List;

public interface DeveloperInterface {

    public DeveloperModel saveDeveloper(DeveloperModel developerModel);

    public DeveloperModel updateDeveloper(DeveloperModel developerModel);

    public List<DeveloperModel> findAllDeveloper();

    public Optional<DeveloperModel> getDeveloperData(long id);

    public void deleteDeveloper(long id);
}