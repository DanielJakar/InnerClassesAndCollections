package android.course.innerclassesandcollections;

/**
 * Created by Jakars on 23/05/2017.
 */

public class Person {
    private String firstName;
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id != null ? id.equals(person.id) : person.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        //debugging.
        //do not over format.
        return firstName;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
