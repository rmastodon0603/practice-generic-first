package org.itstep.step02;

// TODO: Пишите ваш код здесь

public class PairDriver {
    public static void main(String[] args) {
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<>("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair<String, Integer>[] stadiums) {
        Pair<String, Integer> largest = stadiums[0];
        for (int i = 0; i < stadiums.length; i++) {
            if(stadiums[i].getSecond()>largest.getSecond()){
                largest=stadiums[i];
            }
        }
        return largest.getFirst();
    }

}

//Бонусный ответ: Не скомпилируется, так как строку нужно дополнительно приводить к Integer, а также там есть ","
//Бонусный ответ: Потому что при оюобщени  мы можем испоьзовать методы классов без дополнительного явного привидения