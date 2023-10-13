package org.example;

public class Retangulo {
    int largura;
    int comprimento;

    public Retangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int area (Retangulo r){
        return r.comprimento * r.largura;
    }

    public int perimetro (int base, int altura){
        return (2*base) + (2*altura);
    }

    public boolean isTriangle(int a, int b, int c){
        boolean val = false;
        if(a < b+c){
            if(b < a+ c){
                if(c < b +a){
                    val = true;
                }
            }
        }
        return val;
    }
}
