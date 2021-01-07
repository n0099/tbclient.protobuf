package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14806common;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer limit;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long q_type;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Long DEFAULT_Q_TYPE = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_LIMIT = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14806common = builder.f14807common;
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
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.limit == null) {
                this.limit = DEFAULT_LIMIT;
                return;
            } else {
                this.limit = builder.limit;
                return;
            }
        }
        this.f14806common = builder.f14807common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.type = builder.type;
        this.pn = builder.pn;
        this.limit = builder.limit;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14807common;
        public Integer limit;
        public Integer pn;
        public Long q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14807common = dataReq.f14806common;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.type = dataReq.type;
                this.pn = dataReq.pn;
                this.limit = dataReq.limit;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
