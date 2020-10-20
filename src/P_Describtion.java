public class P_Describtion {

    private String name;
    private String category;
    private String category1;
    private String color;
    private String size;
    private double price;

    public P_Describtion(String name, String category, String category1, String color, String size, double price) {
        this.name = name;
        this.category = category;
        this.category1 = category1;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public P_Describtion() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getCategory1() {
        return category1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String toString() {
        return  "Name= " + name +
                "\nColor= " + color +
                "\nSize= " + size +
                "\n\nPrice= Tk " + price ;
    }
}
