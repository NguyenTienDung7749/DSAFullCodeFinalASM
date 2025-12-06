package ASM1Code.CodeThuyetTrinh.LinkedList;

public class Gamer {
    private int ID;
    private String NickName;
    private int Star;

    public Gamer(int ID, String NickName, int Star) {
        this.ID = ID;
        this.NickName = NickName;
        this.Star = Star;
    }

    public String getRank() {
        if (Star < 11) return "Cao Thủ";
        else if (Star < 31) return "Chiến Tướng";
        else if (Star < 51) return "Chiến Thần";
        else if (Star < 100) return "Thách Đấu";
        else return "Bố Tướng";
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "ID=" + ID +
                ", NickName='" + NickName + '\'' +
                ", Star=" + Star +
                '}';
    }
}
