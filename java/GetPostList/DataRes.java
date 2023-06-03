package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Post;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Post> post_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.post_list = Message.copyOf(dataRes.post_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Post> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
                return;
            } else {
                this.post_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.post_list = Message.immutableCopyOf(builder.post_list);
    }
}
