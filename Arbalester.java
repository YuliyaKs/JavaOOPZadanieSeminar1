// Класс Арбалетчик
public class Arbalester extends Shooter{
    
    private int dart; // стрелы

    public static String setName(){
        return String.format("Hero_Arbalester #%d", ++Arbalester.number);
    }

    public Arbalester() {
        super(setName());
        this.dart = Arbalester.r.nextInt(0, 100);
    }

    // Метод война
    public void war(int hour) {
        super.war(hour);
        this.dart -= hour * 5;
    }

    @Override
    public String getInfo() {
        return "Arbalester";
    }

    @Override
    public void step(){}
}

