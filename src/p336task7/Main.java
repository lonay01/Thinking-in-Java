package p336task7;

import java.util.ArrayList;
import java.util.List;

class Doggy {
    private int i;
    Doggy(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Doggy{" +
                "i=" + i +
                '}';
    }
};

public class Main {
    public static void main(String[] args) {
        Doggy[] doggies = {new Doggy(1), new Doggy(2), new Doggy(3), new Doggy(4)};
        List<Doggy> sub = new ArrayList<>(List.of(doggies));
        List<Doggy> sub_copy = new ArrayList<>(sub.subList(1,3));
        sub.removeAll(sub_copy);
        System.out.println(sub);
        }
    }

