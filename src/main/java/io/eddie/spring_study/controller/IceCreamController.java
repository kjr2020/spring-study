package io.eddie.spring_study.controller;

import io.eddie.spring_study.service.IceCreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class IceCreamController {
    private final IceCreamService iceCreamService;

    @Autowired
    public IceCreamController(IceCreamService iceCreamService) {
        this.iceCreamService = iceCreamService;
    }


}
