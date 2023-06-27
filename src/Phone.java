
public class Phone {
	private String manufacturer, model;
	private int price;
	public Phone(String manufacturer,String model,int price) {
		this.manufacturer=manufacturer;
		this.model=model;
		this.price=price;
	}
	//Создаем конструктор с производителем телефона, его моделью и ценой, также, так как сами переменные имеют модификатор доступа priate, я создал методы для их получения (getters).
	//We are creating a constructor with the phone manufacturer, its model and price, also, since the variables themselves have a priate access modifier, I created methods to get them (getters).
	public String getManufacturer() {
		return manufacturer;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price; 
	}
	@Override
	public String toString() {
		return manufacturer+" "+model+" - "+price+" rubles (rus)";
	}
}