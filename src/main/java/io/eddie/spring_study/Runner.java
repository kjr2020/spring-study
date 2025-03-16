package io.eddie.spring_study;

import io.eddie.spring_study.entity.IceCream;
import io.eddie.spring_study.repository.IceCreamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final IceCreamRepository iceCreamRepository;

    public Runner(IceCreamRepository iceCreamRepository) {
        this.iceCreamRepository = iceCreamRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        IceCream chocolate = new IceCream("Chocolate", 1500);
        IceCream strawberry = new IceCream("Strawberry", 1900);

        iceCreamRepository.save(chocolate);
        iceCreamRepository.save(strawberry);

        System.out.println("=== IceCream List ===");
        iceCreamRepository.findAll().forEach(iceCream -> {
            System.out.println("ID: " + iceCream.getId());
            System.out.println("Name: " + iceCream.getName());
            System.out.println("Price: " + iceCream.getPrice());
            System.out.println("-------------------");
        });
    }
}
