
public class Mom implements Observer {
	private Subject Baby;//creates the instance of the baby
	public Mom(Subject Baby) {
		this.Baby = Baby;//constructor for the baby
		Baby.registerObserver(this);//make the baby an observer in this instance
		
	}
	@Override//makes the cry list
	public void update(Cry cry) {//depending on the type of cry responds in different ways
		if(cry == Cry.angryCry) {
			System.out.println("mom hugs and rocks baby, maybe spoiling");
		}
		if(cry == Cry.hungryCry) {
			System.out.println("mom cuddles and feeds baby");
		}
		if(cry == Cry.wetCry) {
			System.out.println("mom changes baby");
		}
	}
	
	
}
