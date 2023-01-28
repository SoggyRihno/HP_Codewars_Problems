import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input21.txt"));
        int n = scan.nextInt();
        scan.nextLine();

        List<Queue> queues = new ArrayList<>();
        int maxtime = 0;

        for (int ll = 0; ll < n; ll++) {
            int time = scan.nextInt();
            scan.nextInt();
            String[] people = scan.nextLine().trim().split(" ");
            queues.add(new Queue(time,people));
            maxtime = Math.max(maxtime, people.length * time);
        }

        for (int i = 1 ;i < maxtime +1; i++){
            for (Queue queue : queues) {
                if (i % queue.time == 0 && i/queue.time -1 < queue.people.length) {
                    System.out.print(queue.people[i/queue.time -1] + " ");
                }
            }
        }
    }
}

class Queue {
    int time;
    String[] people;

    public Queue(int time, String[] people) {
        this.time = time;
        this.people = people;
    }
}