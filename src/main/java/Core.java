import javax.swing.*;
import java.util.Map;
import java.util.TreeMap;

public class Core extends SwingWorker<Void,Void> {
    private Double up;
    private Double down;
    private Double left;
    private Double right;
    private Double sleep;
    private Integer Nst;
    private Integer N;
    private Integer M;
    private Integer n0;
    private Integer m0;
    private Integer countUp;
    private Integer countDown;
    private Integer countLeft;
    private Integer countRight;
    private Map<String, Double> countSleep;

    public Core(Double up, Double down, Double left, Double right, Double sleep, Integer nst, Integer n, Integer m, Integer n0, Integer m0) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.sleep = sleep;
        Nst = nst;
        N = n;
        M = m;
        this.n0 = n0;
        this.m0 = m0;
        this.countUp = 0;
        this.countDown = 0;
        this.countLeft = 0;
        this.countRight = 0;
        countSleep = new TreeMap<String, Double>();
    }

    public void run(JProgressBar jProgressBar1) {
        MethodOfIntervals methodOfIntervals = new MethodOfIntervals(up, down, left, right, sleep);

        for (int i = 0; i < Nst; i++) {
            int tmpN = n0;
            int tmpM = m0;
            while (true) {
                Steps step = methodOfIntervals.getStep(methodOfIntervals.getIntervals());
                boolean flag = false;
                switch (step.getNumberOfField()) {
                    case 1: {
                        tmpM++;
                        break;
                    }
                    case 2: {
                        tmpM--;
                        break;
                    }
                    case 3: {
                        tmpN--;
                        break;
                    }
                    case 4: {
                        tmpN++;
                        break;
                    }
                    case 5: {
                        flag = true;
                        String key = tmpN + "," + tmpM;
                        if (countSleep.containsKey(key)) {
                            countSleep.put(key, countSleep.get(key) + 1);
                        } else {
                            countSleep.put(key, 1.0);
                        }
                        break;
                    }
                }

                if (flag) {
                    break;
                }

                if (tmpM > M) {
                    countUp++;
                    break;
                } else {
                    if (tmpM < 0) {
                        countDown++;
                        break;
                    } else {
                        if (tmpN > N) {
                            countRight++;
                            break;
                        } else {
                            if (tmpN < 0) {
                                countLeft++;
                                break;
                            }
                        }
                    }
                }
            }
            jProgressBar1.setValue(i);
        }
        getProbabilityOfSleep();
    }

    private void getProbabilityOfSleep() {
        Double count = 0.0;
        for (Double value : countSleep.values()) {
            count += value;
        }

        Double index = 1 / count;
        for (String key : countSleep.keySet()) {
            countSleep.put(key, countSleep.get(key) * index);
        }

    }

    public Integer getCountUp() {
        return countUp;
    }

    public Integer getCountDown() {
        return countDown;
    }

    public Integer getCountLeft() {
        return countLeft;
    }

    public Integer getCountRight() {
        return countRight;
    }

    public Integer getN() {
        return N;
    }

    public Integer getM() {
        return M;
    }

    public Double getSumProb() {
        return (double)countUp + countDown + countLeft + countRight;
    }

    public Map<String, Double> getCountSleep() {
        return countSleep;
    }

    protected Void doInBackground() throws Exception {
        MethodOfIntervals methodOfIntervals = new MethodOfIntervals(up, down, left, right, sleep);

        for (int i = 0; i < Nst; i++) {
            int tmpN = n0;
            int tmpM = m0;
            while (true) {
                Steps step = methodOfIntervals.getStep(methodOfIntervals.getIntervals());
                boolean flag = false;
                switch (step.getNumberOfField()) {
                    case 1: {
                        tmpM++;
                        break;
                    }
                    case 2: {
                        tmpM--;
                        break;
                    }
                    case 3: {
                        tmpN--;
                        break;
                    }
                    case 4: {
                        tmpN++;
                        break;
                    }
                    case 5: {
                        flag = true;
                        String key = tmpN + "," + tmpM;
                        if (countSleep.containsKey(key)) {
                            countSleep.put(key, countSleep.get(key) + 1);
                        } else {
                            countSleep.put(key, 1.0);
                        }
                        break;
                    }
                }

                if (flag) {
                    break;
                }

                if (tmpM > M) {
                    countUp++;
                    break;
                } else {
                    if (tmpM < 0) {
                        countDown++;
                        break;
                    } else {
                        if (tmpN > N) {
                            countRight++;
                            break;
                        } else {
                            if (tmpN < 0) {
                                countLeft++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        getProbabilityOfSleep();
        return null;
    }
}
