package school.sptech;



import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mensagensMensais = List.of(
                "📅 Início de mês! Veja como se comportaram as evasões no mês passado.",
                "📈 Os dados acumulados do último mês revelam padrões consistentes de evasão.",
                "🔄 Novo mês, novos desafios — mas os dados do anterior seguem prontos para análise."
        );

        Telegram telegram = new Telegram(mensagensMensais);
        telegram.enviarMensagemAleatoria();
    }
}


