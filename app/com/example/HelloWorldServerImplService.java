
package com.example;

import play.Application;
import play.api.Play;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWorldServerImplService", targetNamespace = "http://example.com/", wsdlLocation = "conf/wsdl/simple_soap.wsdl")
public class HelloWorldServerImplService
    extends Service
{

    private static URL HELLOWORLDSERVERIMPLSERVICE_WSDL_LOCATION;
    private static WebServiceException HELLOWORLDSERVERIMPLSERVICE_EXCEPTION;
    private final static QName HELLOWORLDSERVERIMPLSERVICE_QNAME = new QName("http://example.com/", "HelloWorldServerImplService");

    static {
        WebServiceException e = null;
        try {
            HELLOWORLDSERVERIMPLSERVICE_WSDL_LOCATION =Play.current().classloader().getResource("wsdl/simple_soap.wsdl");
        } catch (Exception ex) {
            e = new WebServiceException("Cannot find 'conf/wsdl/simple_soap.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        HELLOWORLDSERVERIMPLSERVICE_EXCEPTION = e;
    }

    public HelloWorldServerImplService() {
        super(__getWsdlLocation(), HELLOWORLDSERVERIMPLSERVICE_QNAME);
    }

    public HelloWorldServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDSERVERIMPLSERVICE_QNAME, features);
    }

    public HelloWorldServerImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDSERVERIMPLSERVICE_QNAME);
    }

    public HelloWorldServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDSERVERIMPLSERVICE_QNAME, features);
    }

    public HelloWorldServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorldServer
     */
    @WebEndpoint(name = "HelloWorldServerImplPort")
    public HelloWorldServer getHelloWorldServerImplPort() {
        return super.getPort(new QName("http://example.com/", "HelloWorldServerImplPort"), HelloWorldServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldServer
     */
    @WebEndpoint(name = "HelloWorldServerImplPort")
    public HelloWorldServer getHelloWorldServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.com/", "HelloWorldServerImplPort"), HelloWorldServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDSERVERIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDSERVERIMPLSERVICE_EXCEPTION;
        }
        return HELLOWORLDSERVERIMPLSERVICE_WSDL_LOCATION;
    }

}