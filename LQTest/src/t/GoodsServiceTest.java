package t;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class GoodsServiceTest {

	 // 声明被测类
    private GoodsService goodsService;

    @Before
    public void setUp(){
        // 创建被测类实例
        goodsService = new GoodsService();
        
    }

    @After
    public void tearDown(){
        // 释放被测类实例
        goodsService = null;
    }
    
    @Test
    public void testShoppingCart01(){
        // TODO 请填写单元测试代码
        Datas datas = new Datas();
        Assert.assertEquals("华为",goodsService.shoppingCart(datas.list2, datas.g1).get(0).getType());
    }

}
