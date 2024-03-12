package COM.coffee.Vo;

public class CoffeeMenuVo {
    private int coffeId;
    private String coffeNm;


    public CoffeeMenuVo() {
    }

    public CoffeeMenuVo(int coffeId, String coffeNm) {
        this.coffeId = coffeId;
        this.coffeNm = coffeNm;
    }

    public int getCoffeId() {
        return coffeId;
    }

    public void setCoffeId(int coffeId) {
        this.coffeId = coffeId;
    }

    public String getCoffeNm() {
        return coffeNm;
    }

    public void setCoffeNm(String coffeNm) {
        this.coffeNm = coffeNm;
    }

}
