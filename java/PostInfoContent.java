package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class PostInfoContent extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_author_view;
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
    public static final Integer DEFAULT_IS_AUTHOR_VIEW = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PostInfoContent> {
        public Long create_time;
        public Integer is_author_view;
        public List<Abstract> post_content;
        public Long post_id;
        public Long post_type;

        public Builder() {
        }

        public Builder(PostInfoContent postInfoContent) {
            super(postInfoContent);
            if (postInfoContent == null) {
                return;
            }
            this.post_content = Message.copyOf(postInfoContent.post_content);
            this.create_time = postInfoContent.create_time;
            this.post_type = postInfoContent.post_type;
            this.post_id = postInfoContent.post_id;
            this.is_author_view = postInfoContent.is_author_view;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfoContent build(boolean z) {
            return new PostInfoContent(this, z);
        }
    }

    public PostInfoContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Abstract> list = builder.post_content;
            if (list == null) {
                this.post_content = DEFAULT_POST_CONTENT;
            } else {
                this.post_content = Message.immutableCopyOf(list);
            }
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l;
            }
            Long l2 = builder.post_type;
            if (l2 == null) {
                this.post_type = DEFAULT_POST_TYPE;
            } else {
                this.post_type = l2;
            }
            Long l3 = builder.post_id;
            if (l3 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l3;
            }
            Integer num = builder.is_author_view;
            if (num == null) {
                this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
                return;
            } else {
                this.is_author_view = num;
                return;
            }
        }
        this.post_content = Message.immutableCopyOf(builder.post_content);
        this.create_time = builder.create_time;
        this.post_type = builder.post_type;
        this.post_id = builder.post_id;
        this.is_author_view = builder.is_author_view;
    }
}
