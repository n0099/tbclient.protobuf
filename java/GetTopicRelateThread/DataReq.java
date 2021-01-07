package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14882common;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long last_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_no;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer pmy_source;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long pmy_topic_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_name;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_PAGE_NO = 0;
    public static final Long DEFAULT_LAST_ID = 0L;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Long DEFAULT_PMY_TOPIC_ID = 0L;
    public static final Integer DEFAULT_PMY_SOURCE = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14882common = builder.f14883common;
            if (builder.topic_id == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = builder.topic_id;
            }
            if (builder.topic_name == null) {
                this.topic_name = "";
            } else {
                this.topic_name = builder.topic_name;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.page_no == null) {
                this.page_no = DEFAULT_PAGE_NO;
            } else {
                this.page_no = builder.page_no;
            }
            if (builder.last_id == null) {
                this.last_id = DEFAULT_LAST_ID;
            } else {
                this.last_id = builder.last_id;
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
            if (builder.pmy_topic_id == null) {
                this.pmy_topic_id = DEFAULT_PMY_TOPIC_ID;
            } else {
                this.pmy_topic_id = builder.pmy_topic_id;
            }
            if (builder.pmy_source == null) {
                this.pmy_source = DEFAULT_PMY_SOURCE;
            } else {
                this.pmy_source = builder.pmy_source;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = builder.sort_type;
                return;
            }
        }
        this.f14882common = builder.f14883common;
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.rn = builder.rn;
        this.page_no = builder.page_no;
        this.last_id = builder.last_id;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.pmy_topic_id = builder.pmy_topic_id;
        this.pmy_source = builder.pmy_source;
        this.sort_type = builder.sort_type;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14883common;
        public Long last_id;
        public Integer page_no;
        public Integer pmy_source;
        public Long pmy_topic_id;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;
        public Long topic_id;
        public String topic_name;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14883common = dataReq.f14882common;
                this.topic_id = dataReq.topic_id;
                this.topic_name = dataReq.topic_name;
                this.rn = dataReq.rn;
                this.page_no = dataReq.page_no;
                this.last_id = dataReq.last_id;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.pmy_topic_id = dataReq.pmy_topic_id;
                this.pmy_source = dataReq.pmy_source;
                this.sort_type = dataReq.sort_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
