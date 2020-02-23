public class Zadanie01 {
        public static void main(String[] args) {
            int [] tab= {3,1,5,901,52,-54,54,6,0};
            System.out.println("The smallest array's element is "+ min(tab));
            System.out.println("The biggest array's element is "+ max(tab));
        }
        //int [] tab= {3,1,5,901,52,-54,54,6,0};
        public static int max(int ... tab){
            int maxA=tab[0];
            for (int i = 0; i <tab.length ; i++) {
                if (maxA < tab[i]) {
                    maxA=tab[i];
                }
            }
            return maxA;
        }
        public static int min(int ... tab){
            int minA=tab[0];
            for (int i = 0; i <tab.length ; i++) {
                if (minA > tab[i]) {
                    minA=tab[i];
                }
            }
            return minA;
        }
    }
