package tbclient.SquareRecommand;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69555common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69556common;
        public Integer pn;
        public Integer q_type;
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
            this.f69556common = dataReq.f69555common;
            this.pn = dataReq.pn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
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
            this.f69555common = builder.f69556common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Integer num4 = builder.q_type;
            if (num4 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num4;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
                return;
            } else {
                this.scr_dip = d2;
                return;
            }
        }
        this.f69555common = builder.f69556common;
        this.pn = builder.pn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
    }
}
