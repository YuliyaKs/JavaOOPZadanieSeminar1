import java.util.ArrayList;
import java.util.Random;

public class Add {
    public static void main(String[] args) {

        Arbalester arbalester = new Arbalester(); // арбалетчик
        Bandit bandit = new Bandit(); // разбойник
        Countryman countryman = new Countryman(); // крестьянин
        Killer killer = new Killer(); // снайпер
        Mage mage = new Mage(); // колдун
        Monastic monastic = new Monastic(); // монах
        Pikeman pikeman = new Pikeman(); // копейщик
        
        ArrayList<AbsoluteHero> armyLightForces = new ArrayList<>();
        fillArmyLF(armyLightForces);
        for (AbsoluteHero absoluteHero : armyLightForces) {
            System.out.println(absoluteHero.getInfo());
        }

        System.out.println();
        
        ArrayList<AbsoluteHero> armyDarkForces = new ArrayList<>();
        fillArmyDF(armyDarkForces);
        for (AbsoluteHero absoluteHero : armyDarkForces) {
            System.out.println(absoluteHero.getInfo());
        }
    }
    public static void fillArmyLF (ArrayList<AbsoluteHero> ArrList) {
        for (int i = 0; i < 10; i++) {
            int count = new Random().nextInt(0, 4);
            switch (count) {
                case 0: {
                    ArrList.add(new Countryman());
                    break;                    
                }
                case 1: {
                    ArrList.add(new Arbalester());
                    break;                    
                }
                case 2: {
                    ArrList.add(new Monastic());
                    break;
                }
                case 3: {
                    ArrList.add(new Pikeman());
                    break;
                }

            }               
        }
    }

    public static void fillArmyDF (ArrayList<AbsoluteHero> ArrList) {
        for (int i = 0; i < 10; i++) {
            int count = new Random().nextInt(0, 4);
            switch (count) {
                case 0: {
                    ArrList.add(new Countryman());
                    break;                    
                }
                case 1: {
                    ArrList.add(new Bandit());
                    break;                    
                }
                case 2: {
                    ArrList.add(new Killer());
                    break;
                }
                case 3: {
                    ArrList.add(new Mage());
                    break;
                }

            }               
        }
    }
}

