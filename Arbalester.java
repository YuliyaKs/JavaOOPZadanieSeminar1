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

    public String getInfo() {
        return String.format("%s  Accuracy: %d  Dart: %d", 
            super.getInfo(), super.accuracy, this.dart);
    }

    // Метод война
    public void war(int hour) {
        super.war(hour);
        this.dart -= hour * 5;
    }
}

