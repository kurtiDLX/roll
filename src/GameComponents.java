import javax.swing.*;
import java.awt.*;

public class GameComponents extends JFrame {
    private JButton cubeOne, cubeTwo, startRoll;
    private int randomFistCube, randomSecondCube, sum;
    private ImageIcon image1, image2, image3, image4, image5, image6;
    private Font font;
    private JLabel sumText;

    public GameComponents() {
        super("dice");
        setLayout(null);
        font = new Font("Arial", Font.BOLD, 18);

        image1 = new ImageIcon("src/img1cube.jpg");
        image2 = new ImageIcon("src/im2cube.jpg");
        image3 = new ImageIcon("src/img3cube.jpg");
        image4 = new ImageIcon("src/img4cube.jpg");
        image5 = new ImageIcon("src/img5cube.jpg");
        image6 = new ImageIcon("src/img6cube.jpg");



        startRoll = new JButton("start");
        startRoll.setFont(font);
        startRoll.setBounds(80, 190, 120,40);
        startRoll.addActionListener(e -> {
            try {

                    randomFistCube = (int) (Math.random() * 6);
                    randomSecondCube = (int) (Math.random() * 6);
                    sum = randomFistCube + randomSecondCube + 2;
                    sumText.setText("sum: " + sum);
                    //cube1:
                    switch (randomFistCube) {
                        case 0:
                            cubeOne.setIcon(image1);
                            break;
                        case 1:
                            cubeOne.setIcon(image2);
                            break;
                        case 2:
                            cubeOne.setIcon(image3);
                            break;
                        case 3:
                            cubeOne.setIcon(image4);
                            break;
                        case 4:
                            cubeOne.setIcon(image5);
                            break;
                        case 5:
                            cubeOne.setIcon(image6);
                            break;
                    }
                    //cube2:
                    switch (randomSecondCube) {
                        case 0:
                            cubeTwo.setIcon(image1);
                            break;
                        case 1:
                            cubeTwo.setIcon(image2);
                            break;
                        case 2:
                            cubeTwo.setIcon(image3);
                            break;
                        case 3:
                            cubeTwo.setIcon(image4);
                            break;
                        case 4:
                            cubeTwo.setIcon(image5);
                            break;
                        case 5:
                            cubeTwo.setIcon(image6);
                            break;
                }
            }catch (Exception exception){

            }

        });




        cubeOne = new JButton();
        cubeOne.setBorderPainted(false);
        cubeOne.setBounds(65, 85, 70, 70);

        cubeTwo = new JButton();
        cubeTwo.setBorderPainted(false);
        cubeTwo.setBounds(155,85, 70,70);

        sumText = new JLabel();
        sumText.setBounds(120,20,80,80);
        sumText.setFont(font);


        add(sumText);
        add(cubeOne);
        add(cubeTwo);
        add(startRoll);

    }
}