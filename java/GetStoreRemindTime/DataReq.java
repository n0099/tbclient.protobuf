package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes24.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5254common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5254common = builder.f5255common;
        } else {
            this.f5254common = builder.f5255common;
        }
    }

    /* loaded from: classes24.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5255common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5255common = dataReq.f5254common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
