package projectOne;

public class Population {
    public static void main(String[] args) {
        String country = "XYZ";
        int population = 10000000;
        int birth = 14;
        int death = 8;
        int dif = (birth - death);
        int timeLine = 10;
        for(int i = 1; i <= timeLine; i++){
            population += population * dif/1000;

        }
        System.out.println("Население в стране: " + country +" \n" + "Через 10 лет будет: " + population);
    }
}
