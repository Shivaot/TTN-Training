package com.tothenew;

public class Ans11 {
    public static void main(String[] args) {
        Bank.SBI sbi = new Bank().new SBI();
        Bank.BOI boi = new Bank().new BOI();
        Bank.ICICI icici = new Bank().new ICICI();
        Bank bank = new Bank();
        System.out.println(bank.getDetails());

        System.out.println(sbi.getDetails());

        System.out.println(boi.getDetails());
  
        System.out.println(icici.getDetails());
    }

}

class Bank{
    float generalRateOfInterest = 4f;
    public float getDetails() {
        return generalRateOfInterest;
    }
    class BOI{
        float rateOfInterestBOI = 2.5f;
        public float getDetails() {
            return rateOfInterestBOI;
        }
    }

    class SBI{
        float rateOfInterestSBI = 3.5f;

        public float getDetails() {
            return rateOfInterestSBI;
        }

    }

    class ICICI{
        float rateOfInterestICICI = 1.5f;

        public float getDetails() {
            return rateOfInterestICICI;
        }

    }

}
