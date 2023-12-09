package week_14.assignments.Question_20;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private final String POST_ID;
    private Set<String> tags;
    private static int numberOfPost;
    public Post(){
        numberOfPost++;
        this.POST_ID = numberOfPost + "";
        this.tags = new HashSet<>();
    }

    public String getPOST_ID() {
        return POST_ID;
    }

    public void addTag(String tag){
        tags.add(tag);
    }
    public void removeTag(String tag){
        tags.remove(tag);
    }
    public boolean isTagExist(String tag){
        return tags.contains(tag);
    }
    public String retrieveTags(){
        return tags.toString();
    }

}
