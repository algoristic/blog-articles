package de.algoristic.tutorials.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeMarshallTest {
    
    File xml;
    Employee employee;
    
    @BeforeEach
    void createEmployee() throws Exception {
        employee = new Employee();
        employee.setGender("m");
        employee.setPersonnelNumber(1337);
        
        Birthday birthday = new Birthday();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "1977-05-04";
        Date date = dateFormat.parse(dateString);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance(); 
        XMLGregorianCalendar xmlDate = datatypeFactory.newXMLGregorianCalendar(calendar);
        birthday.setDate(xmlDate);
        birthday.setLocation("Modesto, California");
        employee.setBirthday(birthday);
        
        Name name = new Name();
        name.setForename("Boba");
        name.setSurname("Fett");
        Titles titles = new Titles();
        titles.getTitle().add("Prof. Dr.");
        titles.getTitle().add("Dr.");
        name.setTitles(titles);
        employee.setName(name);
        
        Contact contact = new Contact();
        Address address = new Address();
        City city = new City();
        city.setPostalCode("90038");
        city.setState("CA");
        city.setValue("Los Angeles");
        address.setCity(city);
        Street street = new Street();
        street.setHouseNumber("1200 - 1298");
        street.setValue("Tamarind Ave");
        address.setStreet(street);
        contact.setAddress(address);
        employee.setContact(contact);
    }
    
    @BeforeEach
    void createTestFile() throws Exception {
        xml = new File("src/test/resources/employee-2.xml");
        xml.createNewFile();
    }
    
    @AfterEach
    void removeTestFile() throws Exception {
        xml.delete();
    }
    
    @Test
    void marshallTestObject() {
        JAXB.marshal(employee, xml);
        employee = JAXB.unmarshal(xml, Employee.class);
        Integer personnelNumber = employee.getPersonnelNumber();
        assertEquals(1337, personnelNumber);
        Name name = employee.getName();
        String forename = name.getForename();
        assertEquals("Boba", forename);
        Titles titles = name.getTitles();
        List<String> actualTitles = titles.getTitle();
        String firstTitle = actualTitles.get(0);
        assertEquals("Prof. Dr.", firstTitle);
    }

}
