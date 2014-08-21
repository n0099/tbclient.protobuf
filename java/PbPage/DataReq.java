package tbclient.PbPage;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_MSG_CLICK = "";
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer arround;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer back;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer banner;
    @ProtoField(tag = 25)
    public final CommonReq common;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer floor_rn;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_NATIVE_PAY, type = Message.Datatype.INT32)
    public final Integer last;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String lastids;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer lz;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer mark;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer message_id;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String msg_click;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pb_rn;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long pid;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer r;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer s_model;
    @ProtoField(tag = 16, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer weipost;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer with_floor;
    public static final Integer DEFAULT_PB_RN = 0;
    public static final Integer DEFAULT_MARK = 0;
    public static final Integer DEFAULT_BACK = 0;
    public static final Long DEFAULT_KZ = 0L;
    public static final Integer DEFAULT_LZ = 0;
    public static final Integer DEFAULT_R = 0;
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_WITH_FLOOR = 0;
    public static final Integer DEFAULT_FLOOR_RN = 0;
    public static final Integer DEFAULT_WEIPOST = 0;
    public static final Integer DEFAULT_MESSAGE_ID = 0;
    public static final Integer DEFAULT_S_MODEL = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Integer DEFAULT_BANNER = 0;
    public static final Integer DEFAULT_ARROUND = 0;
    public static final Integer DEFAULT_LAST = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pb_rn == null) {
                this.pb_rn = DEFAULT_PB_RN;
            } else {
                this.pb_rn = builder.pb_rn;
            }
            if (builder.mark == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = builder.mark;
            }
            if (builder.back == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = builder.back;
            }
            if (builder.kz == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = builder.kz;
            }
            if (builder.lz == null) {
                this.lz = DEFAULT_LZ;
            } else {
                this.lz = builder.lz;
            }
            if (builder.r == null) {
                this.r = DEFAULT_R;
            } else {
                this.r = builder.r;
            }
            if (builder.pid == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = builder.pid;
            }
            if (builder.with_floor == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = builder.with_floor;
            }
            if (builder.floor_rn == null) {
                this.floor_rn = DEFAULT_FLOOR_RN;
            } else {
                this.floor_rn = builder.floor_rn;
            }
            if (builder.weipost == null) {
                this.weipost = DEFAULT_WEIPOST;
            } else {
                this.weipost = builder.weipost;
            }
            if (builder.message_id == null) {
                this.message_id = DEFAULT_MESSAGE_ID;
            } else {
                this.message_id = builder.message_id;
            }
            if (builder.s_model == null) {
                this.s_model = DEFAULT_S_MODEL;
            } else {
                this.s_model = builder.s_model;
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
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            if (builder.banner == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = builder.banner;
            }
            if (builder.arround == null) {
                this.arround = DEFAULT_ARROUND;
            } else {
                this.arround = builder.arround;
            }
            if (builder.last == null) {
                this.last = DEFAULT_LAST;
            } else {
                this.last = builder.last;
            }
            if (builder.msg_click == null) {
                this.msg_click = "";
            } else {
                this.msg_click = builder.msg_click;
            }
            this.common = builder.common;
            if (builder.lastids == null) {
                this.lastids = "";
                return;
            } else {
                this.lastids = builder.lastids;
                return;
            }
        }
        this.pb_rn = builder.pb_rn;
        this.mark = builder.mark;
        this.back = builder.back;
        this.kz = builder.kz;
        this.lz = builder.lz;
        this.r = builder.r;
        this.pid = builder.pid;
        this.with_floor = builder.with_floor;
        this.floor_rn = builder.floor_rn;
        this.weipost = builder.weipost;
        this.message_id = builder.message_id;
        this.s_model = builder.s_model;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.pn = builder.pn;
        this.st_type = builder.st_type;
        this.thread_type = builder.thread_type;
        this.banner = builder.banner;
        this.arround = builder.arround;
        this.last = builder.last;
        this.msg_click = builder.msg_click;
        this.common = builder.common;
        this.lastids = builder.lastids;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public Integer arround;
        public Integer back;
        public Integer banner;
        public CommonReq common;
        public Integer floor_rn;
        public Long kz;
        public Integer last;
        public String lastids;
        public Integer lz;
        public Integer mark;
        public Integer message_id;
        public String msg_click;
        public Integer pb_rn;
        public Long pid;
        public Integer pn;
        public Integer q_type;
        public Integer r;
        public Integer rn;
        public Integer s_model;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String st_type;
        public Integer thread_type;
        public Integer weipost;
        public Integer with_floor;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.pb_rn = dataReq.pb_rn;
                this.mark = dataReq.mark;
                this.back = dataReq.back;
                this.kz = dataReq.kz;
                this.lz = dataReq.lz;
                this.r = dataReq.r;
                this.pid = dataReq.pid;
                this.with_floor = dataReq.with_floor;
                this.floor_rn = dataReq.floor_rn;
                this.weipost = dataReq.weipost;
                this.message_id = dataReq.message_id;
                this.s_model = dataReq.s_model;
                this.rn = dataReq.rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.pn = dataReq.pn;
                this.st_type = dataReq.st_type;
                this.thread_type = dataReq.thread_type;
                this.banner = dataReq.banner;
                this.arround = dataReq.arround;
                this.last = dataReq.last;
                this.msg_click = dataReq.msg_click;
                this.common = dataReq.common;
                this.lastids = dataReq.lastids;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
