public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j <= 8 && i == 2) {
                    System.out.print(array[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------");

        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println("2. FRAPPUCCINO ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j <= 12 && j >= 2) && i == 13) {
                    System.out.print(array[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------");

        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i <= 9 && i >= 2) && j == 9) {
                    System.out.print(array[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------");

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");

        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");

        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");

        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");

        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");

        // =============================================================
        // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");

        // =============================================================
        // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");

        // =============================================================

        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("11. Elizer needs your help!");

        // Elizer loves to watch professional basketball. He is an avid fan of a certain
        // team which he follows on social media.
        // One day, he saw a post where his favorite team revealed their brand new home
        // and guest uniforms for the upcoming season.

        // The home and guest uniform are of different color.
        // All basketball teams have a home uniform which they wear if they are on their
        // home arena. On the other hand, the guest uniform is worn by teams who are
        // visiting their opponent's arena.

        // Sometimes, the color of the guest uniform of the visiting team can be the
        // same color with the uniform of the home team. If this happens, the home
        // team will put on their guest uniform so that they would be different.

        // There are n teams taking part in the regular season. Elizer asked himself how
        // many times a home team will have to wear their guest uniform?

        // The regular season consists of n * ( n - 1) games. Each team will have a home
        // game and away game.
        // The color of the uniforms are represented by integers. No two distinct colors
        // can have the same number.
        // Help Elizer find the answer to his question!

        // Requirements
        // 1. Ask for the number of n teams participating.
        // 2. Ask for a pair of numbers, the home and away colors for each
        // participating team.
        // 3. The answer should be the number of times a home team will wear their away
        // uniform.

        // =============================================================
        // Example:
        // Input:
        // 3
        // 1 2
        // 2 4
        // 3 4

        // Answer
        // 1

        // Note: In this example, the season will have a total of six games.
        // There is game where team 2 will have to wear their guest uniform if team 1
        // visits their arena.
        
        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("12. Everybody has a price!");
        
        // Create a program and find out the condition to prove the following statements below.
        // ELIZER == ZOPHIA is TRUE
        // TONI > MARC is FALSE.
        
        // Input:
        // The first line is any name in UPPERCASE which only consists of characters from A-Z;
        // The second line is any name in UPPERCASE which only consists of characters from A-Z;
        
        // Output:
        // TRUE or FALSE
    }
}
