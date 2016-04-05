/**
 * WSRIConsultazioneCatalogoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WSRIConsultazioneCatalogoServiceLocator extends org.apache.axis.client.Service implements it.test.kion.WSRIConsultazioneCatalogoService {

    public WSRIConsultazioneCatalogoServiceLocator() {
    }


    public WSRIConsultazioneCatalogoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSRIConsultazioneCatalogoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSRIConsultazioneCatalogoPort
    private java.lang.String WSRIConsultazioneCatalogoPort_address = "https://test.univr.iris.cineca.it/webservices/";

    public java.lang.String getWSRIConsultazioneCatalogoPortAddress() {
        return WSRIConsultazioneCatalogoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSRIConsultazioneCatalogoPortWSDDServiceName = "WSRIConsultazioneCatalogoPort";

    public java.lang.String getWSRIConsultazioneCatalogoPortWSDDServiceName() {
        return WSRIConsultazioneCatalogoPortWSDDServiceName;
    }

    public void setWSRIConsultazioneCatalogoPortWSDDServiceName(java.lang.String name) {
        WSRIConsultazioneCatalogoPortWSDDServiceName = name;
    }

    public it.test.kion.WSRIConsultazioneCatalogo getWSRIConsultazioneCatalogoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSRIConsultazioneCatalogoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSRIConsultazioneCatalogoPort(endpoint);
    }

    public it.test.kion.WSRIConsultazioneCatalogo getWSRIConsultazioneCatalogoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.test.kion.WSRIConsultazioneCatalogoPortBindingStub _stub = new it.test.kion.WSRIConsultazioneCatalogoPortBindingStub(portAddress, this);
            _stub.setPortName(getWSRIConsultazioneCatalogoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSRIConsultazioneCatalogoPortEndpointAddress(java.lang.String address) {
        WSRIConsultazioneCatalogoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.test.kion.WSRIConsultazioneCatalogo.class.isAssignableFrom(serviceEndpointInterface)) {
                it.test.kion.WSRIConsultazioneCatalogoPortBindingStub _stub = new it.test.kion.WSRIConsultazioneCatalogoPortBindingStub(new java.net.URL(WSRIConsultazioneCatalogoPort_address), this);
                _stub.setPortName(getWSRIConsultazioneCatalogoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSRIConsultazioneCatalogoPort".equals(inputPortName)) {
            return getWSRIConsultazioneCatalogoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "WSRIConsultazioneCatalogoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "WSRIConsultazioneCatalogoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSRIConsultazioneCatalogoPort".equals(portName)) {
            setWSRIConsultazioneCatalogoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
