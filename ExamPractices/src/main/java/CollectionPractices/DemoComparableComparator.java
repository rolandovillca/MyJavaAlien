package CollectionPractices;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DemoComparableComparator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("ZZZ", 30, 300));
        list.add(new Person("AAA", 20, 200));
        list.add(new Person("MMM", 50, 500));

        // Collections.sort(list);

        Collections.sort(list, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.age < p2.age) return -1;
                return 1;
            }
        });

        for (Person p : list) {
            System.out.println(p.age);
        }
    }
}

// class Person implements Comparable<Person>{
    class Person {
    String name;
    int age;
    int id;

    public Person(){}

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // @Override
    // public int compareTo(Person p) {
    //     if (this.age > p.age) return -1;
    //     return 1;
    // }

    public String toString(){
        return "Name=" + name + ", Age=" + age + ", Id=" + id;
    }
}