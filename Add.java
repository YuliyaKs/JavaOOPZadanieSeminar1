public class Add {
    public static void main(String[] args) {

        Arbalester arbalester = new Arbalester(); // арбалетчик
        System.out.println(arbalester.getInfo()); 

        Bandit bandit = new Bandit(); // разбойник
        System.out.println(bandit.getInfo());

        Countryman countryman = new Countryman(); // крестьянин
        System.out.println(countryman.getInfo());

        Killer killer = new Killer(); // снайпер
        System.out.println(killer.getInfo());

        Mage mage = new Mage(); // колдун
        System.out.println(mage.getInfo());

        Monastic monastic = new Monastic(); // монах
        System.out.println(monastic.getInfo());

        Pikeman pikeman = new Pikeman(); // копейщик
        System.out.println(pikeman.getInfo());
    }
}
