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
    public final CommonReq f1527common;
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer click_type;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1528common;
        public Long pk_id;
        public Integer pk_index;
        public Integer pk_type;
        public Long topic_id;
        public Long user_pk_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1528common = dataReq.f1527common;
            this.pk_id = dataReq.pk_id;
            this.topic_id = dataReq.topic_id;
            this.pk_index = dataReq.pk_index;
            this.click_type = dataReq.click_type;
            this.pk_type = dataReq.pk_type;
            this.user_pk_id = dataReq.user_pk_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1527common = builder.f1528common;
            Long l = builder.pk_id;
            if (l == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l;
            }
            Long l2 = builder.topic_id;
            if (l2 == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l2;
            }
            Integer num = builder.pk_index;
            if (num == null) {
                this.pk_index = DEFAULT_PK_INDEX;
            } else {
                this.pk_index = num;
            }
            Integer num2 = builder.click_type;
            if (num2 == null) {
                this.click_type = DEFAULT_CLICK_TYPE;
            } else {
                this.click_type = num2;
            }
            Integer num3 = builder.pk_type;
            if (num3 == null) {
                this.pk_type = DEFAULT_PK_TYPE;
            } else {
                this.pk_type = num3;
            }
            Long l3 = builder.user_pk_id;
            if (l3 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l3;
                return;
            }
        }
        this.f1527common = builder.f1528common;
        this.pk_id = builder.pk_id;
        this.topic_id = builder.topic_id;
        this.pk_index = builder.pk_index;
        this.click_type = builder.click_type;
        this.pk_type = builder.pk_type;
        this.user_pk_id = builder.user_pk_id;
    }
}
