// Класс Снайпер
public class Killer extends Shooter { 
    
    private int bullet; // пули

    public static String setName(){
        return String.format("Hero_Killer #%d", ++Killer.number);
    }

    public Killer() {
        super(setName());
        this.bullet = Killer.r.nextInt(0, 100);
    }

    // Метод война
    public void war(int hour) {
        super.war(hour);
        this.bullet -= hour * 5;
    }

    @Override
    public String getInfo() {
        return "Killer";
    }

    @Override
    public void step(){}

}
