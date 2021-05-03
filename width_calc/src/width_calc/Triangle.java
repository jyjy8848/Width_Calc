package width_calc;

public class Triangle implements Width {
	private int value1;
	private int value2;
	
	@Override
	public void setData(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public double cale() {
		return (double)this.value1 * (double)this.value2 / 2.0;
	}

}
