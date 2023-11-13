package com.arteli.servico;
public abstract class ServicoMensagem{

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //É PROTECTED POIS SÓ AS CLASSES FILHAS PRECISAM TER ACESSO À ESSE MÉTODO
    protected void verificarConexao(){
        System.out.println("Verificando conexão com a internet");
    }

    protected void salvarHistorico(){
        System.out.println("Salvando histórico de mensagens");
    }
}