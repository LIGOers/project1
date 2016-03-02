//import java.awt.*;
import com.illposed.osc.*;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;


public class Main extends JFrame {

    boolean firstBuild = true;
    VideoInputDemo videoInputPanel;
    public Main(){

        final int WINDOW_WIDTH = 1024;
        final int WINDOW_HEIGHT = 768;

        setTitle("LIGO");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        BuildBuffer();

        //BuildStageFour();

        BuildStageThree();

        BuildStageTwo();

        BuildStageOne();

        setResizable(false);

        setVisible(true);

    }

    private void BuildBuffer(){

        JPanel buffer = new JPanel();

        buffer.setPreferredSize(new Dimension(1024, 170));

        buffer.setBackground(Color.black);

        add(buffer, BorderLayout.SOUTH);

    }

    private void BuildStageOne(){

        // Button Image References
        ImageIcon bimagehover = new ImageIcon("s1-btn-1.jpg");
        ImageIcon bimage = new ImageIcon("s1-btn-n1.jpg");

        // Background Image Refernces
        ImageIcon first = new ImageIcon("tp1-sketch1.jpg");

        // Right Panel setup
        JPanel rightpanel = new JPanel();
        rightpanel.setPreferredSize(new Dimension(360, 576));
        rightpanel.setOpaque(false);

        //  Explore Button Setuo
        JLabel button1 = new JLabel(bimage);

        // Background image Setup
        JLabel stageOne = new JLabel(first);
        stageOne.setLayout(new BorderLayout());

        // Create button Size
        button1.setPreferredSize(new Dimension(244, 55));

        // Create Right panel top padding the Box and add to right panel
        rightpanel.add(Box.createRigidArea(new Dimension(360, 450)));
        rightpanel.add(button1);

        // Add right rightpanel east on Stageone
        stageOne.add(rightpanel, BorderLayout.EAST);

        // Add Stageone to Main JFrame
        add(stageOne, BorderLayout.NORTH);

        // Set Size of StaneOne
        stageOne.setPreferredSize(new Dimension(1024, 576));

        // Set Visibility
        stageOne.setVisible(true);
        button1.setVisible(true);

        // Explore button Actions
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Button Clicked");
                stageOne.setVisible(false);
               // BuildStageTwo();
               // BuildHeaderFooter();
               BuildStageTwo();

            }
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button1.setVisible(true);

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                button1.setIcon(bimagehover);
                setCursor(new Cursor(Cursor.HAND_CURSOR));




            }

            @Override
            public void mouseExited(MouseEvent e) {
                button1.setIcon(bimage);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            }
        });







    }


    private void BuildStageTwo(){

        ImageIcon headerbkg = new ImageIcon("header.jpg");
        ImageIcon footerbkg = new ImageIcon("footer.jpg");
        ImageIcon nav_btn_01 = new ImageIcon("btn-01-normal.jpg");
        ImageIcon nav_btn_02 = new ImageIcon("btn-02-normal.jpg");
        ImageIcon nav_btn_03 = new ImageIcon("btn-03-normal.jpg");
        ImageIcon nav_btn_04 = new ImageIcon("btn-04-normal.jpg");

        ImageIcon nav_btn_01_over = new ImageIcon("btn-01-over.jpg");
        ImageIcon nav_btn_02_over = new ImageIcon("btn-02-over.jpg");
        ImageIcon nav_btn_03_over = new ImageIcon("btn-03-over.jpg");
        ImageIcon nav_btn_04_over = new ImageIcon("btn-04-over.jpg");

        ImageIcon imagetxt01 = new ImageIcon("01-image-text.jpg");

        JLabel stagetwotxt = new JLabel(imagetxt01);


        JPanel header_footer = new JPanel();
        JPanel stage = new JPanel();

        stage.setPreferredSize(new Dimension(1024, 436));
        stage.setBackground(Color.BLACK);

        JLabel navbtn01 = new JLabel(nav_btn_01);
        JLabel navbtn02 = new JLabel(nav_btn_02);
        JLabel navbtn03 = new JLabel(nav_btn_03);
        JLabel navbtn04 = new JLabel(nav_btn_04);

        navbtn01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageOne();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn01.setIcon(nav_btn_01_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn01.setIcon(nav_btn_01);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        navbtn02.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn02.setIcon(nav_btn_02_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn02.setIcon(nav_btn_02);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        navbtn03.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageThree();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn03.setIcon(nav_btn_03_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn03.setIcon(nav_btn_03);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            }
        });

        navbtn04.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageFour();


            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn04.setIcon(nav_btn_04_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn04.setIcon(nav_btn_04);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        JLabel header = new JLabel(headerbkg);
        JLabel footer = new JLabel(footerbkg);
        //JLabel content = new JLabel();

        //content.setLayout(new FlowLayout());

        /**
         *  Video Player
         */
        JFXPanel fxPanel = new JFXPanel();

        stage.add(fxPanel);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
        });
        /**
         *  Video Player End
         */

        stage.add(stagetwotxt);









        footer.setLayout(new FlowLayout());

        footer.add(Box.createRigidArea(new Dimension(100, 85)));
        footer.add(navbtn01);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn02);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn03);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn04);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));




        footer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


        header_footer.setPreferredSize(new Dimension(1024, 576));

        header_footer.setBackground(Color.BLACK);

        header_footer.setLayout(new BorderLayout());

        header_footer.add(header, BorderLayout.NORTH);
        header_footer.add(stage, BorderLayout.CENTER);
        header_footer.add(footer, BorderLayout.SOUTH);

        add(header_footer);

        header_footer.setVisible(true);


    }


    /**
     * Video Creation Setup and Init
     * @param fxPanel
     */


    private static void initFX(JFXPanel fxPanel) {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private static Scene createScene() {
        String workingDir = System.getProperty("user.dir");
        final File f = new File(workingDir, "video2.mp4");

        final Media m = new Media(f.toURI().toString());
        final MediaPlayer mp = new MediaPlayer(m);
        final MediaView mv = new MediaView(mp);

        final DoubleProperty width = mv.fitWidthProperty();
        final DoubleProperty height = mv.fitHeightProperty();

        width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));

        mv.setPreserveRatio(true);



        StackPane root = new StackPane();
        root.getChildren().add(mv);

        Scene scene = new Scene(root, 500, 390);
        scene.setFill(javafx.scene.paint.Color.BLACK);

        mp.setCycleCount(MediaPlayer.INDEFINITE);

        mp.play();

        return (scene);
    }

    private void BuildStageThree(){

        // Navagation and Header Image Setup

        ImageIcon headerbkg = new ImageIcon("header.jpg");
        ImageIcon footerbkg = new ImageIcon("footer.jpg");
        ImageIcon nav_btn_01 = new ImageIcon("btn-01-normal.jpg");
        ImageIcon nav_btn_02 = new ImageIcon("btn-02-normal.jpg");
        ImageIcon nav_btn_03 = new ImageIcon("btn-03-normal.jpg");
        ImageIcon nav_btn_04 = new ImageIcon("btn-04-normal.jpg");
        ImageIcon nav_btn_01_over = new ImageIcon("btn-01-over.jpg");
        ImageIcon nav_btn_02_over = new ImageIcon("btn-02-over.jpg");
        ImageIcon nav_btn_03_over = new ImageIcon("btn-03-over.jpg");
        ImageIcon nav_btn_04_over = new ImageIcon("btn-04-over.jpg");

        // Stage Three Image setup
        ImageIcon stagethreeimagetext = new ImageIcon("stagethree-txt.jpg");
        ImageIcon stagethreemap = new ImageIcon("map.jpg");

        // Jlabel for images
        JLabel stagethreetxt = new JLabel(stagethreeimagetext);
        JLabel stagemap = new JLabel(stagethreemap);


        JPanel header_footer = new JPanel();
        JPanel stage = new JPanel();

        stage.setPreferredSize(new Dimension(1024, 436));
        stage.setBackground(Color.BLACK);

        stage.add(stagethreetxt);
        stage.add(stagemap);



        JLabel navbtn01 = new JLabel(nav_btn_01);
        JLabel navbtn02 = new JLabel(nav_btn_02);
        JLabel navbtn03 = new JLabel(nav_btn_03);
        JLabel navbtn04 = new JLabel(nav_btn_04);

        navbtn01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageOne();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn01.setIcon(nav_btn_01_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn01.setIcon(nav_btn_01);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        navbtn02.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageTwo();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn02.setIcon(nav_btn_02_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn02.setIcon(nav_btn_02);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        navbtn03.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn03.setIcon(nav_btn_03_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn03.setIcon(nav_btn_03);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            }
        });

        navbtn04.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageFour();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn04.setIcon(nav_btn_04_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn04.setIcon(nav_btn_04);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        JLabel header = new JLabel(headerbkg);
        JLabel footer = new JLabel(footerbkg);
        //JLabel content = new JLabel();

        //content.setLayout(new FlowLayout());






        footer.setLayout(new FlowLayout());

        footer.add(Box.createRigidArea(new Dimension(100, 85)));
        footer.add(navbtn01);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn02);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn03);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn04);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));




        footer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


        header_footer.setPreferredSize(new Dimension(1024, 576));

        header_footer.setBackground(Color.BLACK);

        header_footer.setLayout(new BorderLayout());

        header_footer.add(header, BorderLayout.NORTH);
        header_footer.add(stage, BorderLayout.CENTER);
        header_footer.add(footer, BorderLayout.SOUTH);

        add(header_footer);

        header_footer.setVisible(true);


    }

    private void BuildStageFour(){

        // Navagation and Header Image Setup

        ImageIcon headerbkg = new ImageIcon("header.jpg");
        ImageIcon footerbkg = new ImageIcon("footer.jpg");
        ImageIcon nav_btn_01 = new ImageIcon("btn-01-normal.jpg");
        ImageIcon nav_btn_02 = new ImageIcon("btn-02-normal.jpg");
        ImageIcon nav_btn_03 = new ImageIcon("btn-03-normal.jpg");
        ImageIcon nav_btn_04 = new ImageIcon("btn-04-normal.jpg");
        ImageIcon nav_btn_01_over = new ImageIcon("btn-01-over.jpg");
        ImageIcon nav_btn_02_over = new ImageIcon("btn-02-over.jpg");
        ImageIcon nav_btn_03_over = new ImageIcon("btn-03-over.jpg");
        ImageIcon nav_btn_04_over = new ImageIcon("btn-04-over.jpg");

        // Stage Four Image setup


        // Jlabel for images



        JPanel header_footer = new JPanel();
        JPanel stage = new JPanel();

        stage.setPreferredSize(new Dimension(1024, 436));
        stage.setBackground(Color.BLACK);


        JLabel navbtn01 = new JLabel(nav_btn_01);
        JLabel navbtn02 = new JLabel(nav_btn_02);
        JLabel navbtn03 = new JLabel(nav_btn_03);
        JLabel navbtn04 = new JLabel(nav_btn_04);

        navbtn01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageOne();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn01.setIcon(nav_btn_01_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn01.setIcon(nav_btn_01);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        navbtn02.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageTwo();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn02.setIcon(nav_btn_02_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn02.setIcon(nav_btn_02);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        navbtn03.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                header_footer.setVisible(false);
                BuildStageThree();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn03.setIcon(nav_btn_03_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn03.setIcon(nav_btn_03);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            }
        });

        navbtn04.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                navbtn04.setIcon(nav_btn_04_over);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                navbtn04.setIcon(nav_btn_04);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        JLabel header = new JLabel(headerbkg);
        JLabel footer = new JLabel(footerbkg);
        //JLabel content = new JLabel();

        //content.setLayout(new FlowLayout());
        /**
         * Add Code for Webcam here
         */
        if(firstBuild == true){
            int width = 768;
            int height = 436;
            int fps = 30;
            videoInputPanel = new VideoInputDemo(width, height, fps);
            videoInputPanel.setMirror(true);
            stage.add(videoInputPanel, BorderLayout.CENTER );
            firstBuild = false;
        }
        stage.add(videoInputPanel, BorderLayout.CENTER );
        stage.repaint();
        /**
         *
         */
        footer.setLayout(new FlowLayout());

        footer.add(Box.createRigidArea(new Dimension(100, 85)));
        footer.add(navbtn01);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn02);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn03);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));
        footer.add(navbtn04);
        footer.add(Box.createRigidArea(new Dimension(100, 25)));




        footer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


        header_footer.setPreferredSize(new Dimension(1024, 576));

        header_footer.setBackground(Color.BLACK);

        header_footer.setLayout(new BorderLayout());

        header_footer.add(header, BorderLayout.NORTH);
        header_footer.add(stage, BorderLayout.CENTER);
        header_footer.add(footer, BorderLayout.SOUTH);

        add(header_footer);

        header_footer.setVisible(true);


    }




        int receiverPort = 8000;
        OSCPortIn receiver = new OSCPortIn(receiverPort);

        OSCListener handler1 = new OSCListener() {
            public void acceptMessage(java.util.Date time, OSCMessage message) {
                // TODO: Put your code to process a message in here

                BuildStageOne();
                System.out.println("Handler1 called with address " + message.getAddress());

                // Print out values
                Object[] values = message.getArguments();
                System.out.printf("Values: [%s", values[0]);
                for (int i = 1; i < values.length; i++)
                    System.out.printf(", %s", values[i]);
                System.out.println("]\n");
            }
        };

        receiver.addListener("/1/push1", handler1);










    public static void main(String[] args) throws java.net.SocketException {
        new Main();

        System.out.println("Hello World!");
    }
}
