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

    // Метод обряды
    public void ceremony(int hour) {
        super.ceremony(hour);
        this.miro -= hour * 5;
    }

    @Override
    public String getInfo() {
        return "Monastic";
    }

    @Override
    public void step(){}
}

