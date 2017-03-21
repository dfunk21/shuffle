package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("class.txt", true);

        Scanner sb = new Scanner(new File ("class.txt"));
        ArrayList<String> shuffle = new ArrayList<>();

        while (sb.hasNext()) {
            shuffle.add(sb.next());
        }

        int n = shuffle.size();
        for (int i = n; i > 1; i--) {
            int ran = (int)(Math.random() * i);
            String s = shuffle.get(i-1);
            shuffle.set(i-1, shuffle.get(ran));
            shuffle.set(ran,s);
        }
        fw.close();
        FileWriter fw2 = new FileWriter("class.txt");
        PrintWriter pw = new PrintWriter(fw2);
        for(String s: shuffle){
            pw.println(s);
        }
        pw.close();
        fw2.close();
    }

}
