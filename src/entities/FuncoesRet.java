package entities;

public class FuncoesRet {
    
    public double altura;
    public double largura;

    public double areaRet () {
        return altura * largura; 
    }

    public double perimetroRet () {
        return 2 * (altura + largura);
    }

    public double diagonalRet() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}

    

}
