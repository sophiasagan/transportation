package transport;

public class HorseFromVehicle extends AbstractVehicle {
    private String name;

    public HorseFromVehicle(String name, int fuel){
        super(fuel); // this.fuel = fuel
        this.name = name;
    }

    public HorseFromVehicle(String name){
//        super(); => fuel = 1
        this.name = name;
    }

    @Override
    public String getPath(){
        return "Grass";
    }

    @Override
    public String getName(){
        return name;
    };

    @Override
    public String toString(){
        return "HorseFromVehicle Name: " + name + " fuel: " + fuel;
    }

}