package radiantMoramMoram.MoramMoram.repository.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import radiantMoramMoram.MoramMoram.entity.post.Post;
import radiantMoramMoram.MoramMoram.entity.post.like.LikePost;
import radiantMoramMoram.MoramMoram.entity.post.like.LikePostKey;
import radiantMoramMoram.MoramMoram.entity.user.User;

@Repository
public interface LikePostRepository extends JpaRepository<LikePost, LikePostKey> {

    boolean existsByPostAndUser(Post post, User user);

    void deleteByPostAndUser(Post post, User user);

    Post findByPost(Post post);

}
