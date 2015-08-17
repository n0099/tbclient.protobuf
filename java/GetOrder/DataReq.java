package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
import tbclient.Wares;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_ORDER_URL = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer is_left;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String order_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay_type;
    @ProtoField(tag = 6)
    public final Wares wares;
    public static final Integer DEFAULT_PAY_TYPE = 0;
    public static final Integer DEFAULT_IS_LEFT = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.pay_type == null) {
                this.pay_type = DEFAULT_PAY_TYPE;
            } else {
                this.pay_type = builder.pay_type;
            }
            if (builder.is_left == null) {
                this.is_left = DEFAULT_IS_LEFT;
            } else {
                this.is_left = builder.is_left;
            }
            if (builder.order_url == null) {
                this.order_url = "";
            } else {
                this.order_url = builder.order_url;
            }
            if (builder.mobile == null) {
                this.mobile = "";
            } else {
                this.mobile = builder.mobile;
            }
            this.wares = builder.wares;
            return;
        }
        this.common = builder.common;
        this.pay_type = builder.pay_type;
        this.is_left = builder.is_left;
        this.order_url = builder.order_url;
        this.mobile = builder.mobile;
        this.wares = builder.wares;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer is_left;
        public String mobile;
        public String order_url;
        public Integer pay_type;
        public Wares wares;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.pay_type = dataReq.pay_type;
                this.is_left = dataReq.is_left;
                this.order_url = dataReq.order_url;
                this.mobile = dataReq.mobile;
                this.wares = dataReq.wares;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
