package tw.com.dao;

import java.util.List;

import tw.com.bean.Product;

public interface ProductDao {

	// 驗證
	public int getProductCheck(String product, int i);

	// 取得所有資訊
	public List<Product> getAllProduct();
	
	
}
