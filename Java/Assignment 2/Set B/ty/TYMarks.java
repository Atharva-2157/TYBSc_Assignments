package ty;

public class TYMarks {
    private int theory, practical;

    public TYMarks(int theory, int practical) {
        this.theory = theory;
        this.practical = practical;
    }

    public int totalMarks() {
        return this.theory + this.practical;
    }
}