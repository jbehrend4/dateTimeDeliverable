
package class4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Class4 {

    public static void main(String[] args) {
        LocalDate album1 = LocalDate.of(1987, 3, 9);
        LocalDate album2 = LocalDate.of(1988, 10, 10);
        Period albums = Period.between(album1, album2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, MMMM dd, yyyy GGGG");
        LocalDate album3 = album2.plus(albums);
        String album1Display = album1.format(formatter);
        String album2Display = album2.format(formatter);
        String album3Display = album3.format(formatter);
        System.out.println("The Joshua Tree:   " + album1Display);
        System.out.println("Rattle and Hum:    " + album2Display);
        System.out.println("Third Album:       " + album3Display);
        LocalDate album4andMore = album3.plus(albums);
        for (int i = 4; i < 5000; i++) {
            String album4Display = album4andMore.format(formatter);            
            System.out.println("Album " + i + ":       " + album4Display);
            album4andMore = album4andMore.plus(albums);
        }        
    }
    
}
