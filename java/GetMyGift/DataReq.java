package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer account_type;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1360common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_ACCOUNT_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer account_type;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1361common;
        public Integer pn;
        public String st_type;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.uid = dataReq.uid;
            this.f1361common = dataReq.f1360common;
            this.pn = dataReq.pn;
            this.st_type = dataReq.st_type;
            this.account_type = dataReq.account_type;
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
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            this.f1360common = builder.f1361common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            Integer num2 = builder.account_type;
            if (num2 == null) {
                this.account_type = DEFAULT_ACCOUNT_TYPE;
                return;
            } else {
                this.account_type = num2;
                return;
            }
        }
        this.uid = builder.uid;
        this.f1360common = builder.f1361common;
        this.pn = builder.pn;
        this.st_type = builder.st_type;
        this.account_type = builder.account_type;
    }
}
