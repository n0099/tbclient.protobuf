package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_PROPS_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69408common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long props_id;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69409common;
        public Long props_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69409common = dataReq.f69408common;
            this.props_id = dataReq.props_id;
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
            this.f69408common = builder.f69409common;
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
                return;
            } else {
                this.props_id = l;
                return;
            }
        }
        this.f69408common = builder.f69409common;
        this.props_id = builder.props_id;
    }
}
