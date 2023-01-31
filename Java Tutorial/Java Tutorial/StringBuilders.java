import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        
        // System.out.println(sb);

        //*charAt() at index 0 */
        // System.out.println(sb.charAt(0));

        //*Set char at index 0
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        //*Insert Character */
        // sb.insert(2 , 'n');
        // System.out.println(sb);

        //*Delete the extra n */
        // sb.delete(2, 4);
        // System.out.println(sb);

        //*append */
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb.length());

        //* */
        StringBuilder sb = new StringBuilder("Hello");

        for( int i=0 ; i<sb.length()/2 ; i++ ) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb. charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
