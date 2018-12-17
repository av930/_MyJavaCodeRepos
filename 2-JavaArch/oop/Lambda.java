import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.lang.Iterable;
import java.time.chrono.IsoChronology;

/* https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html*/
public class Lambda {

    interface CheckPerson {
        boolean test(Person per);
    }

    // Approach 1: Create Methods that Search for Persons that Match One Characteristic
    public static void printPersonsWithAge(List<Person> roster, int age) {
        for (Person per : roster) {
            if (per.getAge() == age) {
                per.printPerson();
            }
        }
    }

    // Approach 2: Create More Generalized Search Methods with age
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person per : roster) {
            if (low <= per.getAge() && per.getAge() < high) {
                per.printPerson();
            }
        }
    }

    // Approach 3: Specify Search Criteria Code in a Local Class
    // Approach 4: Specify Search Criteria Code in an Anonymous Class
    // Approach 5: Specify Search Criteria Code with a Lambda Expression
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person per : roster) {
            if (tester.test(per)) {
                per.printPerson();
            }
        }
    }

    // Approach 6: Use Standard Functional Interfaces with Lambda Expressions
    public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person per : roster) {
            if (tester.test(per)) {
                per.printPerson();
            }
        }
    }

    // Approach 7: Use Lambda Expressions Throughout Your Application
    public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
        for (Person per : roster) {
            if (tester.test(per)) {
                block.accept(per);
            }
        }
    }

    // Approach 7, second example
    public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester, Function<Person, String> mapper, Consumer<String> block) {
        for (Person per : roster) {
            if (tester.test(per)) {
                String data = mapper.apply(per);
                block.accept(data);
            }
        }
    }

    // Approach 8: Use Generics More Extensively
    public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper, Consumer<Y> block) {
        for (X per : source) {
            if (tester.test(per)) {
                Y data = mapper.apply(per);
                block.accept(data);
            }
        }
    }

    public static void main(String... args) {
        // Intro: List All Person info
        List<Person> roster = Person.createRoster();
        System.out.println("All Persons:");
        for (Person per : roster) {
            per.printPerson();
        }

        // Approach 1: Create Methods that Search for Persons that Match One Characteristic
        // 리스트와 조건을 넣어주면, 해당 조건에 맞는 객체만 출력
        System.out.println("\n1.Persons 17 years old:");
        printPersonsWithAge(roster, 17);


        // Approach 2: Create More Generalized Search Methods
        // 좀 더 일반적인 조건을 처리하도록 변경
        System.out.println("\n2.Persons between the ages of 14 and 30:");
        printPersonsWithinAgeRange(roster, 14, 30);


        // Approach 3: Specify Search Criteria Code in a Local Class
        // 조건을 처리할수 있는 class 생성한 후 해당 class를 전달
        // 참고: java에서는 function pointer를 interface를 이용하여 전달하게 된다.
        // 이유는 function이 객체가 아니므로, interface를 선언후 그것의 구현체 클래스로 생성하고
        // 그안에서 method overriding을 한후에, 생성된 class를 전달하는 식이다.
        System.out.println("\n3.Persons who are eligible for Selective Service:");
        class CheckPersonEligibleForSelectiveService implements CheckPerson {
            public boolean test(Person per) {
                return per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25;
            }
        }
        printPersons(roster, new CheckPersonEligibleForSelectiveService());


        // Approach 4: Specify Search Criteria Code in an Anonymous Class
        // 조건을 처리할수 있는 class를 익명클래스로 생성하여 전달
        // interface CheckPerson를 상속받는 익명클래스를 생성하고, 그안의 test를 정의함
        System.out.println("\n4.Persons who are eligible for Selective Service " + "(anonymous class):");
        printPersons(roster, new CheckPerson() {
                                public boolean test(Person per) {
                                    return per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25;
                                }
                }
        );


        // Approach 5: Specify Search Criteria Code with a Lambda Expression
        // 조건을 처리할수 있는 class를 lambda로 생성하여 전달
        // -> 로 람다(Person type 익명클래스)임을 표시하고, Person per를 param으로 받아 조건(boolean)을 return하는 method를 정의함.
        System.out.println("\n5.Persons who are eligible for Selective Service " + "(lambda expression):");
        printPersons(roster, (Person per) -> per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25);


        // Approach 6: Use Standard Functional Interfaces with Lambda Expressions
        // 조건을 처리할수 있는 class를 lambda로 생성하여 전달하되, 받을때 general interface인 predicate로 받도록 처리
        // -> 로 람다(익명클래스)임을 표시하고, Person type을 param으로 받아므로, per를 Person type으로 인식하도록 함.
        // Predicate<Person>을 받으므로, Person이 익명 클래스로 들어감
        System.out.println("\n6.Persons who are eligible for Selective Service " + "(with Predicate parameter):");
        printPersonsWithPredicate(roster, per -> per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25);


        // Approach 7: Use Lamba Expressions Throughout Your Application
        // 조건을 넘겨줄때 General한 Predicate를 사용한것처럼, 결과를 accept할때도 general한 Consumer를 사용하여 처리
        // 결과처리부분을 -> 로 람다(익명클래스)임을 표시하고, Person type을 param으로 void return하는 method를 overriding함.
        System.out.println("\n7.Persons who are eligible for Selective Service " + "(with Predicate and Consumer parameters):");
        processPersons(roster, per -> per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25,
                                per -> per.printPerson()                  );


        // Approach 7, second example
        // 추가적으로 accept 할때, 선행처리를 위해 Mapper로 선행(전)처리를 적용후, Consumer로 accept하도록 하게 함.
        // 조건부분은 위와 동일하고,
        // 전처리를 위해 <Person, String> type의 익명클래스 per를 람다로 생성하고, String을 return하는 method(getEmailAddress)를 override하여 정의함.
        // 결과부분도 -> class type은 알아서 람다로 만들어달라고 하고, String type인 param으로 하고, void를 return하는 method를 override함
        System.out.println("\n7-1.Persons who are eligible for Selective Service " + "(with Predicate, Function, and Consumer parameters):");
        processPersonsWithFunction(roster, per -> per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25,
                                per -> per.getEmailAddress(),
                                email -> System.out.println(email)        );


        // Approach 8: Use Generics More Extensively
        // Generic을 이용하여, Person은 X로, String은 Y로 <X, Y> type으로 치환하여 processElements 함수를 재정의하다.
        System.out.println("\n8.Persons who are eligible for Selective Service " + "(generic version):");
        processElements(roster, per -> per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25,
                                per -> per.getEmailAddress(),
                                email -> System.out.println(email)        );


        // Approach 9: Use Bulk Data Operations That Accept Lambda Expressions as Parameters
        // Person List인 roster를 stream으로 만들고, Predicate를 받는 filter에 람다로 조건부를 생성하고
        // Mapper를 받는 map에 람다로 전처리할것을 정의하고
        // forEach를 통해 결과(실제 action)을 처리한다.
        System.out.println("\n9.Persons who are eligible for Selective Service " + "(with bulk data operations):");
        roster.stream()
            .filter(per -> per.getGender() == Person.Sex.MALE && per.getAge() >= 14 && per.getAge() <= 25)
            .map(per -> per.getEmailAddress())
            .forEach(email -> System.out.println(email));
    }
}



