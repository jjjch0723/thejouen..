package COM.coffee.Vo;

import java.util.Date;

public class CoffeeSalesVo extends CoffeeMenuVo{

    private int price;
    private int saleCnt;
    private Date saleDate;
    private String priceDate;

    public CoffeeSalesVo() {
    }

    public CoffeeSalesVo(int price, int saleCnt, Date saleDate, String priceDate) {
        this.price = price;
        this.saleCnt = saleCnt;
        this.saleDate = saleDate;
        this.priceDate = priceDate;
    }

    public CoffeeSalesVo(int coffeId, String coffeNm, int price, int saleCnt, Date saleDate, String priceDate) {
        super.setCoffeId(coffeId);
        super.setCoffeNm(coffeNm);
        this.price = price;
        this.saleCnt = saleCnt;
        this.saleDate = saleDate;
        this.priceDate = priceDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSaleCnt() {
        return saleCnt;
    }

    public void setSaleCnt(int saleCnt) {
        this.saleCnt = saleCnt;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(String priceDate) {
        this.priceDate = priceDate;
    }
}
