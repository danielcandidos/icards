package xCards;

import negocio.GerenciarDB;

/**
 *
 * @author gustavopereira
 */
public class mainTeste {
   
    public static void main(String[] args) throws Exception{
        GerenciarDB banco = new GerenciarDB();
        //banco.addUsuario("2424","Capeta","hell@bol.com","Inferno Av.","66326694","06/06/2006","Hell","ADM","12345PAI","adm123");
        //banco.addEstabelecimento(12345, "Casa Loterica", "34543433");
        //banco.addCartao(15,"2424");
        //banco.addExtratoDeposito(13.0, "Gustavo", 15.50, "10/03/2013");
        //banco.addExtratoDebito(12345.0, 13.0, 345.20, "11/03/2013");
        //banco.delUsuario("135555");
        
        //banco.delExtrato(4);
        //banco.delExtrato(3);
        //banco.delEstabelecimento(12345);
        //banco.delCartao(13);
        
        System.out.println(banco.checkSenhaDB(15, "1234", 0));
    }
}
