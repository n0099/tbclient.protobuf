package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer load_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_tags;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer sug_count;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tag_code;
    public static final Integer DEFAULT_TAG_CODE = 0;
    public static final Integer DEFAULT_NEED_TAGS = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_PAGE_THREAD_COUNT = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SUG_COUNT = 0;
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
            this.common = builder.common;
            if (builder.tag_code == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = builder.tag_code;
            }
            if (builder.need_tags == null) {
                this.need_tags = DEFAULT_NEED_TAGS;
            } else {
                this.need_tags = builder.need_tags;
            }
            if (builder.load_type == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = builder.load_type;
            }
            if (builder.page_thread_count == null) {
                this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
            } else {
                this.page_thread_count = builder.page_thread_count;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.sug_count == null) {
                this.sug_count = DEFAULT_SUG_COUNT;
            } else {
                this.sug_count = builder.sug_count;
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
                return;
            } else {
                this.q_type = builder.q_type;
                return;
            }
        }
        this.common = builder.common;
        this.tag_code = builder.tag_code;
        this.need_tags = builder.need_tags;
        this.load_type = builder.load_type;
        this.page_thread_count = builder.page_thread_count;
        this.pn = builder.pn;
        this.sug_count = builder.sug_count;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer load_type;
        public Integer need_tags;
        public Integer page_thread_count;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sug_count;
        public Integer tag_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.tag_code = dataReq.tag_code;
                this.need_tags = dataReq.need_tags;
                this.load_type = dataReq.load_type;
                this.page_thread_count = dataReq.page_thread_count;
                this.pn = dataReq.pn;
                this.sug_count = dataReq.sug_count;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
