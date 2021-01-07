package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_IS_JAIL_BROKEN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14896common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer is_jail_broken;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14896common = builder.f14897common;
            if (builder.is_jail_broken == null) {
                this.is_jail_broken = DEFAULT_IS_JAIL_BROKEN;
                return;
            } else {
                this.is_jail_broken = builder.is_jail_broken;
                return;
            }
        }
        this.f14896common = builder.f14897common;
        this.is_jail_broken = builder.is_jail_broken;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14897common;
        public Integer is_jail_broken;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14897common = dataReq.f14896common;
                this.is_jail_broken = dataReq.is_jail_broken;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
