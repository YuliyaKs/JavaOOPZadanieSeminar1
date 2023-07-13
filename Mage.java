// Класс Колдун
public class Mage extends Psychic{

    private int elixir;
    private int medicament;


    public static String setName(){
        return String.format("Hero_Mage #%d", ++Mage.number);
    }

    public Mage() {
        super(setName());
        this.elixir = Mage.r.nextInt(0, 100);
    }

    // Метод обряды
    public void ceremony(int hour) {
        super.ceremony(hour);
        this.elixir -= hour * 5;
    }

    // Метод врачевание
    public void therapy(AbsoluteHero target) {
        this.medicament = medicament - Mage.r.nextInt(0, medicament);
        int Hp = AbsoluteHero.r.nextInt(10, 20);
        target.healed(Hp);
    }

    @Override
    public String getInfo() {
        return "Mage";
    }

    @Override
    public void step(){}
}
