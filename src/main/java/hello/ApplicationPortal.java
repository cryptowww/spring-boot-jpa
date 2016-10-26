/**
 * [gs-accessing-data-jpa-initial] hello.ApplicationPortal.java
 * 
 * created at 2016年10月25日 by kevin_zhu
 */
package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kevin_zhu
 *
 */

@SpringBootApplication
public class ApplicationPortal {

	private static final Logger log = LoggerFactory.getLogger(ApplicationPortal.class);
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ApplicationPortal.class);
	}

}
