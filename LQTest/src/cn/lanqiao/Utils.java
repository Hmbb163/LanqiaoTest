package cn.lanqiao;

/**
 * 本类为工具类，主要功能描述：
 * 1、字符串不能为 null，否则无法进行处理，因此当为 null 时，返回 “字符串不能为空”。
 * 2、字符串要求的长度是参数提供的最小长度  ~ 最大长度位，会对获取的字符串进行去除前后空格的处理，当去除空格后长度依然不满足要求时，会返回 “字符串长度必须在最小长度 ~ 最大长度位”。
 * 3、对于长度小于最大长度位的字符串，会在字符串后面添加空格补全，直到长度为最大长度位后处理结束，并返回处理后的字符串。
 */
public class Utils {
    /**
     * 对字符串长度进行处理，为达到最大长度时，用空格补全
     * @param message 字符串
     * @param min 最小长度
     * @param max 最大长度
     * @return 处理后的信息
//     * @throws InterruptedException 
     */
    public static String stringStyle(String message, int min, int max){
        String result = null;
        // 字符串不能为空
        if(message != null){
            // 去除字符串前后空格
            message = message.trim();
            // 获取字符串长度
            int length = message.length();
            if(length >=min && length <= max){
                result = message;
                // 当长度为达到最大长度，用空格补全
                for (int i = 0; i < max-length; i++) {
                    result += " ";
                }
            }else{
                result = "字符串长度必须在"+min+"~"+max+"位";
            }  
        }else{
            result = "字符串不能为空";
        }
        return result;
    }
}
