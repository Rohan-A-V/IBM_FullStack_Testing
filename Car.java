class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){

       tyres = 4;
       doors = 4;
    }
    public void displayCharactersitics(){
        System.out.println("Car color is " + color);
        System.out.println("Car transmission is " + transmission);
        System.out.println("Car make is " + make);
        System.out.println("Car's no of tyres is " + tyres);
        System.out.println("Car's no of doors is " + doors);
    }

    public void accelerate(){
        System.out.println("Car is accelerating.");
    }

    public void brake(){
        System.out.println("Car is braking.");

    }

}