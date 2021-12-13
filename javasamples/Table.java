import java.util.HashMap;

/**
 * ------ | Col1 | Col2 | Col 3 Row1 | [1,2] | [1] | [2] Row2 | [1,2,4] | [1,3]
 * | [2] Row3 | [] | [1,2,4,5] | [2]
 * 
 */

public class Table {

    public static void main(String[] args) {
        String[] options = { "Col1", "Col2", "Col3" };
        String[] methods = { "Row1", "Row2", "Row2" };

        HashMap<String, String[]> mappings = new HashMap<String, String[]>();

        mappings.put(options[0] + "-" + methods[0], new String[] { "math", "logic" });
    }

}