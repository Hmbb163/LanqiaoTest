package t;

/**
 * 商品实体类
 */
public class Goods {
    // 商品编号
    private int id;
    // 商品名称
    private String name;
    // 商品类别
	private String type;
    // 商品价格
	private double price;
    // 商品数量
	private int quantity;
    
    /**
     * 无参
     */
    public Goods() {
    }

    /**
     * 全参
     * @param id 编号
     * @param name 名称
     * @param type 类别
     * @param price 价格
     * @param quantity 数量
     */
    public Goods(int id, String name, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Goods [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity=" + quantity + "]";
    }

}
