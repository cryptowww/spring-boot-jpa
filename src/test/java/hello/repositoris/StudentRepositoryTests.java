package hello.repositoris;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import hello.models.StudentModel;


@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentRepositoryTests {
	private static final Logger log = LoggerFactory.getLogger(StudentRepositoryTests.class);
	
	@Autowired
    private TestEntityManager entityManager;
	@Autowired
	private StudentRepository studentRepository;
	
	@Ignore
	@Test
	public void testFindOne(){
		
		StudentModel student = new StudentModel();
		student.setFirstName("kevin");
		student.setLastName("Chuh");
		student.setAge(27);
		student.setGender("male");
		student.setSno("S0017");
		entityManager.persist(student);
				
		List<StudentModel> stu =  studentRepository.findTop5ByOrderByAgeDesc();

		assertThat(stu).extracting("firstName").containsOnly(student.getFirstName());
	}
	@Ignore
	@Test
	public void testfindByAgeGreaterThan(){
		StudentModel student = new StudentModel();
		student.setFirstName("kevin");
		student.setLastName("Chuh");
		student.setAge(27);
		student.setGender("male");
		student.setSno("S0017");
		entityManager.persist(student);
		
		StudentModel student1 = new StudentModel();
		student1.setFirstName("michel");
		student1.setLastName("Chuh");
		student1.setAge(20);
		student1.setGender("male");
		student1.setSno("S0018");
		entityManager.persist(student1);
		
		StudentModel student2 = new StudentModel();
		student2.setFirstName("steven");
		student2.setLastName("smid");
		student2.setAge(30);
		student2.setGender("female");
		student2.setSno("S0019");
		entityManager.persist(student2);
		List<StudentModel> stu =  studentRepository.findByAgeGreaterThan(27);
		
		assertThat(stu).extracting(StudentModel::getFirstName).contains(student2.getFirstName());
		
		List<StudentModel> stux = studentRepository.findByFirstNameAndLastName("steven","smid");
		
		assertThat(stux).hasSize(1).contains(student2);
	}
	@Ignore
	@Test
	public void testFindByQuery(){
		StudentModel student = new StudentModel();
		student.setFirstName("kevins");
		student.setLastName("Chuh");
		student.setAge(27);
		student.setGender("male");
		student.setSno("S0017");
		entityManager.persist(student);
		
		StudentModel student1 = new StudentModel();
		student1.setFirstName("kevins");
		student1.setLastName("Chuh");
		student1.setAge(20);
		student1.setGender("male");
		student1.setSno("S0018");
		entityManager.persist(student1);
		
		StudentModel student2 = new StudentModel();
		student2.setFirstName("kevins");
		student2.setLastName("Chuh");
		student2.setAge(30);
		student2.setGender("female");
		student2.setSno("S0019");
		entityManager.persist(student2);
		List<StudentModel> stu =  studentRepository.findByQuery("ke");
		
		assertThat(stu).contains(student,student1);
		
		
	}
	
	@Ignore
	@Test
	public void testfindByFirstNameAndLastNameAndAgeGreaterThanAndGenderIsNotNullOrderByAgeDesc(){
		StudentModel student = new StudentModel();
		student.setFirstName("kevins");
		student.setLastName("Chuh");
		student.setAge(27);
		student.setGender("male");
		student.setSno("S0017");
		entityManager.persist(student);
		
		StudentModel student1 = new StudentModel();
		student1.setFirstName("kevins");
		student1.setLastName("Chuh");
		student1.setAge(20);
		student1.setGender("male");
		student1.setSno("S0018");
		entityManager.persist(student1);
		
		StudentModel student2 = new StudentModel();
		student2.setFirstName("kevins");
		student2.setLastName("Chuh");
		student2.setAge(30);
		student2.setGender("female");
		student2.setSno("S0019");
		entityManager.persist(student2);
		
		List<StudentModel> stux =  studentRepository.findByFirstNameAndLastNameAndAgeGreaterThanAndGenderIsNotNullOrderByAgeDesc("kevins", "Chuh", 26);
		assertThat(stux).contains(student,student2);
		log.info("################################");
		log.info(stux.get(0).getSno());
		log.info(stux.get(1).getSno());
		log.info("################################");
	}
	
	@Test
	public void testfindByFirstNameAndLastName_2(){
		StudentModel student = new StudentModel();
		student.setFirstName("kevins");
		student.setLastName("Chuh");
		student.setAge(27);
		student.setGender("male");
		student.setSno("S0017");
		entityManager.persist(student);
		
		StudentModel student1 = new StudentModel();
		student1.setFirstName("jimmy");
		student1.setLastName("xxu");
		student1.setAge(20);
		student1.setGender("male");
		student1.setSno("S0018");
		entityManager.persist(student1);
		
		List<StudentModel> stu =  studentRepository.findByFirstNameAndLastName_2("Chuh", "kevins");
		assertThat(stu).contains(student);
	}
}
