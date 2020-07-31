package tbclient.ShowLiveSecondPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_NETWORK_TYPE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1211common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer entry_type;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double lat;
    @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
    public final Double lng;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String network_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer ps;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_ENTRY_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_PS = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Double DEFAULT_LAT = Double.valueOf(0.0d);
    public static final Double DEFAULT_LNG = Double.valueOf(0.0d);

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1211common = builder.f1212common;
            if (builder.entry_type == null) {
                this.entry_type = DEFAULT_ENTRY_TYPE;
            } else {
                this.entry_type = builder.entry_type;
            }
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
            if (builder.network_type == null) {
                this.network_type = "";
            } else {
                this.network_type = builder.network_type;
            }
            if (builder.lat == null) {
                this.lat = DEFAULT_LAT;
            } else {
                this.lat = builder.lat;
            }
            if (builder.lng == null) {
                this.lng = DEFAULT_LNG;
                return;
            } else {
                this.lng = builder.lng;
                return;
            }
        }
        this.f1211common = builder.f1212common;
        this.entry_type = builder.entry_type;
        this.pn = builder.pn;
        this.ps = builder.ps;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.network_type = builder.network_type;
        this.lat = builder.lat;
        this.lng = builder.lng;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1212common;
        public Integer entry_type;
        public Double lat;
        public Double lng;
        public String network_type;
        public Integer pn;
        public Integer ps;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1212common = dataReq.f1211common;
                this.entry_type = dataReq.entry_type;
                this.pn = dataReq.pn;
                this.ps = dataReq.ps;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.scr_dip = dataReq.scr_dip;
                this.network_type = dataReq.network_type;
                this.lat = dataReq.lat;
                this.lng = dataReq.lng;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
