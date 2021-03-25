package Jay.basic.day08;

public class Book {
    private String bkname;
    private String writer;
    private String trlator;
    private String publisher;
    private String pudate;
    private int bkprice;
    private double discount;
    private int saleprice;
    private int point;


    public Book(String bkname, String writer, String trlator, String publisher, String pudate, int bkprice, double discount) {
        this.bkname = bkname;
        this.writer = writer;
        this.trlator = trlator;
        this.publisher = publisher;
        this.pudate = pudate;
        this.bkprice = bkprice;
        this.discount = discount;
    }

    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTrlator() {
        return trlator;
    }

    public void setTrlator(String trlator) {
        this.trlator = trlator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPudate() {
        return pudate;
    }

    public void setPudate(String pudate) {
        this.pudate = pudate;
    }

    public int getBkprice() {
        return bkprice;
    }

    public void setBkprice(int bkprice) {
        this.bkprice = bkprice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(int saleprice) {
        this.saleprice = saleprice;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

