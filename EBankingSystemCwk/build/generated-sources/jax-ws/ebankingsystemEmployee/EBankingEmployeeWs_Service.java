
package ebankingsystemEmployee;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EBankingEmployee_ws", targetNamespace = "http://ebankingEmployee/", wsdlLocation = "http://localhost:8080/EBankingEmployee_ws/EBankingEmployee_ws?wsdl")
public class EBankingEmployeeWs_Service
    extends Service
{

    private final static URL EBANKINGEMPLOYEEWS_WSDL_LOCATION;
    private final static WebServiceException EBANKINGEMPLOYEEWS_EXCEPTION;
    private final static QName EBANKINGEMPLOYEEWS_QNAME = new QName("http://ebankingEmployee/", "EBankingEmployee_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EBankingEmployee_ws/EBankingEmployee_ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EBANKINGEMPLOYEEWS_WSDL_LOCATION = url;
        EBANKINGEMPLOYEEWS_EXCEPTION = e;
    }

    public EBankingEmployeeWs_Service() {
        super(__getWsdlLocation(), EBANKINGEMPLOYEEWS_QNAME);
    }

    public EBankingEmployeeWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EBANKINGEMPLOYEEWS_QNAME, features);
    }

    public EBankingEmployeeWs_Service(URL wsdlLocation) {
        super(wsdlLocation, EBANKINGEMPLOYEEWS_QNAME);
    }

    public EBankingEmployeeWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EBANKINGEMPLOYEEWS_QNAME, features);
    }

    public EBankingEmployeeWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EBankingEmployeeWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EBankingEmployeeWs
     */
    @WebEndpoint(name = "EBankingEmployee_wsPort")
    public EBankingEmployeeWs getEBankingEmployeeWsPort() {
        return super.getPort(new QName("http://ebankingEmployee/", "EBankingEmployee_wsPort"), EBankingEmployeeWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EBankingEmployeeWs
     */
    @WebEndpoint(name = "EBankingEmployee_wsPort")
    public EBankingEmployeeWs getEBankingEmployeeWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ebankingEmployee/", "EBankingEmployee_wsPort"), EBankingEmployeeWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EBANKINGEMPLOYEEWS_EXCEPTION!= null) {
            throw EBANKINGEMPLOYEEWS_EXCEPTION;
        }
        return EBANKINGEMPLOYEEWS_WSDL_LOCATION;
    }

}
