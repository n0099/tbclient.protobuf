package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ADDR_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String addr_name;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1160common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.addr_name == null) {
                this.addr_name = "";
            } else {
                this.addr_name = builder.addr_name;
            }
            this.f1160common = builder.f1161common;
            return;
        }
        this.addr_name = builder.addr_name;
        this.f1160common = builder.f1161common;
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String addr_name;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1161common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.addr_name = dataReq.addr_name;
                this.f1161common = dataReq.f1160common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
