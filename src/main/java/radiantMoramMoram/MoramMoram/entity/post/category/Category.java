package radiantMoramMoram.MoramMoram.entity.post.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import radiantMoramMoram.MoramMoram.entity.post.Post;

import javax.persistence.*;

@Entity(name = "tbl_category")
@IdClass(CategoryKey.class)
@Getter
@Builder
@IdClass(CategoryKey.class)
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @ManyToOne
    private Post post;

    @Id
    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

}
