import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Martin Eden",520,"Jack London",1999));
        books.add(new Book("Bir İdam Mahkumunun Son Günü",130,"Victor Hugo",1980));
        books.add(new Book("Yeraltından Notlar",139,"Fyodor Mihayloviç Dostoyevski",1950));
        books.add(new Book("Gurur ve Önyargı",424,"Jane Austen",2002));
        books.add(new Book("Dünya'nın Merkezine Yolculuk",136,"Jules Verne",1805));
        books.add(new Book("Altıncı Koğuş",68,"Anton Pabloviç Çehov",1905));
        books.add(new Book("Genç Werther'in Acıları",126,"Johann Wolfgang von Goethe",1789));
        books.add(new Book("Martı",94,"Anton Pabloviç Çehov",1907));
        books.add(new Book("Bilinmeyen Bir Kadının Mektubu",56,"Stefan Zweig",1863));
        books.add(new Book("Balonla Beş Hafta Kısaltılmış Metin",144,"Jules Verne",1819));

        //books.stream().forEach(bookName -> System.out.println(bookName.getBookName()));
        books.stream().filter(book -> book.getNumberOfPages() > 100).forEach(bookName -> System.out.println(bookName.getBookName()));
    }
}