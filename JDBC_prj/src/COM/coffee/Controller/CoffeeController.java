package COM.coffee.Controller;

import COM.coffee.Dao.CoffeeDao;
import COM.coffee.Vo.CoffeeOrderVo;
import COM.coffee.Vo.CoffeeSalesVo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoffeeController {
    CoffeeDao cd = new CoffeeDao();
    List<CoffeeOrderVo> orderList = new ArrayList<CoffeeOrderVo>();
    public void getCoffeeMenu(){

        List<CoffeeSalesVo> list = new ArrayList<CoffeeSalesVo>();
        list = cd.getCoffeeList();

        System.out.println("메뉴를 선택해주세요");
        for (int i = 0; i < list.size(); i++) {
            CoffeeSalesVo csv = list.get(i);
            int coffeeId = csv.getCoffeId();
            String coffeeNm = csv.getCoffeNm();
            int price = csv.getPrice();

            System.out.println(" | " + coffeeId + " | " + coffeeNm + " | " + price + " | " );
        }
    }

    //coffee
    public void setOrderMenu(CoffeeOrderVo cov){
        orderList.add(cov);
        if (cov.getFlag().equals("N")){
            cd.setOrderMenu(orderList);
        }
    }


    // 오늘 매출 출력
    public void getDaillySales(){
        int sum_ = 0; // 오늘의 합계

            for (CoffeeSalesVo cv : cd.DaillySales()){
            int coffeid = cv.getCoffeId();
            String coffeNm = cv.getCoffeNm();
            int price = cv.getPrice();
            int saleCnt = cv.getSaleCnt();
            Date slaeDate = cv.getSaleDate();
            int sum = 0;
            sum += price * saleCnt;

            sum_ += sum;

            System.out.println("|"+coffeid+"|"+coffeNm+"|"+price+"|"+saleCnt+"|"+slaeDate+ "|" + price+ "|" + sum);
        }

            System.out.printf("오늘의 합계는" + sum_);
    }
}
