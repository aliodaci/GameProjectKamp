package Adaptors;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer){
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		boolean result=true;
		
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toLowerCase(),
					customer.getLastName(), 
					customer.getBirthDatetime());
			
		} catch (NumberFormatException | RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		return result;
		
		
	}

}
