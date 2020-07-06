package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_NETWORK_TYPE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1201common;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_refresh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String network_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ps;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_PS = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Integer DEFAULT_IS_REFRESH = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1201common = builder.f1202common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.ps == null) {
                this.ps = DEFAULT_PS;
            } else {
                this.ps = builder.ps;
            }
            if (builder.network_type == null) {
                this.network_type = "";
            } else {
                this.network_type = builder.network_type;
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
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.is_refresh == null) {
                this.is_refresh = DEFAULT_IS_REFRESH;
                return;
            } else {
                this.is_refresh = builder.is_refresh;
                return;
            }
        }
        this.f1201common = builder.f1202common;
        this.pn = builder.pn;
        this.ps = builder.ps;
        this.network_type = builder.network_type;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.is_refresh = builder.is_refresh;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1202common;
        public Integer is_refresh;
        public String network_type;
        public Integer pn;
        public Integer ps;
        public Integer q_type;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1202common = dataReq.f1201common;
                this.pn = dataReq.pn;
                this.ps = dataReq.ps;
                this.network_type = dataReq.network_type;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.scr_dip = dataReq.scr_dip;
                this.is_refresh = dataReq.is_refresh;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
