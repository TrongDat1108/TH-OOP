package Ex3;

public class Demo {
    public static void main(String[] args) {
        VegetableFactory factory = new VegetableFactory();
        VegetableFactory.Carrot carrot = factory.new Carrot();
        System.out.println(carrot.getInfo());
        VegetableFactory.Cabbage cabbage = factory.new Cabbage();
        System.out.println(cabbage.getInfo());
        VegetableFactory.Pumpkin pumpkin = factory.new Pumpkin();
        System.out.println(pumpkin.getInfo());
    }
}
