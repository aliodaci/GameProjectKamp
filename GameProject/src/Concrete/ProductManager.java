package Concrete;

import Abstract.IProductervice;
import Entities.Product;

public class ProductManager implements IProductervice {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" oyun veritabanına kaydedildi.");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" oyun veritabanında güncellendi.");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" oyun veritabanından silindi.");
	}

}
