package tw.com.Test;

import org.junit.jupiter.api.Test;

import tw.com.daoImpl.ProductDaoImpl;

public class TTest {
	
	@Test
	public void getTest() {
		
		String searchname = "慢跑鞋";
		int i = 0;

		ProductDaoImpl pdl = new ProductDaoImpl();
		int pname = pdl.getProductCheck(searchname, i);
		
		System.out.println(pname);
	}
	
}
