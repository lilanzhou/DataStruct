package 数据结构.recursion;

/**
 * Created by Administrator on 2019:03:26
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class HanoiTower {
    public static void main(String[] args) {
        hanoiT(4,'A','B','C');
    }

    /**
     *
     * @param topN 盘子数目
     * @param from  起始盘子
     * @param inter 中间塔
     * @param to  目标塔
     */
    public static void hanoiT(int topN ,char from ,char inter,char to ){
        if(topN==1){
            System.out.println("盘子1从"+from+"塔到"+to+"塔");

        }else {
            hanoiT(topN-1,from,to,inter);
            System.out.println("盘子"+topN+"从"+from+"塔到"+to+"塔");
            hanoiT(topN-1,inter,from,to);
        }
    }
}
