import java.util.ArrayList;

public class Room {
    private ArrayList<Person> roomPersons;

    public Room() {
        this.roomPersons = new ArrayList<>();
    }

    public void add(Person person) {
        this.roomPersons.add(person);
    }

    public boolean isEmpty() {
        return this.roomPersons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.roomPersons;
    }

    public Person shortest() {
        Person shortestPerson = null;

        if (!this.roomPersons.isEmpty()) {
            shortestPerson = this.roomPersons.get(0);
            for (Person person : this.roomPersons) {
                if (person.getHeight() < shortestPerson.getHeight()) {
                    shortestPerson = person;
                }
            }
        }

        return shortestPerson;
    }

    public Person take() {
        Person shortestReturn = this.shortest();
        this.roomPersons.remove(shortestReturn);
        return shortestReturn;
    }
}

