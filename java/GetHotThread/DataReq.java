package tbclient.GetHotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 11)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer need_abstract;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer need_photo_pic;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer order_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_ORDER_TYPE = 0;
    public static final Integer DEFAULT_NEED_ABSTRACT = 0;
    public static final Integer DEFAULT_NEED_PHOTO_PIC = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.order_type == null) {
                this.order_type = DEFAULT_ORDER_TYPE;
            } else {
                this.order_type = builder.order_type;
            }
            if (builder.need_abstract == null) {
                this.need_abstract = DEFAULT_NEED_ABSTRACT;
            } else {
                this.need_abstract = builder.need_abstract;
            }
            if (builder.need_photo_pic == null) {
                this.need_photo_pic = DEFAULT_NEED_PHOTO_PIC;
            } else {
                this.need_photo_pic = builder.need_photo_pic;
            }
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
            this.common = builder.common;
            return;
        }
        this.forum_id = builder.forum_id;
        this.order_type = builder.order_type;
        this.need_abstract = builder.need_abstract;
        this.need_photo_pic = builder.need_photo_pic;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long forum_id;
        public Integer need_abstract;
        public Integer need_photo_pic;
        public Integer order_type;
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
                this.forum_id = dataReq.forum_id;
                this.order_type = dataReq.order_type;
                this.need_abstract = dataReq.need_abstract;
                this.need_photo_pic = dataReq.need_photo_pic;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
