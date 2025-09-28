package padroescriacao.factorymethod;

public class NotificacaoFactory {

    public static INotificacao obterNotificacao(String tipo) {
        Class classe;
        Object objeto;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Notificacao" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de notificação inexistente");
        }
        if (!(objeto instanceof INotificacao)) {
            throw new IllegalArgumentException("Tipo de notificação inválido");
        }
        return (INotificacao) objeto;
    }
}
