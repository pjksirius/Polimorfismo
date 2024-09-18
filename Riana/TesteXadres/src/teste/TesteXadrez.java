package teste;

import xadrez.Bispo;
import xadrez.Cavalo;
import xadrez.Peao;
import xadrez.Peca;

public class TesteXadrex {
    public static void main(String[] args) {
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();

        peao.mover();
        cavalo.mover();
        bispo.mover();
    }
}
