package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_LYO = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1423common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer lyo;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1424common;
        public Integer lyo;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1424common = dataReq.f1423common;
            this.lyo = dataReq.lyo;
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
            this.f1423common = builder.f1424common;
            Integer num = builder.lyo;
            if (num == null) {
                this.lyo = DEFAULT_LYO;
                return;
            } else {
                this.lyo = num;
                return;
            }
        }
        this.f1423common = builder.f1424common;
        this.lyo = builder.lyo;
    }
}
