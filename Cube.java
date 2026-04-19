public class Cube {
    
    private static final String[] LETTERS 
        = new String[]{"A", "B", "C", "D", "E", "F"};
    private static final String[] COLORS 
        = new String[]{"red", "orange", "yellow", "green", "blue", "purple"};

    private String cubeType;

    public Cube(String cubeType) {
        this.cubeType = cubeType;
    }

    public String roll() {
        int rand = (int) (Math.random() * 6);

        if (cubeType.equals("number")) {
            return "" + (rand + 1);
        }
        else if (cubeType.equals("letter")) {
            return LETTERS[rand];
        }
        else {
            return COLORS[rand];
        }

    }
}
