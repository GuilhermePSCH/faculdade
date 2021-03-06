import java.awt.geom.Ellipse2D;

/**
 * Um círculo que pode ser manipulado e se desenha em uma tela.
 * 
 * Adaptado do exemplo originalmente publicado no livro:
 * "Programação Orientada a Objetos com Java: Uma Introdução Prática Utilizando o Blue J"
 * dos autores Michael Kölling and David J. Barnes.
 */

public class Circulo {
    private String cor; // Cor do círculo. As cores aceitas são (todas em inglês): "red", "yellow", "blue", "green", "magenta" e "black".
    private int diametro; // Diâmetro do círculo
    private int x; // Posição X do círculo na tela
    private int y; // Posição Y do círculo na tela 
    
    public Circulo(String cor, int diametro){
        
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.diametro = diametro;
        
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public int getDiametro()
    {
        return this.diametro;
    }
    
    public boolean setCor(String cor)
    {
        this.cor = cor;
        return true;
    }
    
    public boolean setX(int x)
    {
        this.x = x;
        return true;
    }
    
    public boolean setY(int y)
    {
        this.y = y;
        return true;
    }
    
    public boolean setDiametro(int diametro)
    {
        if (diametro > 0){
            this.diametro = diametro;
            return true;
        }
        return false;
    }

    /**
     * Move o círculo horizontalmente por uma 'distância' em pixels.
     * 
     * @param distancia a quantidade de pixels para mover horizontalmente. 
     *          Se for um valor positivo, move para a direita. 
     *          Se for um valor negativo, move para a esquerda.
     */
    public void moverHorizontal(int distancia) {
        apagar();
        x += distancia;
        desenhar();
    }

    /**
     * Move o círculo verticalmente por uma 'distância' em pixels.
     * 
     * @param distancia a quantidade de pixels para mover verticalmente. 
     *          Se for um valor positivo, move para baixo. 
     *          Se for um valor negativo, move para cima.
     */
    public void moverVertical(int distancia) {
        apagar();
        y += distancia;
        desenhar();
    }

    /**
     * Desenha o circulo com as especificações na tela
     */
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, cor, new Ellipse2D.Double(x, y, diametro, diametro));
        canvas.wait(10);
    }

    /**
     * Apaga o circulo da tela
     */
    public void apagar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }
}
