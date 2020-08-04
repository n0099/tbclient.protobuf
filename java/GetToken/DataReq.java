package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SHOUBAICUID = "";
    public static final String DEFAULT_TOKEN = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1122common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String shoubaicuid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1122common = builder.f1123common;
            if (builder.token == null) {
                this.token = "";
            } else {
                this.token = builder.token;
            }
            if (builder.shoubaicuid == null) {
                this.shoubaicuid = "";
                return;
            } else {
                this.shoubaicuid = builder.shoubaicuid;
                return;
            }
        }
        this.f1122common = builder.f1123common;
        this.token = builder.token;
        this.shoubaicuid = builder.shoubaicuid;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1123common;
        public String shoubaicuid;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1123common = dataReq.f1122common;
                this.token = dataReq.token;
                this.shoubaicuid = dataReq.shoubaicuid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
