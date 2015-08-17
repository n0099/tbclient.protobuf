package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PostInfoList;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long ctime;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer hide_post;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long logid;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PostInfoList> post_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long time;
    public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HIDE_POST = 0;
    public static final Long DEFAULT_TIME = 0L;
    public static final Long DEFAULT_CTIME = 0L;
    public static final Long DEFAULT_LOGID = 0L;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.hide_post == null) {
                this.hide_post = DEFAULT_HIDE_POST;
            } else {
                this.hide_post = builder.hide_post;
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
                return;
            } else {
                this.logid = builder.logid;
                return;
            }
        }
        this.post_list = immutableCopyOf(builder.post_list);
        this.hide_post = builder.hide_post;
        this.time = builder.time;
        this.ctime = builder.ctime;
        this.logid = builder.logid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long ctime;
        public Integer hide_post;
        public Long logid;
        public List<PostInfoList> post_list;
        public Long time;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.hide_post = dataRes.hide_post;
                this.time = dataRes.time;
                this.ctime = dataRes.ctime;
                this.logid = dataRes.logid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
