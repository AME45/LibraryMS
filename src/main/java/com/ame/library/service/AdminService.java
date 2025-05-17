package com.ame.library.service;

import com.ame.library.dao.AdminDao;
import com.ame.library.entity.Admin;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Resource
    private AdminDao adminDao;

    public List<Admin> GetAll(){
        return adminDao.selectAll();
    }

}