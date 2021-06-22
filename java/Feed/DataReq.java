package tbclient.Feed;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72696common;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer load_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer new_net_type;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_NEW_NET_TYPE = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72697common;
        public Integer load_type;
        public Integer new_net_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72697common = dataReq.f72696common;
            this.scr_h = dataReq.scr_h;
            this.scr_w = dataReq.scr_w;
            this.scr_dip = dataReq.scr_dip;
            this.new_net_type = dataReq.new_net_type;
            this.load_type = dataReq.load_type;
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
            this.f72696common = builder.f72697common;
            Integer num = builder.scr_h;
            if (num == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num3 = builder.new_net_type;
            if (num3 == null) {
                this.new_net_type = DEFAULT_NEW_NET_TYPE;
            } else {
                this.new_net_type = num3;
            }
            Integer num4 = builder.load_type;
            if (num4 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
                return;
            } else {
                this.load_type = num4;
                return;
            }
        }
        this.f72696common = builder.f72697common;
        this.scr_h = builder.scr_h;
        this.scr_w = builder.scr_w;
        this.scr_dip = builder.scr_dip;
        this.new_net_type = builder.new_net_type;
        this.load_type = builder.load_type;
    }
}
