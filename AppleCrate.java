public class AppleCrate {
    private Apple[][] apples;
    private double totalWeight = 0.0;
    private int[] rowChange = new int[]{-1, 0, 1, 0};
    private int[] colChange = new int[]{0, 1, 0, -1};

    public AppleCrate() {
        this.apples = new Apple[4][6];
        apples[0][0] = new Apple(0.3, false);
        apples[0][1] = new Apple(0.4, false);
        apples[0][2] = new Apple(0.35, false);
        apples[0][3] = new Apple(0.5, false);
        apples[0][4] = new Apple(0.45, false);
        apples[0][5] = new Apple(0.4, true);
        apples[1][0] = new Apple(0.42, false);
        apples[1][1] = new Apple(0.38, false);
        apples[1][2] = new Apple(0.33, false);
        apples[1][3] = new Apple(0.4, false);
        apples[1][4] = new Apple(0.41, false);
        apples[1][5] = new Apple(0.44, false);
        apples[2][0] = new Apple(0.32, false);
        apples[2][1] = new Apple(0.44, false);
        apples[2][2] = new Apple(0.35, true);
        apples[2][3] = new Apple(0.49, false);
        apples[2][4] = new Apple(0.29, false);
        apples[2][5] = new Apple(0.32, false);
        apples[3][0] = new Apple(0.3, false);
        apples[3][1] = new Apple(0.4, false);
        apples[3][2] = new Apple(0.35, false);
        apples[3][3] = new Apple(0.5, false);
        apples[3][4] = new Apple(0.45, false);
        apples[3][5] = new Apple(0.4, false);
    }
    public int numberOfPies(double poundsPerPie) {

        for (int row = 0; row < apples.length; row++) {
            for (int col = 0; col < apples[0].length; col++) {
                Apple apple = apples[row][col];
                if (!apple.isRotten()) {
                    addWeight(apple, row, col);
                }
            }    
        }
        return (int) (totalWeight / poundsPerPie);
    }

    private void addWeight(Apple apple, int row, int col) {
        for (int i = 0; i < 4; i++ ) {
            int newRow = row + rowChange[i];
            int newCol = col + colChange[i];
            if (newRow >=0 && newRow < apples.length && newCol >= 0 && newCol < apples[0].length
                           && apples[newRow][newCol].isRotten()) {
                return;
            }
        }
        totalWeight += apple.getWeight();
    }

    public static void main(String[] args) {
        AppleCrate crate = new AppleCrate();
        System.out.println(crate.numberOfPies(2.0));
    }
}
