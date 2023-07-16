package com.baanBaini.sellers.controllers;

import com.baanBaini.commons.utils.CheckAccess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public String testAccess(){
        return CheckAccess.getMessage();
    }
}
