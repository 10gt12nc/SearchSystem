package tw.com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.bean.Product;
import tw.com.dao.ProductDao;
import tw.com.dbutils.DBConnectionUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAllProduct() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();

		try {
			conn = DBConnectionUtils.getDB().getConnection();
			String sql = "select * from shoes ";

			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				int remnant = rs.getInt(4);

				Product product = new Product(id, name, price, remnant);
				list.add(product);
			}

		} catch (Exception e) {

		} finally {

			DBConnectionUtils.getDB().close(rs);
			DBConnectionUtils.getDB().close(ps);
			DBConnectionUtils.getDB().close(conn);

		}

		return list;
	}

	@Override
	public int getProductCheck(String product, int i) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnectionUtils.getDB().getConnection();
			String sql = "select id from shoes where 名稱=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, product);
			rs = ps.executeQuery();

			if (rs.next()) {
				int count = rs.getInt(1);
				if (count > 0)
					i += 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBConnectionUtils.getDB().close(rs);
			DBConnectionUtils.getDB().close(ps);
			DBConnectionUtils.getDB().close(conn);
		}
		return i;
	}

}
