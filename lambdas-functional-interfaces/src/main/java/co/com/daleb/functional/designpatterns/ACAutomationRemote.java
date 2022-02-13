package co.com.daleb.functional.designpatterns;

public class ACAutomationRemote {

  Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void buttonPressed() {
    command.executer();
  }
}
