package top.fitch.study;

/**
 * @author fitch
 * @date 2021/12/15 15:10
 */
public class StringUtil {


    /**
     * 如果对象是字符串是否为空串空的定义如下:<br>
     * 1、为null <br>
     * 2、为""<br>
     *
     * @param obj
     *            对象
     * @return 如果为字符串是否为空串
     * @since 3.3.0
     */
    public static boolean isEmpty(Object obj) {
        if (null == obj) {
            return true;
        } else if (obj instanceof String) {
            return 0 == ((String)obj).length();
        }
        return false;
    }

    /**
     * 字符串是否为非空白 空白的定义如下： <br>
     * 1、不为null <br>
     * 2、不为""<br>
     *
     * @param str
     *            被检测的字符串
     * @return 是否为非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
