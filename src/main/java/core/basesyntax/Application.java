package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball ball = lottery.getRandomBall();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        System.out.println(ball);
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
