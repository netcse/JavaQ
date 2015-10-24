package fx.animation.graphics3d.anim;

/**
 * Created by Microsoft on 10/6/2015.
 */


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.Lighting;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;
import javafx.util.Duration;


public class TimelineApp extends Application {

    private Timeline timeline;

    public Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(253, 100);
        root.setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
        root.setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);

        //create a circle
        final Circle circle = new Circle(25, 25, 20, Color.web("1c89f4"));
        circle.setEffect(new Lighting());

        //create a timeline for moving the circle
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        //one can start/pause/stop/play animation by
        //timeline.play();
        //timeline.pause();
        //timeline.stop();
        //timeline.playFromStart();

        //add the following keyframes to the timeline
        timeline.getKeyFrames().addAll(new KeyFrame(Duration.ZERO,
                        new KeyValue(circle.translateXProperty(), 0)),
                new KeyFrame(new Duration(4000),
                        new KeyValue(circle.translateXProperty(), 205)));
        root.getChildren().addAll(createNavigation(), circle);

        return root;
    }

    private VBox createNavigation() {
        //method for creating navigation panel
        //start/stop/pause/play from start buttons
        Button buttonStart = new Button("Start");
        buttonStart.setOnAction((ActionEvent t) -> {
            //start timeline
            timeline.play();
        });
        Button buttonStop = new Button("Stop");
        buttonStop.setOnAction((ActionEvent t) -> {
            //stop timeline
            timeline.stop();
        });
        Button buttonPlayFromStart = new Button("Restart");
        buttonPlayFromStart.setOnAction((ActionEvent t) -> {
            //play from start
            timeline.playFromStart();
        });
        Button buttonPause = new Button("Pause");
        buttonPause.setOnAction((ActionEvent t) -> {
            //pause from start
            timeline.pause();
        });
        //text showing current time
        final Text currentRateText = new Text("Current time: 0 ms");
        currentRateText.setBoundsType(TextBoundsType.VISUAL);
        timeline.currentTimeProperty().addListener((Observable ov) -> {
            int time = (int) timeline.getCurrentTime().toMillis();
            currentRateText.setText("Current time: " + time + " ms");
        });
        //Autoreverse checkbox
        final CheckBox checkBoxAutoReverse = new CheckBox("Auto Reverse");
        checkBoxAutoReverse.setSelected(true);
        checkBoxAutoReverse.selectedProperty().addListener((Observable ov) -> {
            timeline.setAutoReverse(checkBoxAutoReverse.isSelected());
        });
        //add all navigation to layout
        HBox hBox1 = new HBox(10);
        hBox1.setPadding(new Insets(0, 0, 0, 5));
        hBox1.getChildren().addAll(buttonStart, buttonPause, buttonStop, buttonPlayFromStart);
        hBox1.setAlignment(Pos.CENTER_LEFT);
        HBox hBox2 = new HBox(10);
        hBox2.setPadding(new Insets(0, 0, 0, 5));
        hBox2.getChildren().addAll(checkBoxAutoReverse, currentRateText);
        hBox2.setAlignment(Pos.CENTER_LEFT);
        VBox vBox = new VBox(10);
        vBox.setLayoutY(60);
        vBox.getChildren().addAll(hBox1, hBox2);
        return vBox;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
        primaryStage.addEventHandler(javafx.scene.input.KeyEvent.KEY_PRESSED, new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent event) {
                if (event.getCode() == KeyCode.ESCAPE) {
                    primaryStage.close();
                }
            }

        });
    }

    /**
     * Java main for when running without JavaFX launcher
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}