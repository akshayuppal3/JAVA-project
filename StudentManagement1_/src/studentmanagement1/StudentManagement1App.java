/*
 * StudentManagement1App.java
 */

package studentmanagement1;

import java.awt.Toolkit;
import java.awt.Window;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class StudentManagement1App extends SingleFrameApplication {
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new StudentManagement1View(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of StudentManagement1App
     */
    public static StudentManagement1App getApplication() {
        return Application.getInstance(StudentManagement1App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(StudentManagement1App.class, args);
    }
}
