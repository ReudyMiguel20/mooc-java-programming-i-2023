import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        //Add the person passed as a parameter to the list.
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        //returns a boolean-type value true or false, that tells whether the room
        // is empty or not.
        if (this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        //returns a list of the persons in the room
        return persons;
    }
    
    public Person shortest(){
        if (this.persons.isEmpty()){
            return null;
        }
        
        Person newPerson = new Person("Mike", 100000);
        
        for (Person p : persons){
            if (newPerson.getHeight() > p.getHeight()){
                newPerson = p;
            }
            
        }
        return newPerson;
        
    }
    
    public Person take(){
        
        
        if (this.persons.isEmpty()){
            return null;
        }
        
        Person newPerson = new Person("Mike", 1000000);
        
        for (Person p : persons){
            if (newPerson.getHeight() > p.getHeight()){
                newPerson = p;
            }
        }
        this.persons.remove(newPerson);
        
        return newPerson;
        
    }
}
