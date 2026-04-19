public class SimulateCarRace {
    private RaceCar carOne;
    private RaceCar carTwo;

    public String findWinner(int numLaps) {
        
        carOne = new RaceCar();
        carTwo = new RaceCar();

        double carOneTime = 0.0;
        double carTwoTime = 0.0;

        for (int lap = 1; lap <= numLaps; lap++) {
            carOneTime += carOne.getLapTime(lap);
            carTwoTime += carTwo.getLapTime(lap);
        }

        if (carOneTime < carTwoTime) {
            return "Car 1 wins!";
        }
        else if (carTwoTime < carOneTime) {
            return "Car 2 wins!";
        }
        else {
            return "Tie!";
        }
    }

    public static void main(String[] args) {
        SimulateCarRace scr = new SimulateCarRace();
        System.out.println(scr.findWinner(2));
    }
}
