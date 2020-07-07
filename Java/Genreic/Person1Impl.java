package Genreic;

public class Person1Impl<E> implements Person1<E>{

    @Override
    public <E> void show(E m) {
        System.out.println(m);
    }
}
