public class Main {
    public static void main(String[] args){
        /*
        1. Stwórz dwie klasy Car i CarFactory
        2. Klasa CAr posiada zmienne: model, brand i color oraz konstruktor dla nich.
        3. Dodatkowo klasa Car musi posiadać metodę getColor() która zwróci kolor auta,
        ponadto musi mieć też metodę printInfo() wyświetlającą w konsili swoje dane.

        4. Klasa CarFactory posiada metodę buildCar() i zwraca Car. Metoda ta wybiera losowy kolor
        z trzech (czerwony, czarny, biały) i tworzy nowy samochód wywołując konstruktor Car.
        Jako dane wskazane są Ford Mustang i losowy kolor.

        Pamiętaj o wykorzystaniu Math.random() do uzyskania wartości od 0 do niemal 1 oraz
        Math.floor() do zaokrąglenia do liczby całkowitej, gdyż indeks tablicy jest liczbą całkowitą.
        Ważne są również konwersje liczb z double do int.

        W Main dodaj dwie instancje Car i pokaż ich kolor, wywołaj printInfo()
         */
        CarFactory factory = new CarFactory();
        Car ford1 = factory.buildCar();
        System.out.println("Wylosowany kolor samochodu to: "+ford1.getColor());
        System.out.println("Informacje o samochodzie:");
        ford1.printInfo();

        Car ford2 = factory.buildCar();
        System.out.println("Wylosowany kolor samochodu to: "+ford2.getColor());
        System.out.println("Informacje o samochodzie:");
        ford2.printInfo();
    }
}




