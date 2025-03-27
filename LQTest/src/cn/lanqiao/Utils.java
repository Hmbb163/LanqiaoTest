package cn.lanqiao;

/**
 * ����Ϊ�����࣬��Ҫ����������
 * 1���ַ�������Ϊ null�������޷����д�����˵�Ϊ null ʱ������ ���ַ�������Ϊ�ա���
 * 2���ַ���Ҫ��ĳ����ǲ����ṩ����С����  ~ ��󳤶�λ����Ի�ȡ���ַ�������ȥ��ǰ��ո�Ĵ�����ȥ���ո�󳤶���Ȼ������Ҫ��ʱ���᷵�� ���ַ������ȱ�������С���� ~ ��󳤶�λ����
 * 3�����ڳ���С����󳤶�λ���ַ����������ַ���������ӿո�ȫ��ֱ������Ϊ��󳤶�λ��������������ش������ַ�����
 */
public class Utils {
    /**
     * ���ַ������Ƚ��д���Ϊ�ﵽ��󳤶�ʱ���ÿո�ȫ
     * @param message �ַ���
     * @param min ��С����
     * @param max ��󳤶�
     * @return ��������Ϣ
//     * @throws InterruptedException 
     */
    public static String stringStyle(String message, int min, int max){
        String result = null;
        // �ַ�������Ϊ��
        if(message != null){
            // ȥ���ַ���ǰ��ո�
            message = message.trim();
            // ��ȡ�ַ�������
            int length = message.length();
            if(length >=min && length <= max){
                result = message;
                // ������Ϊ�ﵽ��󳤶ȣ��ÿո�ȫ
                for (int i = 0; i < max-length; i++) {
                    result += " ";
                }
            }else{
                result = "�ַ������ȱ�����"+min+"~"+max+"λ";
            }  
        }else{
            result = "�ַ�������Ϊ��";
        }
        return result;
    }
}
