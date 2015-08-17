package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> user_list;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
                return;
            }
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.user_list = immutableCopyOf(builder.user_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> thread_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.user_list = DataRes.copyOf(dataRes.user_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
