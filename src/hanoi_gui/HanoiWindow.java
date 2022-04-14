package hanoi_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HanoiWindow extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    Tower tower = null;
    int amountOfDisc = 2;
    char[] towerName = {'A', 'B', 'C'};
    JMenuBar bar;
    JMenu menuGrade,menuRule;
    JMenuItem oneGradeItem, twoGradeItem, threeGradeItem;
    JMenuItem gameRuleItem;
    JButton renew = null;
    JButton autoButton = null;
    JPanel center = new JPanel();

    public HanoiWindow() {
        tower = new Tower(towerName);
        tower.setAmountOfDisc(amountOfDisc);
        tower.setMaxDiscWidth(120);
        tower.setMinDiscWidth(50);
        tower.setDiscHeight(16);
        tower.putDiscOnTower();

        add(tower, BorderLayout.CENTER);
        bar = new JMenuBar();

        // 难度级别
        menuGrade = new JMenu("难度级别");
        oneGradeItem = new JMenuItem("初级");
        twoGradeItem = new JMenuItem("中级");
        threeGradeItem = new JMenuItem("高级");

        menuGrade.add(oneGradeItem);
        menuGrade.add(twoGradeItem);
        menuGrade.add(threeGradeItem);

        bar.add(menuGrade);

        // 游戏规则
        menuRule = new JMenu("游戏规则");
        gameRuleItem = new JMenuItem("游戏规则");
        menuRule.add(gameRuleItem);

        bar.add(menuRule);

        setJMenuBar(bar);
        oneGradeItem.addActionListener(this);
        twoGradeItem.addActionListener(this);
        threeGradeItem.addActionListener(this);
        gameRuleItem.addActionListener(this);

        renew = new JButton("重新开始");
        renew.addActionListener(this);

        autoButton = new JButton("自动演示");
        autoButton.addActionListener(this);

        JPanel north = new JPanel();
        north.add(renew);
        north.add(autoButton);

        String mess = "将全部盘子从" + towerName[0] + "座搬运到" + towerName[1] + "座或" + towerName[2] + "座";

        JLabel hintMess = new JLabel(mess, JLabel.CENTER);
        north.add(hintMess);

        add(north, BorderLayout.NORTH);
        setResizable(false);
        setVisible(true);
        setBounds(60, 60, 460, 410);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == oneGradeItem) {
            amountOfDisc = 2;
            tower.setAmountOfDisc(amountOfDisc);
            tower.putDiscOnTower();
        } else if (e.getSource() == twoGradeItem) {
            amountOfDisc = 3;
            tower.setAmountOfDisc(amountOfDisc);
            tower.putDiscOnTower();
        } else if (e.getSource() == threeGradeItem) {
            amountOfDisc = 4;
            tower.setAmountOfDisc(amountOfDisc);
            tower.putDiscOnTower();
        } else if (e.getSource() == renew) {
            tower.setAmountOfDisc(amountOfDisc);
            tower.putDiscOnTower();
        } else if (e.getSource() == autoButton) {
            tower.setAmountOfDisc(amountOfDisc);
            tower.putDiscOnTower();
            int x = this.getBounds().x + this.getBounds().width;
            int y = this.getBounds().y;
            tower.getAutoMoveDisc().setLocation(x, y);
            tower.getAutoMoveDisc().setSize(280, this.getBounds().height);
            tower.getAutoMoveDisc().setVisible(true);
        }else if (e.getSource() == gameRuleItem){
            JOptionPane.showMessageDialog(null, "从左到右有A、B、C三根柱子\n" +
                    "其中A柱子上面有从小叠到大的若干个圆盘\n" +
                    "现要求将A柱子上的圆盘移到C柱子上去\n" +
                    "期间只有一个原则：一次只能移到一个盘子且大盘子不能在小盘子上面",null, JOptionPane.INFORMATION_MESSAGE);

        }
        validate();
    }

    public static void main(String[] args) {
        new HanoiWindow();
    }
}
