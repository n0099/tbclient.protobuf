package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_FROM = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1157common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer from;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1157common = builder.f1158common;
            if (builder.from == null) {
                this.from = DEFAULT_FROM;
                return;
            } else {
                this.from = builder.from;
                return;
            }
        }
        this.f1157common = builder.f1158common;
        this.from = builder.from;
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1158common;
        public Integer from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1158common = dataReq.f1157common;
                this.from = dataReq.from;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
