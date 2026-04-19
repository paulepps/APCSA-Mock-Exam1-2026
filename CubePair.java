public class CubePair {
    
    private Cube cube1;
    private Cube cube2;

    public CubePair(String cubeType) {
        cube1 = new Cube(cubeType);
        cube2 = new Cube(cubeType);
    }
    
    public CubePair(String cube1Type, String cube2Type) {
        cube1 = new Cube(cube1Type);
        cube2 = new Cube(cube2Type);
    }

    public String rollCubes() {
        return cube1.roll() + cube2.roll();
    }

    public static void main(String[] args) {
        CubePair p1 = new CubePair("number", "color");
        System.out.println(p1.rollCubes());

        CubePair p2 = new CubePair("number");
        System.out.println(p2.rollCubes());

        CubePair p3 = new CubePair("letter");
        System.out.println(p3.rollCubes());

    }
}
