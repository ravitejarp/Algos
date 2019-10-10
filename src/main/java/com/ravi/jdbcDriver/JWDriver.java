package com.ravi.jdbcDriver;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class JWDriver implements Driver {

    static {
        try {
            // Register the JWDriver with DriverManager
            JWDriver driverInst = new JWDriver();
            DriverManager.registerDriver(driverInst);
            System.setSecurityManager(new RMISecurityManager());
        } catch (SQLException e) {

        } finally {

        }

    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        if (remoteDriver == null) {
            remoteDriver = RemoteDriver)Naming.lookup("rmi://" + serverName
                    + ":1099" + "/RemoteDriver");
        }
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
