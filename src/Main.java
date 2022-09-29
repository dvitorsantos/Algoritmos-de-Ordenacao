public class Main {
    public static void main(String[] args) {
        Sort<Double> sortDouble = new Sort<Double>();
        Sort<Integer> sortInteger = new Sort<Integer>();

        Double[] vectorDouble = { 5.0, 2.0, 1.0, 3.0, 4.0 };
        Integer[] vectorInteger = { 3, 5, 1, 2, 4 };

        //sort selection com double
        vectorDouble = sortDouble.selectionSort(vectorDouble);

        //sort selection com integer
        vectorInteger = sortInteger.selectionSort(vectorInteger);

        for (int i = 0; i < vectorDouble.length; i++) {
            System.out.println(vectorDouble[i]);
        }

        for (int i = 0; i < vectorInteger.length; i++) {
            System.out.println(vectorInteger[i]);
        }
    }
}