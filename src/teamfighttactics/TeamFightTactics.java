package teamfighttactics;

public class TeamFightTactics {

    public static void main(String[] args) {
        //Teste da factory de elementos
        ElementoFactory elem = new ElementoFactory(); 
        Elemento e = elem.fabricaElemento("4234");
        e.aprimoramento();
  
        //Teste da Factory de Classe
        ClasseFactory clas = new ClasseFactory(); 
        Classe c = clas.criarClasse("Assassino");
        c.descricao();
        c.efeito();
    
        //Teste do Builder
        Campeao ashe = new CampeaoBuilder()
                        .comNome("Ashe")
                        .comCusto(1)
                        .deClasse("Patrulheiro")
                        .comElemento("Oceano")
                        .build();
        ashe.exibeStatus();
    }
}
