public class Movie {
    private String name;
    private double duration;
    private int rating;

    public Movie(String name, double duration, int rating){
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }
    public boolean equals(Movie m){
        return (m.getName() == this.getName()) && (m.getDuration() == this.getDuration());
        // error -> return (b.getTitle() == this.title()) && (b.getAuthor() == this.author());
    }

    /*** Accessor methods ***/
    public String getName() {
        return name;
    }



    public int getRating() {
        return rating;
    }

    public String toString()
    {
        String info = "\"" + name + "\", lasts for " + duration ;
        if (rating != 0)
        {
            info += ", rating is " + rating;
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

    public double getDuration() {
        return duration;
    }
    public void setDuration(double d){
        duration = d;
    }
}
