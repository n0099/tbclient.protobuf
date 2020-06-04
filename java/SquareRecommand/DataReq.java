package tbclient.SquareRecommand;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1249common;
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

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1249common = builder.f1250common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
                return;
            } else {
                this.scr_dip = builder.scr_dip;
                return;
            }
        }
        this.f1249common = builder.f1250common;
        this.pn = builder.pn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1250common;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1250common = dataReq.f1249common;
                this.pn = dataReq.pn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.scr_dip = dataReq.scr_dip;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}