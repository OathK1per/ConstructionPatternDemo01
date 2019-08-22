package prototype01;

public class Client04 {

    public static void main(String[] args) throws Exception {

        long newInstance = Client04.newInstance();
        long cloneInstance = Client04.cloneInstance();

        System.out.println("newInstance: " + newInstance);
        System.out.println("cloneInstance: " + cloneInstance);
    }

    private static long newInstance() {
        long start = System.currentTimeMillis();
        for (long i = 0; i < 10000000; i++) {
            Student student = new Student();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long cloneInstance() throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Student student = new Student();
        for (long i = 0; i < 10000000; i++) {
            Student student1 = student.clone();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
