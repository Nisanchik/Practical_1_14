public class Test {
    public static void main(String[] args) {
        Thread[] students = new StudentThread[7];
        for (int i = 0; i < 7; i++) {
            students[i] = new StudentThread();
            students[i].setName("Student " + (i + 1));
            students[i].start();
        }
        try {
            for (Thread student : students) {
                student.join();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
