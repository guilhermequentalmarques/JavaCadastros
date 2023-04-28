public class Pessoa {
    public String nome;
    public String CPF;
    public String telefone;
    public String dataNascimento;
    public String dataAgendamento;
    public String periodo;

    public Pessoa(String nome, String CPF, String telefone, String dataNascimento, String dataAgendamento, String periodo) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getDataAgendamento() {
        return dataAgendamento;
    }
    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", CPF=" + CPF +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                ", dataAgendamento=" + dataAgendamento +
                ", periodo=" + periodo +
                '}';
    }
}
