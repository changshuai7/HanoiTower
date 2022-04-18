package hanoi_algorithm;

/**
 * ��ŵ������
 */
public class HanoiTower {
    public static void main(String[] args) {

        hanoiTower(2, 'A', 'B', 'C');
        System.out.println("\n�ܹ�" + num + "��\n");

    }

    /**
     * ��ŵ���㷨����num���̣���aTowerλ���ƶ���cTowerλ��
     *
     * @param num    ���ٸ���
     * @param aTower ��ʼλ��
     * @param bTower �м�λ��
     * @param cTower �յ�λ��
     */
    public static void hanoiTower(int num, char aTower, char bTower, char cTower) {

        //���ֻ��һ����
        if (num == 1) {
            move(num, aTower, cTower);
        } else {

            /**
             * ��������� num >= 2 ���
             * �������ǿ��Կ����������� 1.���±ߵ�һ���̡�2.�����������
             */

            //1. �Ȱ�������������� A->B�� �ƶ����̻�ʹ�õ�C��
            hanoiTower(num - 1, aTower, cTower, bTower);
            //2. �����±ߵ��� A->C
            move(num, aTower, cTower);
            //3. ��B���������� �� B->C , �ƶ�����ʹ�õ�A����
            hanoiTower(num - 1, bTower, aTower, cTower);
        }

    }

    public static int num = 0;

    /**
     * ִ���ƶ�
     *
     * @param n         �ڼ�����
     * @param fromTower ��ʼλ��
     * @param toTower   �յ�λ��
     */
    public static void move(int n, char fromTower, char toTower) {
        num++;
        System.out.println("��" + n + "���̣�" + "��" + fromTower + "��" + toTower);
    }
}