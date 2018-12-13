package BlogPost;

import java.util.ArrayList;
import java.util.List;

//Reuse your BlogPost class
//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost
public class Blog {

    List listOfBlogPosts = new ArrayList();

    public void addBlogPost(BlogPost blogPost) {

        listOfBlogPosts.add(blogPost);
    }

    public void delete(int deleteiIndex) {
        listOfBlogPosts.remove(deleteiIndex);
    }

    public void update(int updateIndex, BlogPost blogPost) {
        listOfBlogPosts.set(updateIndex, blogPost);
    }
}
