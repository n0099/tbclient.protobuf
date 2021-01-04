package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class LikeUserInfo extends Message {
    public static final String DEFAULT_MESSAGE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ForumInfo> forum_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PostInfo> post_info;
    @ProtoField(tag = 1)
    public final UserInfo user_info;
    public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    public static final List<PostInfo> DEFAULT_POST_INFO = Collections.emptyList();

    private LikeUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            if (builder.forum_info == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = immutableCopyOf(builder.forum_info);
            }
            if (builder.post_info == null) {
                this.post_info = DEFAULT_POST_INFO;
            } else {
                this.post_info = immutableCopyOf(builder.post_info);
            }
            if (builder.message == null) {
                this.message = "";
                return;
            } else {
                this.message = builder.message;
                return;
            }
        }
        this.user_info = builder.user_info;
        this.forum_info = immutableCopyOf(builder.forum_info);
        this.post_info = immutableCopyOf(builder.post_info);
        this.message = builder.message;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<LikeUserInfo> {
        public List<ForumInfo> forum_info;
        public String message;
        public List<PostInfo> post_info;
        public UserInfo user_info;

        public Builder() {
        }

        public Builder(LikeUserInfo likeUserInfo) {
            super(likeUserInfo);
            if (likeUserInfo != null) {
                this.user_info = likeUserInfo.user_info;
                this.forum_info = LikeUserInfo.copyOf(likeUserInfo.forum_info);
                this.post_info = LikeUserInfo.copyOf(likeUserInfo.post_info);
                this.message = likeUserInfo.message;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeUserInfo build(boolean z) {
            return new LikeUserInfo(this, z);
        }
    }
}
