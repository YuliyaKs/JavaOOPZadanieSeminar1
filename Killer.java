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

    public String getInfo() {
        return String.format("%s  Accuracy: %d  Bullet: %d", 
            super.getInfo(), super.accuracy, this.bullet);
    }

    // Метод война
    public void war(int hour) {
        super.war(hour);
        this.bullet -= hour * 5;
    }
}
