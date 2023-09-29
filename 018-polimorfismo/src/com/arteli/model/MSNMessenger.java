package com.arteli.model;
import com.arteli.servico.ServicoMensagem;

public class MSNMessenger extends ServicoMensagem {
    
    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Enviando mensagem pelo MSNMessenger");
        salvarHistorico();
    }

    public void receberMensagem(){
        System.out.println("Recebendo uma mensagem no MSNMessenger");
        salvarHistorico();
    }

    
}
