import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Dato un array di interi di lunghezza n scrivere un metodo che lo stampi con l'ordinamento
         * descritto nell'esempio:
         * Int array[] = {14,5,23,89,4,50};
         * Stamp: 14,50,5,4,23,89
         * Stampare sia questo che con numeri dispari.
         */

        Integer[] arrayOfNumbers = {14, 5, 23, 89, 4, 50};
        String[] arrayOfStrings = {"rosso", "verde", "blu", "viola", "giallo", "grigio"};
        Double[] arrayOfDouble = {14.5, 5.5, 23.5, 89.5, 4.5, 50.5};

        List<Integer> integers = SortMethod.processExtremesSort(List.of(arrayOfNumbers));
        List<String> strings = SortMethod.processExtremesSort(List.of(arrayOfStrings));
        List<Double> doubles = SortMethod.processExtremesSort(List.of(arrayOfDouble));

        System.out.println("Sorted Integers: " + integers);
        System.out.println("Sorted Strings: " + strings);
        System.out.println("Sorted Doubles: " + doubles);

        /*System.out.println(SortMethod.sortByExtremes(Arrays.asList(arrayOfNumbers)));
        System.out.println(SortMethod.sortByExtremes(Arrays.asList(arrayOfStrings)));
        System.out.println(SortMethod.sortByExtremes(Arrays.asList(arrayOfDouble)));*/

    }
}