package tbclient.ShowLiveSecondPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Double DEFAULT_LAT;
    public static final Double DEFAULT_LNG;
    public static final String DEFAULT_NETWORK_TYPE = "";
    public static final Double DEFAULT_SCR_DIP;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69508common;
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69509common;
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
            if (dataReq == null) {
                return;
            }
            this.f69509common = dataReq.f69508common;
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

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_SCR_DIP = valueOf;
        DEFAULT_LAT = valueOf;
        DEFAULT_LNG = valueOf;
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f69508common = builder.f69509common;
            Integer num = builder.entry_type;
            if (num == null) {
                this.entry_type = DEFAULT_ENTRY_TYPE;
            } else {
                this.entry_type = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            Integer num3 = builder.ps;
            if (num3 == null) {
                this.ps = DEFAULT_PS;
            } else {
                this.ps = num3;
            }
            Integer num4 = builder.scr_w;
            if (num4 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num4;
            }
            Integer num5 = builder.scr_h;
            if (num5 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num5;
            }
            Integer num6 = builder.q_type;
            if (num6 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num6;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            String str = builder.network_type;
            if (str == null) {
                this.network_type = "";
            } else {
                this.network_type = str;
            }
            Double d3 = builder.lat;
            if (d3 == null) {
                this.lat = DEFAULT_LAT;
            } else {
                this.lat = d3;
            }
            Double d4 = builder.lng;
            if (d4 == null) {
                this.lng = DEFAULT_LNG;
                return;
            } else {
                this.lng = d4;
                return;
            }
        }
        this.f69508common = builder.f69509common;
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
}
