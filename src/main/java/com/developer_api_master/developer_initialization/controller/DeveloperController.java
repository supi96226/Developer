package com.developer_api_master.developer_initialization.controller;

import java.util.Optional;

import com.developer_api_master.developer_initialization.model.DeveloperModel;
import com.developer_api_master.developer_initialization.service_implementation.DeveloperImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("*")
public class DeveloperController {

    @Autowired
    private DeveloperImplementation developerImplementation;

    @PostMapping(value = "saveDeveloper")
    public DeveloperModel saveDeveloper(@RequestBody DeveloperModel developerModel){
        System.out.println("Developer added successfully");
        developerImplementation.saveDeveloper((developerModel));
        return developerModel;
    }

    @GetMapping(value = "getAllDeveloper")
    public List<DeveloperModel> findAllDeveloper(){
        return  developerImplementation.findAllDeveloper();
    }

    @GetMapping(value = "getDeveloperData/{id}")
    public DeveloperModel getDeveloperData(@PathVariable ("id") Long id){
        Optional<DeveloperModel> dataRow = developerImplementation.getDeveloperData(id);
        if(dataRow.isPresent()){
            return dataRow.get();
        }
        return null;
    }

    @PutMapping("updateDeveloper")
    public DeveloperModel updateDeveloper(@RequestBody DeveloperModel developerModel){
        return developerImplementation.updateDeveloper(developerModel);
    }

    @DeleteMapping("deleteDeveloper")
    public String deleteDeveloper(@RequestParam long id){
        developerImplementation.deleteDeveloper(id);
        return "Developer deleted!";
    }

}

