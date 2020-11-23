package sy;

public class SYMarks {
    private int computerTotal, mathsTotal, electronicsTotal;

	public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
		this.computerTotal = computerTotal;
		this.mathsTotal = mathsTotal;
		this.electronicsTotal = electronicsTotal;
	}

	public int totalMarks() {
		return this.computerTotal + this.mathsTotal + this.electronicsTotal;
	}
}