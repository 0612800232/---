package com.hundsun.network.post.settle.web.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import com.hundsun.itrans.common.util.StringUtils;
import com.hundsun.network.melody.common.util.Money;

/**
 * �������util��
 *
 * @author daodao
 *
 */
public class MoneyUtil {
    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param intMoney
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(String strMoney) {
        return getFormatMoney(strMoney, null);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param strMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(String strMoney, String formatStr) {
        return getFormatMoney(strMoney, formatStr, Locale.US);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param strMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @param locale
     *            ʹ���Ĺ������ָ�ʽ,��������ǧ��λ����ʾ����
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(String strMoney, String formatStr, Locale locale) {
        Double doubleMoney;
        if (strMoney == null || strMoney.trim().equals("")) {
            strMoney = "0";
        }
        try {
            doubleMoney = Double.valueOf(strMoney);
        } catch (Exception e) {
            return strMoney;
        }
        return getFormatMoney(doubleMoney, formatStr, locale);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param intMoney
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(Integer intMoney) {
        return getFormatMoney(intMoney, null);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param intMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(Integer intMoney, String formatStr) {
        return getFormatMoney(intMoney, formatStr, Locale.US);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param intMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @param locale
     *            ʹ���Ĺ������ָ�ʽ,��������ǧ��λ����ʾ����
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(Integer intMoney, String formatStr, Locale locale) {
        if (intMoney == null) {
            intMoney = Integer.parseInt("0");
        }
        if (null == formatStr || formatStr.trim().equals("")) {
            formatStr = "��#,##0.00";
        }
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(locale);// ����ʹ���������ָ�ʽ
        // (
        // ǧ��λ
        // )
        df.applyPattern(formatStr);// ����Ӧ�ý���ʽ
        return df.format(intMoney);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param doubleMoney
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(Double doubleMoney) {
        return getFormatMoney(doubleMoney, null);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ
     *
     * @param doubleMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(Double doubleMoney, String formatStr) {
        if (doubleMoney == null) {
            doubleMoney = Double.valueOf(0);
        }
        return getFormatMoney(doubleMoney, formatStr, Locale.US);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ
     *
     * @param doubleMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @param locale
     *            ʹ���Ĺ������ָ�ʽ,��������ǧ��λ����ʾ����
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(Double doubleMoney, String formatStr, Locale locale) {
        if (doubleMoney == null) {
            doubleMoney = Double.valueOf(0);
        }
        if (null == formatStr || formatStr.trim().equals("")) {
            formatStr = "��#,##0.00";
        }
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(locale);// ����ʹ���������ָ�ʽ
        // (
        // ǧ��λ
        // )
        df.applyPattern(formatStr);// ����Ӧ�ý���ʽ
        return df.format(doubleMoney);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ(��λС��,ǧ��λ)
     *
     * @param bigDecimalMoney
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(BigDecimal bigDecimalMoney) {
        return getFormatMoney(bigDecimalMoney, null);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ
     *
     * @param bigDecimalMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @param locale
     *            ʹ���Ĺ������ָ�ʽ,��������ǧ��λ����ʾ����
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(BigDecimal bigDecimalMoney, String formatStr) {
        return getFormatMoney(bigDecimalMoney, formatStr, Locale.US);
    }

    /**
     * ת���ɽ�Ǯ���ַ���,����ʽ
     *
     * @param bigDecimalMoney
     * @param formatStr
     *            ��ʽ(����: ###.00 Ԫ),
     *            #ռλ��ʾ�ɿ�,0ռλ��ʾ���˾Ͳ�0ռλ,Eռλ��ʾʹ�ÿ�ѧ������,��ʽ�м��������ַ���ֱ����ʾ����
     *            ,����ǰ����ߺ���Ӹ�[Ԫ]��.�������ο�DecimalFormat
     * @param locale
     *            ʹ���Ĺ������ָ�ʽ,��������ǧ��λ����ʾ����
     * @return
     * @create Dec 15, 2008 9:40:39 AM yuancong
     * @history
     */
    public static String getFormatMoney(BigDecimal bigDecimalMoney, String formatStr, Locale locale) {
        if (bigDecimalMoney == null) {
            bigDecimalMoney = BigDecimal.valueOf(0.00);
        }
        if (null == formatStr || formatStr.trim().equals("")) {
            formatStr = "��#,##0.00";
        }
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(locale);// ����ʹ���������ָ�ʽ
        // (
        // ǧ��λ
        // )
        df.applyPattern(formatStr);// ����Ӧ�ý���ʽ
        return df.format(bigDecimalMoney);
    }

    /**
     * ��ȡmoney���͵��ַ���
     *
     * @param cent
     * @return
     */
    public static String getMoneyStr(Long cent) {
        Money money = new Money();
        money.setCent(cent);
        return money.toString();
    }

    /**
     * ����ֵ��ַ������õ�Ԫ���ַ���
     * @param cent
     * @return
     */
    public static String getMoneyStr(String cent) {
        if (cent != null && StringUtils.isNumeric(cent)) {
            Money money = new Money();
            money.setCent(Long.valueOf(cent));
            return money.toString();
        }
        return null;

    }
}
