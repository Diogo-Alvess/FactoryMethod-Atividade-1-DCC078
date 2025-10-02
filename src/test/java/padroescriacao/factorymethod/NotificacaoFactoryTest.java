package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaNotificacaoInexistente() {
        try {
            INotificacao notif = NotificacaoFactory.obterNotificacao("Telegram");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de notificação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotificacaoInvalida() {
        try {
            INotificacao notif = NotificacaoFactory.obterNotificacao("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de notificação inválido", e.getMessage());
        }
    }
}
