package com.example.springit.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter @Setter
@ToString
//@NoArgsConstructor
public class Comment extends Auditable{

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Long id;

//    @NonNull
    private String body;

    @ManyToOne
//    @NonNull
    private Link link;

    public Comment(@NonNull String body, @NonNull Link link) {
        this.body = body;
        this.link = link;
    }

//    public Comment(){
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", link=" + link +
                "} " + super.toString();
    }
}
