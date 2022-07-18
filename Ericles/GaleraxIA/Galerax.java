public class Galerax{
    int AnoDeFabricacao;
    String Criador;
    double CapacidadeAnalitica;
    int NivelDeAmeaca;
    public Galerax(int AnoDeFabricacao, String Criador, double CapacidadeAnalitica, int NivelDeAmeaca){
        this.AnoDeFabricacao = AnoDeFabricacao;
        this.Criador = Criador;
        this.CapacidadeAnalitica = CapacidadeAnalitica;
        this.NivelDeAmeaca = NivelDeAmeaca;
    }   
    private void DestruirOMundo(){
        System.out.println("Destruindo o mundo");
    }
    private void SalvarOMundo(){
        System.out.println("Salvando o mundo");
    }
    private void Explodir(){
        System.out.println("Explodindo");
    }
    public void DecisaoFinal(){
        int random = (int) (Math.random() * 3);
        System.out.println("Decisão final: " + random);
        if(random == 0){
            DestruirOMundo();
        }else if(random == 1){
            SalvarOMundo();
        }else{
            Explodir();
        }
    }
}