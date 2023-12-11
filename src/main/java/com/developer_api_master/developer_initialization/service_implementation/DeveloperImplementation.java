package com.developer_api_master.developer_initialization.service_implementation;

import java.util.Optional;
import com.developer_api_master.developer_initialization.model.DeveloperModel;
import com.developer_api_master.developer_initialization.repository.DeveloperRepository;
import com.developer_api_master.developer_initialization.service_interface.DeveloperInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperImplementation implements DeveloperInterface {

    @Autowired
    private DeveloperRepository developerRepository;
    @Override
    public DeveloperModel saveDeveloper(DeveloperModel developerModel) {
        return developerRepository.save(developerModel);
    }

    @Override
    public DeveloperModel updateDeveloper(DeveloperModel developerModel) {
        DeveloperModel existingDeveloperModel = developerRepository.findById(developerModel.getDeveloperId()).orElse(null);
        existingDeveloperModel.setNumPullRequests(developerModel.getNumPullRequests());
        existingDeveloperModel.setAvgTimeMergeReq(developerModel.getAvgTimeMergeReq());
        existingDeveloperModel.setNumIssuesClosed(developerModel.getNumIssuesClosed());
        existingDeveloperModel.setNumProjects(developerModel.getNumProjects());
        existingDeveloperModel.setAddedDate(developerModel.getAddedDate());
        return developerRepository.save(existingDeveloperModel);
    }

    @Override
    public List<DeveloperModel> findAllDeveloper() {
        return (List<DeveloperModel>) developerRepository.findAll();
    }

    @Override
    public Optional<DeveloperModel> getDeveloperData(long id) {
        return (Optional<DeveloperModel>) developerRepository.findById(id);
    }

    @Override
    public void deleteDeveloper(long id) {
        developerRepository.deleteById(id);

    }
}
