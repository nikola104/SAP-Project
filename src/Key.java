

public class Key {
	private String brand;
	private String model;
	private String description;
	
	public Key(String brand, String model, String description) {
		this.setBrand(brand);
		this.setModel(model);
		this.setDescription(description);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Brand=" + brand + ", Model=" + model + ", Description=" + description;
	}
	
	
	
}
