package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class ReqData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1306common;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String st_type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1307common;
        public Long friend_id;
        public String st_type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.friend_id = reqData.friend_id;
            this.st_type = reqData.st_type;
            this.f1307common = reqData.f1306common;
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
            Long l = builder.friend_id;
            if (l == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
            } else {
                this.friend_id = l;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            this.f1306common = builder.f1307common;
            return;
        }
        this.friend_id = builder.friend_id;
        this.st_type = builder.st_type;
        this.f1306common = builder.f1307common;
    }
}
