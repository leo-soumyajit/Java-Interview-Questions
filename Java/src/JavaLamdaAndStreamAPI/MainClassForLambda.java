package JavaLamdaAndStreamAPI;

public class MainClassForLambda {
    public static void main(String[] args) {
//        Older way
        Walkable obj1 = new WalkFast();
        obj1.walkSteps(10);

//        new way using Lambda
        Walkable obj2 = (steps) -> {
            System.out.println("Walking fast "+steps+" Using Lambda func");
            return steps*2;
        };
        obj2.walkSteps(10);



    }
}
@FunctionalInterface
interface Walkable{
    int walkSteps(int steps);

}

class WalkFast implements Walkable{

    @Override
    public int walkSteps(int steps) {
        System.out.println("Walking fast "+steps);
        return steps*2;
    }
}
