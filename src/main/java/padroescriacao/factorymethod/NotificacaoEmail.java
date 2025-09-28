package padroescriacao.factorymethod;

public class NotificacaoEmail implements INotificacao {
    @Override
    public String enviar(String mensagem) {
        return "Enviando EMAIL: " + mensagem;
    }
}
