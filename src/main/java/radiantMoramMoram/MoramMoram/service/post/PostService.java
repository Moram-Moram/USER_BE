package radiantMoramMoram.MoramMoram.service.post;
import radiantMoramMoram.MoramMoram.payload.request.post.WritePostRequest;

import radiantMoramMoram.MoramMoram.payload.request.post.LikePostRequest;
import radiantMoramMoram.MoramMoram.payload.response.mypage.MyPagePostResponse;
import radiantMoramMoram.MoramMoram.payload.response.post.GetPostResponse;
import radiantMoramMoram.MoramMoram.payload.response.post.PostsResponse;

import java.util.List;

public interface PostService {

    void writePost(WritePostRequest writePostRequest, String token);

    GetPostResponse getPost(Integer postId, String token);

    void deletePost(Integer postId, String token);

    void likePost(LikePostRequest likePostRequest);

    void reportPost(Integer postId, String token);

    GetPostResponse randomPost(int num);

    PostsResponse getPostList(String category);

    List<MyPagePostResponse> getMyPagePost(String userId, String token);

    List<MyPagePostResponse> getLikePost(String userId, String token);

}
