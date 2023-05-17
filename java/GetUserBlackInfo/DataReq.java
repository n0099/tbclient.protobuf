package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_BLACK_UID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long black_uid;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1262common;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long black_uid;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1263common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1263common = dataReq.f1262common;
            this.black_uid = dataReq.black_uid;
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
            this.f1262common = builder.f1263common;
            Long l = builder.black_uid;
            if (l == null) {
                this.black_uid = DEFAULT_BLACK_UID;
                return;
            } else {
                this.black_uid = l;
                return;
            }
        }
        this.f1262common = builder.f1263common;
        this.black_uid = builder.black_uid;
    }
}
