package oops.pillar2;

public class employee extends Company{
    private int id;
    private String name;
    public employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int cal_sal() {
        return 0;
    }
}
