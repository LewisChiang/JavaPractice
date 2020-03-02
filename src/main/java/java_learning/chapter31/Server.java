package java_learning.chapter31;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


/**
 * Created by Lewis on 2019-8-12.
 */
public class Server extends Application{
    @Override //Override the start method in the Application clsss
    public void start(Stage primaryStage){
        //Text area for displaying contents
        TextArea ta = new TextArea();

        //Create a scene and place it in the stage
        Scene scene =new Scene(new ScrollPane(ta),450,200);
        primaryStage.setTitle("Server");//Set the stage title
        primaryStage.setScene(scene); //Place the scene in the stage
        primaryStage.show(); //Display the stage

        new Thread(()->{
            try {
                //Create a server socket
                ServerSocket serverSocket = new ServerSocket(8000);
                Platform.runLater(() ->
                ta.appendText("Server started at " + new Date() + '\n'));

                //Listen for a connection request
                Socket socket = serverSocket.accept();

                //Create data input and output streams
                DataInputStream inputFormClient = new DataInputStream(
                        socket.getInputStream());
                DataOutputStream outputToClient =  new DataOutputStream(
                        socket.getOutputStream());
                while(true){
                    //Receive radius from the client
                    double radius = inputFormClient.readDouble();

                    //Compute area
                    double area = radius * radius * Math.PI;

                    //Send area back to client
                    outputToClient.writeDouble(area);

                    Platform.runLater(() -> {
                        ta.appendText("Radius received from client:" + radius + '\n');
                        ta.appendText("Area is:" + area + '\n');
                    });
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }).start();
    }
}
