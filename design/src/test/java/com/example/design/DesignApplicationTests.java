package com.example.design;

import com.example.design.factory.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void simpleFactory() {
		new Customer().eatPizz();
	}

}
