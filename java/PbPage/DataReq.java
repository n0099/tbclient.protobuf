package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_ARROUND;
  
  public static final Integer DEFAULT_BACK;
  
  public static final Integer DEFAULT_BANNER;
  
  public static final Long DEFAULT_BROADCAST_ID;
  
  public static final String DEFAULT_CALL_URL = "";
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final String DEFAULT_FEED_NID = "";
  
  public static final Long DEFAULT_FID;
  
  public static final Integer DEFAULT_FLOOR_RN;
  
  public static final Integer DEFAULT_FLOOR_SORT_TYPE;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_FROM_PUSH;
  
  public static final Integer DEFAULT_FROM_SMART_FRS;
  
  public static final Integer DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE;
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final Integer DEFAULT_IS_COMM_REVERSE;
  
  public static final Integer DEFAULT_IS_EDIT_COMMENT_REQ;
  
  public static final Integer DEFAULT_IS_FOLD_COMMENT_REQ;
  
  public static final Integer DEFAULT_IS_JUMPFLOOR;
  
  public static final String DEFAULT_JFROM = "";
  
  public static final Long DEFAULT_JID;
  
  public static final Integer DEFAULT_JUMPFLOOR_NUM;
  
  public static final Long DEFAULT_KZ;
  
  public static final Integer DEFAULT_LAST;
  
  public static final String DEFAULT_LASTIDS = "";
  
  public static final Integer DEFAULT_LZ;
  
  public static final Integer DEFAULT_MARK;
  
  public static final Integer DEFAULT_MESSAGE_ID;
  
  public static final String DEFAULT_MSG_CLICK = "";
  
  public static final Integer DEFAULT_NEED_LOG;
  
  public static final Integer DEFAULT_NEED_REPOST_RECOMMEND_FORUM;
  
  public static final String DEFAULT_OBJ_LOCATE = "";
  
  public static final String DEFAULT_OBJ_PARAM1 = "";
  
  public static final String DEFAULT_OBJ_SOURCE = "";
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final Integer DEFAULT_ORI_UGC_TYPE;
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final Integer DEFAULT_PB_RN;
  
  public static final Long DEFAULT_PID;
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_QUERY_WORD = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_R;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final Integer DEFAULT_SOURCE_TYPE;
  
  public static final String DEFAULT_ST_FROM = "";
  
  public static final String DEFAULT_ST_LINK = "";
  
  public static final Integer DEFAULT_ST_STAT;
  
  public static final Long DEFAULT_ST_TASK;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Integer DEFAULT_S_MODEL;
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final String DEFAULT_UP_SCHEMA = "";
  
  public static final Integer DEFAULT_WEIPOST;
  
  public static final Integer DEFAULT_WITH_FLOOR;
  
  public static final String DEFAULT_YUELAOU_LOCATE = "";
  
  public static final String DEFAULT_YUELAOU_PARAMS = "";
  
  public transient FieldHolder $fh;
  
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
  public final CommonReq common;
  
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1374404917, "Ltbclient/PbPage/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1374404917, "Ltbclient/PbPage/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PB_RN = integer;
    DEFAULT_MARK = integer;
    DEFAULT_BACK = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_KZ = long_;
    DEFAULT_LZ = integer;
    DEFAULT_R = integer;
    DEFAULT_PID = long_;
    DEFAULT_WITH_FLOOR = integer;
    DEFAULT_FLOOR_RN = integer;
    DEFAULT_WEIPOST = integer;
    DEFAULT_MESSAGE_ID = integer;
    DEFAULT_S_MODEL = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_BANNER = integer;
    DEFAULT_ARROUND = integer;
    DEFAULT_LAST = integer;
    DEFAULT_ST_STAT = integer;
    DEFAULT_ST_TASK = long_;
    DEFAULT_ISSDK = integer;
    DEFAULT_IS_COMM_REVERSE = integer;
    DEFAULT_IS_JUMPFLOOR = integer;
    DEFAULT_JUMPFLOOR_NUM = integer;
    DEFAULT_JID = long_;
    DEFAULT_FID = long_;
    DEFAULT_FROM_SMART_FRS = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_NEED_REPOST_RECOMMEND_FORUM = integer;
    DEFAULT_NEED_LOG = integer;
    DEFAULT_ORI_UGC_TYPE = integer;
    DEFAULT_FROM_PUSH = integer;
    DEFAULT_BROADCAST_ID = long_;
    DEFAULT_FLOOR_SORT_TYPE = integer;
    DEFAULT_SOURCE_TYPE = integer;
    DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE = integer;
    DEFAULT_IS_FOLD_COMMENT_REQ = integer;
    DEFAULT_IS_EDIT_COMMENT_REQ = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer13 = paramBuilder.pb_rn;
      if (integer13 == null) {
        this.pb_rn = DEFAULT_PB_RN;
      } else {
        this.pb_rn = integer13;
      } 
      integer13 = paramBuilder.mark;
      if (integer13 == null) {
        this.mark = DEFAULT_MARK;
      } else {
        this.mark = integer13;
      } 
      integer13 = paramBuilder.back;
      if (integer13 == null) {
        this.back = DEFAULT_BACK;
      } else {
        this.back = integer13;
      } 
      Long long_6 = paramBuilder.kz;
      if (long_6 == null) {
        this.kz = DEFAULT_KZ;
      } else {
        this.kz = long_6;
      } 
      Integer integer12 = paramBuilder.lz;
      if (integer12 == null) {
        this.lz = DEFAULT_LZ;
      } else {
        this.lz = integer12;
      } 
      integer12 = paramBuilder.r;
      if (integer12 == null) {
        this.r = DEFAULT_R;
      } else {
        this.r = integer12;
      } 
      Long long_5 = paramBuilder.pid;
      if (long_5 == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_5;
      } 
      Integer integer11 = paramBuilder.with_floor;
      if (integer11 == null) {
        this.with_floor = DEFAULT_WITH_FLOOR;
      } else {
        this.with_floor = integer11;
      } 
      integer11 = paramBuilder.floor_rn;
      if (integer11 == null) {
        this.floor_rn = DEFAULT_FLOOR_RN;
      } else {
        this.floor_rn = integer11;
      } 
      integer11 = paramBuilder.weipost;
      if (integer11 == null) {
        this.weipost = DEFAULT_WEIPOST;
      } else {
        this.weipost = integer11;
      } 
      integer11 = paramBuilder.message_id;
      if (integer11 == null) {
        this.message_id = DEFAULT_MESSAGE_ID;
      } else {
        this.message_id = integer11;
      } 
      integer11 = paramBuilder.s_model;
      if (integer11 == null) {
        this.s_model = DEFAULT_S_MODEL;
      } else {
        this.s_model = integer11;
      } 
      integer11 = paramBuilder.rn;
      if (integer11 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer11;
      } 
      integer11 = paramBuilder.scr_w;
      if (integer11 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer11;
      } 
      integer11 = paramBuilder.scr_h;
      if (integer11 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer11;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer10 = paramBuilder.q_type;
      if (integer10 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer10;
      } 
      integer10 = paramBuilder.pn;
      if (integer10 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer10;
      } 
      String str9 = paramBuilder.st_type;
      if (str9 == null) {
        this.st_type = "";
      } else {
        this.st_type = str9;
      } 
      Integer integer9 = paramBuilder.thread_type;
      if (integer9 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer9;
      } 
      integer9 = paramBuilder.banner;
      if (integer9 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = integer9;
      } 
      integer9 = paramBuilder.arround;
      if (integer9 == null) {
        this.arround = DEFAULT_ARROUND;
      } else {
        this.arround = integer9;
      } 
      integer9 = paramBuilder.last;
      if (integer9 == null) {
        this.last = DEFAULT_LAST;
      } else {
        this.last = integer9;
      } 
      String str8 = paramBuilder.msg_click;
      if (str8 == null) {
        this.msg_click = "";
      } else {
        this.msg_click = str8;
      } 
      this.common = paramBuilder.common;
      str8 = paramBuilder.lastids;
      if (str8 == null) {
        this.lastids = "";
      } else {
        this.lastids = str8;
      } 
      str8 = paramBuilder.st_from;
      if (str8 == null) {
        this.st_from = "";
      } else {
        this.st_from = str8;
      } 
      str8 = paramBuilder.st_link;
      if (str8 == null) {
        this.st_link = "";
      } else {
        this.st_link = str8;
      } 
      Integer integer8 = paramBuilder.st_stat;
      if (integer8 == null) {
        this.st_stat = DEFAULT_ST_STAT;
      } else {
        this.st_stat = integer8;
      } 
      Long long_4 = paramBuilder.st_task;
      if (long_4 == null) {
        this.st_task = DEFAULT_ST_TASK;
      } else {
        this.st_task = long_4;
      } 
      Integer integer7 = paramBuilder.issdk;
      if (integer7 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer7;
      } 
      String str7 = paramBuilder.query_word;
      if (str7 == null) {
        this.query_word = "";
      } else {
        this.query_word = str7;
      } 
      Integer integer6 = paramBuilder.is_comm_reverse;
      if (integer6 == null) {
        this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
      } else {
        this.is_comm_reverse = integer6;
      } 
      integer6 = paramBuilder.is_jumpfloor;
      if (integer6 == null) {
        this.is_jumpfloor = DEFAULT_IS_JUMPFLOOR;
      } else {
        this.is_jumpfloor = integer6;
      } 
      integer6 = paramBuilder.jumpfloor_num;
      if (integer6 == null) {
        this.jumpfloor_num = DEFAULT_JUMPFLOOR_NUM;
      } else {
        this.jumpfloor_num = integer6;
      } 
      String str6 = paramBuilder.da_idfa;
      if (str6 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str6;
      } 
      str6 = paramBuilder.platform;
      if (str6 == null) {
        this.platform = "";
      } else {
        this.platform = str6;
      } 
      Long long_3 = paramBuilder.jid;
      if (long_3 == null) {
        this.jid = DEFAULT_JID;
      } else {
        this.jid = long_3;
      } 
      long_3 = paramBuilder.fid;
      if (long_3 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_3;
      } 
      String str5 = paramBuilder.jfrom;
      if (str5 == null) {
        this.jfrom = "";
      } else {
        this.jfrom = str5;
      } 
      str5 = paramBuilder.yuelaou_locate;
      if (str5 == null) {
        this.yuelaou_locate = "";
      } else {
        this.yuelaou_locate = str5;
      } 
      str5 = paramBuilder.yuelaou_params;
      if (str5 == null) {
        this.yuelaou_params = "";
      } else {
        this.yuelaou_params = str5;
      } 
      str5 = paramBuilder.obj_source;
      if (str5 == null) {
        this.obj_source = "";
      } else {
        this.obj_source = str5;
      } 
      str5 = paramBuilder.obj_locate;
      if (str5 == null) {
        this.obj_locate = "";
      } else {
        this.obj_locate = str5;
      } 
      str5 = paramBuilder.obj_param1;
      if (str5 == null) {
        this.obj_param1 = "";
      } else {
        this.obj_param1 = str5;
      } 
      this.app_pos = paramBuilder.app_pos;
      Integer integer5 = paramBuilder.from_smart_frs;
      if (integer5 == null) {
        this.from_smart_frs = DEFAULT_FROM_SMART_FRS;
      } else {
        this.from_smart_frs = integer5;
      } 
      String str4 = paramBuilder.feed_nid;
      if (str4 == null) {
        this.feed_nid = "";
      } else {
        this.feed_nid = str4;
      } 
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      Integer integer4 = paramBuilder.need_repost_recommend_forum;
      if (integer4 == null) {
        this.need_repost_recommend_forum = DEFAULT_NEED_REPOST_RECOMMEND_FORUM;
      } else {
        this.need_repost_recommend_forum = integer4;
      } 
      this.ad_param = paramBuilder.ad_param;
      integer4 = paramBuilder.need_log;
      if (integer4 == null) {
        this.need_log = DEFAULT_NEED_LOG;
      } else {
        this.need_log = integer4;
      } 
      String str3 = paramBuilder.call_url;
      if (str3 == null) {
        this.call_url = "";
      } else {
        this.call_url = str3;
      } 
      str3 = paramBuilder.shoubai_cuid;
      if (str3 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str3;
      } 
      str3 = paramBuilder.ori_ugc_nid;
      if (str3 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str3;
      } 
      str3 = paramBuilder.ori_ugc_tid;
      if (str3 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str3;
      } 
      Integer integer3 = paramBuilder.ori_ugc_type;
      if (integer3 == null) {
        this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
      } else {
        this.ori_ugc_type = integer3;
      } 
      String str2 = paramBuilder.ori_ugc_vid;
      if (str2 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str2;
      } 
      str2 = paramBuilder.ad_context_list;
      if (str2 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str2;
      } 
      str2 = paramBuilder.up_schema;
      if (str2 == null) {
        this.up_schema = "";
      } else {
        this.up_schema = str2;
      } 
      Integer integer2 = paramBuilder.from_push;
      if (integer2 == null) {
        this.from_push = DEFAULT_FROM_PUSH;
      } else {
        this.from_push = integer2;
      } 
      String str1 = paramBuilder.ad_ext_params;
      if (str1 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str1;
      } 
      Long long_1 = paramBuilder.broadcast_id;
      if (long_1 == null) {
        this.broadcast_id = DEFAULT_BROADCAST_ID;
      } else {
        this.broadcast_id = long_1;
      } 
      Integer integer1 = paramBuilder.floor_sort_type;
      if (integer1 == null) {
        this.floor_sort_type = DEFAULT_FLOOR_SORT_TYPE;
      } else {
        this.floor_sort_type = integer1;
      } 
      integer1 = paramBuilder.source_type;
      if (integer1 == null) {
        this.source_type = DEFAULT_SOURCE_TYPE;
      } else {
        this.source_type = integer1;
      } 
      integer1 = paramBuilder.immersion_video_comment_source;
      if (integer1 == null) {
        this.immersion_video_comment_source = DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE;
      } else {
        this.immersion_video_comment_source = integer1;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      integer1 = paramBuilder.is_fold_comment_req;
      if (integer1 == null) {
        this.is_fold_comment_req = DEFAULT_IS_FOLD_COMMENT_REQ;
      } else {
        this.is_fold_comment_req = integer1;
      } 
      integer = paramBuilder.is_edit_comment_req;
      if (integer == null) {
        this.is_edit_comment_req = DEFAULT_IS_EDIT_COMMENT_REQ;
      } else {
        this.is_edit_comment_req = integer;
      } 
    } else {
      this.pb_rn = ((Builder)integer).pb_rn;
      this.mark = ((Builder)integer).mark;
      this.back = ((Builder)integer).back;
      this.kz = ((Builder)integer).kz;
      this.lz = ((Builder)integer).lz;
      this.r = ((Builder)integer).r;
      this.pid = ((Builder)integer).pid;
      this.with_floor = ((Builder)integer).with_floor;
      this.floor_rn = ((Builder)integer).floor_rn;
      this.weipost = ((Builder)integer).weipost;
      this.message_id = ((Builder)integer).message_id;
      this.s_model = ((Builder)integer).s_model;
      this.rn = ((Builder)integer).rn;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.pn = ((Builder)integer).pn;
      this.st_type = ((Builder)integer).st_type;
      this.thread_type = ((Builder)integer).thread_type;
      this.banner = ((Builder)integer).banner;
      this.arround = ((Builder)integer).arround;
      this.last = ((Builder)integer).last;
      this.msg_click = ((Builder)integer).msg_click;
      this.common = ((Builder)integer).common;
      this.lastids = ((Builder)integer).lastids;
      this.st_from = ((Builder)integer).st_from;
      this.st_link = ((Builder)integer).st_link;
      this.st_stat = ((Builder)integer).st_stat;
      this.st_task = ((Builder)integer).st_task;
      this.issdk = ((Builder)integer).issdk;
      this.query_word = ((Builder)integer).query_word;
      this.is_comm_reverse = ((Builder)integer).is_comm_reverse;
      this.is_jumpfloor = ((Builder)integer).is_jumpfloor;
      this.jumpfloor_num = ((Builder)integer).jumpfloor_num;
      this.da_idfa = ((Builder)integer).da_idfa;
      this.platform = ((Builder)integer).platform;
      this.jid = ((Builder)integer).jid;
      this.fid = ((Builder)integer).fid;
      this.jfrom = ((Builder)integer).jfrom;
      this.yuelaou_locate = ((Builder)integer).yuelaou_locate;
      this.yuelaou_params = ((Builder)integer).yuelaou_params;
      this.obj_source = ((Builder)integer).obj_source;
      this.obj_locate = ((Builder)integer).obj_locate;
      this.obj_param1 = ((Builder)integer).obj_param1;
      this.app_pos = ((Builder)integer).app_pos;
      this.from_smart_frs = ((Builder)integer).from_smart_frs;
      this.feed_nid = ((Builder)integer).feed_nid;
      this.forum_id = ((Builder)integer).forum_id;
      this.need_repost_recommend_forum = ((Builder)integer).need_repost_recommend_forum;
      this.ad_param = ((Builder)integer).ad_param;
      this.need_log = ((Builder)integer).need_log;
      this.call_url = ((Builder)integer).call_url;
      this.shoubai_cuid = ((Builder)integer).shoubai_cuid;
      this.ori_ugc_nid = ((Builder)integer).ori_ugc_nid;
      this.ori_ugc_tid = ((Builder)integer).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)integer).ori_ugc_type;
      this.ori_ugc_vid = ((Builder)integer).ori_ugc_vid;
      this.ad_context_list = ((Builder)integer).ad_context_list;
      this.up_schema = ((Builder)integer).up_schema;
      this.from_push = ((Builder)integer).from_push;
      this.ad_ext_params = ((Builder)integer).ad_ext_params;
      this.broadcast_id = ((Builder)integer).broadcast_id;
      this.floor_sort_type = ((Builder)integer).floor_sort_type;
      this.source_type = ((Builder)integer).source_type;
      this.immersion_video_comment_source = ((Builder)integer).immersion_video_comment_source;
      this.app_transmit_data = ((Builder)integer).app_transmit_data;
      this.is_fold_comment_req = ((Builder)integer).is_fold_comment_req;
      this.is_edit_comment_req = ((Builder)integer).is_edit_comment_req;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
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
    
    public CommonReq common;
    
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
    
    public Integer rn;
    
    public Integer s_model;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String shoubai_cuid;
    
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
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.pb_rn = param1DataReq.pb_rn;
      this.mark = param1DataReq.mark;
      this.back = param1DataReq.back;
      this.kz = param1DataReq.kz;
      this.lz = param1DataReq.lz;
      this.r = param1DataReq.r;
      this.pid = param1DataReq.pid;
      this.with_floor = param1DataReq.with_floor;
      this.floor_rn = param1DataReq.floor_rn;
      this.weipost = param1DataReq.weipost;
      this.message_id = param1DataReq.message_id;
      this.s_model = param1DataReq.s_model;
      this.rn = param1DataReq.rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.pn = param1DataReq.pn;
      this.st_type = param1DataReq.st_type;
      this.thread_type = param1DataReq.thread_type;
      this.banner = param1DataReq.banner;
      this.arround = param1DataReq.arround;
      this.last = param1DataReq.last;
      this.msg_click = param1DataReq.msg_click;
      this.common = param1DataReq.common;
      this.lastids = param1DataReq.lastids;
      this.st_from = param1DataReq.st_from;
      this.st_link = param1DataReq.st_link;
      this.st_stat = param1DataReq.st_stat;
      this.st_task = param1DataReq.st_task;
      this.issdk = param1DataReq.issdk;
      this.query_word = param1DataReq.query_word;
      this.is_comm_reverse = param1DataReq.is_comm_reverse;
      this.is_jumpfloor = param1DataReq.is_jumpfloor;
      this.jumpfloor_num = param1DataReq.jumpfloor_num;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.jid = param1DataReq.jid;
      this.fid = param1DataReq.fid;
      this.jfrom = param1DataReq.jfrom;
      this.yuelaou_locate = param1DataReq.yuelaou_locate;
      this.yuelaou_params = param1DataReq.yuelaou_params;
      this.obj_source = param1DataReq.obj_source;
      this.obj_locate = param1DataReq.obj_locate;
      this.obj_param1 = param1DataReq.obj_param1;
      this.app_pos = param1DataReq.app_pos;
      this.from_smart_frs = param1DataReq.from_smart_frs;
      this.feed_nid = param1DataReq.feed_nid;
      this.forum_id = param1DataReq.forum_id;
      this.need_repost_recommend_forum = param1DataReq.need_repost_recommend_forum;
      this.ad_param = param1DataReq.ad_param;
      this.need_log = param1DataReq.need_log;
      this.call_url = param1DataReq.call_url;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.up_schema = param1DataReq.up_schema;
      this.from_push = param1DataReq.from_push;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.broadcast_id = param1DataReq.broadcast_id;
      this.floor_sort_type = param1DataReq.floor_sort_type;
      this.source_type = param1DataReq.source_type;
      this.immersion_video_comment_source = param1DataReq.immersion_video_comment_source;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.is_fold_comment_req = param1DataReq.is_fold_comment_req;
      this.is_edit_comment_req = param1DataReq.is_edit_comment_req;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
