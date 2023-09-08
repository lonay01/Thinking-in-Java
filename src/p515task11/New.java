package p515task11;

import java.util.ArrayList;

public class New {
    public static <K> ArrayList<K> list() {
        return  new ArrayList<K>();
    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = list();
        ArrayList<Integer> integers = New.<Integer>list();
    }
}
