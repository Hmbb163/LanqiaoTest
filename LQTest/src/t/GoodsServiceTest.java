package t;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class GoodsServiceTest {

	 // ����������
    private GoodsService goodsService;

    @Before
    public void setUp(){
        // ����������ʵ��
        goodsService = new GoodsService();
        
    }

    @After
    public void tearDown(){
        // �ͷű�����ʵ��
        goodsService = null;
    }
    
    @Test
    public void testShoppingCart01(){
        // TODO ����д��Ԫ���Դ���
        Datas datas = new Datas();
        Assert.assertEquals("��Ϊ",goodsService.shoppingCart(datas.list2, datas.g1).get(0).getType());
    }

}
