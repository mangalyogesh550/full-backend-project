package com.backend.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.backend.project.repositories.UserRepo;

@SpringBootTest
class FullBackenedProjectApplicationTests {

	@Autowired
	private UserRepo userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void repoTest() {
		String className = this.userRepo.getClass().getName();
		Package packageName = this.userRepo.getClass().getPackage();
		System.out.println(className);
		System.out.println(packageName);

	}

}
