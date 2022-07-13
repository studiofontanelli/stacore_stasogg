/**
 * ServiziTauServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class ServiziTauServiceLocator extends org.apache.axis.client.Service implements it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauService {

    public ServiziTauServiceLocator() {
    }


    public ServiziTauServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiziTauServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiziTauFCDSB
    private java.lang.String ServiziTauFCDSB_address = "http://applogic.reteunitaria.piemonte.it/gmsrpsrvjApplGmsrpsrvjWsfad/services/ServiziTauFCDSB";

    public java.lang.String getServiziTauFCDSBAddress() {
        return ServiziTauFCDSB_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiziTauFCDSBWSDDServiceName = "ServiziTauFCDSB";

    public java.lang.String getServiziTauFCDSBWSDDServiceName() {
        return ServiziTauFCDSBWSDDServiceName;
    }

    public void setServiziTauFCDSBWSDDServiceName(java.lang.String name) {
        ServiziTauFCDSBWSDDServiceName = name;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTau getServiziTauFCDSB() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiziTauFCDSB_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiziTauFCDSB(endpoint);
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTau getServiziTauFCDSB(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauFCDSBSoapBindingStub _stub = new it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauFCDSBSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiziTauFCDSBWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiziTauFCDSBEndpointAddress(java.lang.String address) {
        ServiziTauFCDSB_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTau.class.isAssignableFrom(serviceEndpointInterface)) {
                it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauFCDSBSoapBindingStub _stub = new it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauFCDSBSoapBindingStub(new java.net.URL(ServiziTauFCDSB_address), this);
                _stub.setPortName(getServiziTauFCDSBWSDDServiceName());
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
        if ("ServiziTauFCDSB".equals(inputPortName)) {
            return getServiziTauFCDSB();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:gmsregsrv", "ServiziTauService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:gmsregsrv", "ServiziTauFCDSB"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiziTauFCDSB".equals(portName)) {
            setServiziTauFCDSBEndpointAddress(address);
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
