package tbclient.GetRecommendGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes11.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1147common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1147common = builder.f1148common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = builder.user_id;
                return;
            }
        }
        this.f1147common = builder.f1148common;
        this.user_id = builder.user_id;
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1148common;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1148common = dataReq.f1147common;
                this.user_id = dataReq.user_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
