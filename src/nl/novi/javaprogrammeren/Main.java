package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.FalconRocket;
import nl.novi.javaprogrammeren.overerving.Rocket;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    FalconRocket extends Rocket.

    Deze opdracht bestaat uit twee elementen. Het eerste element is om te oefenen. Het tweede element is een uitdagende
    opdracht.

    Element 1:
    De FalconRocket heeft reserve brandstof (extraFuel). Wanneer de raket niet genoeg fuel lijkt te hebben, moet er
    gekeken worden of er genoeg fuel is in extraFuel om het tekort op te vangen. Als dat zo is, moet er alsnog `true`
    geretourneerd worden.

    Element 2 (Uitdaging):
    Nadat er extra fuel gebruikt is, moet deze natuurlijk ook verminderd worden. Voeg dit toe aan de code.

     */

    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(6);
        System.out.println("Maximum fuel:" + genericRocket.maximumFuel);
        genericRocket.fly(5);
        System.out.println(genericRocket.toString());

        FalconRocket falconRocket = new FalconRocket(11);
        System.out.println("Maximum fuel:" + falconRocket.maximumFuel);
        falconRocket.fly(20);
        System.out.println(falconRocket.toString());
    }
}
