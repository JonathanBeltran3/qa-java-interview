public class Solution {

    /**
     * Implémentez la méthode closestToZero pour retourner la température la plus proche de zéro qui appartient au tableau ts.
     * + si le tableau est vide, retournez 0
     * + si deux nombres sont tous aussi proches de zéro, considérez le nombre positif comme étant le plus proche de zéro
     * (par exemple si ts contient 5 & -5 retourner 5)
     *
     * @param ts
     */
    public static double closestToZero(double[] ts) {
        if (ts == null || ts.length == 0) {
            return 0;
        }

        double T;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < ts.length; i++) {
            T = ts[i];
            if (Math.abs(T) < Math.abs(min) || (T == -min && T > 0)) {
                min = T;
            }
        }
        return min;
    }
    
//    public static double closestToZero(double[] ts){
//
//
//        if (double == 0 || double == null) {
//            return 0;
//        }
//
//        double T;
//        double min = double.MAX_VALUE;
//        for (double i = 0; i < double; i++) {
//            T = ts[i];
//            if (Math.abs(T) < Math.abs(min) || (T == -min && T > 0)) {
//                min = T;
//            }
//        }
//        return min;
//    }


}