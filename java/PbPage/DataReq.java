package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_CALL_URL = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FEED_NID = "";
    public static final String DEFAULT_JFROM = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_MSG_CLICK = "";
    public static final String DEFAULT_OBJ_LOCATE = "";
    public static final String DEFAULT_OBJ_PARAM1 = "";
    public static final String DEFAULT_OBJ_SOURCE = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final String DEFAULT_ORI_UGC_VID = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_QUERY_WORD = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    public static final String DEFAULT_ST_FROM = "";
    public static final String DEFAULT_ST_LINK = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_UP_SCHEMA = "";
    public static final String DEFAULT_YUELAOU_LOCATE = "";
    public static final String DEFAULT_YUELAOU_PARAMS = "";
    @ProtoField(tag = 68, type = Message.Datatype.STRING)
    public final String ad_context_list;
    @ProtoField(tag = 72, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 58)
    public final AdParam ad_param;
    @ProtoField(tag = 53)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 77)
    public final AppTransmitData app_transmit_data;
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer arround;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer back;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer banner;
    @ProtoField(tag = 73, type = Message.Datatype.INT64)
    public final Long broadcast_id;
    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String call_url;
    @ProtoField(tag = 25)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1454common;
    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 55, type = Message.Datatype.STRING)
    public final String feed_nid;
    @ProtoField(tag = 45, type = Message.Datatype.UINT64)
    public final Long fid;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer floor_rn;
    @ProtoField(tag = 74, type = Message.Datatype.INT32)
    public final Integer floor_sort_type;
    @ProtoField(tag = 56, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 71, type = Message.Datatype.INT32)
    public final Integer from_push;
    @ProtoField(tag = 54, type = Message.Datatype.UINT32)
    public final Integer from_smart_frs;
    @ProtoField(tag = 76, type = Message.Datatype.INT32)
    public final Integer immersion_video_comment_source;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;
    @ProtoField(tag = 79, type = Message.Datatype.INT32)
    public final Integer is_edit_comment_req;
    @ProtoField(tag = 78, type = Message.Datatype.INT32)
    public final Integer is_fold_comment_req;
    @ProtoField(tag = 34, type = Message.Datatype.INT32)
    public final Integer is_jumpfloor;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer issdk;
    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String jfrom;
    @ProtoField(tag = 44, type = Message.Datatype.UINT64)
    public final Long jid;
    @ProtoField(tag = 35, type = Message.Datatype.INT32)
    public final Integer jumpfloor_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer last;
    @ProtoField(tag = 81, type = Message.Datatype.INT64)
    public final Long last_pid;
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
    @ProtoField(tag = 59, type = Message.Datatype.INT32)
    public final Integer need_log;
    @ProtoField(tag = 57, type = Message.Datatype.INT32)
    public final Integer need_repost_recommend_forum;
    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String obj_locate;
    @ProtoField(tag = 52, type = Message.Datatype.STRING)
    public final String obj_param1;
    @ProtoField(tag = 50, type = Message.Datatype.STRING)
    public final String obj_source;
    @ProtoField(tag = 62, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 63, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 65, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;
    @ProtoField(tag = 66, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pb_rn;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long pid;
    @ProtoField(tag = 43, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String query_word;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer r;
    @ProtoField(tag = 80, type = Message.Datatype.INT32)
    public final Integer request_times;
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
    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String shoubai_cuid;
    @ProtoField(tag = 82, type = Message.Datatype.INT32)
    public final Integer similar_from;
    @ProtoField(tag = 75, type = Message.Datatype.INT32)
    public final Integer source_type;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String st_from;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String st_link;
    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer st_stat;
    @ProtoField(tag = 30, type = Message.Datatype.INT64)
    public final Long st_task;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 69, type = Message.Datatype.STRING)
    public final String up_schema;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer weipost;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer with_floor;
    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String yuelaou_locate;
    @ProtoField(tag = 48, type = Message.Datatype.STRING)
    public final String yuelaou_params;
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
    public static final Long DEFAULT_JID = 0L;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_FROM_SMART_FRS = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_NEED_REPOST_RECOMMEND_FORUM = 0;
    public static final Integer DEFAULT_NEED_LOG = 0;
    public static final Integer DEFAULT_ORI_UGC_TYPE = 0;
    public static final Integer DEFAULT_FROM_PUSH = 0;
    public static final Long DEFAULT_BROADCAST_ID = 0L;
    public static final Integer DEFAULT_FLOOR_SORT_TYPE = 0;
    public static final Integer DEFAULT_SOURCE_TYPE = 0;
    public static final Integer DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE = 0;
    public static final Integer DEFAULT_IS_FOLD_COMMENT_REQ = 0;
    public static final Integer DEFAULT_IS_EDIT_COMMENT_REQ = 0;
    public static final Integer DEFAULT_REQUEST_TIMES = 0;
    public static final Long DEFAULT_LAST_PID = 0L;
    public static final Integer DEFAULT_SIMILAR_FROM = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_context_list;
        public String ad_ext_params;
        public AdParam ad_param;
        public AppPosInfo app_pos;
        public AppTransmitData app_transmit_data;
        public Integer arround;
        public Integer back;
        public Integer banner;
        public Long broadcast_id;
        public String call_url;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1455common;
        public String da_idfa;
        public String feed_nid;
        public Long fid;
        public Integer floor_rn;
        public Integer floor_sort_type;
        public Long forum_id;
        public Integer from_push;
        public Integer from_smart_frs;
        public Integer immersion_video_comment_source;
        public Integer is_comm_reverse;
        public Integer is_edit_comment_req;
        public Integer is_fold_comment_req;
        public Integer is_jumpfloor;
        public Integer issdk;
        public String jfrom;
        public Long jid;
        public Integer jumpfloor_num;
        public Long kz;
        public Integer last;
        public Long last_pid;
        public String lastids;
        public Integer lz;
        public Integer mark;
        public Integer message_id;
        public String msg_click;
        public Integer need_log;
        public Integer need_repost_recommend_forum;
        public String obj_locate;
        public String obj_param1;
        public String obj_source;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;
        public Integer pb_rn;
        public Long pid;
        public String platform;
        public Integer pn;
        public Integer q_type;
        public String query_word;
        public Integer r;
        public Integer request_times;
        public Integer rn;
        public Integer s_model;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String shoubai_cuid;
        public Integer similar_from;
        public Integer source_type;
        public String st_from;
        public String st_link;
        public Integer st_stat;
        public Long st_task;
        public String st_type;
        public Integer thread_type;
        public String up_schema;
        public Integer weipost;
        public Integer with_floor;
        public String yuelaou_locate;
        public String yuelaou_params;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
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
            this.f1455common = dataReq.f1454common;
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
            this.jid = dataReq.jid;
            this.fid = dataReq.fid;
            this.jfrom = dataReq.jfrom;
            this.yuelaou_locate = dataReq.yuelaou_locate;
            this.yuelaou_params = dataReq.yuelaou_params;
            this.obj_source = dataReq.obj_source;
            this.obj_locate = dataReq.obj_locate;
            this.obj_param1 = dataReq.obj_param1;
            this.app_pos = dataReq.app_pos;
            this.from_smart_frs = dataReq.from_smart_frs;
            this.feed_nid = dataReq.feed_nid;
            this.forum_id = dataReq.forum_id;
            this.need_repost_recommend_forum = dataReq.need_repost_recommend_forum;
            this.ad_param = dataReq.ad_param;
            this.need_log = dataReq.need_log;
            this.call_url = dataReq.call_url;
            this.shoubai_cuid = dataReq.shoubai_cuid;
            this.ori_ugc_nid = dataReq.ori_ugc_nid;
            this.ori_ugc_tid = dataReq.ori_ugc_tid;
            this.ori_ugc_type = dataReq.ori_ugc_type;
            this.ori_ugc_vid = dataReq.ori_ugc_vid;
            this.ad_context_list = dataReq.ad_context_list;
            this.up_schema = dataReq.up_schema;
            this.from_push = dataReq.from_push;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.broadcast_id = dataReq.broadcast_id;
            this.floor_sort_type = dataReq.floor_sort_type;
            this.source_type = dataReq.source_type;
            this.immersion_video_comment_source = dataReq.immersion_video_comment_source;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.is_fold_comment_req = dataReq.is_fold_comment_req;
            this.is_edit_comment_req = dataReq.is_edit_comment_req;
            this.request_times = dataReq.request_times;
            this.last_pid = dataReq.last_pid;
            this.similar_from = dataReq.similar_from;
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
            Integer num = builder.pb_rn;
            if (num == null) {
                this.pb_rn = DEFAULT_PB_RN;
            } else {
                this.pb_rn = num;
            }
            Integer num2 = builder.mark;
            if (num2 == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = num2;
            }
            Integer num3 = builder.back;
            if (num3 == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = num3;
            }
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Integer num4 = builder.lz;
            if (num4 == null) {
                this.lz = DEFAULT_LZ;
            } else {
                this.lz = num4;
            }
            Integer num5 = builder.r;
            if (num5 == null) {
                this.r = DEFAULT_R;
            } else {
                this.r = num5;
            }
            Long l2 = builder.pid;
            if (l2 == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l2;
            }
            Integer num6 = builder.with_floor;
            if (num6 == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = num6;
            }
            Integer num7 = builder.floor_rn;
            if (num7 == null) {
                this.floor_rn = DEFAULT_FLOOR_RN;
            } else {
                this.floor_rn = num7;
            }
            Integer num8 = builder.weipost;
            if (num8 == null) {
                this.weipost = DEFAULT_WEIPOST;
            } else {
                this.weipost = num8;
            }
            Integer num9 = builder.message_id;
            if (num9 == null) {
                this.message_id = DEFAULT_MESSAGE_ID;
            } else {
                this.message_id = num9;
            }
            Integer num10 = builder.s_model;
            if (num10 == null) {
                this.s_model = DEFAULT_S_MODEL;
            } else {
                this.s_model = num10;
            }
            Integer num11 = builder.rn;
            if (num11 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num11;
            }
            Integer num12 = builder.scr_w;
            if (num12 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num12;
            }
            Integer num13 = builder.scr_h;
            if (num13 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num13;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num14 = builder.q_type;
            if (num14 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num14;
            }
            Integer num15 = builder.pn;
            if (num15 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num15;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            Integer num16 = builder.thread_type;
            if (num16 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num16;
            }
            Integer num17 = builder.banner;
            if (num17 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = num17;
            }
            Integer num18 = builder.arround;
            if (num18 == null) {
                this.arround = DEFAULT_ARROUND;
            } else {
                this.arround = num18;
            }
            Integer num19 = builder.last;
            if (num19 == null) {
                this.last = DEFAULT_LAST;
            } else {
                this.last = num19;
            }
            String str2 = builder.msg_click;
            if (str2 == null) {
                this.msg_click = "";
            } else {
                this.msg_click = str2;
            }
            this.f1454common = builder.f1455common;
            String str3 = builder.lastids;
            if (str3 == null) {
                this.lastids = "";
            } else {
                this.lastids = str3;
            }
            String str4 = builder.st_from;
            if (str4 == null) {
                this.st_from = "";
            } else {
                this.st_from = str4;
            }
            String str5 = builder.st_link;
            if (str5 == null) {
                this.st_link = "";
            } else {
                this.st_link = str5;
            }
            Integer num20 = builder.st_stat;
            if (num20 == null) {
                this.st_stat = DEFAULT_ST_STAT;
            } else {
                this.st_stat = num20;
            }
            Long l3 = builder.st_task;
            if (l3 == null) {
                this.st_task = DEFAULT_ST_TASK;
            } else {
                this.st_task = l3;
            }
            Integer num21 = builder.issdk;
            if (num21 == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = num21;
            }
            String str6 = builder.query_word;
            if (str6 == null) {
                this.query_word = "";
            } else {
                this.query_word = str6;
            }
            Integer num22 = builder.is_comm_reverse;
            if (num22 == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = num22;
            }
            Integer num23 = builder.is_jumpfloor;
            if (num23 == null) {
                this.is_jumpfloor = DEFAULT_IS_JUMPFLOOR;
            } else {
                this.is_jumpfloor = num23;
            }
            Integer num24 = builder.jumpfloor_num;
            if (num24 == null) {
                this.jumpfloor_num = DEFAULT_JUMPFLOOR_NUM;
            } else {
                this.jumpfloor_num = num24;
            }
            String str7 = builder.da_idfa;
            if (str7 == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = str7;
            }
            String str8 = builder.platform;
            if (str8 == null) {
                this.platform = "";
            } else {
                this.platform = str8;
            }
            Long l4 = builder.jid;
            if (l4 == null) {
                this.jid = DEFAULT_JID;
            } else {
                this.jid = l4;
            }
            Long l5 = builder.fid;
            if (l5 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l5;
            }
            String str9 = builder.jfrom;
            if (str9 == null) {
                this.jfrom = "";
            } else {
                this.jfrom = str9;
            }
            String str10 = builder.yuelaou_locate;
            if (str10 == null) {
                this.yuelaou_locate = "";
            } else {
                this.yuelaou_locate = str10;
            }
            String str11 = builder.yuelaou_params;
            if (str11 == null) {
                this.yuelaou_params = "";
            } else {
                this.yuelaou_params = str11;
            }
            String str12 = builder.obj_source;
            if (str12 == null) {
                this.obj_source = "";
            } else {
                this.obj_source = str12;
            }
            String str13 = builder.obj_locate;
            if (str13 == null) {
                this.obj_locate = "";
            } else {
                this.obj_locate = str13;
            }
            String str14 = builder.obj_param1;
            if (str14 == null) {
                this.obj_param1 = "";
            } else {
                this.obj_param1 = str14;
            }
            this.app_pos = builder.app_pos;
            Integer num25 = builder.from_smart_frs;
            if (num25 == null) {
                this.from_smart_frs = DEFAULT_FROM_SMART_FRS;
            } else {
                this.from_smart_frs = num25;
            }
            String str15 = builder.feed_nid;
            if (str15 == null) {
                this.feed_nid = "";
            } else {
                this.feed_nid = str15;
            }
            Long l6 = builder.forum_id;
            if (l6 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l6;
            }
            Integer num26 = builder.need_repost_recommend_forum;
            if (num26 == null) {
                this.need_repost_recommend_forum = DEFAULT_NEED_REPOST_RECOMMEND_FORUM;
            } else {
                this.need_repost_recommend_forum = num26;
            }
            this.ad_param = builder.ad_param;
            Integer num27 = builder.need_log;
            if (num27 == null) {
                this.need_log = DEFAULT_NEED_LOG;
            } else {
                this.need_log = num27;
            }
            String str16 = builder.call_url;
            if (str16 == null) {
                this.call_url = "";
            } else {
                this.call_url = str16;
            }
            String str17 = builder.shoubai_cuid;
            if (str17 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str17;
            }
            String str18 = builder.ori_ugc_nid;
            if (str18 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str18;
            }
            String str19 = builder.ori_ugc_tid;
            if (str19 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str19;
            }
            Integer num28 = builder.ori_ugc_type;
            if (num28 == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = num28;
            }
            String str20 = builder.ori_ugc_vid;
            if (str20 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str20;
            }
            String str21 = builder.ad_context_list;
            if (str21 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str21;
            }
            String str22 = builder.up_schema;
            if (str22 == null) {
                this.up_schema = "";
            } else {
                this.up_schema = str22;
            }
            Integer num29 = builder.from_push;
            if (num29 == null) {
                this.from_push = DEFAULT_FROM_PUSH;
            } else {
                this.from_push = num29;
            }
            String str23 = builder.ad_ext_params;
            if (str23 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str23;
            }
            Long l7 = builder.broadcast_id;
            if (l7 == null) {
                this.broadcast_id = DEFAULT_BROADCAST_ID;
            } else {
                this.broadcast_id = l7;
            }
            Integer num30 = builder.floor_sort_type;
            if (num30 == null) {
                this.floor_sort_type = DEFAULT_FLOOR_SORT_TYPE;
            } else {
                this.floor_sort_type = num30;
            }
            Integer num31 = builder.source_type;
            if (num31 == null) {
                this.source_type = DEFAULT_SOURCE_TYPE;
            } else {
                this.source_type = num31;
            }
            Integer num32 = builder.immersion_video_comment_source;
            if (num32 == null) {
                this.immersion_video_comment_source = DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE;
            } else {
                this.immersion_video_comment_source = num32;
            }
            this.app_transmit_data = builder.app_transmit_data;
            Integer num33 = builder.is_fold_comment_req;
            if (num33 == null) {
                this.is_fold_comment_req = DEFAULT_IS_FOLD_COMMENT_REQ;
            } else {
                this.is_fold_comment_req = num33;
            }
            Integer num34 = builder.is_edit_comment_req;
            if (num34 == null) {
                this.is_edit_comment_req = DEFAULT_IS_EDIT_COMMENT_REQ;
            } else {
                this.is_edit_comment_req = num34;
            }
            Integer num35 = builder.request_times;
            if (num35 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num35;
            }
            Long l8 = builder.last_pid;
            if (l8 == null) {
                this.last_pid = DEFAULT_LAST_PID;
            } else {
                this.last_pid = l8;
            }
            Integer num36 = builder.similar_from;
            if (num36 == null) {
                this.similar_from = DEFAULT_SIMILAR_FROM;
                return;
            } else {
                this.similar_from = num36;
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
        this.f1454common = builder.f1455common;
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
        this.jid = builder.jid;
        this.fid = builder.fid;
        this.jfrom = builder.jfrom;
        this.yuelaou_locate = builder.yuelaou_locate;
        this.yuelaou_params = builder.yuelaou_params;
        this.obj_source = builder.obj_source;
        this.obj_locate = builder.obj_locate;
        this.obj_param1 = builder.obj_param1;
        this.app_pos = builder.app_pos;
        this.from_smart_frs = builder.from_smart_frs;
        this.feed_nid = builder.feed_nid;
        this.forum_id = builder.forum_id;
        this.need_repost_recommend_forum = builder.need_repost_recommend_forum;
        this.ad_param = builder.ad_param;
        this.need_log = builder.need_log;
        this.call_url = builder.call_url;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.ad_context_list = builder.ad_context_list;
        this.up_schema = builder.up_schema;
        this.from_push = builder.from_push;
        this.ad_ext_params = builder.ad_ext_params;
        this.broadcast_id = builder.broadcast_id;
        this.floor_sort_type = builder.floor_sort_type;
        this.source_type = builder.source_type;
        this.immersion_video_comment_source = builder.immersion_video_comment_source;
        this.app_transmit_data = builder.app_transmit_data;
        this.is_fold_comment_req = builder.is_fold_comment_req;
        this.is_edit_comment_req = builder.is_edit_comment_req;
        this.request_times = builder.request_times;
        this.last_pid = builder.last_pid;
        this.similar_from = builder.similar_from;
    }
}
