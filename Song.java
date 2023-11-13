//Jason Zhou, Peyton Leonard
public class Song {
    private String name;
    private int rating;

    public Song(String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    public boolean equals(Movie m){
        return (m.getName() == this.getName());
        // error -> return (b.getTitle() == this.title()) && (b.getAuthor() == this.author());
    }

    /*** Accessor methods ***/
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        String info = "\"" + name + "\"";
        if (rating != 0)
        {
            info += "'s rating is " + rating;
        }
        return info;
    }

    /*** Mutator methods ***/
    public void setTitle(String n) {
        name = n;
    }

    public void adjustRating(int i){
        if (rating + i >0 && rating + i <10){
            rating += i;
        }
    }
}
