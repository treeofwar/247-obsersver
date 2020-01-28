
public class Dad implements Observer {
	private Subject Baby;//creates the instance of the baby
	public Dad(Subject Baby) {
		this.Baby = Baby;//constructor for the baby
		Baby.registerObserver(this);//make the baby an observer in this instance
		
	}
	@Override
	public void update(Cry cry) {//makes the cry list
		if(cry == Cry.hungryCry) {
			System.out.println("dad feeds baby");//depending on the type of cry responds in different ways
			
		}
		else if(cry == Cry.angryCry) {
			System.out.println("dad puts in earplugs");
		}
		else if(cry == Cry.wetCry) {
			System.out.println("dad calls mom");
		}
		
	}
	
}
