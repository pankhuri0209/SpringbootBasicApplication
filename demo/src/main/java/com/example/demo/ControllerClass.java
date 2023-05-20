package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerClass {

		@RequestMapping("/courses")
		public List<Course> retieveAllCourses() {

			return Arrays.asList(new Course(1, "Learn AWS", "in 28mins"), new Course(2, "Learn Devops", "in 28mins")
					, new Course(3, "Learn Azure", "in 28mins")
					, new Course(4, "Learn GCP", "in 28mins"));
		}

	

}
