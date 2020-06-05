package tw.com.factory;

import tw.com.dao.ProductDao;
import tw.com.daoImpl.ProductDaoImpl;

public class ProductFactory {
	
	public static ProductDao getProductFactory () {
		return new ProductDaoImpl();
	}
	

}
