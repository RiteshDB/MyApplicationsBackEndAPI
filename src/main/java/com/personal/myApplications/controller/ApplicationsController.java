package com.personal.myApplications.controller;

import com.personal.myApplications.entity.ApplicationsEntity;
import com.personal.myApplications.service.ApplicationService;
import com.personal.myApplications.service.IApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/applications")
public class ApplicationsController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping(path = "/allApplications", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<ApplicationsEntity>> getApplications(){
        ArrayList<ApplicationsEntity> list = applicationService.getAllApplicationsDetails();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping(path="/newApplication", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApplicationsEntity> insertApplication(@RequestBody ApplicationsEntity applicationsEntity){
        ApplicationsEntity application = applicationService.insertApplicationDetails(applicationsEntity);
        return new ResponseEntity(application, HttpStatus.CREATED);
    }
}
