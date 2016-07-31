/**
 * Created by JoJuJa on 7/31/2016.
 */
package com.applications.doc.electronicse_module;

import java.util.StringTokenizer;

public class Globals {
    public static String ans;
    public static int q;

    public static void addAnswer(String a){
        ans += a;
    }

    public static void changeQuestion(){
        q++;
    }

    public static int getQuestion(){
        return q;
    }

    public static String getAnswer(){
        return ans;
    }
}
