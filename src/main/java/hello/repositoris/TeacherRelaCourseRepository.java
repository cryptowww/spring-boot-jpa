/**
 * [gs-accessing-data-jpa-initial] hello.repositoris.TeacherRelaCourseRepository.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello.repositoris;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

import hello.models.TeacherRelaCourseModel;

/**
 * @author kevin_zhu
 *
 */
@org.springframework.stereotype.Repository
public interface TeacherRelaCourseRepository extends Repository<TeacherRelaCourseModel, Integer> {

}
