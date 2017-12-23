package cn.kidjoker.htmlData.service.bo;

public class CoinColaBo {

    //            获取用户地址和用户名
    private String userUrl;
    private String userName;
    //            获取交易次数、评价、信任数
    private Integer tradeTimes;
    private Double grade;
    private Integer credit;
    //            支付渠道
    private String payChannel;
    //            交易区间
    private Integer tradeReginlow;
    private Integer tradeRegintop;
    //            交易价格
    private Double price;

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTradeTimes() {
        return tradeTimes;
    }

    public void setTradeTimes(Integer tradeTimes) {
        this.tradeTimes = tradeTimes;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getTradeReginlow() {
        return tradeReginlow;
    }

    public void setTradeReginlow(Integer tradeReginlow) {
        this.tradeReginlow = tradeReginlow;
    }

    public Integer getTradeRegintop() {
        return tradeRegintop;
    }

    public void setTradeRegintop(Integer tradeRegintop) {
        this.tradeRegintop = tradeRegintop;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoinColaBo{" +
                "userUrl='" + userUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", tradeTimes=" + tradeTimes +
                ", grade=" + grade +
                ", credit=" + credit +
                ", payChannel='" + payChannel + '\'' +
                ", tradeReginlow=" + tradeReginlow +
                ", tradeRegintop=" + tradeRegintop +
                ", price=" + price +
                '}';
    }
}
