package com.example.onetoone;

import com.example.onetoone.models.License;
import com.example.onetoone.models.Person;
import com.example.onetoone.repositories.LicenseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Date;

@SpringBootTest
class OnetooneApplicationTests {

	@Autowired
	LicenseRepository licenseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testOneToOneCreateLicense() {

		Person person = new Person();

		person.setFirst_name("111");
		person.setLast_name("222");
		person.setAge(10);

		License license = new License();

		license.setType("Type1");
		license.setValid_from(new Date());
		license.setValid_to(new Date());

		license.setPerson(person);

		licenseRepository.save(license);

	}
}
