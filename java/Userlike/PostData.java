package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
import tbclient.User;
/* loaded from: classes4.dex */
public final class PostData extends Message {
    public static final String DEFAULT_POST_TITLE = "";
    @ProtoField(tag = 4)
    public final User author;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PbContent> content;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String post_title;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long time;
    public static final Long DEFAULT_ID = 0L;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Long DEFAULT_TIME = 0L;

    private PostData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.post_title == null) {
                this.post_title = "";
            } else {
                this.post_title = builder.post_title;
            }
            this.author = builder.author;
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = builder.time;
                return;
            }
        }
        this.id = builder.id;
        this.content = immutableCopyOf(builder.content);
        this.post_title = builder.post_title;
        this.author = builder.author;
        this.time = builder.time;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<PostData> {
        public User author;
        public List<PbContent> content;
        public Long id;
        public String post_title;
        public Long time;

        public Builder() {
        }

        public Builder(PostData postData) {
            super(postData);
            if (postData != null) {
                this.id = postData.id;
                this.content = PostData.copyOf(postData.content);
                this.post_title = postData.post_title;
                this.author = postData.author;
                this.time = postData.time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostData build(boolean z) {
            return new PostData(this, z);
        }
    }
}
