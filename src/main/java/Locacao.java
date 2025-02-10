public class Locacao {
    private double valorLocacao;
    private double valorMulta;
    private Funcionario objFuncionario;
    private Usuario objUsuario;
    private Livro objLivro;
    private Data dataLocacao;
    private Data dataDevolucao;
    private Livro objLivroLocado;
    private double precoLocacao = 10;




    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getObjFuncionario() {
        return objFuncionario;
    }

    public void setObjFuncionario(Funcionario objFuncionario) {
        this.objFuncionario = objFuncionario;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getObjLivroLocado() {
        return objLivroLocado;
    }

    public void setObjLivroLocado(Livro objLivroLocado) {
        this.objLivroLocado = objLivroLocado;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
}
