/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**************************************************** 
Program Name: Stock4UGUI 
Programmer's Name: Xavier Avery 
Program Description: Stocks4U Portfolio Management System
***********************************************************/

public class Stock {
    // Attributes
    private String companyName;
    private double numberOfShares;
    private double purchasePrice;
    private double currentPrice;
    
    // Constructors
    public Stock() {
        companyName = "N/A";
        numberOfShares = 0.0;
        purchasePrice = 0.0;
        currentPrice = 0.0;
    }
    
    public Stock(String companyName, double numberOfShares, double purchasePrice, double currentPrice) {
        this.setCompanyName(companyName);
        this.setNumberOfShares(numberOfShares);
        this.setPurchasePrice(purchasePrice);
        this.setCurrentPrice(currentPrice);
    }
    
    // behaviors
    public double getProfitLoss() {
       return numberOfShares * (currentPrice - purchasePrice);
    }
    
    @Override 
    public String toString() {
        return companyName;
    }
    
    //Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(double numberOfShares) {
        if (numberOfShares > 0.0) {
            this.numberOfShares = numberOfShares;
        }
        else {
            this.numberOfShares = 0.0;
        }    
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (purchasePrice > 0.0) {
            this.purchasePrice = purchasePrice;
        }
        else {
            this.purchasePrice = 0.0;
        }  
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        if (currentPrice > 0.0) {
            this.currentPrice = currentPrice;
        }
        else {
            this.currentPrice = 0.0;
        }  
    }    
} // end of Stock Class
