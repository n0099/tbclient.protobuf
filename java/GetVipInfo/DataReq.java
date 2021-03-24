package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_IS_JAIL_BROKEN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68511common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer is_jail_broken;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68512common;
        public Integer is_jail_broken;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68512common = dataReq.f68511common;
            this.is_jail_broken = dataReq.is_jail_broken;
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
            this.f68511common = builder.f68512common;
            Integer num = builder.is_jail_broken;
            if (num == null) {
                this.is_jail_broken = DEFAULT_IS_JAIL_BROKEN;
                return;
            } else {
                this.is_jail_broken = num;
                return;
            }
        }
        this.f68511common = builder.f68512common;
        this.is_jail_broken = builder.is_jail_broken;
    }
}
