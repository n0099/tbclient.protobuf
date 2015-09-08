package tbclient.PbPage;

import com.baidu.location.a0;
import com.baidu.tbadk.TbConfig;
import com.baidu.tbadk.core.data.LiveCardData;
import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_MSG_CLICK = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_QUERY_WORD = "";
    public static final String DEFAULT_ST_FROM = "";
    public static final String DEFAULT_ST_LINK = "";
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer arround;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer back;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer banner;
    @ProtoField(tag = 25)
    public final CommonReq common;
    @ProtoField(tag = a0.e, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer floor_rn;
    @ProtoField(tag = LiveCardData.LIVETYPE_PHOTOLIVE, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;
    @ProtoField(tag = 34, type = Message.Datatype.INT32)
    public final Integer is_jumpfloor;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer issdk;
    @ProtoField(tag = TbConfig.FRS_NOABSTRACT_ITEM_NUMBER, type = Message.Datatype.INT32)
    public final Integer jumpfloor_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
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
    @ProtoField(tag = a0.f29case, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String query_word;
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
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String st_from;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String st_link;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_PUSH_RECOMMEND_PB, type = Message.Datatype.INT32)
    public final Integer st_stat;
    @ProtoField(tag = 30, type = Message.Datatype.INT64)
    public final Long st_task;
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
    public static final Integer DEFAULT_ST_STAT = 0;
    public static final Long DEFAULT_ST_TASK = 0L;
    public static final Integer DEFAULT_ISSDK = 0;
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;
    public static final Integer DEFAULT_IS_JUMPFLOOR = 0;
    public static final Integer DEFAULT_JUMPFLOOR_NUM = 0;

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
            } else {
                this.lastids = builder.lastids;
            }
            if (builder.st_from == null) {
                this.st_from = "";
            } else {
                this.st_from = builder.st_from;
            }
            if (builder.st_link == null) {
                this.st_link = "";
            } else {
                this.st_link = builder.st_link;
            }
            if (builder.st_stat == null) {
                this.st_stat = DEFAULT_ST_STAT;
            } else {
                this.st_stat = builder.st_stat;
            }
            if (builder.st_task == null) {
                this.st_task = DEFAULT_ST_TASK;
            } else {
                this.st_task = builder.st_task;
            }
            if (builder.issdk == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = builder.issdk;
            }
            if (builder.query_word == null) {
                this.query_word = "";
            } else {
                this.query_word = builder.query_word;
            }
            if (builder.is_comm_reverse == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = builder.is_comm_reverse;
            }
            if (builder.is_jumpfloor == null) {
                this.is_jumpfloor = DEFAULT_IS_JUMPFLOOR;
            } else {
                this.is_jumpfloor = builder.is_jumpfloor;
            }
            if (builder.jumpfloor_num == null) {
                this.jumpfloor_num = DEFAULT_JUMPFLOOR_NUM;
            } else {
                this.jumpfloor_num = builder.jumpfloor_num;
            }
            if (builder.da_idfa == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = builder.da_idfa;
            }
            if (builder.platform == null) {
                this.platform = "";
                return;
            } else {
                this.platform = builder.platform;
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
        this.st_from = builder.st_from;
        this.st_link = builder.st_link;
        this.st_stat = builder.st_stat;
        this.st_task = builder.st_task;
        this.issdk = builder.issdk;
        this.query_word = builder.query_word;
        this.is_comm_reverse = builder.is_comm_reverse;
        this.is_jumpfloor = builder.is_jumpfloor;
        this.jumpfloor_num = builder.jumpfloor_num;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer arround;
        public Integer back;
        public Integer banner;
        public CommonReq common;
        public String da_idfa;
        public Integer floor_rn;
        public Integer is_comm_reverse;
        public Integer is_jumpfloor;
        public Integer issdk;
        public Integer jumpfloor_num;
        public Long kz;
        public Integer last;
        public String lastids;
        public Integer lz;
        public Integer mark;
        public Integer message_id;
        public String msg_click;
        public Integer pb_rn;
        public Long pid;
        public String platform;
        public Integer pn;
        public Integer q_type;
        public String query_word;
        public Integer r;
        public Integer rn;
        public Integer s_model;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String st_from;
        public String st_link;
        public Integer st_stat;
        public Long st_task;
        public String st_type;
        public Integer thread_type;
        public Integer weipost;
        public Integer with_floor;

        public Builder() {
        }

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
                this.st_from = dataReq.st_from;
                this.st_link = dataReq.st_link;
                this.st_stat = dataReq.st_stat;
                this.st_task = dataReq.st_task;
                this.issdk = dataReq.issdk;
                this.query_word = dataReq.query_word;
                this.is_comm_reverse = dataReq.is_comm_reverse;
                this.is_jumpfloor = dataReq.is_jumpfloor;
                this.jumpfloor_num = dataReq.jumpfloor_num;
                this.da_idfa = dataReq.da_idfa;
                this.platform = dataReq.platform;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
