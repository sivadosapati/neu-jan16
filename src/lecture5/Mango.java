package lecture5;

public class Mango extends Fruit {

	public Mango() {
		super(2);
	}

	@Override
	public void adjustPriceDuringSale() {
		float p = super.getPrice();
		p = p - 0.1f * p;
		super.setPrice(p);
	}

	public void displayName() {
		System.out.println(name);
	}

	@Override
	public boolean isExpensive() {
		if (!isTasty()) {
			return super.isExpensive();
		}
		if (getPrice() > 20) {
			return true;
		}
		return false;
	}

	public boolean isPeelable() {
		return true;
	}

	public boolean isJuicy() {
		return true;
	}
}
