//ben duker
public interface Subject {
	void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	
}
