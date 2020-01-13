package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.Page;
import tbclient.Post;
import tbclient.SimpleForum;
import tbclient.SubPostList;
import tbclient.ThreadInfo;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2)
    public final Anti anti;
    @ProtoField(tag = 8)
    public final SimpleForum display_forum;
    @ProtoField(tag = 6)
    public final SimpleForum forum;
    @ProtoField(tag = 1)
    public final Page page;
    @ProtoField(tag = 3)
    public final Post post;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SubPostList> subpost_list;
    @ProtoField(tag = 5)
    public final ThreadInfo thread;
    public static final List<SubPostList> DEFAULT_SUBPOST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SERVER_TIME = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.page = builder.page;
            this.anti = builder.anti;
            this.post = builder.post;
            if (builder.subpost_list == null) {
                this.subpost_list = DEFAULT_SUBPOST_LIST;
            } else {
                this.subpost_list = immutableCopyOf(builder.subpost_list);
            }
            this.thread = builder.thread;
            this.forum = builder.forum;
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = builder.server_time;
            }
            this.display_forum = builder.display_forum;
            return;
        }
        this.page = builder.page;
        this.anti = builder.anti;
        this.post = builder.post;
        this.subpost_list = immutableCopyOf(builder.subpost_list);
        this.thread = builder.thread;
        this.forum = builder.forum;
        this.server_time = builder.server_time;
        this.display_forum = builder.display_forum;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Anti anti;
        public SimpleForum display_forum;
        public SimpleForum forum;
        public Page page;
        public Post post;
        public Integer server_time;
        public List<SubPostList> subpost_list;
        public ThreadInfo thread;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.page = dataRes.page;
                this.anti = dataRes.anti;
                this.post = dataRes.post;
                this.subpost_list = DataRes.copyOf(dataRes.subpost_list);
                this.thread = dataRes.thread;
                this.forum = dataRes.forum;
                this.server_time = dataRes.server_time;
                this.display_forum = dataRes.display_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
