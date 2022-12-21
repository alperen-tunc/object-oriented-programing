package Tutorial._20_Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student
{
    private String name;
    private int alter;

    public Student(){};

    public Student(String name, int alter)
    {
        this.alter = alter;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }
}

public class Teil2
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Timo", 33));
        studentList.add(new Student("Tom", 23));
        studentList.add(new Student("Anton", 32));
        studentList.add(new Student("Ali", 30));
        studentList.add(new Student("Tims", 29));

        Stream<String> helloStream = Stream.generate(() -> "Hello generate()");

        helloStream.limit(10).forEach(System.out::println);
        System.out.println();

        Stream<Student> studentStream = studentList.stream();

        studentStream.filter(s -> s.getAlter()>=30)
                        .map(s-> s.getName().toUpperCase())
                        .forEach(System.out::println);

        System.out.println();

        Function<Student, String> studentStringFunction = s -> s.getName().toUpperCase();
        Stream<Student> studentStream1 = studentList.stream();
        studentStream1.filter(s -> s.getAlter()>=30)
                .map(studentStringFunction)
                .forEach(System.out::println);
        System.out.println();

        Stream<Student> studentStream2 = studentList.stream();
        List<String> namen = studentStream2.filter(s -> s.getAlter()>=30)
                                            .map(studentStringFunction)
                                            .collect(Collectors.toList());

        namen.forEach(System.out::println);
        System.out.println();

        // TerminalOperationen

        Stream<Student> studentStream3 = studentList.stream();
        long count = studentStream3.filter(s -> s.getAlter() >= 30).count();
        System.out.println(count);

        Stream<Student> studentStream4 = studentList.stream();
        Optional<Student> max = studentStream4.max((s1,s2) -> s1.getAlter() - s2.getAlter());

        Stream<Student> studentStream5 = studentList.stream();
        Optional<Student> min = studentStream5.min((s1,s2) -> s1.getAlter() - s2.getAlter());

        System.out.println(max.get().getName());
        System.out.println(min.get().getName());

        boolean unter30 = studentList.stream().allMatch(s-> s.getAlter()<30); // allMatch für alle, anyMatch für beliebige, noneMatch für eine von denen.
        System.out.println(unter30);




        System.out.println("\n\nEnd of Main..");
    }
}
