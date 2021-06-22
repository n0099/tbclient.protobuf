package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SHOUBAICUID = "";
    public static final String DEFAULT_TOKEN = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72836common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String shoubaicuid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72837common;
        public String shoubaicuid;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72837common = dataReq.f72836common;
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
            this.f72836common = builder.f72837common;
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
        this.f72836common = builder.f72837common;
        this.token = builder.token;
        this.shoubaicuid = builder.shoubaicuid;
    }
}
