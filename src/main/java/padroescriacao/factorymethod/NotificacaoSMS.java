package padroescriacao.factorymethod;

public class NotificacaoSMS implements INotificacao {
    @Override
    public String enviar(String mensagem) {
        return "Enviando SMS: " + mensagem;
    }
}
