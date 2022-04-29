public class AgendaShow {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addDiaAgenda(2, 1, 2022, 17, "teste de sofware");
        agenda.addDiaAgenda(5, 2, 2022, 18, "teste de Requisitos");
        agenda.addDiaAgenda(5, 2, 2022, 19, "teste de Application");
        agenda.addDiaAgenda(7, 2, 2022, 17, "Estudo faculdade");
        agenda.addDiaAgenda(7, 2, 2022, 18, "Estudo programacao");
        agenda.addDiaAgenda(7, 2, 2022, 19, "Revisao de Programacao");
        agenda.addDiaAgenda(11, 2, 2022, 17, "Trabalhar no codigo de Programacao");

        agenda.imprimirAgenda();

        // agenda.listaDia(19, 1, 2022); // teste de dia nao existente
        agenda.listaDia(11, 2, 2022); // teste de dia existente
    }
}
