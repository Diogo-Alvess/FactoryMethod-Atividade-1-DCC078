package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoPushTest {

    @Test
    void deveEnviarPush() {
        INotificacao notif = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Enviando PUSH: Teste", notif.enviar("Teste"));
    }
}
