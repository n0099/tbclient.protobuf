package tbclient.GetUserOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69518common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer order_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer show_member;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_ORDER_TYPE = 0;
    public static final Integer DEFAULT_SHOW_MEMBER = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69519common;
        public Integer order_type;
        public Integer pn;
        public Integer rn;
        public Integer show_member;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69519common = dataReq.f69518common;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.order_type = dataReq.order_type;
            this.show_member = dataReq.show_member;
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
            this.f69518common = builder.f69519common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.rn;
            if (num2 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num2;
            }
            Integer num3 = builder.order_type;
            if (num3 == null) {
                this.order_type = DEFAULT_ORDER_TYPE;
            } else {
                this.order_type = num3;
            }
            Integer num4 = builder.show_member;
            if (num4 == null) {
                this.show_member = DEFAULT_SHOW_MEMBER;
                return;
            } else {
                this.show_member = num4;
                return;
            }
        }
        this.f69518common = builder.f69519common;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.order_type = builder.order_type;
        this.show_member = builder.show_member;
    }
}
