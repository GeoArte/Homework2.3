import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args)
    {
        Car BMW = new Car("BMW", "", 1500, "Germany", "Black", 120, 2, "Автомат", "Легковая", 22, 5, true);
        Car volga = new Car("Газ", "Волга", 2000, "Russia", "White", 80, 2.3, "Механическая", "Легковая", 27, 5, true);
        Car ford = new Car("Ford", "Mustang", 2500, "USA", "Blue", 200, 4, "", "", 21, 10, false);
        Bus one = new Bus("","", 1, "", "", -200);
        Bus two = new Bus("Газ", "Электробус", 2020, "Russia", "Blue", 100);
        Bus three = new Bus("Ford", "bus", 1999, "English", "Red", 120);
    }
}