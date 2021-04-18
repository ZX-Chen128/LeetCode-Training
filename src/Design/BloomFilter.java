package Design;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Zixin Chen on 2021/4/14.
 */
public class BloomFilter {

    Boolean[] bitmap = new Boolean[64];
    int size = 64;

    private void get(Object obj) {
        int hashCode1 = obj.hashCode() % size;
        int hashCode2 = obj.toString().hashCode() % size;
        if(bitmap[hashCode1] && bitmap[hashCode2]) {
            System.out.println("This input might exist!");
        } else {
            System.out.println("This input is new!");
        }
    }

    private void add(Object obj) {
        int hashCode1 = obj.hashCode() % size;
        int hashCode2 = obj.toString().hashCode() % size;
        if(bitmap[hashCode1] && bitmap[hashCode2]) {
            System.out.println("This input might exist!");
        } else {
            bitmap[hashCode1] = true;
            bitmap[hashCode2] = true;
            System.out.println("This input is new!");
        }
    }
}
