package HomeWork_2021._2021_2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 02 02
 * Time:23:14
 */

class Car {
    public int position;
    public double time;

    public Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}

public class Test02 {
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        int i = carFleet(target, position, speed);
        System.out.println(i);
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        Car[] cars = new Car[len];
        for (int i = 0; i < len; i++) {
            cars[i] = new Car(position[i],(double) (target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.position - o2.position;
            }
        });
        int ret = 0;
        int k = len;
        while (--k > 0){
            if(cars[k].time < cars[k - 1].time)
                ret++;
            else
                cars[k - 1] = cars[k];
        }
        return ret + (k == 0 ? 1 : 0);
    }
}
