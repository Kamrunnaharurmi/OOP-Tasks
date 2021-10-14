package assignment;


public class BillCalculator{
    public double calculateBasicBill(double unit){
        double bill=0;
        if(unit<=199)
        {
            if(bill<=100)
            {
                bill=100;
            }
            else
            {
                 bill = unit * 1.2;
            }
        }
        else if(unit>199 && unit<400)
        {
            bill = unit*1.5;
        }
        else if(unit>=400 && unit<600)
        {
            bill = unit*1.8;
        }
        else
        {
            bill = unit*2;
        }
        return bill;
    }
    public double calculateSurcharge(double basicBill){
        double surcharge = 0;
        if(basicBill>400)
        {
            surcharge = (basicBill*15)/100;
        }
        return surcharge;
    }
    public double getTotalBill(double unit){
        double totalBill = calculateBasicBill(unit);
        totalBill += calculateSurcharge(totalBill);
       
        return totalBill;
    }
}