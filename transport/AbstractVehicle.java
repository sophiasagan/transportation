package transport;

//class -> blueprint for objects
//abstract class -> blueprint for classes

abstract class AbstractVehicle {
//    parent, child
    protected int fuel;

//    default constructor
    public AbstractVehicle(){
        fuel = 1;
    }

    public AbstractVehicle(int fuel){
        this.fuel = fuel;
    }

    abstract String getPath();
    abstract String getName();

    void move(){
        fuel--;
    }

    void move(int steps){
        fuel = fuel - steps;
    }

    int getFuelLevel(){
        return fuel;
    }

    void addFuel(int i){
        fuel = fuel + i;
    }


}