package t;

/**
 * ��Ʒʵ����
 */
public class Goods {
    // ��Ʒ���
    private int id;
    // ��Ʒ����
    private String name;
    // ��Ʒ���
	private String type;
    // ��Ʒ�۸�
	private double price;
    // ��Ʒ����
	private int quantity;
    
    /**
     * �޲�
     */
    public Goods() {
    }

    /**
     * ȫ��
     * @param id ���
     * @param name ����
     * @param type ���
     * @param price �۸�
     * @param quantity ����
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
