package com.personal.myApplications.service;

import com.personal.myApplications.entity.ApplicationsEntity;
import com.personal.myApplications.exception.ApplicationNotFoundError;
import com.personal.myApplications.repository.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ApplicationService implements IApplicationsService{

    @Autowired
    private ApplicationsRepository applicationsRepository;
    @Override
    public ArrayList<ApplicationsEntity> getAllApplicationsDetails() {
        ArrayList<ApplicationsEntity> applications = (ArrayList<ApplicationsEntity>) applicationsRepository.findAll();
        return applications;
    }

    @Override
    public ApplicationsEntity getApplicationDetail(int id) {
        ApplicationsEntity applicationsEntity = applicationsRepository.findById(id).orElse(null);

        return applicationsEntity;
    }

    @Override
    public ApplicationsEntity insertApplicationDetails(ApplicationsEntity applicationsEntity) {

        ApplicationsEntity insertedApplication = applicationsRepository.save(applicationsEntity);
        return insertedApplication;
    }

    @Override
    public boolean deletApplication(int id) throws ApplicationNotFoundError {
        applicationsRepository.delete(applicationsRepository.findById(id).orElseThrow(() ->new ApplicationNotFoundError("This application is not found")));
        return true;
    }
}
