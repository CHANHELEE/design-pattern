package builder;

public class Application {

    public static void main(String[] args) {

        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.name("lee").grade("2").phoneNumber("010-").build();
        System.out.println(student);
    }
}
