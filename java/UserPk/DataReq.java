package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer click_type;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14733common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pk_index;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer pk_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long user_pk_id;
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_PK_INDEX = 0;
    public static final Integer DEFAULT_CLICK_TYPE = 0;
    public static final Integer DEFAULT_PK_TYPE = 0;
    public static final Long DEFAULT_USER_PK_ID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14733common = builder.f14734common;
            if (builder.pk_id == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = builder.pk_id;
            }
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.pk_index == null) {
                this.pk_index = DEFAULT_PK_INDEX;
            } else {
                this.pk_index = builder.pk_index;
            }
            if (builder.click_type == null) {
                this.click_type = DEFAULT_CLICK_TYPE;
            } else {
                this.click_type = builder.click_type;
            }
            if (builder.pk_type == null) {
                this.pk_type = DEFAULT_PK_TYPE;
            } else {
                this.pk_type = builder.pk_type;
            }
            if (builder.user_pk_id == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = builder.user_pk_id;
                return;
            }
        }
        this.f14733common = builder.f14734common;
        this.pk_id = builder.pk_id;
        this.topic_id = builder.topic_id;
        this.pk_index = builder.pk_index;
        this.click_type = builder.click_type;
        this.pk_type = builder.pk_type;
        this.user_pk_id = builder.user_pk_id;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer click_type;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14734common;
        public Long pk_id;
        public Integer pk_index;
        public Integer pk_type;
        public Long topic_id;
        public Long user_pk_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14734common = dataReq.f14733common;
                this.pk_id = dataReq.pk_id;
                this.topic_id = dataReq.topic_id;
                this.pk_index = dataReq.pk_index;
                this.click_type = dataReq.click_type;
                this.pk_type = dataReq.pk_type;
                this.user_pk_id = dataReq.user_pk_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
