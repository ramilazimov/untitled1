package day45_OOP;

public class AnimalSpecies {
    String name;
    int population;

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growth=" + growth +
                '}';
    }

    int growth;
    public void setInfo(String nameA,int populationA,int growthA){
        name = nameA;
        population =populationA;
        growth =growthA;
    }
    public String getname(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public int getGrowth(){
        return growth;
    }
}
