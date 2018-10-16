package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class PbHotPost extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<HotPost> hot_post_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer need_hot_post;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer need_post_zan;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_NEED_HOT_POST = 0;
    public static final Integer DEFAULT_NEED_POST_ZAN = 0;
    public static final List<HotPost> DEFAULT_HOT_POST_LIST = Collections.emptyList();

    private PbHotPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.need_hot_post == null) {
                this.need_hot_post = DEFAULT_NEED_HOT_POST;
            } else {
                this.need_hot_post = builder.need_hot_post;
            }
            if (builder.need_post_zan == null) {
                this.need_post_zan = DEFAULT_NEED_POST_ZAN;
            } else {
                this.need_post_zan = builder.need_post_zan;
            }
            if (builder.hot_post_list == null) {
                this.hot_post_list = DEFAULT_HOT_POST_LIST;
                return;
            } else {
                this.hot_post_list = immutableCopyOf(builder.hot_post_list);
                return;
            }
        }
        this.post_list = immutableCopyOf(builder.post_list);
        this.need_hot_post = builder.need_hot_post;
        this.need_post_zan = builder.need_post_zan;
        this.hot_post_list = immutableCopyOf(builder.hot_post_list);
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<PbHotPost> {
        public List<HotPost> hot_post_list;
        public Integer need_hot_post;
        public Integer need_post_zan;
        public List<Post> post_list;

        public Builder() {
        }

        public Builder(PbHotPost pbHotPost) {
            super(pbHotPost);
            if (pbHotPost != null) {
                this.post_list = PbHotPost.copyOf(pbHotPost.post_list);
                this.need_hot_post = pbHotPost.need_hot_post;
                this.need_post_zan = pbHotPost.need_post_zan;
                this.hot_post_list = PbHotPost.copyOf(pbHotPost.hot_post_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbHotPost build(boolean z) {
            return new PbHotPost(this, z);
        }
    }
}
