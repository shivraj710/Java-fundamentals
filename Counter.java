public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        System.out.println("Count:" +Counter.getCount());
        Counter c2 = new Counter();
        System.out.println("Count:" +Counter.getCount());
        Counter c3 = new Counter();
        System.out.println("Count:" +Counter.getCount());
    }
}
