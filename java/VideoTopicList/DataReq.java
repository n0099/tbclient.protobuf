package tbclient.VideoTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_Q_TYPE = "";
    public static final String DEFAULT_SCR_DIP = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5388common;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long pn;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String q_type;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer topic_id;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_TOPIC_ID = 0;
    public static final Long DEFAULT_PN = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5388common = builder.f5389common;
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
                this.q_type = "";
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = "";
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.f5388common = builder.f5389common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.rn = builder.rn;
        this.topic_id = builder.topic_id;
        this.pn = builder.pn;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5389common;
        public Long pn;
        public String q_type;
        public Integer rn;
        public String scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer topic_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5389common = dataReq.f5388common;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.scr_dip = dataReq.scr_dip;
                this.rn = dataReq.rn;
                this.topic_id = dataReq.topic_id;
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
