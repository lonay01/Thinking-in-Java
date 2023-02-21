

public class p131task5 {
    public static String toBinary(int value) {
        int saveValue = value;
        int mask = 1;
        String result = "";
        do {
            result = ((mask & saveValue) > 0 ? "1" : "0") + result;
            value >>= 1;
            mask <<= 1;
        }
        while (value != 0);
        return result;
    }
    public static void main(String[] Args) {
        int variable = 4895;
        String asd = toBinary(variable);
        System.out.println(asd);
    }
}