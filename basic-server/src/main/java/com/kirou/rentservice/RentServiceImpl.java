package com.kirou.rentservice;

import com.kirou.landlord.Landlord;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RentServiceImpl implements RentService {
    @Resource
    private Landlord landlord;
    public void rent() {
        landlord.service();
    }
}
