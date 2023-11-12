package com.personal.myApplications.service;

import com.personal.myApplications.entity.ApplicationsEntity;
import com.personal.myApplications.exception.ApplicationNotFoundError;
import com.personal.myApplications.repository.ApplicationsRepository;

import java.util.ArrayList;

public interface IApplicationsService {
    public ArrayList<ApplicationsEntity> getAllApplicationsDetails();

    public ApplicationsEntity getApplicationDetail(int id);

    public ApplicationsEntity insertApplicationDetails(ApplicationsEntity applicationsEntity);

    public boolean deletApplication(int id) throws ApplicationNotFoundError;

}
