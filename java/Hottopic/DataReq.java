package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes20.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FIRST_DIR = "";
    public static final String DEFAULT_SECOND_DIR = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1150common;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String first_dir;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String second_dir;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 13, type = Message.Datatype.UINT64)
    public final Long topic_tid;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_CALL_FROM = 0;
    public static final Long DEFAULT_TOPIC_TID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1150common = builder.f1151common;
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
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.first_dir == null) {
                this.first_dir = "";
            } else {
                this.first_dir = builder.first_dir;
            }
            if (builder.second_dir == null) {
                this.second_dir = "";
            } else {
                this.second_dir = builder.second_dir;
            }
            if (builder.call_from == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = builder.call_from;
            }
            if (builder.topic_tid == null) {
                this.topic_tid = DEFAULT_TOPIC_TID;
                return;
            } else {
                this.topic_tid = builder.topic_tid;
                return;
            }
        }
        this.f1150common = builder.f1151common;
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.sort_type = builder.sort_type;
        this.fid = builder.fid;
        this.first_dir = builder.first_dir;
        this.second_dir = builder.second_dir;
        this.call_from = builder.call_from;
        this.topic_tid = builder.topic_tid;
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1151common;
        public Long fid;
        public String first_dir;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String second_dir;
        public Integer sort_type;
        public Long topic_id;
        public String topic_name;
        public Long topic_tid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1151common = dataReq.f1150common;
                this.topic_id = dataReq.topic_id;
                this.topic_name = dataReq.topic_name;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.sort_type = dataReq.sort_type;
                this.fid = dataReq.fid;
                this.first_dir = dataReq.first_dir;
                this.second_dir = dataReq.second_dir;
                this.call_from = dataReq.call_from;
                this.topic_tid = dataReq.topic_tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
