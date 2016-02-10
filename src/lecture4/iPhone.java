package lecture4;

public class iPhone {


	private int memory;
	private Color color;
	private String version;
	private Cover cover;

	public iPhone() {
		/*memory = 64;
		color = Color.SILVER;
		version = "6s";
		cover = null;*/
		this(64);
	}

	public iPhone(int memory) {
		/*this.memory = memory;
		color = Color.SILVER;
		version = "6";
		cover = null;*/
		this(memory,Color.SILVER);
	}

	public iPhone(int memory, Color color) {
		/*this.memory = memory;
		this.color = color;
		version = "6s";
		cover = null;*/
		this(memory,color,"6s");
	}

	public iPhone(int memory, Color color, String version) {
		setMemory(memory);
		this.color = color;
		this.version = version;
		cover = null;
	}
	
	private void setMemory(int memory){
		this.memory = memory;
	}

	public String getInfo() {
		return "Color = " + color + " : Memory = " + memory + " : Version = "
				+ version + " : Has Cover = " + hasCover();
	}

	private boolean hasCover() {
		if (cover == null) {
			return false;
		}
		return true;
	}

	public void setCover(Cover cover2) {
		this.cover = cover2;
		
	}
}

enum Color {
	GOLD, WHITE, SILVER, PINK;
}

class Cover {
	private int price;
	public Cover(int price){
		this.price = price;
	}

}