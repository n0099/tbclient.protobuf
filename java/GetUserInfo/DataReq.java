package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1268common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_SCR_W = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1269common;
        public Integer scr_w;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1269common = dataReq.f1268common;
            this.uid = dataReq.uid;
            this.scr_w = dataReq.scr_w;
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
            this.f1268common = builder.f1269common;
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Integer num = builder.scr_w;
            if (num == null) {
                this.scr_w = DEFAULT_SCR_W;
                return;
            } else {
                this.scr_w = num;
                return;
            }
        }
        this.f1268common = builder.f1269common;
        this.uid = builder.uid;
        this.scr_w = builder.scr_w;
    }
}
