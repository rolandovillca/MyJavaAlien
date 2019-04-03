/**
 * The question mark (?), represents the wildcard, 
 * stands for unknown type in generics. 
 * There may be times when you'll want to restrict the kinds of types 
 * that are allowed to be passed to a type parameter. 
 * 
 * For example, a method that operates on numbers might only want 
 * to accept instances of Integer or its superclasses like Number.
 * 
 * To declare a lower bounded Wildcard parameter, 
 * list the ?, followed by the super keyword, followed by its lower bound.
 * 
 * Example
 * Following example illustrates how super is used to specify 
 * an lower bound wildcard.
 */

package GenericPractices;

import java.util.ArrayList;
import java.util.List;

class LowerBoundedWilcard {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        List<BolivianCat> boliviaCats = new ArrayList<BolivianCat>();
        List<Dog> dogs = new ArrayList<Dog>();

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        List<? extends Cat> covariantCats = cats;
        Animal animal = covariantCats.get(0);
        Cat cat = covariantCats.get(1);

        List<? super RedCat> contravariantCats = new ArrayList<RedCat>();
        contravariantCats.add(new RedCat());
        contravariantCats.add(new BolivianCat());
        contravariantCats.add(new CbbaCat());
    }

    static void addCat(List<? super Cat> cats) {
        cats.add(new Cat());
        System.out.println("Adding cats and all its children cats");
    }
}

class Animal {}

class Cat extends Animal {}

class RedCat extends Cat {}

class BolivianCat extends RedCat {}

class CbbaCat extends BolivianCat {}

class Dog extends Animal {}