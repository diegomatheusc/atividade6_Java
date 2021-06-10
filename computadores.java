package atividade06;
public class computadores implements Processador, Aparelho, Bateria {
private boolean carregado;
private int porcentagem;
private String marca; 
public computadores(String modelo) {
this.modelo(modelo);
this.percentual(0);
}
@Override
public int potenciahz() {
return 50000;
}
@Override
public void carregar() {
System.out.println("Sobrecarga! Desligue a fonte do PC");
this.setCarregado(false);
this.setPorcentagem(101);
}
@Override
public int porcentagem() {
return this.getPorcentagem();
}
@Override
public String monitor() {
return "Tela Curva";
}
@Override
public String getTipoAparelho() {
return "PC";
}
@Override
public String getModeloProcessador() {
return "Celeron (perdão professor, mas esse é realmente o meu processador, péssimo)";
}
@Override
public String getPotencia() {
return "1.8 GHz";
}
public boolean getCarregado() {
return carregado;
}
public void setCarregado(boolean carregado) {
this.carregado = carregado;
}
public String getMarca() {
return marca;
}
public void setMarca(String marca) {
this.marca = marca;
}
public int getPorcentagem() {
return porcentagem;
}
public void setPorcentagem(int porcentagem) {
this.porcentagem = porcentagem;
}




