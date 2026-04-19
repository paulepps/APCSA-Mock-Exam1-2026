public class ElectricVehicle {
    
    private int range;
    private String modelName;

    public ElectricVehicle(int range, String modelName) {
        this.range = range;
        this.modelName = modelName;
    }

    public int getRange() {
        return range;
    }

    public String getModelName() {
        return modelName;
    }
}
