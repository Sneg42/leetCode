package OnSite.Fundomate;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Partner{
    private Partner[] subPartners;
    private int percComis;

    public Partner(Partner[] subPartners, int percComis){
        this.percComis = percComis;
        this.subPartners = subPartners;
    }

    public int getPercComis(){
        return this.percComis;
    }

    public Partner[] getSubPartners(){
        return this.subPartners;
    }
}

public class Commission {
    private Queue<Double> qRes = new LinkedList<>();

    public Queue<Double> getqRes(){
        return this.qRes;
    }
    private double countCommissSub(double sum, Partner sub){
        return sum * sub.getPercComis() / 100;
    }

    public  void countTotalCommissionForPartner(double total, Partner partner){
        double sum = 0;
        double sumCommissSubPartn = 0;
        int commiss = partner.getPercComis();
        Partner[] subPartners = partner.getSubPartners();
        Queue<Partner> q = new LinkedList<>();

        sum = total * commiss / 100;
        if (subPartners == null) {
            this.qRes.add(sum);
            return;
        }
        for (int i = 0; i < subPartners.length; i++) {
            q.add(subPartners[i]);
        }
        while (!q.isEmpty()) {
            sumCommissSubPartn += countCommissSub(sum, q.poll());
        }
        this.qRes.add(sum - sumCommissSubPartn);
        for (int i = 0; i < subPartners.length; i++) {
            q.add(subPartners[i]);
        }
        while (!q.isEmpty()) {
            countTotalCommissionForPartner(sum, q.poll());
        }
    }
}
