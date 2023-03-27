public class Feriado extends Data {
  private String event;

  public Feriado(String diaDoAno, String event) {
    super(diaDoAno);
    this.event = event;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

}
