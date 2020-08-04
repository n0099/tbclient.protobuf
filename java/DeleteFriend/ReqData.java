package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1030common;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.friend_id == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
            } else {
                this.friend_id = builder.friend_id;
            }
            this.f1030common = builder.f1031common;
            return;
        }
        this.friend_id = builder.friend_id;
        this.f1030common = builder.f1031common;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1031common;
        public Long friend_id;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.friend_id = reqData.friend_id;
                this.f1031common = reqData.f1030common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
