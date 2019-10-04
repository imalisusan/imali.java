package oopstock;
public class Stock {
       String symbol;
       String name;
       double previousClosingPrice;
       double currentPrice;
       
       public Stock()
       {
       symbol="ORCL";
       name="Oracle Corporation";
       previousClosingPrice=34.5;
       currentPrice=34.35;
       }

    public double getChangePercent()
       {    
       double percentChange=(double)((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
           return percentChange;
       
       }
}