class Person {

    public enum Sex { MALE, FEMALE  }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    Person(String nameArg, LocalDate birthdayArg,Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }

    public int getAge()                 {return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();    }
    public void printPerson()           {System.out.print("["+ name + ", " + this.getAge() + "]");              }
    public Sex getGender()              {return gender;}
    public String getName()             {return name; }
    public String getEmailAddress()     {return emailAddress; }
    public LocalDate getBirthday()      {return birthday; }
    public static int compareByAge(Person a, Person b) { return a.birthday.compareTo(b.birthday);               }

    public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();
        roster.add( new Person(
                        "Fred",
                        IsoChronology.INSTANCE.date(1980, 6, 20),
                        Person.Sex.MALE, "fred@example.com"));
        roster.add( new Person(
                        "Jane",
                        IsoChronology.INSTANCE.date(1990, 7, 15),
                        Person.Sex.FEMALE, "jane@example.com"));
        roster.add( new Person(
                        "George",
                        IsoChronology.INSTANCE.date(1991, 8, 13),
                        Person.Sex.MALE, "george@example.com"));
        roster.add( new Person(
                        "Bob",
                        IsoChronology.INSTANCE.date(2000, 9, 12),
                        Person.Sex.MALE, "bob@example.com"));
        return roster;
    }
}