import java.math.BigDecimal;

public class Temperature {
    public int sumTemp(int[] temps) {
        int sum = 0;//счетчик суммирует температуру
        for (int tt : temps) {
            sum += tt;
        }
        return sum;
    }

    public int averageTemp(int[] days, int[] temps) {
        int sum = 0;//счетчик суммирует температуру
        for (int tt : temps) {
            sum += tt;
        }
        return sum / days.length;
    }

    public int maxTemp(int[] temps) {
        int max = -1;
        for (int tt : temps) {
            if (tt > max) {
                max = tt;
            }
        }
        return max;
    }
}
