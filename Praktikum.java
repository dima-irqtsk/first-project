public class Praktikum {
    public static void main(String[] args) {
        int days = 30;
        int serials = 3;
        for (int i = 1; i <= days; i++) {
            System.out.println("День " + i);
            for (int j = 1; j <= serials; j++) {
                System.out.println(" Серия " + j);
            }
        }
    }
}