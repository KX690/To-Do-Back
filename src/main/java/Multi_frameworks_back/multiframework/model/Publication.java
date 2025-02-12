package Multi_frameworks_back.multiframework.model;

import java.util.List;
import java.util.Objects;

public class Publication {
    private Integer id;
    private String title;
    private String link;
    private String description;
    private Integer votosPositivos;
    private Integer votosNegativos;
    private String tags;

    public Publication() {
    }

    public Publication(Integer id, String title, String link, String description, Integer votosPositivos, Integer votosNegativos, String tags) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.description = description;
        this.votosPositivos = votosPositivos;
        this.votosNegativos = votosNegativos;
        this.tags = tags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVotosPositivos() {
        return votosPositivos;
    }

    public void setVotosPositivos(Integer votosPositivos) {
        this.votosPositivos = votosPositivos;
    }

    public Integer getVotosNegativos() {
        return votosNegativos;
    }

    public void setVotosNegativos(Integer votosNegativos) {
        this.votosNegativos = votosNegativos;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(link, that.link) && Objects.equals(description, that.description) && Objects.equals(votosPositivos, that.votosPositivos) && Objects.equals(votosNegativos, that.votosNegativos) && Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, link, description, votosPositivos, votosNegativos, tags);
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", votosPositivos=" + votosPositivos +
                ", votosNegativos=" + votosNegativos +
                ", tags='" + tags + '\'' +
                '}';
    }
}
