package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class PostInfo extends Message {
    public static final String DEFAULT_COMMON_POST_PIC = "";
    public static final String DEFAULT_LARGE_POST_PIC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_post_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String large_post_pic;

    private PostInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.common_post_pic == null) {
                this.common_post_pic = "";
            } else {
                this.common_post_pic = builder.common_post_pic;
            }
            if (builder.large_post_pic == null) {
                this.large_post_pic = "";
                return;
            } else {
                this.large_post_pic = builder.large_post_pic;
                return;
            }
        }
        this.common_post_pic = builder.common_post_pic;
        this.large_post_pic = builder.large_post_pic;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<PostInfo> {
        public String common_post_pic;
        public String large_post_pic;

        public Builder() {
        }

        public Builder(PostInfo postInfo) {
            super(postInfo);
            if (postInfo != null) {
                this.common_post_pic = postInfo.common_post_pic;
                this.large_post_pic = postInfo.large_post_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfo build(boolean z) {
            return new PostInfo(this, z);
        }
    }
}
