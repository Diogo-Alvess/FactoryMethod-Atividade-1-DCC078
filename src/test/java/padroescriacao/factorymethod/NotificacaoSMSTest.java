package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSMSTest {

    @Test
    void deveEnviarSMS() {
        INotificacao notif = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("Enviando SMS: Teste", notif.enviar("Teste"));
    }
}
