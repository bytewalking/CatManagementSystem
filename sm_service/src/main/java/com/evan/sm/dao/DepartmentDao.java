package com.evan.sm.dao;

import com.evan.sm.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void delete(Integer id);
    void update(Department department);
    Department selectById(Integer id);
    List<Department> selectAll();
}
