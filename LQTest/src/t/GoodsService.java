package t;



import java.util.ArrayList;
import java.util.List;

/**
 * ��Ʒ����ģ��ҵ���߼��࣬������Ҫ����������
 * 1�������ﳵ�����Ʒ����ʱ�����ﳵ�����б����ڣ���ôϵͳ�ᴴ�����ﳵ�����б�Ȼ�����ﳵ�����������Ʒ��Ϣ����������Ʒ�����б�
 * 2�������ﳵ���϶���Ϊ��ʱ����ֱ�������Ʒ�����������б��У�Ȼ�󷵻���Ʒ�����б�
 * 3�������ﳵ�����Ʒ���󣬶�����Ʒ�Ѵ��ڹ��ﳵ���϶����б���ʱ���б���ֻ��Ը���Ʒ���������е��ӣ�����Ʒ��������Ϣ���䣬��ɲ����󷵻���Ʒ�����б�
 * 4�������ﳵ��ӵ���Ʒ���󣬲���������Ʒ�����б��У�����ӵ����ﳵ�����б��У���������Ʒ�����б�
 */
public class GoodsService{

    /**
     * ��Ʒ���빺�ﳵ
     * @param list ���ﳵ�б�
     * @param goods ��Ʒ��Ϣ
     * @return ���ﳵ�б�
     */
    public List<Goods> shoppingCart(List<Goods> list, Goods goods) {
        // �����ﳵΪ null
        if(list == null){
            // �������ﳵ���϶���
            list = new ArrayList<>();
            // �����Ʒ��Ϣ
            list.add(goods);
        }else{
            boolean flag = false;
            for (Goods goods2 : list) {
                // �����ﳵ���Ѵ�����Ʒ����ӵ���Ʒһ��ʱ����Ʒ�������е���
                if(goods2.getId() == goods.getId()){
                    goods2.setQuantity(goods2.getQuantity()+goods.getQuantity());
                    flag = true;
                    break;
                }
            }
            // ����ӵ���Ʒ���󲻴����빺�ﳵ��ʱ������Ʒ����洢�����ﳵ�����б���
            if(!flag){
                list.add(goods);
            }
        }
        return list;
    }
    
}

