/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webapp.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.webapp.repository.EmployeeRepository;

import javax.sql.DataSource;

/**
 *
 * @author Sathish V
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(
        executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
        scripts = {"/data/employee.sql"}
)
public class EmployeeRepositoryTest {
    
    @Autowired
    private EmployeeRepository er;
    
    @Autowired
    private DataSource ds;
    

    
    @Test
    public void testHitung(){
        Long jumlah = er.count();
        Assert.assertEquals(3L, jumlah.longValue());
    }
    
}
