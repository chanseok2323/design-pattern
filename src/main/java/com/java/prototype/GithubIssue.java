package com.java.prototype;

import java.util.Objects;

public class GithubIssue implements Cloneable {
    private int id;
    private String title;
    private GithubRepository githubRepository;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getGithubRepository() {
        return githubRepository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issue/%d", githubRepository.getUser(), githubRepository.getName(), id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(githubRepository, that.githubRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, githubRepository);
    }
}
