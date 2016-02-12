package lecture5;

public class Fruit {
	protected String name;

	public void adjustPriceDuringSale() {
		price = price - 0.2f * price;
	}

	public String getName() {
		return name;
	}

	private float price;

	public Fruit() {
		price = 1;
		numberOfDaysInTheShop = 1;
	}

	public Fruit(int price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public FruitColor getColor() {
		return color;
	}

	public void setColor(FruitColor color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getNumberOfDaysInTheShop() {
		return numberOfDaysInTheShop;
	}

	public void setNumberOfDaysInTheShop(int numberOfDaysInTheShop) {
		this.numberOfDaysInTheShop = numberOfDaysInTheShop;
	}

	private FruitColor color;
	private float weight;
	private int numberOfDaysInTheShop;

	public boolean isTasty() {
		if (numberOfDaysInTheShop < 4) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isExpensive() {
		if (price > 3) {
			return true;
		} else {
			return false;
		}
	}

	public String getInfo() {
		return "Price -> " + price + " Color -> " + color + " Tasty -> "
				+ isTasty() + " Expensive -> " + isExpensive() + " weight -> "
				+ weight + " numberOfDaysInShop -> " + numberOfDaysInTheShop;
	}
}

enum FruitColor {
	RED, YELLOW, ORANGE
}
