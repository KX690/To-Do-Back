package Multi_frameworks_back.multiframework.model;

import java.util.Objects;

public class Comment {

    public Integer id;
    public String name;
    public String comment;
    public Integer idPublication;

    public Comment() {
    }

    public Comment(Integer id, String name, String comment, Integer idPublication) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.idPublication = idPublication;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(id, comment1.id) && Objects.equals(name, comment1.name) && Objects.equals(comment, comment1.comment) && Objects.equals(idPublication, comment1.idPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, comment, idPublication);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", idPublication=" + idPublication +
                '}';
    }
}
