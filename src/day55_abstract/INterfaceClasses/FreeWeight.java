package day55_abstract.INterfaceClasses;

import day55_abstract.Lifting;

public class FreeWeight extends Lifting {
    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
