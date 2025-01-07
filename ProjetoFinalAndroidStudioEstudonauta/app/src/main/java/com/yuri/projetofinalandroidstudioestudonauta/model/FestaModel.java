package com.yuri.projetofinalandroidstudioestudonauta.model;

public class FestaModel {
    private String nomeFesta, ruaFesta, dataFesta;
    private int capacidade, classificacao;
    private Double preco;

    public FestaModel() {
    }

    public FestaModel(String nomeFesta, String ruaFesta, String dataFesta, int capacidade, int classificacao, Double preco) {
        this.nomeFesta = nomeFesta;
        this.ruaFesta = ruaFesta;
        this.dataFesta = dataFesta;
        this.capacidade = capacidade;
        this.classificacao = classificacao;
        this.preco = preco;
    }

    public String getNomeFesta() {
        return nomeFesta;
    }

    public void setNomeFesta(String nomeFesta) {
        this.nomeFesta = nomeFesta;
    }

    public String getRuaFesta() {
        return ruaFesta;
    }

    public void setRuaFesta(String ruaFesta) {
        this.ruaFesta = ruaFesta;
    }

    public String getDataFesta() {
        return dataFesta;
    }

    public void setDataFesta(String dataFesta) {
        this.dataFesta = dataFesta;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
