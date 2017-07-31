package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class PbTopAgreePost extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
    public final List<Long> post_id_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer total_num;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final List<Long> DEFAULT_POST_ID_LIST = Collections.emptyList();

    private PbTopAgreePost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.total_num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = builder.total_num;
            }
            if (builder.post_id_list == null) {
                this.post_id_list = DEFAULT_POST_ID_LIST;
                return;
            } else {
                this.post_id_list = immutableCopyOf(builder.post_id_list);
                return;
            }
        }
        this.post_list = immutableCopyOf(builder.post_list);
        this.total_num = builder.total_num;
        this.post_id_list = immutableCopyOf(builder.post_id_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PbTopAgreePost> {
        public List<Long> post_id_list;
        public List<Post> post_list;
        public Integer total_num;

        public Builder() {
        }

        public Builder(PbTopAgreePost pbTopAgreePost) {
            super(pbTopAgreePost);
            if (pbTopAgreePost != null) {
                this.post_list = PbTopAgreePost.copyOf(pbTopAgreePost.post_list);
                this.total_num = pbTopAgreePost.total_num;
                this.post_id_list = PbTopAgreePost.copyOf(pbTopAgreePost.post_id_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbTopAgreePost build(boolean z) {
            return new PbTopAgreePost(this, z);
        }
    }
}
