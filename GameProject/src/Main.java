import Adaptors.MernisServiceAdapters;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.ProductManager;
import Concrete.ProductSalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer gamer1=new Customer(1, "Ali", "Odacı", "25633864928", 1991);
		
		CustomerManager gamerManager=new CustomerManager(new MernisServiceAdapters());
		gamerManager.add(gamer1);
		
		Product product=new Product(1, "Pubg Mobile", 170);
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
		Campaign campaign=new Campaign(1, "friday campaign", 100);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		
		ProductSalesManager prdSalesManager=new ProductSalesManager();
		if (gamerManager.isCheck()) {
			prdSalesManager.productGame(gamer1, product, campaign);
		}
	}

}
