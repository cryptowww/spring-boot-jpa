/**
 * [gs-accessing-data-jpa-initial] hello.repositoris.StudentRepository.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.repositoris;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import hello.models.StudentModel;

/**
 * @author kevin_zhu
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Integer>{

	public List<StudentModel> findTop5ByOrderByAgeDesc();

//	public List<StudentModel> findByFirstNameAndLastName();
//	
	public List<StudentModel> findByAgeGreaterThan(int min);
	
	public List<StudentModel> findAll();
}
