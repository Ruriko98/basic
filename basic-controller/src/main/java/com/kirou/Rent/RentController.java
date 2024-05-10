package com.kirou.Rent;

import com.kirou.rentservice.RentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentController {
    @Resource
    private RentService rentService;

    @GetMapping("/rent")
    public void rent() {
        rentService.rent();
    }
}

