package standard;

public class CafeDrink {
    private String menuName;
    private int price;
    private String size;
    private boolean isIce;
    private int shot;

    public CafeDrink() {}
    public CafeDrink(String menuName, int price, String size, boolean isIce, int shot) {
        this.menuName = menuName;
        this.price = price;
        this.size = size;
        this.isIce = isIce;
        this.shot = shot;
    }

    public String getMenuName() {return menuName;}
    public int getPrice() {return price;}
    public String getSize() {return size;}
    public boolean getIsIce() {return isIce;}
    public int getShot() {return shot;}

    public void setMenuName(String menuName) {this.menuName = menuName;}
    public void setPrice(int price) {this.price = price;}
    public void setSize(String size) {this.size = size;}
    public void setIsIce(boolean isIce) {this.isIce = isIce;}
    public void setShot(int shot) {this.shot = shot;}

    public void printMenu() {
        System.out.println("메뉴 이름: " + menuName);
        System.out.println("가격: " + price + "원");
        System.out.println("사이즈: " + size);
        System.out.println("아이스 여부: " + isIce);
        System.out.println("샷 개수: " + shot);
    }
}