package day51_Inheritance.super_keyword;
// committing for no reason
public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles) {
        //     calculateRate of Lyft + plus 20 percent
        return super.calculateRate(miles) * 1.2;
    }
}
