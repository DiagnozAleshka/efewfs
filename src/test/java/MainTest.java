import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.qa123.AmountMonthsBelowAverage;
import ru.netology.qa123.BottomSales;
import ru.netology.qa123.PeakSales;
import ru.netology.qa123.amountMonthsUnderAverange;


public class MainTest {
@Test

    public void test () {
    BottomSales service = new BottomSales();
        int expected = 9;
        int[] amountSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.minSales(amountSale);
    Assertions.assertEquals(expected,actuall);

    }
}
