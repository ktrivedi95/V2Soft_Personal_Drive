
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.v2soft.ws.example.employeeforhr;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-09-04T16:37:02.392+05:30
 * Generated source version: 3.3.2
 *
 */

@javax.jws.WebService(
                      serviceName = "EmployeeForHrService",
                      portName = "EmployeeForHrPort",
                      targetNamespace = "http://localhost:8080",
                      wsdlLocation = "file:/C:/Bari/Training/EmployeeSOAP/WSDL/employee_for_hr.wsdl",
                      endpointInterface = "com.v2soft.ws.example.employeeforhr.EmployeeForHr")

public class EmployeeForHrPortImpl implements EmployeeForHr {

    private static final Logger LOG = Logger.getLogger(EmployeeForHrPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.v2soft.ws.example.employeeforhr.EmployeeForHr#createEmployee(com.v2soft.ws.example.employeeforhr.CreateEmployeeRequestWithSecurity in)*
     */
    public com.v2soft.ws.example.employeeforhr.EmployeeWithoutSalary createEmployee(CreateEmployeeRequestWithSecurity in) {
        LOG.info("Executing operation createEmployee");
        System.out.println(in);
        try {
            com.v2soft.ws.example.employeeforhr.EmployeeWithoutSalary _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
