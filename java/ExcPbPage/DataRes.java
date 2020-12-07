package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Post;
import tbclient.User;
/* loaded from: classes23.dex */
public final class DataRes extends Message {
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Post> post_list;
    @ProtoField(tag = 1)
    public final ExcellentPbThreadInfo thread_info;
    @ProtoField(tag = 4)
    public final UserInfo user_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_info = builder.thread_info;
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            this.user_info = builder.user_info;
            return;
        }
        this.thread_info = builder.thread_info;
        this.post_list = immutableCopyOf(builder.post_list);
        this.user_list = immutableCopyOf(builder.user_list);
        this.user_info = builder.user_info;
    }

    /* loaded from: classes23.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Post> post_list;
        public ExcellentPbThreadInfo thread_info;
        public UserInfo user_info;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_info = dataRes.thread_info;
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.user_info = dataRes.user_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
