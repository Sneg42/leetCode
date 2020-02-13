package OnSite.Fundomate;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class NegativeDaysTest {

    @Test
    public void negativeDaysTest(){
        NegativeDays test = new NegativeDays();
        Transaction[] transactions = {
                new Transaction(new Date(2019, 7, 11), -200, 300),
                new Transaction(new Date(2019, 7, 12), -400, -100),
                new Transaction(new Date(2019, 7, 16), -100, -200),
                new Transaction(new Date(2019, 7, 18), -3000, -2700),
                new Transaction(new Date(2019, 8, 25), -1000, -3700),
                new Transaction(new Date(2019, 8, 30), 5000, 1300),
                new Transaction(new Date(2019, 9, 25), -500, 800),
                new Transaction(new Date(2019, 9, 26), -5000, -4200),
                new Transaction(new Date(2019, 9, 26), -100, -4300),};

        Account account = new Account(transactions, 1000);
        test.countNegativeDays2( account);
    }


}
