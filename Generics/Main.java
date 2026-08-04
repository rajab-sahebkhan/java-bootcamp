package Generics;

public class Main {

    public static void main(String[] args) {

        Box<String> name = new Box<>("power");
        Box<Integer> marks = new Box<>(20);
        Box<Double> salary = new Box<>(24.2452);

        String a = name.getItem();

        System.out.println(name.getItem());

        name.setItem("Rajab");

        System.out.println(name.getItem());
        System.out.println(marks.getItem());
        System.out.println(salary.getItem());

    }
}
