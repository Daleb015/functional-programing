package co.com.daleb.functional.designpatterns;

public class CommandDesignDemo {
    public static void main(String[] args) {

        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote acAutomationRemote = new ACAutomationRemote();
        acAutomationRemote.setCommand(() -> ac2.turnOn());
        acAutomationRemote.buttonPressed();


    }
}
