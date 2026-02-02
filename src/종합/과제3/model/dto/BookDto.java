package 종합.과제3.model.dto;

public class BookDto {
    private int mno;
    private String btitle;
    private int bnumber;
    private String bauthor;
    private boolean brent;

    public int getMno() {
        return mno;
    }
    public void setMno(int mno) {
        this.mno = mno;
    }
    public String getBtitle() {
        return btitle;
    }
    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }
    public int getBnumber() {
        return bnumber;
    }
    public void setBnumber(int bnumber) {
        this.bnumber = bnumber;
    }
    public String getBauthor() {
        return bauthor;
    }
    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public boolean isBrent() {
        return brent;
    }
    public void setBrent(boolean brent) {
        this.brent = brent;
    }
    public BookDto(boolean brent, String bauthor, int bnumber, String btitle, int mno) {
        this.brent = brent;
        this.bauthor = bauthor;
        this.bnumber = bnumber;
        this.btitle = btitle;
        this.mno = mno;    }

    @Override
    public String toString() {
        return "BookDto{" +
                "mno=" + mno +
                ", btitle='" + btitle + '\'' +
                ", bnumber=" + bnumber +
                ", bauthor='" + bauthor + '\'' +
                ", brent=" + brent +
                '}';
    }
}
