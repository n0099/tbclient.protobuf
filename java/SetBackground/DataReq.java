package tbclient.SetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PROPS_ID = 0;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14687common;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            this.f14687common = builder.f14688common;
            return;
        }
        this.props_id = builder.props_id;
        this.f14687common = builder.f14688common;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14688common;
        public Integer props_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.props_id = dataReq.props_id;
                this.f14688common = dataReq.f14687common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
