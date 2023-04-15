import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    public void sumTemp() {
Temperature temperature=new Temperature();
int[]temps={5, 15, 10, -5};

double actual=temperature.sumTemp(temps);
double expected=5+15+10+(-5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void averageTemp() {
        Temperature temperature=new Temperature();
        int[]temps={5, 15, 10, -5};
        int[]days={1,2,3,4};
        int actual=temperature.averageTemp(days,temps);
        int expected=(5+15+10+(-5))/days.length;
        Assertions.assertEquals(expected,actual);
    }
}