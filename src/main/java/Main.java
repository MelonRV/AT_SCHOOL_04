import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;


public class Main {
    public static void main(String[] args) {

        Other.saySomthing();
        Contract.staticMethod("Строка для вывода в консоль");
        Some some = new Some("secret");
        System.out.println(some);
        System.out.println(some.getДаТакТожеМожно());
        System.out.println(some.count());
        some.soTellMeAboutInterfaces();
        System.out.println(Qwerty.class.getAnnotation(AnnotationForExaple.class).description());
        System.out.println(Some.class.getAnnotation(AnnotationForExaple.class).description());
    }
}
