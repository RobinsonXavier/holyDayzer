public class CalendarioFeriado implements interfaceCalendario{
  Feriado[] feriados = new Feriado[11];

  public Feriado[] getFeriados() {
    return feriados;
  }

  public void setFeriados(Feriado[] feriados) {
    this.feriados = feriados;
  }
  
  public String confirmaFeriado(String feriado) {
    for(int i = 0; i < feriados.length; i++) {
      if(feriado.equals(feriados[i].getDiaDoAno())) {
        return feriados[i].getEvent();
      }
    }
    return "Este feriado não existe";
  }
  
}
