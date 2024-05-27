public class Main {
    public static void main(String[] args) {
        Cache LRU = new Cache(3);
        LRU.put(1);
        LRU.put(2);
        LRU.put(3);
        System.out.println(LRU.getCache());
        LRU.put(4);
        System.out.println(LRU.getCache());
        System.out.println("Received 2 at position " + LRU.get(2));
        System.out.println(LRU.getCache());
        System.out.println("Received 4 at position " + LRU.get(4));
        System.out.println(LRU.getCache());
        System.out.println("Received 4 at position " + LRU.get(4));
        System.out.println(LRU.getCache());
    }
}