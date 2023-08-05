package p274task11;




class Swap{
    public String sp(String s){
        char[] s_1 = s.toCharArray();
        char buff;
        for (int i = 0; i < s_1.length/2; i++) {
            buff = s_1[i];
            s_1[i] = s_1[s_1.length - i - 1];
            s_1[s_1.length - i - 1] = buff;
        }

        return String.valueOf(s_1);
    }
}
interface Processor{
    String name();
    Object process(Object input);
}

class Apply{
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class SwapAdapter implements Processor{
    public String name(){return "SwapAdapter";}
    Swap s;
    SwapAdapter(Swap sp){
        s = sp;
    }
    public String process(Object input){
        return s.sp((String)input);
    }
}
public class Main{
    public static void main(String[] args){
        String s = "Privet";
        Apply.process(new SwapAdapter(new Swap()), s);
    }
}