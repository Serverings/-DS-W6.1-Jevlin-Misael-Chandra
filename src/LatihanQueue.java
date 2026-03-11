import java.util.*;

public class LatihanQueue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur (pisahkan dengan spasi): ");
        String data = input.nextLine();

        Queue<Integer> queue = new LinkedList<>();

        Queue<Integer> passed = new LinkedList<>();
        Queue<Integer> rejected = new LinkedList<>();

        String[] parts = data.split(" ");

        for (String p : parts) {
            int ageValue = Integer.parseInt(p); 
            queue.add(ageValue);
        }

        while (!queue.isEmpty()) {
            int age = queue.remove();

     
            if (age >= 28 && age <= 118) {
                passed.add(age);  
            } else {
                rejected.add(age);
            }
        }

        System.out.println("Yang lolos: " + passed);
        System.out.println("Yang ditolak: " + rejected);
    }
}