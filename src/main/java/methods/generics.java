package methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.lang.*;

/*
Place for all generic sortings algorithms
current algorithm plans for this project is:
- Sorting from hard to easy (extendion of Arrays.sort, so it can work with climbing routes)
- finding the hardest route in a arrayList
- finding the easiest route in a arrayList
 */

public class generics {
    public static void change(int k, int j){
        //standard method for change the value of a thing
        if (k > 0 || j > 0){
            throw new IllegalArgumentException("illegal intervall");
        }
        int temp  = k;
        k = j;
        j = temp;
    }
    public static <T> List<T> addWithCondition (List<T> a, List <String> b){
    //Array A must have a proprety of array B
        //combine bubble and mergesort.
        List <T> aSort  = new ArrayList<>();
    if (a.size() <= 0) throw new IndexOutOfBoundsException("The unsorted list is empty");
    if (b.size() <= 0) throw new IndexOutOfBoundsException("Nothing to sort against");
    else {
        int l = 0;
        while (l < b.size()) {
            for (int i = 0; i < a.size(); i++) {
                //if a[i] contains b[l], add it to the aSort

                if (a.get(i).equals(b.get(l))) {
                    aSort.add(a.get(i));
                }

            }
            l++;
        }
    }


    return aSort;
    }
    //sorting
    public static <T> List <T> sort (List <T> list){

    }


}
