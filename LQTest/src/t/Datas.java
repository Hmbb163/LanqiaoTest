package t;

import java.util.ArrayList;
import java.util.List;
/**
 * 测试数据
 */
public class Datas {
    // 声明集合对象
    public static List<Goods> list1 = null;
    public static List<Goods> list2 = null;
    public static List<Goods> list3 = null;

    // 提供商品信息
    public static Goods g1 = new Goods(1, "手机", "华为", 3000, 2);
    public static Goods g2 = new Goods(2, "手机", "oppo", 2800, 2);
    public static Goods g3 = new Goods(3, "手机", "小米", 1800, 2);
    public static Goods g4 = new Goods(4, "手机", "vivo", 2600, 2);
    public static Goods g5 = new Goods(5, "手机", "荣耀", 1300, 2);
    public static Goods g6 = new Goods(6, "手机", "华为", 6000, 2);
    public static Goods g7 = new Goods(7, "手机", "oppo", 3800, 2);
    public static Goods g8 = new Goods(8, "手机", "小米", 2000, 2);
    public static Goods g9 = new Goods(9, "手机", "vivo", 3100, 2);
    public static Goods g10 = new Goods(10, "手机", "荣耀", 1700, 2);

    static {
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list3.add(g1);
        list3.add(g2);
        list3.add(g3);
        list3.add(g4);
        list3.add(g5);
        list3.add(g6);
        list3.add(g7);
        list3.add(g8);
        list3.add(g9);
    }
}
