//package GUI;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GUI implements ActionListener {
//    int count = 0;
//    JLabel label;
//    JFrame frame;
//    JButton button;
//    JPanel panel;
//
//
//    public GUI(){
//
//        frame = new JFrame();
//        button = new JButton("click me");
//        button.addActionListener(this);
//        label = new JLabel("Number of clicks " + count );
//
//
//        // панель это и есть внутренний интерфейс в который, мы добавляем разные кнопки и т.д. (внутренний интерфейс нашего приложения)
//        panel = new JPanel();
//        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
//        panel.setLayout(new GridLayout(0,1));
//        panel.add(button);
//        panel.add(label);
//
//
//        frame.add(panel, BorderLayout.CENTER); //это рамки нашего приложения
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // он добавляет кнопку закрытия
//        frame.setTitle("Our gui"); // это название нашего приложения
//        frame.pack(); // он устанавливает минимальный размер контейнера,который достаточен для отображения всех компонентов.
//        frame.setVisible(true); // он делает наше окно видимым, без этого окна не видно
//        // вот это все что наверху это должно ставится по default, то есть всегда для swing
//
//
//
//
//
//
//
//    }
//    public static void main(String[] args) {
//         new GUI(); // Создается новое окно, gui довольно таки устаревший графический интерефейс
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) { // Это действие нашей кнопки
//        count++; //
//        label.setText("Number of clicks "  + count);
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
