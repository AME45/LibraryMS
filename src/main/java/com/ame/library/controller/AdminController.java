package com.ame.library.controller;

import com.ame.library.entity.Admin;
import jakarta.annotation.Resource;
import com.ame.library.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    AdminService adminService;

    @GetMapping("/alldata")
    public List<Admin> getData() {

        return adminService.GetAll();
    }
}
