package COM.coffee.Vo;

public class CoffeeOrderVo {

    private int coffeeId;
    private String flag;
    private int OrderCnt;

    public int getOrderCnt() {
        return OrderCnt;
    }

    public void setOrderCnt(int orderCnt) {
        OrderCnt = orderCnt;
    }

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

}
