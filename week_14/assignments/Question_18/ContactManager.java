package week_14.assignments.Question_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManager {
    private Map<String, String> contacts;
    public ContactManager() {
     this.contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        if(!contacts.containsKey(name)) {
            contacts.put(name, phoneNumber);
        }else {
            System.out.println("There is a person with the same name. Do you want to update phone number? Write Y for (Yes) " +
                    "or N for (No)");
            String answer = new Scanner(System.in).next();
            if(answer.equals("Y")) {
                contacts.put(name, phoneNumber);
            }
        }
    }
    public String searchByName(String name) {
        for (Map.Entry<String , String> entries: contacts.entrySet()) {
            if(name.equals(entries.getKey())) {
                return name + "'s Phone Number: " + entries.getValue();
            }
        }
        return "The name is not found";
    }
    public String searchByPhoneNumber(String phoneNumber) {
        for (Map.Entry<String , String> entries: contacts.entrySet()) {
            if(phoneNumber.equals(entries.getValue())) {
                return entries.getKey() + "'s Name: " + entries.getKey();
            }
        }
        return "The phone number is not found";
    }
}

