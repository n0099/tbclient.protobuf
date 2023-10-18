package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SHOUBAICUID = "";
    public static final String DEFAULT_TOKEN = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1388common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String shoubaicuid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1389common;
        public String shoubaicuid;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1389common = dataReq.f1388common;
            this.token = dataReq.token;
            this.shoubaicuid = dataReq.shoubaicuid;
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
            this.f1388common = builder.f1389common;
            String str = builder.token;
            if (str == null) {
                this.token = "";
            } else {
                this.token = str;
            }
            String str2 = builder.shoubaicuid;
            if (str2 == null) {
                this.shoubaicuid = "";
                return;
            } else {
                this.shoubaicuid = str2;
                return;
            }
        }
        this.f1388common = builder.f1389common;
        this.token = builder.token;
        this.shoubaicuid = builder.shoubaicuid;
    }
}
