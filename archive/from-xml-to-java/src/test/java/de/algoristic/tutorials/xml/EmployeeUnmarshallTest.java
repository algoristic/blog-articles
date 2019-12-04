package de.algoristic.tutorials.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeUnmarshallTest {
    
    File xml;
    
    @BeforeEach
    void loadFile() {
        xml = new File("src/test/resources/employee.xml");
    }
    
    @Test
    void unmarshallTestFile() {
        Employee employee = JAXB.unmarshal(xml, Employee.class);
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
