package com.rms.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/add-train")
    public String addTrain() {
        return "Train added by Admin";
    }

    @DeleteMapping("/delete-train/{id}")
    public String deleteTrain(@PathVariable Long id) {
        return "Train deleted by Admin";
    }
}
