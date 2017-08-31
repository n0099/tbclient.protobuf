package tbclient.Frshighlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerList;
import tbclient.Page;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(tag = 3)
    public final BannerList banner_list;
    @ProtoField(tag = 4)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> user_list;

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
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            this.banner_list = builder.banner_list;
            this.page = builder.page;
            return;
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.user_list = immutableCopyOf(builder.user_list);
        this.banner_list = builder.banner_list;
        this.page = builder.page;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public BannerList banner_list;
        public Page page;
        public List<ThreadInfo> thread_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.banner_list = dataRes.banner_list;
                this.page = dataRes.page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}