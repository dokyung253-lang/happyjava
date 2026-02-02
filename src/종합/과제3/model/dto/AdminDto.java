package 종합.과제3.model.dto;

public class AdminDto {
    private int ano;
    private String aid;
    private String apw;
    private String aname;
    private String aphone;

    public AdminDto(int ano, String aid, String apw, String aname, String aphone) {
        this.ano = ano;
        this.aid = aid;
        this.apw = apw;
        this.aname = aname;
        this.aphone = aphone;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getAid() {
        return aid;
    }
    public void setAid(String aid) {
        this.aid = aid;
    }
    public String getApw() {
        return apw;
    }
    public void setApw(String apw) {
        this.apw = apw;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getAphone() {
        return aphone;
    }
    public void setAphone(String aphone) {this.aphone = aphone;}

    @Override
    public String toString() {
        return "AdminDto{" +
                "ano=" + ano +
                ", aid='" + aid + '\'' +
                ", apw='" + apw + '\'' +
                ", aname='" + aname + '\'' +
                ", aphone='" + aphone + '\'' +
                '}';
    }
}
