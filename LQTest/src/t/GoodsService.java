package t;



import java.util.ArrayList;
import java.util.List;

/**
 * 商品管理模块业务逻辑类，本类主要功能描述：
 * 1、当向购物车添加商品对象时，购物车集合列表不存在，那么系统会创建购物车集合列表，然后向购物车集合中添加商品信息，并返回商品集合列表。
 * 2、当购物车集合对象为空时，可直接添加商品对象至集合列表中，然后返回商品集合列表。
 * 3、当向购物车添加商品对象，而此商品已存在购物车集合对象列表中时，列表中只会对该商品的数量进行叠加，该商品的其他信息不变，完成操作后返回商品集合列表。
 * 4、当向购物车添加的商品对象，并不存在商品集合列表中，则添加到购物车集合列表中，并返回商品集合列表。
 */
public class GoodsService{

    /**
     * 商品加入购物车
     * @param list 购物车列表
     * @param goods 商品信息
     * @return 购物车列表
     */
    public List<Goods> shoppingCart(List<Goods> list, Goods goods) {
        // 当购物车为 null
        if(list == null){
            // 创建购物车集合对象
            list = new ArrayList<>();
            // 添加商品信息
            list.add(goods);
        }else{
            boolean flag = false;
            for (Goods goods2 : list) {
                // 当购物车中已存在商品和添加的商品一致时，商品数量进行叠加
                if(goods2.getId() == goods.getId()){
                    goods2.setQuantity(goods2.getQuantity()+goods.getQuantity());
                    flag = true;
                    break;
                }
            }
            // 当添加的商品对象不存在与购物车中时，将商品对象存储到购物车集合列表中
            if(!flag){
                list.add(goods);
            }
        }
        return list;
    }
    
}

