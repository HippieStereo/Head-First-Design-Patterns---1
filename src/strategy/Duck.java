package strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehaviorIn) {
        this.flyBehavior = flyBehaviorIn;
    }

    public void setQuackBehavior(QuackBehavior quackBehaviorIn) {
        this.quackBehavior = quackBehaviorIn;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
}
