class MinOfThree {
    public static void main(String args[]) {
        int a = 63;
        int b = 45;
        int c = 9;
        int d = min_no(a, b, c);
        System.out.print(d);
    }

    public static int min_no(int x, int y, int z) {          
        if (x >= y) {              //ckeck wheater y is smaller than x
            if (y >= z) {           // check wheater z is smaller than y
                return z;          // if above two checks are successfull than z must be the smallest
            } else {
                return y;           // if y is smaller than z than y is the smallest
            }
        } else {                   
            if (x >= z) {
                return z;
            } else {
                return x;
            }
        }
    }

}

