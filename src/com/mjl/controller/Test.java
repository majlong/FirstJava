package com.mjl.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:mjl
 * @Date:2020/6/17 - 06 - 17 - 20:01
 * @Description:com.mjl.controller
 * @version:1.0
 */
public class Test {
    //prsf
    private static final long L = 5L;
    //psfi
    public static final int num = 4;

    //psvm /  main
    public static void main(String[] args) {
        //sout
        System.out.println();
        //soutp  形参
        ArrayList<String> list = new ArrayList<>();
        Map<String,Object> m = new HashMap<>();
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm  方法名字
        System.out.println("Test.main");
        // soutv  变量值
        int i = 0;
        String s ="1";
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        //xxx.sout
        System.out.println(i);

        //fori
        String[] strs = new  String[]{"lilei","hanmeimei"};
        for (int j = 0; j < 10; j++) {
            
        }
        //iter
        for (String str : strs) {

        }
        //itar
        for (int j = 0; j < strs.length; j++) {
            String str = strs[j];

        }
        ArrayList<String> arr = new ArrayList<String>(){
            {
                add("oo");
                add("XX");
            }
        };
        //list.for
        for (String s1 : list) {

        }
        //list.fori
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        //list.forr  倒序遍历
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {

        }
        //ifn
        if (arr == null) {

        }
        //inn
        if (arr != null) {

        }
        //

        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
    }
}
