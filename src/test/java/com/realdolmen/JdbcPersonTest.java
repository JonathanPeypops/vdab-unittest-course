package com.realdolmen;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class JdbcPersonTest {
    @Before
    public void initializeDataSets() throws Exception {
        Connection jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "Jonathan", "");
        IDatabaseConnection databaseConnection = new DatabaseConnection(jdbcConnection);

        IDataSet dataSet =
                new FlatXmlDataSetBuilder().build(new File("people.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(databaseConnection, dataSet);

    }
        private PersonRepository repository = new JdbcPersonRepository();

    @Test
    public void testPersonName() throws Exception{
        Person person = repository.find(1);
        assertEquals("Jimi",person.getFirstName());
        assertEquals("Hendrix",person.getLastName());
    }

    @Test
    public void testPersonId() throws Exception {
        Person person = repository.find(1);
        repository.remove(person);
        Person p = repository.find(1);
        assertNull(p);
    }

    @Test
    public void testPersonSave() throws Exception {
    }
}