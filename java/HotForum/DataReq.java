package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes18.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_LYO = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1137common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer lyo;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1137common = builder.f1138common;
            if (builder.lyo == null) {
                this.lyo = DEFAULT_LYO;
                return;
            } else {
                this.lyo = builder.lyo;
                return;
            }
        }
        this.f1137common = builder.f1138common;
        this.lyo = builder.lyo;
    }

    /* loaded from: classes18.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1138common;
        public Integer lyo;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1138common = dataReq.f1137common;
                this.lyo = dataReq.lyo;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
