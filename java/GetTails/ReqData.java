package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14587common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String st_type;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            this.f14587common = builder.f14588common;
            return;
        }
        this.st_type = builder.st_type;
        this.f14587common = builder.f14588common;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14588common;
        public String st_type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.st_type = reqData.st_type;
                this.f14588common = reqData.f14587common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
