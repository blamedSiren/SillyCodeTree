public class ProblemSolveB_1 {
    public static void main(String[] args) {
        String [] cheeses = {"Brie" , "Cheddar", "Gouda", "Mozzarella", "Parmesan", "Feta"};

        System.out.println(cheeses.length);
        System.out.println(cheeses[2]);
        System.out.println(cheeses[cheeses.length - 2]);

        for (int i = 0; i < cheeses.length-2; i++) {
            System.out.print(cheeses[i] + " ");
        }


    }   
}
