package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_FROM = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1250common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer from;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1251common;
        public Integer from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1251common = dataReq.f1250common;
            this.from = dataReq.from;
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
            this.f1250common = builder.f1251common;
            Integer num = builder.from;
            if (num == null) {
                this.from = DEFAULT_FROM;
                return;
            } else {
                this.from = num;
                return;
            }
        }
        this.f1250common = builder.f1251common;
        this.from = builder.from;
    }
}
