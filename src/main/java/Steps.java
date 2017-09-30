public enum Steps {
    UP(1),
    DOWN(2),
    LEFT(3),
    RIGHT(4),
    SLEEP(5);

    private int numberOfField;

    Steps(int numberOfField) {
        this.numberOfField = numberOfField;
    }

    public int getNumberOfField() {
        return numberOfField;
    }
}
