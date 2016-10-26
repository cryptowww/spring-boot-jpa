/**
 * [gs-accessing-data-jpa-initial] hello.services.StudentService.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import hello.models.StudentModel;
import hello.repositoris.StudentRepository;


/**
 * @author kevin_zhu
 *
 */
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public StudentService(){
		
	}
	
	
	public StudentModel retriveOneStudent(int id){
		return studentRepository.findOne(id);
	}
	
	public List<StudentModel> retriveAll(){
		List<StudentModel> list = null;
		try {
			list = studentRepository.findAll();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<StudentModel> retriveTop2(){
		List<StudentModel> list = null;
		try {
			list = studentRepository.findTop5ByOrderByAgeDesc();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
}
