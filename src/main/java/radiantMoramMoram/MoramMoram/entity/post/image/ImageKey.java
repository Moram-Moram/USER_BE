package radiantMoramMoram.MoramMoram.entity.post.image;

import lombok.Builder;

import java.io.Serializable;

@Builder
public class ImageKey implements Serializable {

    private int post;

    private String fileName;
}
