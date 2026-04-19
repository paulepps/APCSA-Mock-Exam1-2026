import java.util.ArrayList;

public class EVDataSet {
    
    private ArrayList<ElectricVehicle> vehicleList;

    public EVDataSet() {
        vehicleList = new ArrayList<>();
    }

    public ArrayList<String> getHighRangeVehicles(int target) { 

        ArrayList<String> list = new ArrayList<>();

        for (ElectricVehicle ev : vehicleList) {
            if (ev.getRange() > target && list.indexOf(ev.getModelName()) == -1) {
                list.add(ev.getModelName());
            }
        }
        return list;
    }

    public static void main(String[] args) {

        EVDataSet dataSet = new EVDataSet();
        dataSet.vehicleList.add(new ElectricVehicle(200, "Eco 6"));
        dataSet.vehicleList.add(new ElectricVehicle(300, "Hallo"));
        dataSet.vehicleList.add(new ElectricVehicle(250, "QTK2"));
        dataSet.vehicleList.add(new ElectricVehicle(270, "Nu EV"));
        dataSet.vehicleList.add(new ElectricVehicle(220, "QTK2"));
        dataSet.vehicleList.add(new ElectricVehicle(190, "Ekstat"));

        ArrayList<String> highRangeVehicleList = dataSet.getHighRangeVehicles(215);

        for (String model : highRangeVehicleList) {
            System.out.println(model);
        }
    }
}
