package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer account_type;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14545common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_ACCOUNT_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            this.f14545common = builder.f14546common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            if (builder.account_type == null) {
                this.account_type = DEFAULT_ACCOUNT_TYPE;
                return;
            } else {
                this.account_type = builder.account_type;
                return;
            }
        }
        this.uid = builder.uid;
        this.f14545common = builder.f14546common;
        this.pn = builder.pn;
        this.st_type = builder.st_type;
        this.account_type = builder.account_type;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer account_type;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14546common;
        public Integer pn;
        public String st_type;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.uid = dataReq.uid;
                this.f14546common = dataReq.f14545common;
                this.pn = dataReq.pn;
                this.st_type = dataReq.st_type;
                this.account_type = dataReq.account_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
