package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class PostInfoContent extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Abstract> post_content;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_type;
    public static final List<Abstract> DEFAULT_POST_CONTENT = Collections.emptyList();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_POST_TYPE = 0L;
    public static final Long DEFAULT_POST_ID = 0L;

    private PostInfoContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_content == null) {
                this.post_content = DEFAULT_POST_CONTENT;
            } else {
                this.post_content = immutableCopyOf(builder.post_content);
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.post_type == null) {
                this.post_type = DEFAULT_POST_TYPE;
            } else {
                this.post_type = builder.post_type;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
                return;
            } else {
                this.post_id = builder.post_id;
                return;
            }
        }
        this.post_content = immutableCopyOf(builder.post_content);
        this.create_time = builder.create_time;
        this.post_type = builder.post_type;
        this.post_id = builder.post_id;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<PostInfoContent> {
        public Long create_time;
        public List<Abstract> post_content;
        public Long post_id;
        public Long post_type;

        public Builder() {
        }

        public Builder(PostInfoContent postInfoContent) {
            super(postInfoContent);
            if (postInfoContent != null) {
                this.post_content = PostInfoContent.copyOf(postInfoContent.post_content);
                this.create_time = postInfoContent.create_time;
                this.post_type = postInfoContent.post_type;
                this.post_id = postInfoContent.post_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfoContent build(boolean z) {
            return new PostInfoContent(this, z);
        }
    }
}
