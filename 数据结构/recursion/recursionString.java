package 数据结构.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019:03:26
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class recursionString {
    public static void main(String[] args) {
        String base="ABC";
        List<String >list=getFun(base,"");
        for (String a:list
             ) {
            System.out.println(a);
        }

    }
    public static List<String> getFun(String base, String buff ){
        List<String> list=new ArrayList<>();
        if(base.length()<=0){
            list.add(buff);
        }
        for (int i = 0; i <base.length() ; i++) {
            List<String > temp=getFun(new StringBuilder(base).deleteCharAt(i).toString(),buff+base.charAt(i));
            list.addAll(temp);
        }
        return list;
    }
}
