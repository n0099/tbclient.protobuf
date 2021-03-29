package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class PostInfo extends Message {
    public static final String DEFAULT_COMMON_POST_PIC = "";
    public static final String DEFAULT_LARGE_POST_PIC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_post_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String large_post_pic;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PostInfo> {
        public String common_post_pic;
        public String large_post_pic;

        public Builder() {
        }

        public Builder(PostInfo postInfo) {
            super(postInfo);
            if (postInfo == null) {
                return;
            }
            this.common_post_pic = postInfo.common_post_pic;
            this.large_post_pic = postInfo.large_post_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfo build(boolean z) {
            return new PostInfo(this, z);
        }
    }

    public PostInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.common_post_pic;
            if (str == null) {
                this.common_post_pic = "";
            } else {
                this.common_post_pic = str;
            }
            String str2 = builder.large_post_pic;
            if (str2 == null) {
                this.large_post_pic = "";
                return;
            } else {
                this.large_post_pic = str2;
                return;
            }
        }
        this.common_post_pic = builder.common_post_pic;
        this.large_post_pic = builder.large_post_pic;
    }
}
