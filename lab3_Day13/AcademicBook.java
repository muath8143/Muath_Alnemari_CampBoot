package lab3_Day13;

public class AcademicBook extends Book{
    protected String subject;
    public AcademicBook(String title, String auteur, String ISBN, double price , int stock,String subject) {
        super(title,auteur,ISBN,price,stock);
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()>=4.5){
            return "Bestseller Academic book";
        }
        else
            return "Academic book";
    }

    @Override
    public String toString() {
        return super.toString()+" the subject is: "+subject;
    }
}
