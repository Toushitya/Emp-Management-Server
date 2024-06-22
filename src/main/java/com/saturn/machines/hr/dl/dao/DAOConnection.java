package com.saturn.machines.hr.dl.dao;

import com.saturn.machines.hr.dl.exceptions.*;
import java.sql.*;

public class DAOConnection
{
private DAOConnection()
{}

public static Connection getConnection() throws DAOException
{
Connection connection = null;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3308/hrdb","hr","hr");
}catch(Exception exception)
{
throw new DAOException(exception.getMessage());
}
return connection;
}
}