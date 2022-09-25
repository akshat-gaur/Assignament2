class Q4 {
    public static void main(String args[]) {
        int population = 80000;
        int year = 0;
        while (population < 150000) {
            population = population * 105;
            population = population / 100;
            System.out.println(population);
            year = year + 1;

        }
        System.out.println(year);

    }

}