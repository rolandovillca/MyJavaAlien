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
 * 
 * Upper Bounded Wildcards:
 * The upper bounded wildcard, <? extends T>, where T is any type, 
 * matches T and any subtype of T.
 * The process method can access the list elements as type Foo:
 *
 * Lower Bounded Wildcards:
 
 */

package GenericPractices;

import java.util.ArrayList;
import java.util.List;

class LowerBoundedWilcard {
    public static void main(String[] args) {
        //Common generics:
        List<Animal> animals = new ArrayList<Animal>();
        List<BolivianCat> boliviaCats = new ArrayList<BolivianCat>();
        List<Dog> dogs = new ArrayList<Dog>();

        List<Cat> cats = new ArrayList<>(); //New notation above java 8.
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new RedCat());
        cats.add(new CbbaCat());
        cats.add(new CbbaCat());
        List<? extends Cat> covariantCats = cats; // Wilcard - upper bound:
        Animal animal1 = covariantCats.get(0);
        Animal animal2 = covariantCats.get(1);
        Cat cat = covariantCats.get(2);
        RedCat redCat = (RedCat)covariantCats.get(3);
        CbbaCat cbbaCat = (CbbaCat)covariantCats.get(4);
        Animal animal3 = covariantCats.get(5);

        // Wilcard - lower bound:
        List<? super RedCat> contravariantCats = new ArrayList<RedCat>();
        contravariantCats.add(new RedCat());
        contravariantCats.add(new BolivianCat());
        contravariantCats.add(new CbbaCat());
        // contravariantCats.add(new Cat()); //Fails coz Cat is parent of RedCat
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