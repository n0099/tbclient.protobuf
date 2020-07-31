package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class PbTopAgreePost extends Message {
    public static final String DEFAULT_FORUM_TOP_LIST = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String forum_top_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
    public final List<Long> post_id_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<Long> DEFAULT_POST_ID_LIST = Collections.emptyList();

    private PbTopAgreePost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.post_id_list == null) {
                this.post_id_list = DEFAULT_POST_ID_LIST;
            } else {
                this.post_id_list = immutableCopyOf(builder.post_id_list);
            }
            if (builder.forum_top_list == null) {
                this.forum_top_list = "";
                return;
            } else {
                this.forum_top_list = builder.forum_top_list;
                return;
            }
        }
        this.post_list = immutableCopyOf(builder.post_list);
        this.post_id_list = immutableCopyOf(builder.post_id_list);
        this.forum_top_list = builder.forum_top_list;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<PbTopAgreePost> {
        public String forum_top_list;
        public List<Long> post_id_list;
        public List<Post> post_list;

        public Builder() {
        }

        public Builder(PbTopAgreePost pbTopAgreePost) {
            super(pbTopAgreePost);
            if (pbTopAgreePost != null) {
                this.post_list = PbTopAgreePost.copyOf(pbTopAgreePost.post_list);
                this.post_id_list = PbTopAgreePost.copyOf(pbTopAgreePost.post_id_list);
                this.forum_top_list = pbTopAgreePost.forum_top_list;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbTopAgreePost build(boolean z) {
            return new PbTopAgreePost(this, z);
        }
    }
}
