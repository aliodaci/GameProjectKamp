package Concrete;


import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService{
	
	ICustomerCheckService customerCheckService;
	boolean checked=false;
		
	public CustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if (customerCheckService.checkIfRealPerson(customer)) {
			checked=true;
			System.out.println("Oyuncu kaydedildi: "+customer.getFirstName()+" "+customer.getLastName());
		}else {
			checked=false;
			System.out.println("Not a valid found");
		}
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public boolean isCheck() {
		return checked;
	}

}
