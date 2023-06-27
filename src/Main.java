
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		//Чтобы всю суть программы было легче понять, читайте комментарии к коду и файл ReadThis.md.
		//To make the whole essence of the program easier to understand, read the comments to the code and the file ReadThis.md.
		List<Phone> phones=new ArrayList<>();
		phones.add(new Phone("Apple","iPhone 11 128gb",53349));
		phones.add(new Phone("Apple","iPhone SE 2022 128gb",50799));
		phones.add(new Phone("Apple","iPhone iPhone 12 Mini 128gb",53199));
		phones.add(new Phone("Xiaomi","Redmi 12C 128gb",10499));
		phones.add(new Phone("Xiaomi","Redmi 10C 128gb",11999));
		phones.add(new Phone("Xiaomi","Redmi Note 10S 128gb",15999));
		phones.add(new Phone("realme","C25Y 128gb",10999));
		phones.add(new Phone("realme","9 128gb",19999));
		phones.add(new Phone("realme","NARZO 50 128gb",13999));
		//Создаем лист и добавляем в него телефоны через конструктор, в который надо ввести название, модель и цену телефона.
		//Create a sheet and add phones to it through the constructor, in which you need to enter the name, model and price of the phone.
		String manufacturer="Apple";
		List<Phone> listPhone=phones.stream().filter(phone->phone.getManufacturer().equals(manufacturer)).toList();
		System.out.println("Apple - "+listPhone+"\n");
		String manufacturer0="realme";
		List<Phone> listPhone0=phones.stream().filter(phone->phone.getManufacturer().equals(manufacturer0)).toList();
		System.out.println("realme - "+listPhone0+"\n");
		String manufacturer1="Xiaomi";
		List<Phone> listPhone1=phones.stream().filter(phone->phone.getManufacturer().equals(manufacturer1)).toList();
		System.out.println("Xiaomi - "+listPhone1+"\n___");
		//Сортируем телефоны по производителю.
		//We sort the phones by manufacturer.
		SortingAtALowerPrice sort=new SortingAtALowerPrice();
		//Я создал 2 класса с Comparator, чтобы сортировать телефоны по стоимости, sort - по возрастанию, sort0 - по убыванию.
		//I created 2 classes with Comparator to sort phones by cost, sort - ascending, sort0 - descending.
		List<Phone> sortingAtALowerPrice_realme=phones.stream().filter(phone->phone.getManufacturer().equals("realme")).sorted(sort).toList();
		System.out.println("Sort in ascending order (realme) - "+sortingAtALowerPrice_realme);
		SortingAtAHighPrice sort0=new SortingAtAHighPrice();
		List<Phone> sortingAtAHighPrice_realme=phones.stream().filter(phone->phone.getManufacturer().equals("realme")).sorted(sort0).toList();
		System.out.println("Sort in descending order (realme) - "+sortingAtAHighPrice_realme+"\n___");
		//Сейчас мы отсортировали телефоны realme по возрастанию, затем по убыванию, потом мы будем сортировать телефоны Apple по возрастанию и убыванию и тоже самое будет с Xiaomi и всеми телефонами в листе phones.
		//Now we have sorted realme phones in ascending order, then in descending order, then we will sort Apple phones in ascending and descending order, and the same will happen with Xiaomi and all phones in the phones list.
		//_____________________________________________________________________
		List<Phone> sortingAtALowerPrice_Apple=phones.stream().filter(phone->phone.getManufacturer().equals("Apple")).sorted(sort).toList();
		System.out.println("Sort in ascending order (Apple) - "+sortingAtALowerPrice_Apple);
		//_____________________________________________________________________
		List<Phone> sortingAtAHighPrice_Apple=phones.stream().filter(phone->phone.getManufacturer().equals("Apple")).sorted(sort0).toList();
		System.out.println("Sort in descending order (Apple) - "+sortingAtAHighPrice_Apple+"\n___");
		//_____________________________________________________________________
		List<Phone> sortingAtALowerPrice_Xiaomi=phones.stream().filter(phone->phone.getManufacturer().equals("Xiaomi")).sorted(sort).toList();
		System.out.println("Sort in ascending order (Xiaomi) - "+sortingAtALowerPrice_Xiaomi);
		//_____________________________________________________________________
		List<Phone> sortingAtAHighPrice_Xiaomi=phones.stream().filter(phone->phone.getManufacturer().equals("Xiaomi")).sorted(sort0).toList();
		System.out.println("Sort in descending order (Xiaomi) - "+sortingAtAHighPrice_Xiaomi+"\n___");
		//_____________________________________________________________________
		List<Phone> sortingAtALowerPrice_AllPhones=phones.stream().sorted(sort).toList();
		System.out.println("Sort in ascending order (All phones) - "+sortingAtALowerPrice_AllPhones+"\n");
		//_____________________________________________________________________
		List<Phone> sortingAtAHighPrice_AllPhones=phones.stream().sorted(sort0).toList();
		System.out.println("Sort in descending order (All phones) - "+sortingAtAHighPrice_AllPhones);
		
	}
}
