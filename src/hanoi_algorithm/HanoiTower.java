package hanoi_algorithm;

/**
 * 汉诺塔问题
 */
public class HanoiTower {
    public static void main(String[] args) {

        hanoiTower(2, 'A', 'B', 'C');
        System.out.println("\n总共" + num + "次\n");

    }

    /**
     * 汉诺塔算法：将num个盘，从aTower位置移动到cTower位置
     *
     * @param num    多少个盘
     * @param aTower 起始位置
     * @param bTower 中间位置
     * @param cTower 终点位置
     */
    public static void hanoiTower(int num, char aTower, char bTower, char cTower) {

        //如果只有一个盘
        if (num == 1) {
            move(num, aTower, cTower);
        } else {

            /**
             * 如果我们有 num >= 2 情况
             * 我们总是可以看做是两个盘 1.最下边的一个盘、2.上面的所有盘
             */

            //1. 先把最上面的所有盘 A->B， 移动过程会使用到C塔
            hanoiTower(num - 1, aTower, cTower, bTower);
            //2. 把最下边的盘 A->C
            move(num, aTower, cTower);
            //3. 把B塔的所有盘 从 B->C , 移动过程使用到A塔塔
            hanoiTower(num - 1, bTower, aTower, cTower);
        }

    }

    public static int num = 0;

    /**
     * 执行移动
     *
     * @param n         第几个盘
     * @param fromTower 开始位置
     * @param toTower   终点位置
     */
    public static void move(int n, char fromTower, char toTower) {
        num++;
        System.out.println("第" + n + "个盘：" + "从" + fromTower + "到" + toTower);
    }
}