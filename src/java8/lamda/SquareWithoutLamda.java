package java8.lamda;

//Without lamda
interface Two{
    public abstract int sqr(int num);

}
class SquareWithoutLamda implements Two{
    public int sqr(int num){
        return num*num;
    }
    public static void main(String[] args) {
        Two obj=new SquareWithoutLamda();
        System.out.println(obj.sqr(10));
    }
}
