package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Post;
import tbclient.User;
/* loaded from: classes23.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long nextftid;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<Post> post_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long prevftid;
    @ProtoField(tag = 2)
    public final ForumInfo thread_info;
    @ProtoField(tag = 1)
    public final User_Info user_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<User> user_list;
    public static final Long DEFAULT_PREVFTID = 0L;
    public static final Long DEFAULT_NEXTFTID = 0L;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.thread_info = builder.thread_info;
            if (builder.prevftid == null) {
                this.prevftid = DEFAULT_PREVFTID;
            } else {
                this.prevftid = builder.prevftid;
            }
            if (builder.nextftid == null) {
                this.nextftid = DEFAULT_NEXTFTID;
            } else {
                this.nextftid = builder.nextftid;
            }
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
                return;
            }
        }
        this.user_info = builder.user_info;
        this.thread_info = builder.thread_info;
        this.prevftid = builder.prevftid;
        this.nextftid = builder.nextftid;
        this.post_list = immutableCopyOf(builder.post_list);
        this.user_list = immutableCopyOf(builder.user_list);
    }

    /* loaded from: classes23.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long nextftid;
        public List<Post> post_list;
        public Long prevftid;
        public ForumInfo thread_info;
        public User_Info user_info;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_info = dataRes.user_info;
                this.thread_info = dataRes.thread_info;
                this.prevftid = dataRes.prevftid;
                this.nextftid = dataRes.nextftid;
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.user_list = DataRes.copyOf(dataRes.user_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
