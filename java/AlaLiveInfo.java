import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaChallengeInfo;
import tbclient.AlaCoverLabel;
import tbclient.AlaLiveInfo;
import tbclient.AlaShareInfo;
import tbclient.AlaStageDislikeInfo;
import tbclient.AlaUserInfo;
import tbclient.DislikeInfo;
import tbclient.YyExt;

public final class AlaLiveInfo extends Message {
  public static final Integer DEFAULT_AUDIENCE_COUNT;
  
  public static final String DEFAULT_COVER = "";
  
  public static final String DEFAULT_COVER_WIDE = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final List<DislikeInfo> DEFAULT_DISLIKE_INFO;
  
  public static final Long DEFAULT_DISTANCE;
  
  public static final Integer DEFAULT_DURATION;
  
  public static final String DEFAULT_FIRST_HEADLINE = "";
  
  public static final String DEFAULT_FORUM_USER_LIVE_MSG = "";
  
  public static final Integer DEFAULT_FRS_TOPLIVE_FORCE;
  
  public static final String DEFAULT_FRS_TOPLIVE_PIC = "";
  
  public static final Integer DEFAULT_FRS_TOPLIVE_TYPE;
  
  public static final Long DEFAULT_GROUP_ID;
  
  public static final String DEFAULT_HLS_URL = "";
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final Integer DEFAULT_LIVE_FROM;
  
  public static final Long DEFAULT_LIVE_ID;
  
  public static final Integer DEFAULT_LIVE_STATUS;
  
  public static final Integer DEFAULT_LIVE_TYPE;
  
  public static final String DEFAULT_MEDIA_ID = "";
  
  public static final String DEFAULT_MEDIA_PIC = "";
  
  public static final String DEFAULT_MEDIA_SUBTITLE = "";
  
  public static final String DEFAULT_MEDIA_URL = "";
  
  public static final Integer DEFAULT_OPEN_RECOM_DURATION;
  
  public static final Integer DEFAULT_OPEN_RECOM_FANS;
  
  public static final Integer DEFAULT_OPEN_RECOM_LOCATION;
  
  public static final Integer DEFAULT_OPEN_RECOM_REASON;
  
  public static final Integer DEFAULT_PB_DISPLAY_TYPE;
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final String DEFAULT_ROOM_NAME = "";
  
  public static final Integer DEFAULT_ROOM_STATUS;
  
  public static final String DEFAULT_ROUTER_TYPE = "";
  
  public static final String DEFAULT_RTMP_URL = "";
  
  public static final Integer DEFAULT_SCREEN_DIRECTION;
  
  public static final String DEFAULT_SECOND_HEADLINE = "";
  
  public static final String DEFAULT_SESSION_ID = "";
  
  public static final List<AlaStageDislikeInfo> DEFAULT_STAGE_DISLIKE_INFO;
  
  public static final String DEFAULT_THIRD_APP_ID = "";
  
  public static final String DEFAULT_THIRD_LIVE_TYPE = "";
  
  public static final String DEFAULT_THIRD_ROOM_ID = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer audience_count;
  
  @ProtoField(tag = 25)
  public final AlaChallengeInfo challenge_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String cover;
  
