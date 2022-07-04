package projectOne;

public class Population2 {
    public static void main(String[] args) {
        String country = "XYZ";
        int population = 10000000;
        int born = 14;
        int death = 8;
        int timeLine = 10;

        for(int i = 1; i <= timeLine;i++){
            if(born > 7){
                born -= 1;

            }
            if(death > 6){
                death -= 1;
            }
            population += population * (born - death)/1000;
        }
        System.out.println("Население в стране: " + country +" \n" + "Через 10 лет будет: " + population);


    }

}
