package tbclient.GetSkin;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PROPS_ID = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14575common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer props_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14575common = builder.f14576common;
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
                return;
            } else {
                this.props_id = builder.props_id;
                return;
            }
        }
        this.f14575common = builder.f14576common;
        this.props_id = builder.props_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14576common;
        public Integer props_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14576common = dataReq.f14575common;
                this.props_id = dataReq.props_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
