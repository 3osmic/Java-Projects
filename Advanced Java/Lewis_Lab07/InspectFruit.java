package lab9.start;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class InspectFruit {

	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
			new Banana(35.0, 20, "yellow"),
			new Banana(37.5, 100, "black"),
			new Banana(5.5, 5, "green"),
			new Banana(37.2, 20, "yellow"),
			new Kiwi(25.1, 19),
			new Kiwi(6.4, 3),
			new Kiwi(21.6, 10),
			new Kiwi(9.9, 5),
			new Kiwi(33.0, 9),
			new Coconut(67.0, 30),
			new Coconut(100.0, 100),
			new Coconut(45.9, 20),
			new Coconut(21.9, 2),
			new Coconut(9.0, 30)
		);
		
		FruitInspector goodInspector = fruit -> fruit.getWeight() >= 15.0
                && (fruit.getAge() <= 30 || fruit.hasHardShell())
                && !fruit.getColor().equalsIgnoreCase("black");
		
		FruitInspector badInspector = x -> {return true;};
		
		System.out.println("Let's inspect some fruits...");
		System.out.println("Good inspector: ");
		System.out.println("---------------");
		performInspection(fruits, goodInspector);
		System.out.println("Bad inspector: ");
		System.out.println("---------------");
		performInspection(fruits, badInspector);
	}
	
	private static void performInspection(Collection<Fruit> fruits, FruitInspector fruitInspector) {
		fruits.forEach(f -> {
			System.out.println("Inspection result of " + f + ": " + (fruitInspector.pass(f) ? "PASS" : "FAIL"));
		});
	}

}
