/**
 * [gs-accessing-data-jpa-initial] hello.repositoris.CourseRepository.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.repositoris;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.models.CourseModel;

/**
 * @author kevin_zhu
 *
 */
@Repository
public interface CourseRepository extends JpaRepository<CourseModel, Integer>{

}
