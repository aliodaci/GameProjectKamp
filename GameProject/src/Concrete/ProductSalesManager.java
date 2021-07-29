package Concrete;

import Abstract.IProductSalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class ProductSalesManager implements IProductSalesService{

	@Override
	public void productGame(Customer customer, Product product, Campaign campaign) {
		// TODO Auto-generated method stub
		double productPrice=product.getPrice()-campaign.getCampaignDiscount();
		System.out.println(product.getProductName()+" game sold to "+customer.getFirstName()+" "+customer.getLastName() +" and price with discount is :"+productPrice);
	}

}
