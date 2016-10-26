/**
 * [gs-accessing-data-jpa-initial] hello.repositoris.TeacherRepository.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.repositoris;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hello.models.TeacherModel;

/**
 * @author kevin_zhu
 *
 */
@Repository
public interface TeacherRepository extends CrudRepository<TeacherModel, Integer>{
	

}
