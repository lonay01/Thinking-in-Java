package p403task25;

public class ThreeLevelException {

    public static void main(String[] args) {
        A c = new C();
        try {
            c.throwException();
        } catch (FirstLevelException e) {
            System.out.println(e);
        }
    }
}

class FirstLevelException extends Exception {

}

class SecondLevelException extends FirstLevelException {

}

class ThirdLevelException extends SecondLevelException {

}

class A {

    void throwException() throws FirstLevelException {
        throw new FirstLevelException();
    }
}

class B extends A {

    @Override
    void throwException() throws SecondLevelException {
        throw new SecondLevelException();
    }
}

class C extends B {

    @Override
    void throwException() throws ThirdLevelException {
        throw new ThirdLevelException();
    }
}