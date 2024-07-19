import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelRangeCells {
    
    public static List<String> cellsInRange(String s) {
        char col1 = s.charAt(0);
        int row1 = Character.getNumericValue(s.charAt(1));
        char col2 = s.charAt(3);
        int row2 = Character.getNumericValue(s.charAt(4));
        
        List<String> result = new ArrayList<>();
        
        for (char col = col1; col <= col2; col++) {
            for (int row = row1; row <= row2; row++) {
                String cell = String.valueOf(col) + row;
                result.add(cell);
            }
        }
        
        // Sort cells by column first, then by row
        Collections.sort(result);
        
        return result;
    }
    
    public static void main(String[] args) {
        String s1 = "K1:L2";
        List<String> cells1 = cellsInRange(s1);
        System.out.println(cells1);  // Output: [K1, K2, L1, L2]
        
        String s2 = "A1:F1";
        List<String> cells2 = cellsInRange(s2);
        System.out.println(cells2);  // Output: [A1, B1, C1, D1, E1, F1]
    }
}
