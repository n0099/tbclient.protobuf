package tbclient.GetUserForumStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 5)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer count;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer offset;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_COUNT = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.offset == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = builder.offset;
            }
            if (builder.count == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = builder.count;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            this.common = builder.common;
            return;
        }
        this.user_id = builder.user_id;
        this.offset = builder.offset;
        this.count = builder.count;
        this.forum_id = builder.forum_id;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer count;
        public Long forum_id;
        public Integer offset;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.user_id = dataReq.user_id;
                this.offset = dataReq.offset;
                this.count = dataReq.count;
                this.forum_id = dataReq.forum_id;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
