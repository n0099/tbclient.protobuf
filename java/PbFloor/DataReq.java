package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final String DEFAULT_ORI_UGC_VID = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_TOP_UGC_PID = "";
    @ProtoField(tag = 9)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1445common;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long pid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long spid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String top_ugc_pid;
    public static final Long DEFAULT_KZ = 0L;
    public static final Long DEFAULT_PID = 0L;
    public static final Long DEFAULT_SPID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_ORI_UGC_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1446common;
        public Long forum_id;
        public Integer is_comm_reverse;
        public Long kz;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;
        public Long pid;
        public Integer pn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Long spid;
        public String st_type;
        public String top_ugc_pid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.kz = dataReq.kz;
            this.pid = dataReq.pid;
            this.spid = dataReq.spid;
            this.pn = dataReq.pn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.st_type = dataReq.st_type;
            this.f1446common = dataReq.f1445common;
            this.is_comm_reverse = dataReq.is_comm_reverse;
            this.forum_id = dataReq.forum_id;
            this.ori_ugc_nid = dataReq.ori_ugc_nid;
            this.ori_ugc_tid = dataReq.ori_ugc_tid;
            this.ori_ugc_type = dataReq.ori_ugc_type;
            this.ori_ugc_vid = dataReq.ori_ugc_vid;
            this.top_ugc_pid = dataReq.top_ugc_pid;
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
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Long l2 = builder.pid;
            if (l2 == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l2;
            }
            Long l3 = builder.spid;
            if (l3 == null) {
                this.spid = DEFAULT_SPID;
            } else {
                this.spid = l3;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            this.f1445common = builder.f1446common;
            Integer num4 = builder.is_comm_reverse;
            if (num4 == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = num4;
            }
            Long l4 = builder.forum_id;
            if (l4 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l4;
            }
            String str2 = builder.ori_ugc_nid;
            if (str2 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str2;
            }
            String str3 = builder.ori_ugc_tid;
            if (str3 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str3;
            }
            Integer num5 = builder.ori_ugc_type;
            if (num5 == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = num5;
            }
            String str4 = builder.ori_ugc_vid;
            if (str4 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str4;
            }
            String str5 = builder.top_ugc_pid;
            if (str5 == null) {
                this.top_ugc_pid = "";
                return;
            } else {
                this.top_ugc_pid = str5;
                return;
            }
        }
        this.kz = builder.kz;
        this.pid = builder.pid;
        this.spid = builder.spid;
        this.pn = builder.pn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.st_type = builder.st_type;
        this.f1445common = builder.f1446common;
        this.is_comm_reverse = builder.is_comm_reverse;
        this.forum_id = builder.forum_id;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.top_ugc_pid = builder.top_ugc_pid;
    }
}
