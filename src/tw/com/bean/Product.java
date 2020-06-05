package tw.com.bean;

import java.io.Serializable;

public class Product implements Serializable {

	private Integer id;
	private String name;
	private Integer price;
	private Integer remnant;

	public Product() {
		super();
	}

	public Product(Integer id, String name, Integer price, Integer remnant) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.remnant = remnant;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getRemnant() {
		return remnant;
	}

	public void setRemnant(Integer remnant) {
		this.remnant = remnant;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", remnant=" + remnant + "]";
	}

}
