package io.eddie.spring_study.service;

import io.eddie.spring_study.entity.IceCream;
import io.eddie.spring_study.repository.IceCreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IceCreamService {
    private static IceCreamRepository iceCreamRepository;

    @Autowired
    public IceCreamService(IceCreamRepository iceCreamRepository) {
        IceCreamService.iceCreamRepository = iceCreamRepository;
    }

    public IceCream createIceCream(IceCream iceCream) {
        return iceCreamRepository.save(iceCream);
    }

    @Transactional
    public void updatePrice(long id, int price) {
        IceCream target = iceCreamRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("No ice cream found"));

        target.setPrice(price);
    }

    public List<IceCream> getAllIceCreams() {
        return iceCreamRepository.findAll();
    }

}
