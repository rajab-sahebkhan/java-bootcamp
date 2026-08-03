package Phonebook;

import java.util.HashMap;

public class Phonebook {

    private HashMap<String, String> phonebook = new HashMap<>();


    public void addContact(String name, String number){
        phonebook.put(name, number);
    }


    public void removeContact(String name){

        if(phonebook.containsKey(name)) {
            phonebook.remove(name);
        } else{
            System.out.println("Contact does not exist.");
        }
    }

    public void displayContacts(){
        for(String name: phonebook.keySet()){
            System.out.println(name + ": " + phonebook.get(name));
        }
    }

    public String searchContact(String name){
        if(phonebook.containsKey(name)) {
            return name + ": " + phonebook.get(name);
        } else{
            throw new IllegalArgumentException("Contact does not exist.");
        }
    }

}
