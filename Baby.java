import java.util.*;

public class Baby implements Subject {
	private Cry cry;//creates instance of the cry list
	private ArrayList<Observer> observers; //creates an observer arraylist
	public Baby() {//constructor for baby
		System.out.println("a baby is born");
		 observers = new ArrayList<Observer>();
		 
	}
	public void hungryCry() {//creates the sayings for all the cries while notifying the mom and dad of which used
		cry = Cry.hungryCry;
		System.out.println("this baby is hungry");
		notifyObservers();
	}
	public void angryCry() {
		cry= Cry.angryCry;
		System.out.println("this baby is angry!");
		notifyObservers();
	}
	public void wetCry() {
		cry = Cry.wetCry;
		System.out.println("this baby is wet");
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer observer) {//adds observers 
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {//removes observers
		observers.remove(observer);
		
	}
	@Override
	public void notifyObservers() {//for each observer it will update the cry to them
		for(Observer observer : observers) {
			observer.update(cry);
		}
	}
}