  @ProtoField(tag = 48, type = Message.Datatype.STRING)
  public final String cover_wide;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 43)
  public final List<DislikeInfo> dislike_info;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT64)
  public final Long distance;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer duration;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String first_headline;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String forum_user_live_msg;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer frs_toplive_force;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String frs_toplive_pic;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer frs_toplive_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long group_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String hls_url;
  
  @ProtoField(tag = 24)
  public final AlaCoverLabel label;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer live_from;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long live_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer live_status;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer live_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String media_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String media_pic;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String media_subtitle;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String media_url;
  
  @ProtoField(tag = 41, type = Message.Datatype.UINT32)
  public final Integer open_recom_duration;
  
  @ProtoField(tag = 40, type = Message.Datatype.UINT32)
  public final Integer open_recom_fans;
  
  @ProtoField(tag = 39, type = Message.Datatype.UINT32)
  public final Integer open_recom_location;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT32)
  public final Integer open_recom_reason;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer pb_display_type;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 44, type = Message.Datatype.UINT64)
  public final Long room_id;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String room_name;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer room_status;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String router_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String rtmp_url;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer screen_direction;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String second_headline;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String session_id;
  
  @ProtoField(tag = 19)
  public final AlaShareInfo share_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<AlaStageDislikeInfo> stage_dislike_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String third_app_id;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String third_live_type;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String third_room_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 12)
  public final AlaUserInfo user_info;
  
  @ProtoField(tag = 49)
  public final YyExt yy_ext;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1589945163, "Ltbclient/AlaLiveInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1589945163, "Ltbclient/AlaLiveInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_LIVE_ID = long_;
    DEFAULT_GROUP_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_DURATION = integer;
    DEFAULT_AUDIENCE_COUNT = integer;
    DEFAULT_LIVE_TYPE = integer;
    DEFAULT_SCREEN_DIRECTION = integer;
    DEFAULT_LIVE_STATUS = integer;
    DEFAULT_DISTANCE = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_STAGE_DISLIKE_INFO = Collections.emptyList();
    DEFAULT_FRS_TOPLIVE_TYPE = integer;
    DEFAULT_FRS_TOPLIVE_FORCE = integer;
    DEFAULT_LIVE_FROM = integer;
    DEFAULT_PB_DISPLAY_TYPE = integer;
    DEFAULT_OPEN_RECOM_REASON = integer;
    DEFAULT_OPEN_RECOM_LOCATION = integer;
    DEFAULT_OPEN_RECOM_FANS = integer;
    DEFAULT_OPEN_RECOM_DURATION = integer;
    DEFAULT_DISLIKE_INFO = Collections.emptyList();
    DEFAULT_ROOM_ID = long_;
    DEFAULT_ROOM_STATUS = integer;
  }
  
  public AlaLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_5 = paramBuilder.live_id;
      if (long_5 == null) {
        this.live_id = DEFAULT_LIVE_ID;
      } else {
        this.live_id = long_5;
      } 
      String str8 = paramBuilder.cover;
      if (str8 == null) {
        this.cover = "";
      } else {
        this.cover = str8;
      } 
      str8 = paramBuilder.session_id;
      if (str8 == null) {
        this.session_id = "";
      } else {
        this.session_id = str8;
      } 
      str8 = paramBuilder.rtmp_url;
      if (str8 == null) {
        this.rtmp_url = "";
      } else {
        this.rtmp_url = str8;
      } 
      str8 = paramBuilder.hls_url;
      if (str8 == null) {
        this.hls_url = "";
      } else {
        this.hls_url = str8;
      } 
      Long long_4 = paramBuilder.group_id;
      if (long_4 == null) {
        this.group_id = DEFAULT_GROUP_ID;
      } else {
        this.group_id = long_4;
      } 
      String str7 = paramBuilder.media_url;
      if (str7 == null) {
        this.media_url = "";
      } else {
        this.media_url = str7;
      } 
      str7 = paramBuilder.media_pic;
      if (str7 == null) {
        this.media_pic = "";
      } else {
        this.media_pic = str7;
      } 
      str7 = paramBuilder.media_id;
      if (str7 == null) {
        this.media_id = "";
      } else {
        this.media_id = str7;
      } 
      str7 = paramBuilder.media_subtitle;
      if (str7 == null) {
        this.media_subtitle = "";
      } else {
        this.media_subtitle = str7;
      } 
      str7 = paramBuilder.description;
      if (str7 == null) {
        this.description = "";
      } else {
        this.description = str7;
      } 
      this.user_info = paramBuilder.user_info;
      Integer integer7 = paramBuilder.duration;
      if (integer7 == null) {
        this.duration = DEFAULT_DURATION;
      } else {
        this.duration = integer7;
      } 
      integer7 = paramBuilder.audience_count;
      if (integer7 == null) {
        this.audience_count = DEFAULT_AUDIENCE_COUNT;
      } else {
        this.audience_count = integer7;
      } 
      integer7 = paramBuilder.live_type;
      if (integer7 == null) {
        this.live_type = DEFAULT_LIVE_TYPE;
      } else {
        this.live_type = integer7;
      } 
      integer7 = paramBuilder.screen_direction;
      if (integer7 == null) {
        this.screen_direction = DEFAULT_SCREEN_DIRECTION;
      } else {
        this.screen_direction = integer7;
      } 
      String str6 = paramBuilder.label_name;
      if (str6 == null) {
        this.label_name = "";
      } else {
        this.label_name = str6;
      } 
      Integer integer6 = paramBuilder.live_status;
      if (integer6 == null) {
        this.live_status = DEFAULT_LIVE_STATUS;
      } else {
        this.live_status = integer6;
      } 
      this.share_info = paramBuilder.share_info;
      Long long_3 = paramBuilder.distance;
      if (long_3 == null) {
        this.distance = DEFAULT_DISTANCE;
      } else {
        this.distance = long_3;
      } 
      String str5 = paramBuilder.third_app_id;
      if (str5 == null) {
        this.third_app_id = "";
      } else {
        this.third_app_id = str5;
      } 
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      List list2 = paramBuilder.stage_dislike_info;
      if (list2 == null) {
        this.stage_dislike_info = DEFAULT_STAGE_DISLIKE_INFO;
      } else {
        this.stage_dislike_info = Message.immutableCopyOf(list2);
      } 
      this.label = paramBuilder.label;
      this.challenge_info = paramBuilder.challenge_info;
      Integer integer5 = paramBuilder.frs_toplive_type;
      if (integer5 == null) {
        this.frs_toplive_type = DEFAULT_FRS_TOPLIVE_TYPE;
      } else {
        this.frs_toplive_type = integer5;
      } 
      String str4 = paramBuilder.frs_toplive_pic;
      if (str4 == null) {
        this.frs_toplive_pic = "";
      } else {
        this.frs_toplive_pic = str4;
      } 
      Integer integer4 = paramBuilder.frs_toplive_force;
      if (integer4 == null) {
        this.frs_toplive_force = DEFAULT_FRS_TOPLIVE_FORCE;
      } else {
        this.frs_toplive_force = integer4;
      } 
      integer4 = paramBuilder.live_from;
      if (integer4 == null) {
        this.live_from = DEFAULT_LIVE_FROM;
      } else {
        this.live_from = integer4;
      } 
      String str3 = paramBuilder.third_room_id;
      if (str3 == null) {
        this.third_room_id = "";
      } else {
        this.third_room_id = str3;
      } 
      str3 = paramBuilder.router_type;
      if (str3 == null) {
        this.router_type = "";
      } else {
        this.router_type = str3;
      } 
      str3 = paramBuilder.third_live_type;
      if (str3 == null) {
        this.third_live_type = "";
      } else {
        this.third_live_type = str3;
      } 
      str3 = paramBuilder.first_headline;
      if (str3 == null) {
        this.first_headline = "";
      } else {
        this.first_headline = str3;
      } 
      str3 = paramBuilder.second_headline;
      if (str3 == null) {
        this.second_headline = "";
      } else {
        this.second_headline = str3;
      } 
      Integer integer3 = paramBuilder.pb_display_type;
      if (integer3 == null) {
        this.pb_display_type = DEFAULT_PB_DISPLAY_TYPE;
      } else {
        this.pb_display_type = integer3;
      } 
      String str2 = paramBuilder.recom_reason;
      if (str2 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str2;
      } 
      Integer integer2 = paramBuilder.open_recom_reason;
      if (integer2 == null) {
        this.open_recom_reason = DEFAULT_OPEN_RECOM_REASON;
      } else {
        this.open_recom_reason = integer2;
      } 
      integer2 = paramBuilder.open_recom_location;
      if (integer2 == null) {
        this.open_recom_location = DEFAULT_OPEN_RECOM_LOCATION;
      } else {
        this.open_recom_location = integer2;
      } 
      integer2 = paramBuilder.open_recom_fans;
      if (integer2 == null) {
        this.open_recom_fans = DEFAULT_OPEN_RECOM_FANS;
      } else {
        this.open_recom_fans = integer2;
      } 
      integer2 = paramBuilder.open_recom_duration;
      if (integer2 == null) {
        this.open_recom_duration = DEFAULT_OPEN_RECOM_DURATION;
      } else {
        this.open_recom_duration = integer2;
      } 
      List list1 = paramBuilder.dislike_info;
      if (list1 == null) {
        this.dislike_info = DEFAULT_DISLIKE_INFO;
      } else {
        this.dislike_info = Message.immutableCopyOf(list1);
      } 
      Long long_1 = paramBuilder.room_id;
      if (long_1 == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_1;
      } 
      Integer integer1 = paramBuilder.room_status;
      if (integer1 == null) {
        this.room_status = DEFAULT_ROOM_STATUS;
      } else {
        this.room_status = integer1;
      } 
      String str1 = paramBuilder.room_name;
      if (str1 == null) {
        this.room_name = "";
      } else {
        this.room_name = str1;
      } 
      str1 = paramBuilder.forum_user_live_msg;
      if (str1 == null) {
        this.forum_user_live_msg = "";
      } else {
        this.forum_user_live_msg = str1;
      } 
      str1 = paramBuilder.cover_wide;
      if (str1 == null) {
        this.cover_wide = "";
      } else {
        this.cover_wide = str1;
      } 
      this.yy_ext = paramBuilder.yy_ext;
    } else {
      this.live_id = paramBuilder.live_id;
      this.cover = paramBuilder.cover;
      this.session_id = paramBuilder.session_id;
      this.rtmp_url = paramBuilder.rtmp_url;
      this.hls_url = paramBuilder.hls_url;
      this.group_id = paramBuilder.group_id;
      this.media_url = paramBuilder.media_url;
      this.media_pic = paramBuilder.media_pic;
      this.media_id = paramBuilder.media_id;
      this.media_subtitle = paramBuilder.media_subtitle;
      this.description = paramBuilder.description;
      this.user_info = paramBuilder.user_info;
      this.duration = paramBuilder.duration;
      this.audience_count = paramBuilder.audience_count;
      this.live_type = paramBuilder.live_type;
      this.screen_direction = paramBuilder.screen_direction;
      this.label_name = paramBuilder.label_name;
      this.live_status = paramBuilder.live_status;
      this.share_info = paramBuilder.share_info;
      this.distance = paramBuilder.distance;
      this.third_app_id = paramBuilder.third_app_id;
      this.thread_id = paramBuilder.thread_id;
      this.stage_dislike_info = Message.immutableCopyOf(paramBuilder.stage_dislike_info);
      this.label = paramBuilder.label;
      this.challenge_info = paramBuilder.challenge_info;
      this.frs_toplive_type = paramBuilder.frs_toplive_type;
      this.frs_toplive_pic = paramBuilder.frs_toplive_pic;
      this.frs_toplive_force = paramBuilder.frs_toplive_force;
      this.live_from = paramBuilder.live_from;
      this.third_room_id = paramBuilder.third_room_id;
      this.router_type = paramBuilder.router_type;
      this.third_live_type = paramBuilder.third_live_type;
      this.first_headline = paramBuilder.first_headline;
      this.second_headline = paramBuilder.second_headline;
      this.pb_display_type = paramBuilder.pb_display_type;
      this.recom_reason = paramBuilder.recom_reason;
      this.open_recom_reason = paramBuilder.open_recom_reason;
      this.open_recom_location = paramBuilder.open_recom_location;
      this.open_recom_fans = paramBuilder.open_recom_fans;
      this.open_recom_duration = paramBuilder.open_recom_duration;
      this.dislike_info = Message.immutableCopyOf(paramBuilder.dislike_info);
      this.room_id = paramBuilder.room_id;
      this.room_status = paramBuilder.room_status;
      this.room_name = paramBuilder.room_name;
      this.forum_user_live_msg = paramBuilder.forum_user_live_msg;
      this.cover_wide = paramBuilder.cover_wide;
      this.yy_ext = paramBuilder.yy_ext;
    } 
  }
}
