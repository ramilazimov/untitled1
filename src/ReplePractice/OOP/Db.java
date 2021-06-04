package ReplePractice.OOP;

public class Db {
    private String data;
    private int yint;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }

    public static void main(String[] args) {
        Db db = new Db();
        db.setData("Ramil");
        db.setYint(43);
        System.out.println(db.getData() + " " + db.getYint());
    }
}
