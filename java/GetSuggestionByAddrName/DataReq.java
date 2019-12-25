package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ADDR_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String addr_name;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1102common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.addr_name == null) {
                this.addr_name = "";
            } else {
                this.addr_name = builder.addr_name;
            }
            this.f1102common = builder.f1103common;
            return;
        }
        this.addr_name = builder.addr_name;
        this.f1102common = builder.f1103common;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String addr_name;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1103common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.addr_name = dataReq.addr_name;
                this.f1103common = dataReq.f1102common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
