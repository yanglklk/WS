/**
 * HelloWorld_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface HelloWorld_PortType extends java.rmi.Remote {
    public double add(double a, double b) throws java.rmi.RemoteException;
    public double sqrt(double a) throws java.rmi.RemoteException;
    public double divide(double a, double b) throws java.rmi.RemoteException;
    public double multiply(double a, double b) throws java.rmi.RemoteException;
    public double power(double a) throws java.rmi.RemoteException;
    public double minus(double a, double b) throws java.rmi.RemoteException;
}
