package com.ame.library.dao;

import com.ame.library.entity.Admin;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@Repository
public interface AdminDao extends Mapper<Admin> {

    List<Admin> getAll();
}