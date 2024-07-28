package Java21July2024;

public class Switch5 {
    public static void main(String[] args) {
        // JDK > 13
        char code = 'B';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;//// return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
