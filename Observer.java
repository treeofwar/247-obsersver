enum Cry { hungryCry, angryCry, wetCry }; //creates enums for each type of cry
public interface Observer  {
	public void update(Cry cry);//will update depending on cry
}
