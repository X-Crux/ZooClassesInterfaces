/**
 * Модель распределения экзотических животных в зоопарке.
 *
 * В зоопарк может попасть только экзотическое животное.
 * Под каждое экзотическое животное в зоопарке выделается один вольер.
 * В вольере может находиться только одно экзотическое животное.
 * Вольер, выделяемый для животного, может быть теплым или холодным, в зависимости от
 * конкретного животного, которое будет там находиться.
 * **/

package com.company;

public class Main {

    public static void main(String[] args) {
		System.out.print("\nИнициализация существ и реализация методов say() и motion() у всех существ:");
	    Leon leon = new Leon("Givi");
		System.out.print("\nЛев по имени " + leon.getName() + " -- ");
		leon.say();
	    Cat cat = new Cat("Pushok");
		System.out.print("\nКот по имени " + cat.getName() + " -- ");
		cat.say();
	    Penguin penguin = new Penguin("Betty");
		System.out.print("\nПингвин по имени " + penguin.getName() + " -- ");
		penguin.motion();
	    Dove dove = new Dove("Stinky");
		System.out.print("\nГолубь по имени " + dove.getName() + " -- ");
		dove.motion();

	    Zoo zoo = new Zoo();
		zoo.setAllWishingZoo(leon);
		zoo.setAllWishingZoo(cat);
		zoo.setAllWishingZoo(penguin);
		zoo.setAllWishingZoo(dove);
        zoo.distribution();
        zoo.display();
		zoo.getAllWishingZoo().clear();
		if (zoo.getAllWishingZoo().size() == 0){
			System.out.println("\nСписок желающих пустой.");
		} else {
			System.out.println("Список желающих не пустой.");
		}
    }
}
