package Factorization;
//testcomment
public class Factor {
    public void FS2E(int num) {
        int firFact = 2, secFact = 2;
        int fin = 0;
        while (true){
            for(int i = 0; i < 1000000; i++) {
                int res = firFact * secFact;
                System.out.println(res);
                secFact++;
                if (res == num) {
                    fin = res;
                    System.out.println("The factors: " + firFact + " and " + secFact);
                    break;
                }

            }
            if (fin == num) break;
            firFact++;
            secFact = 2;
        }

    }
    public int CS2E(int num) {

        return -1;
    }
}
