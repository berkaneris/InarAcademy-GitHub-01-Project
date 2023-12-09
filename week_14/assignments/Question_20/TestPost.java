package week_14.assignments.Question_20;

public class TestPost {
    public static void main(String[] args) {
        Post post1 = new Post();
        Post post2 = new Post();

        post1.addTag("Java");
        post1.addTag("Coding");
        post1.addTag("Programming");

        post2.addTag("Java");
        post2.addTag("Technology");
        post2.addTag("Coding");

        System.out.println("Tags for Post 1: " + post1.retrieveTags());
        System.out.println("Tags for Post 2: " + post2.retrieveTags());

        System.out.println("Does post1 have the tag 'Java'? " + post1.isTagExist("Java"));
        System.out.println("Does post2 have the tag 'Technology'? " + post2.isTagExist("Technology"));
        post1.removeTag("Programming");
        System.out.println("Tags for Post 1: " + post1.retrieveTags());


    }
}
