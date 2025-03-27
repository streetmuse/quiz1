package nikoloz_lobzhanidze_2.quiz1.t2.blender.sub;

import nikoloz_lobzhanidze_2.quiz1.t2.blender.A21;
import nikoloz_lobzhanidze_2.quiz1.t2.herb.conductor.A22;

import java.time.Month;

public class R21 {
    public static void main(String[] args) {
        A22 a22 = new A22();
        System.out.println(Month.of(a22.getMonth()));
        A21 a21 = new A21(21,32);
        System.out.println(a21.getWidth() * a21.getHeight());
    }
}
