package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public interface IProductSalesService {
	void productGame(Customer customer, Product product, Campaign campaign);
}
