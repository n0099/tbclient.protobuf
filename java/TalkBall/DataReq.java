package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long last_thread_id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Long DEFAULT_LAST_THREAD_ID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_PN = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
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
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.last_thread_id == null) {
                this.last_thread_id = DEFAULT_LAST_THREAD_ID;
            } else {
                this.last_thread_id = builder.last_thread_id;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.common = builder.common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.forum_name = builder.forum_name;
        this.last_thread_id = builder.last_thread_id;
        this.rn = builder.rn;
        this.pn = builder.pn;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String forum_name;
        public Long last_thread_id;
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
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.forum_name = dataReq.forum_name;
                this.last_thread_id = dataReq.last_thread_id;
                this.rn = dataReq.rn;
                this.pn = dataReq.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
