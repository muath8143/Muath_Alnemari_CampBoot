package lab3_Day13;

public class Main {
    public static void main(String[] args) {
        //book
        Book b1 =new Book("Clean code","Robert C.Martin","3947510375521",50,10);
        Book b2 =new Book("Effective java","Joshua Bloch","9485838583745",55,8);
        Book b3 =new Book("The pragmatic programmer","Andrew Hunt","4067284037502",52,9);
        //novel------------------------

        //AcademicBook------------------

        //movie------------------------
        Movie mv1 = new Movie("Inception","Christopher Nolan","9485861583745",25.50,148);
        Movie mv2 = new Movie("Titanic","James Cameron","5267284037502",20,195);
        Movie mv3 = new Movie("The Godfather","Francis Ford Coppola","3947940375521",30.99,175);
        //Music---------------------------------------------------------
        Music m1 = new Music("Bohemian Rhapsody","Queen","1047637205438",15.99,"Queen");
        Music m2 = new Music("Shape of You","Ed Sheeran","2057195630562",10,"Ed Sheeran");
        Music m3 = new Music("Blinding Lights","The Weeknd","7094768164529",13.75,"The Weeknd");

        Store store=new Store();
        store.addMedia(b1);
        store.addMedia(b2);
        store.addMedia(b3);

//      store.addMedia(No1);
//      store.addMedia(No2);
//      store.addMedia(No3);
//
//      store.addMedia(ab1);
//      store.addMedia(ab2);
//      store.addMedia(ab3);

        store.addMedia(mv1);
        store.addMedia(mv2);
        store.addMedia(mv3);

        store.addMedia(m1);
        store.addMedia(m2);
        store.addMedia(m3);

        System.out.println(store.displayMedia());
        User u1 =new User("Muath8143","muath@gmail.com");
        User u2 =new User("Osama9023","osama@hotmaiil.com");
        store.adduser(u1);
        store.adduser(u2);
        System.out.println(store.displayUsers());

        u1.Addtocart(b1);
        u1.Addtocart(mv1);

        u1.removeFromCart(mv1);
        b1.purchase(u1);
        System.out.println("checkout is done");

        System.out.println(store.displayMedia());
    }
}
