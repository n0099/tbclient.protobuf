package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PostInfo extends Message {
    public static final String DEFAULT_COMMON_POST_PIC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_post_pic;

    /* synthetic */ PostInfo(Builder builder, boolean z, PostInfo postInfo) {
        this(builder, z);
    }

    private PostInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.common_post_pic == null) {
                this.common_post_pic = "";
                return;
            } else {
                this.common_post_pic = builder.common_post_pic;
                return;
            }
        }
        this.common_post_pic = builder.common_post_pic;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PostInfo> {
        public String common_post_pic;

        public Builder(PostInfo postInfo) {
            super(postInfo);
            if (postInfo != null) {
                this.common_post_pic = postInfo.common_post_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfo build(boolean z) {
            return new PostInfo(this, z, null);
        }
    }
}
