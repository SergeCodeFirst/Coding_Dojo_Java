public class PuzzleTest {
    public static void main(String[] args) {
        Puzzle newPuzzle = new Puzzle();

        // newPuzzle.randomTest();
        // newPuzzle.getTenRolls();
        // System.out.println(newPuzzle.getRandomLetter());
        // System.out.println(newPuzzle.generatePassword());
        // System.out.println(newPuzzle.getNewPasswordSet(8));
        System.out.println(newPuzzle.shuffleArray(newPuzzle.getNewPasswordSet(8)));
    }
}
