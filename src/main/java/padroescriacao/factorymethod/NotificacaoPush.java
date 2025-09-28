package padroescriacao.factorymethod;

public class NotificacaoPush implements INotificacao {
    @Override
    public String enviar(String mensagem) {
        return "Enviando PUSH: " + mensagem;
    }
}
