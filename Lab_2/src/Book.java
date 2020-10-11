public class Book {
    private int ID;
    private String author;
    private String title;
    private int price;
    private int amount;
    private Client client;

    public Book(int ID, String author, String title, int price, int amount, Client client) {
        this.ID = ID;
        this.author = author;
        this.title = title;
        this.price = price;
        this.amount = amount;
        this.client = client;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", client=" + client +
                '}';
    }
}
