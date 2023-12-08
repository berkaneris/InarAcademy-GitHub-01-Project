package week_14.assignments.Question_18;

public class Question_18 {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Steve Doe" , "123-456-7890");
        contactManager.addContact("Jane Smith" , "456-321-1212");

        System.out.println(contactManager.searchByName("Steve Doe"));
        System.out.println(contactManager.searchByPhoneNumber("456-321-1212"));
    }
}
