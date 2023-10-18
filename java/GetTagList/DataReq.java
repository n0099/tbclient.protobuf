package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_FROM = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1382common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer from;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1383common;
        public Integer from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1383common = dataReq.f1382common;
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
            this.f1382common = builder.f1383common;
            Integer num = builder.from;
            if (num == null) {
                this.from = DEFAULT_FROM;
                return;
            } else {
                this.from = num;
                return;
            }
        }
        this.f1382common = builder.f1383common;
        this.from = builder.from;
    }
}
