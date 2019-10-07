/**
 * The question mark (?), represents the wildcard, 
 * stands for unknown type in generics. 
 * There may be times when you'll want to restrict the kinds of types 
 * that are allowed to be passed to a type parameter. 
 * 
 * For example, a method that operates on numbers might only want 
 * to accept instances of Number or its subclasses.
 * 
 * To declare a upper bounded Wildcard parameter, 
 * list the ?, followed by the extends keyword, followed by its upper bound.
 * 
 * Example:
 * Following example illustrates how extends is used to specify 
 * an upper bound wildcard.
 */

package GenericPractices;

import java.util.Arrays;
import java.util.List;

class UpperBoundedWildcard {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println("Sum ints="+sum(ints));

        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("Sum doubles="+sum(doubles));
    }

    static double sum(List<? extends Number> nums) {
        double sumTotal = 0.0;
        for(Number num: nums) {
            sumTotal += num.doubleValue();
        }
        return sumTotal;
    }
}