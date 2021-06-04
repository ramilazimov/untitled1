package day45_OOP;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies animal = new AnimalSpecies();
        animal.setInfo("bear",10,30);
//        System.out.println("Animal name - " + animal.getname());
//        System.out.println("Animal growth rate - " + animal.getGrowth() + "%");
//        System.out.println("Animal population - "+ animal.getPopulation()+ "Mln");

        AnimalSpecies animal1 = new AnimalSpecies();
        animal.setInfo("lion",10,20);
        System.out.println("Animal name - " + animal.getname());
        System.out.println("Animal growth rate - " + animal.getGrowth() + " %");
        System.out.println("Animal population - "+ animal.getPopulation()+ " Mln");


    }
}
