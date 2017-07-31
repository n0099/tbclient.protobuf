package tbclient.ForumHeadVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long active_tid;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Long DEFAULT_ACTIVE_TID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
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
            if (builder.active_tid == null) {
                this.active_tid = DEFAULT_ACTIVE_TID;
                return;
            } else {
                this.active_tid = builder.active_tid;
                return;
            }
        }
        this.common = builder.common;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.fid = builder.fid;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.active_tid = builder.active_tid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long active_tid;
        public CommonReq common;
        public Long fid;
        public Integer pn;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.fid = dataReq.fid;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.scr_dip = dataReq.scr_dip;
                this.active_tid = dataReq.active_tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
