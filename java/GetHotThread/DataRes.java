package tbclient.GetHotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> good_thread_list;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_list;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_GOOD_THREAD_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            this.page = builder.page;
            if (builder.good_thread_list == null) {
                this.good_thread_list = DEFAULT_GOOD_THREAD_LIST;
                return;
            } else {
                this.good_thread_list = immutableCopyOf(builder.good_thread_list);
                return;
            }
        }
        this.user_list = immutableCopyOf(builder.user_list);
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.page = builder.page;
        this.good_thread_list = immutableCopyOf(builder.good_thread_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> good_thread_list;
        public Page page;
        public List<ThreadInfo> thread_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.page = dataRes.page;
                this.good_thread_list = DataRes.copyOf(dataRes.good_thread_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
