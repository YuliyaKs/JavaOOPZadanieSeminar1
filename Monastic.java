// Класс Монах
public class Monastic extends Psychic{

    private int miro;

    public static String setName(){
        return String.format("Hero_Monastic #%d", ++Monastic.number);
    }

    public Monastic() {
        super(setName());
        this.miro = Monastic.r.nextInt(0, 100);
    }

    public String getInfo() {
        return String.format("%s  Mana: %d  Miro: %d", 
            super.getInfo(), super.mana, this.miro);
    }

    // Метод обряды
    public void ceremony(int hour) {
        super.ceremony(hour);
        this.miro -= hour * 5;
    }
}

