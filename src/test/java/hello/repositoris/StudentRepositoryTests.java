package hello.repositoris;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hello.models.StudentModel;



@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentRepositoryTests {

	@Autowired
    private TestEntityManager entityManager;
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testFindOne(){
		
		
		StudentModel stu =  studentRepository.findOne(1);
		
		assertThat(stu).isNull();
		
		List<StudentModel> list = studentRepository.findAll();
		assertThat(list).extracting(StudentModel::getFirstName).contains("steven");
	}
}
