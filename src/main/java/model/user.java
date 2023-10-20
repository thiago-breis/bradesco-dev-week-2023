package model;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private account account;

    @OneToOne(cascade = CascadeType.ALL)
    private card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<news> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public account getaccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public card getcard() {
        return card;
    }

    public void setcard(card card) {
        this.card = card;
    }

    public List<feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<feature> features) {
        this.features = features;
    }

    public List<news> getNews() {
        return news;
    }

    public void setnews(List<news> news) {
        this.news = news;
    }

}