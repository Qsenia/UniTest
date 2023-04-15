import java.math.BigDecimal;

public class Temperature {
    public int sumTemp(int[] temps){
        int sum = 0;//счетчик суммирует температуру
        for (int tt : temps) {
            sum += tt;
        }
        return sum;
    }
    public int averageTemp(int[]days, int[]temps){
        int sum = 0;//счетчик суммирует температуру
        for (int tt : temps) {
            sum += tt;
        }
        return sum /days.length;
    }
}
