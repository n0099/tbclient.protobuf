package tbclient.LiveTabliveSubTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ENTRY_NAME = "";
    public static final String DEFAULT_LABEL_NAME = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68535common;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer entry_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String entry_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String label_name;
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
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer sort_type;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_PS = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_ENTRY_ID = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68536common;
        public Integer entry_id;
        public String entry_name;
        public String label_name;
        public Integer pn;
        public Integer ps;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68536common = dataReq.f68535common;
            this.entry_name = dataReq.entry_name;
            this.pn = dataReq.pn;
            this.ps = dataReq.ps;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
            this.entry_id = dataReq.entry_id;
            this.label_name = dataReq.label_name;
            this.sort_type = dataReq.sort_type;
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
            this.f68535common = builder.f68536common;
            String str = builder.entry_name;
            if (str == null) {
                this.entry_name = "";
            } else {
                this.entry_name = str;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.ps;
            if (num2 == null) {
                this.ps = DEFAULT_PS;
            } else {
                this.ps = num2;
            }
            Integer num3 = builder.scr_w;
            if (num3 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num3;
            }
            Integer num4 = builder.scr_h;
            if (num4 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num4;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num5;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num6 = builder.entry_id;
            if (num6 == null) {
                this.entry_id = DEFAULT_ENTRY_ID;
            } else {
                this.entry_id = num6;
            }
            String str2 = builder.label_name;
            if (str2 == null) {
                this.label_name = "";
            } else {
                this.label_name = str2;
            }
            Integer num7 = builder.sort_type;
            if (num7 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = num7;
                return;
            }
        }
        this.f68535common = builder.f68536common;
        this.entry_name = builder.entry_name;
        this.pn = builder.pn;
        this.ps = builder.ps;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.entry_id = builder.entry_id;
        this.label_name = builder.label_name;
        this.sort_type = builder.sort_type;
    }
}
