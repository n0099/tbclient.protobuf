package tbclient.GetConsentList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f4974common;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long page_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long res_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_GID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_PAGE_NUM = 0L;
    public static final Long DEFAULT_RES_NUM = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f4974common = builder.f4975common;
            if (builder.author_id == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = builder.author_id;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.gid == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = builder.gid;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.page_num == null) {
                this.page_num = DEFAULT_PAGE_NUM;
            } else {
                this.page_num = builder.page_num;
            }
            if (builder.res_num == null) {
                this.res_num = DEFAULT_RES_NUM;
                return;
            } else {
                this.res_num = builder.res_num;
                return;
            }
        }
        this.f4974common = builder.f4975common;
        this.author_id = builder.author_id;
        this.user_id = builder.user_id;
        this.gid = builder.gid;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.page_num = builder.page_num;
        this.res_num = builder.res_num;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long author_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f4975common;
        public Long gid;
        public Long page_num;
        public Long post_id;
        public Long res_num;
        public Long thread_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f4975common = dataReq.f4974common;
                this.author_id = dataReq.author_id;
                this.user_id = dataReq.user_id;
                this.gid = dataReq.gid;
                this.thread_id = dataReq.thread_id;
                this.post_id = dataReq.post_id;
                this.page_num = dataReq.page_num;
                this.res_num = dataReq.res_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
