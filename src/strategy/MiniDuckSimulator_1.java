package strategy;

public class MiniDuckSimulator_1 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        System.out.println("Mallard Duck");
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck model = new ModelDuck();

        System.out.println("Model Duck");
        model.performFly();
        System.out.println("Model Change Fly");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
