package tbclient.FriendFeedPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer ctime;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long logid;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FriendThreadInfo> thread_list;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_list;
    public static final List<FriendThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_CTIME = 0;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVER_TIME = 0;

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
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.ctime == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = builder.ctime;
            }
            if (builder.logid == null) {
                this.logid = DEFAULT_LOGID;
            } else {
                this.logid = builder.logid;
            }
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
                return;
            } else {
                this.server_time = builder.server_time;
                return;
            }
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.has_more = builder.has_more;
        this.user_list = immutableCopyOf(builder.user_list);
        this.time = builder.time;
        this.ctime = builder.ctime;
        this.logid = builder.logid;
        this.server_time = builder.server_time;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Integer ctime;
        public Integer has_more;
        public Long logid;
        public Integer server_time;
        public List<FriendThreadInfo> thread_list;
        public Integer time;
        public List<User> user_list;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.has_more = dataRes.has_more;
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.time = dataRes.time;
                this.ctime = dataRes.ctime;
                this.logid = dataRes.logid;
                this.server_time = dataRes.server_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
