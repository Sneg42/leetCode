package OnSite.Fundomate;

import helpFunctions.TreeNode;

import java.util.*;

public class NegativeDays {

    private String createKey(Date date){
        return " " + date.getMonth() + "/" + date.getYear();
    }

    public void countNegativeDays2(Account account){
        Transaction[] transactions = account.getTransactions();

        HashMap<String, Integer> map = new HashMap<>();
        map.put(createKey(transactions[0].getDate()), 0);

        for (int i = 0; i < transactions.length; i++) {
            Date curDate = transactions[i].getDate();
            while (i < transactions.length && curDate == transactions[i].getDate()){
                i++;
            }
            if (i != transactions.length - 1)
                i--;
            String  key = createKey(transactions[i].getDate());
            if (!map.containsKey(key)){
                map.put(key, 0);
            }
            if (transactions[i].getBalancer() < 0){
                map.put(key, map.get(key)+1);
            }
        }
        SortedSet<String> keys = new TreeSet<>(map.keySet());
        for (Object key : keys) {
            System.out.println(key + " - " + map.get(key));
        }

    }

//    public void countNegativeDays(Account account){
//        ArrayList<Integer> res = new ArrayList<>();
//        Date[] reDates;
//        Date[] dates = account.getDates();
//        ArrayList<Integer> amount = account.getAmount();
//        ArrayList<Integer> balance = account.getBalance();
//        int length = amount.size();
//        reDates = new Date[length];
//        int countMonth = 0;
//
//        reDates[countMonth++] = dates[0];
//        res.add(0);
//        for (int i = 0; i < length; i++) {
//            if (dates[i].getYear() > reDates[countMonth - 1].getYear() ||
//                    dates[i].getMonth() > reDates[countMonth - 1].getMonth()){
//                reDates[countMonth++] = dates[i];
//                res.add(0);
//            }
////            if (amount.get(i) < 0 && Math.abs(amount.get(i)) > balance.get(i)
////                    && dates[i].getDay() != reDates[countMonth - 1].getDay()){
////                int lastElem = res.size() - 1;
////                res.set(lastElem, res.get(lastElem) + 1);
////            }
//            if (balance.get(i + 1) < 0){
//                int lastElem = res.size() - 1;
//                res.set(lastElem, res.get(lastElem) + 1);
//            }
//            if (balance.get(i + 1) >= 0 && balance.get(i) < 0
//                    && reDates[countMonth - 1].getDay() == dates[i].getDay()
//                    && ){
//                int lastElem = res.size() - 1;
//                res.set(lastElem, res.get(lastElem)  - 1);
//            }
//
//        }
//        for (int i = 0; i < res.size(); i++) {
//            System.out.println("" + reDates[i].getMonth() + "/" + reDates[i].getYear() +
//                    " - " + res.get(i));
//        }
//    }
}

class Transaction{
    private Date date;
    private double amount;

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalancer() {
        return balancer;
    }

    public Transaction(Date date, double amount, double balancer) {
        this.date = date;
        this.amount = amount;
        this.balancer = balancer;
    }

    double balancer;
}

class Account{
    private Transaction[] transactions;
    private double beginBalance;

    public Account(Transaction[] transactions, double beginBalance) {
        this.transactions = transactions;
        this.beginBalance = beginBalance;
    }

    public double getBeginBalance() {
        return beginBalance;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }
    //    private Date[] dates;
//    private ArrayList<Integer> amount;
//    private ArrayList<Integer> balance;
//
//    public Account(Date[] dates, ArrayList<Integer> amount, ArrayList<Integer> balance){
//        this.dates = dates;
//        this.amount = amount;
//        this.balance = balance;
//    }
//
//    public Date[] getDates() {
//        return dates;
//    }
//
//    public ArrayList<Integer> getAmount() {
//        return amount;
//    }
//
//    public ArrayList<Integer> getBalance() {
//        return balance;
//    }


}
