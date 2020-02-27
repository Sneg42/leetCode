package OnSite.Fundomate;


import org.junit.Test;

import java.util.Queue;

public class CommissionTest {

    @Test
    public void commissonTest(){
        Partner[] subPartners5 = {new Partner(null, 30),
                        new Partner(null, 30)};
        Partner[] subPartners2 = {new Partner(subPartners5, 10),
                                new Partner(null, 10),
                                new Partner(null, 20)};
        Partner[] subPartners = {new Partner(subPartners2, 30),
                                new Partner(null, 30),
                                new Partner(null, 30)};
        Partner partner = new Partner(subPartners, 50);

        Commission test = new Commission();
       test.countTotalCommissionForPartner(1000, partner);
        Queue<Double> q = test.getqRes();

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

}
