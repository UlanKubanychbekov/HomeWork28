package peaksoft;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        /**
         sqrt деген метод тузунуз.
         UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
         Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
         public static UnaryOperator<Double> sqrt().*/


        System.out.println(sqrt.apply(1234.4));
    }

    public static UnaryOperator<Double> sqrt = Math::sqrt;

}
