package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java her zaman guzel");

        sb.delete(8,9);
        System.out.println(sb); //her zaman   arasındaki boslugu sildik

        sb.deleteCharAt(7);
        System.out.println(sb);   //

        // bastan baslayarak her loop te ilj-k harfi silip kalanı yazdıralım

        int son=sb.length();

        for (int i = 0; i <sb.length() ; i++) {
        sb.deleteCharAt(0);
            System.out.println(sb);
        }



    }
}
