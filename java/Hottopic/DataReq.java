package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FIRST_DIR = "";
    public static final String DEFAULT_SECOND_DIR = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1416common;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String first_dir;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_video_topic;
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
    public static final Integer DEFAULT_IS_VIDEO_TOPIC = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1417common;
        public Long fid;
        public String first_dir;
        public Integer is_video_topic;
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
            if (dataReq == null) {
                return;
            }
            this.f1417common = dataReq.f1416common;
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
            this.is_video_topic = dataReq.is_video_topic;
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
            this.f1416common = builder.f1417common;
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
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
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num3 = builder.q_type;
            if (num3 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num3;
            }
            Integer num4 = builder.sort_type;
            if (num4 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num4;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l2;
            }
            String str2 = builder.first_dir;
            if (str2 == null) {
                this.first_dir = "";
            } else {
                this.first_dir = str2;
            }
            String str3 = builder.second_dir;
            if (str3 == null) {
                this.second_dir = "";
            } else {
                this.second_dir = str3;
            }
            Integer num5 = builder.call_from;
            if (num5 == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = num5;
            }
            Long l3 = builder.topic_tid;
            if (l3 == null) {
                this.topic_tid = DEFAULT_TOPIC_TID;
            } else {
                this.topic_tid = l3;
            }
            Integer num6 = builder.is_video_topic;
            if (num6 == null) {
                this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
                return;
            } else {
                this.is_video_topic = num6;
                return;
            }
        }
        this.f1416common = builder.f1417common;
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
        this.is_video_topic = builder.is_video_topic;
    }
}
