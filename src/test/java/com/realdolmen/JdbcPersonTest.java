package com.realdolmen;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcPersonTest {
    @Before
    public void initializeDataSets() throws Exception {
        Connection jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "Jonathan", "root");
        IDatabaseConnection databaseConnection = new DatabaseConnection(jdbcConnection);

        IDataSet dataSet =
                new FlatXmlDataSetBuilder().build(new File("data.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(databaseConnection, dataSet);
    }
}