package com.personal.myApplications;

import com.personal.myApplications.entity.ApplicationsEntity;
import com.personal.myApplications.repository.ApplicationsRepository;
import com.personal.myApplications.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
public class MyApplicationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(MyApplicationsApplication.class, args);
		ApplicationService service = context.getBean(ApplicationService.class);
		//System.out.println("Project is created successfully and applicationsEntity is created successfully " + service);

		/*ApplicationsEntity entity = new ApplicationsEntity(1, "Accenture", "Campus", LocalDate.now(),"Completed",true,false);

		ApplicationsEntity newEntry = service.insertApplicationDetails(entity);
		if(newEntry != null){
			System.out.println("Entry is created successfully");
		}
	*/

	}

}
