package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14777common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long user_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14777common = builder.f14778common;
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = builder.user_id;
                return;
            }
        }
        this.f14777common = builder.f14778common;
        this.class_name = builder.class_name;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.user_id = builder.user_id;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String class_name;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14778common;
        public Integer pn;
        public Integer rn;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14778common = dataReq.f14777common;
                this.class_name = dataReq.class_name;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.user_id = dataReq.user_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
