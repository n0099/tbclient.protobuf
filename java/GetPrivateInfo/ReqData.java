package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69352common;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69353common;
        public Long user_id;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.user_id = reqData.user_id;
            this.f69353common = reqData.f69352common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            this.f69352common = builder.f69353common;
            return;
        }
        this.user_id = builder.user_id;
        this.f69352common = builder.f69353common;
    }
}
