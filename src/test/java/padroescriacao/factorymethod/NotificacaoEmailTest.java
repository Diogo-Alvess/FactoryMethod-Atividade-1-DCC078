package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoEmailTest {

    @Test
    void deveEnviarEmail() {
        INotificacao notif = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("Enviando EMAIL: Teste", notif.enviar("Teste"));
    }
}
