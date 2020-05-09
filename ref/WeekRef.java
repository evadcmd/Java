package ref;

import java.lang.ref.WeakReference;

public class WeekRef {
    public static void main(String... args) {
        WeakReference<String> weakref = new WeakReference<>("hello world");
        System.out.println(weakref.get());
        System.gc();
        if (weakref.get() == null)
            System.out.println("recycled");
        else
            System.out.println("alive");
    }
}