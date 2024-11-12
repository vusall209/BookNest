package az.booknest.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    int id;

    @Column(name = "book_name")
    String bookName;

    @Column(name = "book_author")
    String author;

    @Column(name = "book_price$")
    int bookPrice;

    @ManyToMany(mappedBy = "books")
    Set<User> user; ;
}
