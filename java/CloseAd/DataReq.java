package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_VIP_CLOSE = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1120common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_close;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1121common;
        public Integer vip_close;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1121common = dataReq.f1120common;
            this.vip_close = dataReq.vip_close;
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
            this.f1120common = builder.f1121common;
            Integer num = builder.vip_close;
            if (num == null) {
                this.vip_close = DEFAULT_VIP_CLOSE;
                return;
            } else {
                this.vip_close = num;
                return;
            }
        }
        this.f1120common = builder.f1121common;
        this.vip_close = builder.vip_close;
    }
}
