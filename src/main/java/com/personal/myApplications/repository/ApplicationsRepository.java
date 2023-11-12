package com.personal.myApplications.repository;

import com.personal.myApplications.entity.ApplicationsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationsRepository extends CrudRepository<ApplicationsEntity, Integer> {
}
