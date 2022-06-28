package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {
//
//    @Autowired
//    private EmployeeDao  employeeDao;
//    private CompanyDao companyDao;
//
//    @Test
//    void testSaveManyToMany() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //Then
//        assertNotEquals(0, softwareMachineId);
//        assertNotEquals(0, dataMaestersId);
//        assertNotEquals(0, greyMatterId);
//
//        //CleanUp
//        try {
//            companyDao.deleteById(softwareMachineId);
//            companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//        } catch (Exception e) {
//           //do nothing
//        }
//    }
//
//    @Test
//    void testRetrieveCompaniesThatStartWith() {
//        //Given
//        Employee jeager = new Employee("Jeager", "Eren");
//
//        Company company1 = new Company("Easy Software");
//        Company company2 = new Company("Medium Software");
//        Company company3 = new Company("Hard Software");
//
//        company1.getEmployees().add(jeager);
//        company2.getEmployees().add(jeager);
//        company3.getEmployees().add(jeager);
//
//        jeager.getCompanies().add(company1);
//        jeager.getCompanies().add(company3);
//        jeager.getCompanies().add(company2);
//
//        //When
//        companyDao.save(company1);
//        companyDao.save(company2);
//        companyDao.save(company3);
//        List<Company> retrievedCompanies = companyDao.retrieveCompaniesThatStartWith("Hard");
//
//        //Then
//        assertNotEquals(retrievedCompanies.get(0).getId(), company1.getId());
//        assertNotEquals(retrievedCompanies.get(0).getId(), company2.getId());
//        assertEquals(retrievedCompanies.get(0).getId(), company3.getId());
//
//        //CleanUp
//        try {
//            companyDao.deleteById(company1.getId());
//            companyDao.deleteById(company2.getId());
//            companyDao.deleteById(company3.getId());
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//
//    @Test
//    void testRetrieveEmployeeWhoseNameIs() {
//        //Given
//        Employee jeager = new Employee("Jeager", "Eren");
//        Employee steven = new Employee("Steven", "Holms");
//        Employee darklord = new Employee("DarkLord", "WhiteLord");
//
//        Company company1 = new Company("Easy Software");
//        Company company2 = new Company("Medium Software");
//        Company company3 = new Company("Hard Software");
//
//        company1.getEmployees().add(jeager);
//        company2.getEmployees().add(darklord);
//        company3.getEmployees().add(steven);
//
//        jeager.getCompanies().add(company1);
//        steven.getCompanies().add(company3);
//        darklord.getCompanies().add(company2);
//
//        //When
//        employeeDao.save(jeager);
//        employeeDao.save(steven);
//        employeeDao.save(darklord);
//        List<Employee> retrievedEmployees = employeeDao.retrieveEmployeeWhoseNameIs("Eren");
//
//        //Then
//        assertNotEquals(retrievedEmployees.get(0).getId(), jeager.getId());
//        assertNotEquals(retrievedEmployees.get(0).getId(), steven.getId());
//        assertEquals(retrievedEmployees.get(0).getId(), darklord.getId());
//
//        //CleanUp
//        try {
//            companyDao.deleteById(company1.getId());
//            companyDao.deleteById(company2.getId());
//            companyDao.deleteById(company3.getId());
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
}