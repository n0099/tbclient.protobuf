package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1195common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1195common = builder.f1196common;
            if (builder.call_from == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = builder.call_from;
                return;
            }
        }
        this.f1195common = builder.f1196common;
        this.call_from = builder.call_from;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1196common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1196common = dataReq.f1195common;
                this.call_from = dataReq.call_from;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
