package Ex3;

public class VegetableFactory {
    class Carrot implements Vegetable {
        private static final String type = "carrot";

        @Override
        public String getInfo() {
            return type;
        }
    }

    class Cabbage implements Vegetable {
        private static final String type = "cabbage";
        private double weight = 2;

        @Override
        public String getInfo() {
            return type + ", " + weight;
        }
    }

    class Pumpkin implements Vegetable {
        private double weight = 3.0;

        @Override
        public String getInfo() {
            return String.valueOf(weight);
        }
    }
}
