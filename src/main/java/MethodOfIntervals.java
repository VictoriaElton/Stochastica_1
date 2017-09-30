public class MethodOfIntervals {
    private Double randomValue;
    private Double up;
    private Double down;
    private Double left;
    private Double right;
    private Double sleep;

    public MethodOfIntervals(Double up, Double down, Double left, Double right, Double sleep) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.sleep = sleep;
    }

    public Double[] getIntervals() {
        Double[] result = new Double[7];
        result[0] = 0.0;
        result[1] = up;
        result[2] = result[1] + down;
        result[3] = result[2] + left;
        result[4] = result[3] + right;
        result[5] = 1.0;

        return result;
    }

    public Steps getStep(Double[] intervals) {
        Steps result;
        randomValue = Math.random();

        if (randomValue < intervals[1]) {
            result = Steps.UP;
        } else {
            if (intervals[1] < randomValue && randomValue < intervals[2]) {
                result = Steps.DOWN;
            } else {
                if (intervals[2] < randomValue && randomValue < intervals[3]) {
                    result = Steps.LEFT;
                } else {
                    if (intervals[3] < randomValue && randomValue < intervals[4]) {
                        result = Steps.RIGHT;
                    } else {
                        result = Steps.SLEEP;
                    }
                }
            }
        }

        return result;
    }
}
