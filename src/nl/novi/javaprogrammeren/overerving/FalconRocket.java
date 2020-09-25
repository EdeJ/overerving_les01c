package nl.novi.javaprogrammeren.overerving;

// Element 1:
//         De FalconRocket heeft reserve brandstof (extraFuel). Wanneer de raket niet genoeg fuel lijkt te hebben, moet er
//         gekeken worden of er genoeg fuel is in extraFuel om het tekort op te vangen. Als dat zo is, moet er alsnog `true`
//         geretourneerd worden.

public class FalconRocket extends Rocket {
    public int extraFuel = 10;

    public FalconRocket(int maximumFuel) {
        super(maximumFuel);
        this.maximumFuel = maximumFuel + extraFuel;
        this.currentFuel = this.maximumFuel;
    }

//    @Override
//    public boolean hasEnoughFuel(int fuel) {
//        if(fuel < currentFuel + this.extraFuel) {
//
//            return true;
//        }
//        System.out.println("Falcon has no fuel");
//        return false;
//    }
}
