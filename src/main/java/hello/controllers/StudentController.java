/**
 * [gs-accessing-data-jpa-initial] hello.controllers.StudentController.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.ApplicationPortal;
import hello.models.StudentModel;
import hello.services.StudentService;

/**
 * @author kevin_zhu
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {

	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	public StudentController(){
		
	}
	
	@RequestMapping("/all")
	public List<StudentModel> providAll(){
		//studentService.retriveAllStudentList();
		log.info("request--from /student/all");
		return studentService.retriveAll();
	}
	
	@RequestMapping("/top2")
	public List<StudentModel> providTop2(){
		//studentService.retriveAllStudentList();
		log.info("request--from /student/top2");
		return studentService.retriveTop2();
	}
}
