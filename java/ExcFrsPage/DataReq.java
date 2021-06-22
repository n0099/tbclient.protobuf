package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72688common;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long last_rank;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long tag_code;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Long DEFAULT_LAST_RANK = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72689common;
        public Long last_rank;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Long tag_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72689common = dataReq.f72688common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.tag_code = dataReq.tag_code;
            this.pn = dataReq.pn;
            this.last_rank = dataReq.last_rank;
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
            this.f72688common = builder.f72689common;
            Integer num = builder.scr_w;
            if (num == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num;
            }
            Integer num2 = builder.scr_h;
            if (num2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num2;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num3 = builder.q_type;
            if (num3 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num3;
            }
            Long l = builder.tag_code;
            if (l == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = l;
            }
            Integer num4 = builder.pn;
            if (num4 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num4;
            }
            Long l2 = builder.last_rank;
            if (l2 == null) {
                this.last_rank = DEFAULT_LAST_RANK;
                return;
            } else {
                this.last_rank = l2;
                return;
            }
        }
        this.f72688common = builder.f72689common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.tag_code = builder.tag_code;
        this.pn = builder.pn;
        this.last_rank = builder.last_rank;
    }
}
