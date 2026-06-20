import standard.CafeDrink;

public class Run {
    public static void main(String[] args) {
        CafeDrink cafeDrink1 = new CafeDrink("아이스 아메리카노", 4500, "Tall", true, 2);
        CafeDrink cafeDrink2 = new CafeDrink("카페 라떼", 5000, "Grande", false, 2);
        CafeDrink drink1 = new CafeDrink("레몬에이드", 5000, "Tall", true, 0);

        cafeDrink1.printInfo();
        System.out.println();
        cafeDrink2.printInfo();
        System.out.println();
        drink1.printInfo();
    }
}