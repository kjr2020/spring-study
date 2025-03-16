package io.eddie.spring_study;

import io.eddie.spring_study.controller.IceCreamController;
import io.eddie.spring_study.entity.IceCream;
import io.eddie.spring_study.repository.IceCreamRepository;
import io.eddie.spring_study.service.IceCreamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStudyApplicationTests {

	@Autowired
	private IceCreamService iceCreamService;

	@Autowired
	private IceCreamRepository iceCreamRepository;

	@Test
	void testIceCream() {

		IceCream iceCream = new IceCream("eddie", 1350);
		IceCream savedIceCream = iceCreamRepository.save(iceCream);

		iceCreamService.updatePrice(savedIceCream.getId(), 3000);

		IceCream updatedIceCream = iceCreamRepository.findById(savedIceCream.getId()).get();

		Assertions.assertEquals(300, iceCreamRepository.findById(savedIceCream.getId()).get().getPrice());
	}

}
