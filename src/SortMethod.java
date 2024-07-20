import java.util.Arrays;
import java.util.List;

public class SortMethod {
    static <T extends Comparable<? super T>> List<T> processExtremesSort(List<T> list) {
        T[] array = list.toArray((T[]) new Comparable[0]);
        T[] orderedArray = Arrays.copyOf(array, array.length);

        int start = 0;
        int end = array.length - 1;
        int position = 0;

        while (start <= end) {
            if (position < array.length) {
                orderedArray[position++] = array[start++];
            }
            if (position < array.length) {
                orderedArray[position++] = array[end--];
            }
        }
        return Arrays.asList(orderedArray);
    }
    /*public static Object sortByExtremes(List<?> list){
        if (list.isEmpty()){
            return Arrays.asList("Empty Array");
        }
        Object firstElement = list.get(0);

        if (firstElement instanceof Integer){
            return processIntExtremesSort((List<Integer>) list);
        } else if (firstElement instanceof String){
            return processStringExtremesSort((List<String>) list);
        } else if (firstElement instanceof Double){
            return processDoubleExtremesSort((List<Double>) list);
        } else {
            return "Unsupported type";
        }


    }
    private static List<Integer> processIntExtremesSort(List<Integer> list) {
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        int[] orderedArray = new int[array.length];

        int start = 0;
        int end = array.length - 1;
        int position = 0;

        while (start <= end) {
            if (position < array.length) {
                orderedArray[position++] = array[start++];
            }
            if (position < array.length) {
                orderedArray[position++] = array[end--];
            }
        }
        return Arrays.asList(Arrays.stream(orderedArray).boxed().toArray(Integer[]::new));
    }

    private static List<Double> processDoubleExtremesSort(List<Double> list) {
        Double[] array = list.toArray(new Double[0]);
        Double[] orderedArray = new Double[array.length];

        int start = 0;
        int end = array.length - 1;
        int position = 0;

        while (start <= end) {
            if (position < array.length) {
                orderedArray[position++] = array[start++];
            }
            if (position < array.length) {
                orderedArray[position++] = array[end--];
            }
        }
        return Arrays.asList(orderedArray);
    }

    private static List<String> processStringExtremesSort(List<String> list) {
        String[] array = list.toArray(new String[0]);
        String[] orderedArray = new String[array.length];

        int start = 0;
        int end = array.length - 1;
        int position = 0;

        while (start <= end) {
            if (position < array.length) {
                orderedArray[position++] = array[start++];
            }
            if (position < array.length) {
                orderedArray[position++] = array[end--];
            }
        }
        return Arrays.asList(orderedArray);
    }
    */
}
