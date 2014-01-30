/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.phone;

import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import nl.amnesty.crm.entity.Phone;

/**
 *
 * @author ed
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class PhoneCRUD {

    /**
     * Web service operation
     
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }
    */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "create")
    public long create(
            @WebParam(name = "Number") long number) {
        //TODO write your implementation code here:
        long phoneid = 123456789;
        return phoneid;
    }
    

    /**
     * Web service operation
     
    @WebMethod(operationName = "read")
    public Phone read(@WebParam(name = "Phoneid") long phoneid) {
        //TODO write your implementation code here:
        Phone phone = new Phone();
        phone.setNumber(987654321);
        return phone;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(long phoneid) {
        //TODO write your implementation code here:
        return phoneid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(long phoneid) {
        //TODO write your implementation code here:
        return phoneid;
    }
    */
}
