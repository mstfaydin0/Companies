package com.company.adapters;

import com.company.abstracts.CustomerCheckService;
import com.company.entities.Customer;
import com.company.ws.tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        KPSPublicSoap soapClient = new KPSPublicSoapProxy();
        boolean result = false;
        try {
            result = soapClient.TCKimlikNoDogrula((customer.getNationalityId()),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getDateOfBirth());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }
}
