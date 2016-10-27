/**
 * [gs-accessing-data-jpa-initial] hello.repositoris.StudentRelaCourseRepository.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.repositoris;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import hello.models.StudentRelaCourseModel;

/**
 * @author kevin_zhu
 *
 */
@org.springframework.stereotype.Repository
public interface StudentRelaCourseRepository extends JpaRepository<StudentRelaCourseModel, Integer>{

	public StudentRelaCourseModel findByCnoAndSno(String cno,String sno);
}
