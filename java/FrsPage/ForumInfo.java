package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerList;
import tbclient.DeletedReasonInfo;
import tbclient.GameInfo;
import tbclient.ThemeColorInfo;

public final class ForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACCELERATE_COTENT = "";
  
  public static final Integer DEFAULT_ALBUM_OPEN_PHOTO_FRS;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final List<Badges> DEFAULT_BADGES;
  
  public static final Integer DEFAULT_CAN_USE_ACCELERATE;
  
  public static final Integer DEFAULT_CUR_SCORE;
  
  public static final Integer DEFAULT_FAVO_TYPE;
  
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final String DEFAULT_FORUM_GAME_LABEL = "";
  
  public static final String DEFAULT_FORUM_SHARE_LINK = "";
  
  public static final List<Calendar> DEFAULT_FORUM_SIGN_CALENDAR;
  
  public static final String DEFAULT_F_SHARE_IMG = "";
  
  public static final List<GameInfo> DEFAULT_GAME_CARD;
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final String DEFAULT_GAME_URL = "";
  
  public static final List<Classify> DEFAULT_GOOD_CLASSIFY;
  
  public static final Integer DEFAULT_HAS_FRS_STAR;
  
  public static final Integer DEFAULT_HAS_GAME;
  
  public static final Integer DEFAULT_HAS_PAPER;
  
  public static final Integer DEFAULT_HAS_POSTPRE;
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_EXISTS;
  
  public static final Integer DEFAULT_IS_FORBIDDEN;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_LIVE_GAME;
  
  public static final Integer DEFAULT_IS_LIVE_GAME_FORUM;
  
  public static final Integer DEFAULT_IS_LOCAL_EFFECT;
  
  public static final Integer DEFAULT_IS_NEW_GAME_FORUM;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM;
  
  public static final String DEFAULT_IS_READONLY = "";
  
  public static final Integer DEFAULT_IS_SEARCH_PEOPLE;
  
  public static final Integer DEFAULT_IS_SHOW_ALL_TOP_THREAD;
  
  public static final Integer DEFAULT_IS_SHOW_BAWUTASK;
  
  public static final Integer DEFAULT_IS_SHOW_FORUMRULE;
  
  public static final Integer DEFAULT_IS_STAGE_FORUM;
  
  public static final Integer DEFAULT_IS_SUPPORT_LOCAL;
  
  public static final String DEFAULT_IS_TOP_IMG = "";
  
  public static final Integer DEFAULT_LEVELUP_SCORE;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final List<Manager> DEFAULT_MANAGERS;
  
  public static final Integer DEFAULT_MEIZHI_TAG;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final List<RecommendForum> DEFAULT_RECOMMEND_FORUM;
  
  public static final String DEFAULT_RISK_TIP_NOTICE = "";
  
  public static final String DEFAULT_RISK_TIP_POP = "";
  
  public static final String DEFAULT_RISK_TIP_POP_TITLE = "";
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final String DEFAULT_SPECIAL_FORUM_TYPE = "";
  
  public static final String DEFAULT_SUPERBOY = "";
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final String DEFAULT_TIDS = "";
  
  public static final List<TipInfo> DEFAULT_TIP_LIST;
  
  public static final String DEFAULT_TOPIC_SPECIAL_ICON = "";
  
  public static final String DEFAULT_TOPIC_SPECIAL_ICON_RIGHT = "";
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  public static final String DEFAULT_WARNING_MSG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String accelerate_cotent;
  
  @ProtoField(tag = 62)
  public final AcrossForumIcon across_forum_hide;
  
  @ProtoField(tag = 60)
  public final AcrossForumIcon across_forum_show;
  
  @ProtoField(tag = 56)
  public final Adkiller adkiller_data;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer album_open_photo_frs;
  
  @ProtoField(tag = 44)
  public final AnchorPower anchor_power;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 34)
  public final List<Badges> badges;
  
  @ProtoField(tag = 32)
  public final Banner banner;
  
  @ProtoField(tag = 33)
  public final BannerList banner_list;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer can_use_accelerate;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer cur_score;
  
  @ProtoField(tag = 85)
  public final DeletedReasonInfo deleted_reason_info;
  
  @ProtoField(tag = 78, type = Message.Datatype.STRING)
  public final String f_share_img;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer favo_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 27)
  public final ForumButton forum_button;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String forum_game_label;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String forum_share_link;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 18)
  public final List<Calendar> forum_sign_calendar;
  
  @ProtoField(tag = 55)
  public final MemberShowIcon forumvip_show_icon;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 53)
  public final List<GameInfo> game_card;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(tag = 47, type = Message.Datatype.STRING)
  public final String game_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<Classify> good_classify;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer has_frs_star;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT32)
  public final Integer has_game;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer has_paper;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer has_postpre;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 71, type = Message.Datatype.INT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_exists;
  
  @ProtoField(tag = 36, type = Message.Datatype.INT32)
  public final Integer is_forbidden;
  
  @ProtoField(tag = 86, type = Message.Datatype.INT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 64, type = Message.Datatype.INT32)
  public final Integer is_live_game;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer is_live_game_forum;
  
  @ProtoField(tag = 42, type = Message.Datatype.INT32)
  public final Integer is_local_effect;
  
  @ProtoField(tag = 65, type = Message.Datatype.INT32)
  public final Integer is_new_game_forum;
  
  @ProtoField(tag = 75, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String is_readonly;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer is_search_people;
  
  @ProtoField(tag = 72, type = Message.Datatype.INT32)
  public final Integer is_show_all_top_thread;
  
  @ProtoField(tag = 77, type = Message.Datatype.INT32)
  public final Integer is_show_bawutask;
  
  @ProtoField(tag = 84, type = Message.Datatype.INT32)
  public final Integer is_show_forumrule;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer is_stage_forum;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer is_support_local;
  
  @ProtoField(tag = 74, type = Message.Datatype.STRING)
  public final String is_top_img;
  
  @ProtoField(tag = 35, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer levelup_score;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<Manager> managers;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer meizhi_tag;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer member_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 52)
  public final TopNews news_info;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 39)
  public final PostPrefix post_prefix;
  
  @ProtoField(tag = 61)
  public final PostTopic post_topic;
  
  @ProtoField(tag = 58)
  public final RealTime realtime_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 43)
  public final List<RecommendForum> recommend_forum;
  
  @ProtoField(tag = 48)
  public final RecomUserInfo recommend_user_info;
  
  @ProtoField(tag = 81, type = Message.Datatype.STRING)
  public final String risk_tip_notice;
  
  @ProtoField(tag = 80, type = Message.Datatype.STRING)
  public final String risk_tip_pop;
  
  @ProtoField(tag = 82, type = Message.Datatype.STRING)
  public final String risk_tip_pop_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(tag = 15)
  public final SignInfo sign_in_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String special_forum_type;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String superboy;
  
  @ProtoField(tag = 38)
  public final TagInfo tag_info;
  
  @ProtoField(tag = 73)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String tids;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 83)
  public final List<TipInfo> tip_list;
  
  @ProtoField(tag = 51)
  public final TopCode top_code;
  
  @ProtoField(tag = 28)
  public final TopNotice top_notice;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String topic_special_icon;
  
  @ProtoField(tag = 70, type = Message.Datatype.STRING)
  public final String topic_special_icon_right;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String warning_msg;
  
  @ProtoField(tag = 45)
  public final WorldCup worldcupinfo;
  
  @ProtoField(tag = 57)
  public final Yule yule;
  
  @ProtoField(tag = 16)
  public final Zhibo zhibo;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_EXISTS = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_USER_LEVEL = integer;
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_HAS_FRS_STAR = integer;
    DEFAULT_CUR_SCORE = integer;
    DEFAULT_LEVELUP_SCORE = integer;
    DEFAULT_MANAGERS = Collections.emptyList();
    DEFAULT_FORUM_SIGN_CALENDAR = Collections.emptyList();
    DEFAULT_IS_SEARCH_PEOPLE = integer;
    DEFAULT_GOOD_CLASSIFY = Collections.emptyList();
    DEFAULT_ALBUM_OPEN_PHOTO_FRS = integer;
    DEFAULT_HAS_POSTPRE = integer;
    DEFAULT_HAS_PAPER = integer;
    DEFAULT_IS_STAGE_FORUM = integer;
    DEFAULT_MEIZHI_TAG = integer;
    DEFAULT_BADGES = Collections.emptyList();
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_IS_FORBIDDEN = integer;
    DEFAULT_FAVO_TYPE = integer;
    DEFAULT_IS_SUPPORT_LOCAL = integer;
    DEFAULT_IS_LOCAL_EFFECT = integer;
    DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
    DEFAULT_HAS_GAME = integer;
    DEFAULT_CAN_USE_ACCELERATE = integer;
    DEFAULT_GAME_CARD = Collections.emptyList();
    DEFAULT_IS_LIVE_GAME_FORUM = integer;
    DEFAULT_IS_LIVE_GAME = integer;
    DEFAULT_IS_NEW_GAME_FORUM = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_IS_SHOW_ALL_TOP_THREAD = integer;
    DEFAULT_IS_PRIVATE_FORUM = integer;
    DEFAULT_IS_SHOW_BAWUTASK = integer;
    DEFAULT_TIP_LIST = Collections.emptyList();
    DEFAULT_IS_SHOW_FORUMRULE = integer;
    DEFAULT_IS_FRS_MASK = integer;
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str12 = paramBuilder.name;
      if (str12 == null) {
        this.name = "";
      } else {
        this.name = str12;
      } 
      str12 = paramBuilder.first_class;
      if (str12 == null) {
        this.first_class = "";
      } else {
        this.first_class = str12;
      } 
      str12 = paramBuilder.second_class;
      if (str12 == null) {
        this.second_class = "";
      } else {
        this.second_class = str12;
      } 
      Integer integer13 = paramBuilder.is_exists;
      if (integer13 == null) {
        this.is_exists = DEFAULT_IS_EXISTS;
      } else {
        this.is_exists = integer13;
      } 
      integer13 = paramBuilder.is_like;
      if (integer13 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer13;
      } 
      integer13 = paramBuilder.user_level;
      if (integer13 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer13;
      } 
      String str11 = paramBuilder.level_name;
      if (str11 == null) {
        this.level_name = "";
      } else {
        this.level_name = str11;
      } 
      Integer integer12 = paramBuilder.member_num;
      if (integer12 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer12;
      } 
      integer12 = paramBuilder.thread_num;
      if (integer12 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer12;
      } 
      integer12 = paramBuilder.post_num;
      if (integer12 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer12;
      } 
      integer12 = paramBuilder.has_frs_star;
      if (integer12 == null) {
        this.has_frs_star = DEFAULT_HAS_FRS_STAR;
      } else {
        this.has_frs_star = integer12;
      } 
      integer12 = paramBuilder.cur_score;
      if (integer12 == null) {
        this.cur_score = DEFAULT_CUR_SCORE;
      } else {
        this.cur_score = integer12;
      } 
      integer12 = paramBuilder.levelup_score;
      if (integer12 == null) {
        this.levelup_score = DEFAULT_LEVELUP_SCORE;
      } else {
        this.levelup_score = integer12;
      } 
      this.sign_in_info = paramBuilder.sign_in_info;
      this.zhibo = paramBuilder.zhibo;
      List<Manager> list6 = paramBuilder.managers;
      if (list6 == null) {
        this.managers = DEFAULT_MANAGERS;
      } else {
        this.managers = Message.immutableCopyOf(list6);
      } 
      List<Calendar> list5 = paramBuilder.forum_sign_calendar;
      if (list5 == null) {
        this.forum_sign_calendar = DEFAULT_FORUM_SIGN_CALENDAR;
      } else {
        this.forum_sign_calendar = Message.immutableCopyOf(list5);
      } 
      Integer integer11 = paramBuilder.is_search_people;
      if (integer11 == null) {
        this.is_search_people = DEFAULT_IS_SEARCH_PEOPLE;
      } else {
        this.is_search_people = integer11;
      } 
      String str10 = paramBuilder.tids;
      if (str10 == null) {
        this.tids = "";
      } else {
        this.tids = str10;
      } 
      List<Classify> list4 = paramBuilder.good_classify;
      if (list4 == null) {
        this.good_classify = DEFAULT_GOOD_CLASSIFY;
      } else {
        this.good_classify = Message.immutableCopyOf(list4);
      } 
      String str9 = paramBuilder.is_readonly;
      if (str9 == null) {
        this.is_readonly = "";
      } else {
        this.is_readonly = str9;
      } 
      Integer integer10 = paramBuilder.album_open_photo_frs;
      if (integer10 == null) {
        this.album_open_photo_frs = DEFAULT_ALBUM_OPEN_PHOTO_FRS;
      } else {
        this.album_open_photo_frs = integer10;
      } 
      String str8 = paramBuilder.avatar;
      if (str8 == null) {
        this.avatar = "";
      } else {
        this.avatar = str8;
      } 
      str8 = paramBuilder.slogan;
      if (str8 == null) {
        this.slogan = "";
      } else {
        this.slogan = str8;
      } 
      Integer integer9 = paramBuilder.has_postpre;
      if (integer9 == null) {
        this.has_postpre = DEFAULT_HAS_POSTPRE;
      } else {
        this.has_postpre = integer9;
      } 
      this.forum_button = paramBuilder.forum_button;
      this.top_notice = paramBuilder.top_notice;
      integer9 = paramBuilder.has_paper;
      if (integer9 == null) {
        this.has_paper = DEFAULT_HAS_PAPER;
      } else {
        this.has_paper = integer9;
      } 
      integer9 = paramBuilder.is_stage_forum;
      if (integer9 == null) {
        this.is_stage_forum = DEFAULT_IS_STAGE_FORUM;
      } else {
        this.is_stage_forum = integer9;
      } 
      integer9 = paramBuilder.meizhi_tag;
      if (integer9 == null) {
        this.meizhi_tag = DEFAULT_MEIZHI_TAG;
      } else {
        this.meizhi_tag = integer9;
      } 
      this.banner = paramBuilder.banner;
      this.banner_list = paramBuilder.banner_list;
      List<Badges> list3 = paramBuilder.badges;
      if (list3 == null) {
        this.badges = DEFAULT_BADGES;
      } else {
        this.badges = Message.immutableCopyOf(list3);
      } 
      Integer integer8 = paramBuilder.level_id;
      if (integer8 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer8;
      } 
      integer8 = paramBuilder.is_forbidden;
      if (integer8 == null) {
        this.is_forbidden = DEFAULT_IS_FORBIDDEN;
      } else {
        this.is_forbidden = integer8;
      } 
      integer8 = paramBuilder.favo_type;
      if (integer8 == null) {
        this.favo_type = DEFAULT_FAVO_TYPE;
      } else {
        this.favo_type = integer8;
      } 
      this.tag_info = paramBuilder.tag_info;
      this.post_prefix = paramBuilder.post_prefix;
      String str7 = paramBuilder.superboy;
      if (str7 == null) {
        this.superboy = "";
      } else {
        this.superboy = str7;
      } 
      Integer integer7 = paramBuilder.is_support_local;
      if (integer7 == null) {
        this.is_support_local = DEFAULT_IS_SUPPORT_LOCAL;
      } else {
        this.is_support_local = integer7;
      } 
      integer7 = paramBuilder.is_local_effect;
      if (integer7 == null) {
        this.is_local_effect = DEFAULT_IS_LOCAL_EFFECT;
      } else {
        this.is_local_effect = integer7;
      } 
      List<RecommendForum> list2 = paramBuilder.recommend_forum;
      if (list2 == null) {
        this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
      } else {
        this.recommend_forum = Message.immutableCopyOf(list2);
      } 
      this.anchor_power = paramBuilder.anchor_power;
      this.worldcupinfo = paramBuilder.worldcupinfo;
      Integer integer6 = paramBuilder.has_game;
      if (integer6 == null) {
        this.has_game = DEFAULT_HAS_GAME;
      } else {
        this.has_game = integer6;
      } 
      String str6 = paramBuilder.game_url;
      if (str6 == null) {
        this.game_url = "";
      } else {
        this.game_url = str6;
      } 
      this.recommend_user_info = paramBuilder.recommend_user_info;
      Integer integer5 = paramBuilder.can_use_accelerate;
      if (integer5 == null) {
        this.can_use_accelerate = DEFAULT_CAN_USE_ACCELERATE;
      } else {
        this.can_use_accelerate = integer5;
      } 
      String str5 = paramBuilder.accelerate_cotent;
      if (str5 == null) {
        this.accelerate_cotent = "";
      } else {
        this.accelerate_cotent = str5;
      } 
      this.top_code = paramBuilder.top_code;
      this.news_info = paramBuilder.news_info;
      List<GameInfo> list1 = paramBuilder.game_card;
      if (list1 == null) {
        this.game_card = DEFAULT_GAME_CARD;
      } else {
        this.game_card = Message.immutableCopyOf(list1);
      } 
      String str4 = paramBuilder.game_name;
      if (str4 == null) {
        this.game_name = "";
      } else {
        this.game_name = str4;
      } 
      this.forumvip_show_icon = paramBuilder.forumvip_show_icon;
      this.adkiller_data = paramBuilder.adkiller_data;
      this.yule = paramBuilder.yule;
      this.realtime_data = paramBuilder.realtime_data;
      this.across_forum_show = paramBuilder.across_forum_show;
      this.post_topic = paramBuilder.post_topic;
      this.across_forum_hide = paramBuilder.across_forum_hide;
      Integer integer4 = paramBuilder.is_live_game_forum;
      if (integer4 == null) {
        this.is_live_game_forum = DEFAULT_IS_LIVE_GAME_FORUM;
      } else {
        this.is_live_game_forum = integer4;
      } 
      integer4 = paramBuilder.is_live_game;
      if (integer4 == null) {
        this.is_live_game = DEFAULT_IS_LIVE_GAME;
      } else {
        this.is_live_game = integer4;
      } 
      integer4 = paramBuilder.is_new_game_forum;
      if (integer4 == null) {
        this.is_new_game_forum = DEFAULT_IS_NEW_GAME_FORUM;
      } else {
        this.is_new_game_forum = integer4;
      } 
      String str3 = paramBuilder.forum_game_label;
      if (str3 == null) {
        this.forum_game_label = "";
      } else {
        this.forum_game_label = str3;
      } 
      str3 = paramBuilder.warning_msg;
      if (str3 == null) {
        this.warning_msg = "";
      } else {
        this.warning_msg = str3;
      } 
      str3 = paramBuilder.special_forum_type;
      if (str3 == null) {
        this.special_forum_type = "";
      } else {
        this.special_forum_type = str3;
      } 
      str3 = paramBuilder.topic_special_icon;
      if (str3 == null) {
        this.topic_special_icon = "";
      } else {
        this.topic_special_icon = str3;
      } 
      str3 = paramBuilder.topic_special_icon_right;
      if (str3 == null) {
        this.topic_special_icon_right = "";
      } else {
        this.topic_special_icon_right = str3;
      } 
      Integer integer3 = paramBuilder.is_brand_forum;
      if (integer3 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer3;
      } 
      integer3 = paramBuilder.is_show_all_top_thread;
      if (integer3 == null) {
        this.is_show_all_top_thread = DEFAULT_IS_SHOW_ALL_TOP_THREAD;
      } else {
        this.is_show_all_top_thread = integer3;
      } 
      this.theme_color = paramBuilder.theme_color;
      String str2 = paramBuilder.is_top_img;
      if (str2 == null) {
        this.is_top_img = "";
      } else {
        this.is_top_img = str2;
      } 
      Integer integer2 = paramBuilder.is_private_forum;
      if (integer2 == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer2;
      } 
      integer2 = paramBuilder.is_show_bawutask;
      if (integer2 == null) {
        this.is_show_bawutask = DEFAULT_IS_SHOW_BAWUTASK;
      } else {
        this.is_show_bawutask = integer2;
      } 
      String str1 = paramBuilder.f_share_img;
      if (str1 == null) {
        this.f_share_img = "";
      } else {
        this.f_share_img = str1;
      } 
      str1 = paramBuilder.forum_share_link;
      if (str1 == null) {
        this.forum_share_link = "";
      } else {
        this.forum_share_link = str1;
      } 
      str1 = paramBuilder.risk_tip_pop;
      if (str1 == null) {
        this.risk_tip_pop = "";
      } else {
        this.risk_tip_pop = str1;
      } 
      str1 = paramBuilder.risk_tip_notice;
      if (str1 == null) {
        this.risk_tip_notice = "";
      } else {
        this.risk_tip_notice = str1;
      } 
      str1 = paramBuilder.risk_tip_pop_title;
      if (str1 == null) {
        this.risk_tip_pop_title = "";
      } else {
        this.risk_tip_pop_title = str1;
      } 
      List<TipInfo> list = paramBuilder.tip_list;
      if (list == null) {
        this.tip_list = DEFAULT_TIP_LIST;
      } else {
        this.tip_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.is_show_forumrule;
      if (integer1 == null) {
        this.is_show_forumrule = DEFAULT_IS_SHOW_FORUMRULE;
      } else {
        this.is_show_forumrule = integer1;
      } 
      this.deleted_reason_info = paramBuilder.deleted_reason_info;
      integer = paramBuilder.is_frs_mask;
      if (integer == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.name = ((Builder)integer).name;
      this.first_class = ((Builder)integer).first_class;
      this.second_class = ((Builder)integer).second_class;
      this.is_exists = ((Builder)integer).is_exists;
      this.is_like = ((Builder)integer).is_like;
      this.user_level = ((Builder)integer).user_level;
      this.level_name = ((Builder)integer).level_name;
      this.member_num = ((Builder)integer).member_num;
      this.thread_num = ((Builder)integer).thread_num;
      this.post_num = ((Builder)integer).post_num;
      this.has_frs_star = ((Builder)integer).has_frs_star;
      this.cur_score = ((Builder)integer).cur_score;
      this.levelup_score = ((Builder)integer).levelup_score;
      this.sign_in_info = ((Builder)integer).sign_in_info;
      this.zhibo = ((Builder)integer).zhibo;
      this.managers = Message.immutableCopyOf(((Builder)integer).managers);
      this.forum_sign_calendar = Message.immutableCopyOf(((Builder)integer).forum_sign_calendar);
      this.is_search_people = ((Builder)integer).is_search_people;
      this.tids = ((Builder)integer).tids;
      this.good_classify = Message.immutableCopyOf(((Builder)integer).good_classify);
      this.is_readonly = ((Builder)integer).is_readonly;
      this.album_open_photo_frs = ((Builder)integer).album_open_photo_frs;
      this.avatar = ((Builder)integer).avatar;
      this.slogan = ((Builder)integer).slogan;
      this.has_postpre = ((Builder)integer).has_postpre;
      this.forum_button = ((Builder)integer).forum_button;
      this.top_notice = ((Builder)integer).top_notice;
      this.has_paper = ((Builder)integer).has_paper;
      this.is_stage_forum = ((Builder)integer).is_stage_forum;
      this.meizhi_tag = ((Builder)integer).meizhi_tag;
      this.banner = ((Builder)integer).banner;
      this.banner_list = ((Builder)integer).banner_list;
      this.badges = Message.immutableCopyOf(((Builder)integer).badges);
      this.level_id = ((Builder)integer).level_id;
      this.is_forbidden = ((Builder)integer).is_forbidden;
      this.favo_type = ((Builder)integer).favo_type;
      this.tag_info = ((Builder)integer).tag_info;
      this.post_prefix = ((Builder)integer).post_prefix;
      this.superboy = ((Builder)integer).superboy;
      this.is_support_local = ((Builder)integer).is_support_local;
      this.is_local_effect = ((Builder)integer).is_local_effect;
      this.recommend_forum = Message.immutableCopyOf(((Builder)integer).recommend_forum);
      this.anchor_power = ((Builder)integer).anchor_power;
      this.worldcupinfo = ((Builder)integer).worldcupinfo;
      this.has_game = ((Builder)integer).has_game;
      this.game_url = ((Builder)integer).game_url;
      this.recommend_user_info = ((Builder)integer).recommend_user_info;
      this.can_use_accelerate = ((Builder)integer).can_use_accelerate;
      this.accelerate_cotent = ((Builder)integer).accelerate_cotent;
      this.top_code = ((Builder)integer).top_code;
      this.news_info = ((Builder)integer).news_info;
      this.game_card = Message.immutableCopyOf(((Builder)integer).game_card);
      this.game_name = ((Builder)integer).game_name;
      this.forumvip_show_icon = ((Builder)integer).forumvip_show_icon;
      this.adkiller_data = ((Builder)integer).adkiller_data;
      this.yule = ((Builder)integer).yule;
      this.realtime_data = ((Builder)integer).realtime_data;
      this.across_forum_show = ((Builder)integer).across_forum_show;
      this.post_topic = ((Builder)integer).post_topic;
      this.across_forum_hide = ((Builder)integer).across_forum_hide;
      this.is_live_game_forum = ((Builder)integer).is_live_game_forum;
      this.is_live_game = ((Builder)integer).is_live_game;
      this.is_new_game_forum = ((Builder)integer).is_new_game_forum;
      this.forum_game_label = ((Builder)integer).forum_game_label;
      this.warning_msg = ((Builder)integer).warning_msg;
      this.special_forum_type = ((Builder)integer).special_forum_type;
      this.topic_special_icon = ((Builder)integer).topic_special_icon;
      this.topic_special_icon_right = ((Builder)integer).topic_special_icon_right;
      this.is_brand_forum = ((Builder)integer).is_brand_forum;
      this.is_show_all_top_thread = ((Builder)integer).is_show_all_top_thread;
      this.theme_color = ((Builder)integer).theme_color;
      this.is_top_img = ((Builder)integer).is_top_img;
      this.is_private_forum = ((Builder)integer).is_private_forum;
      this.is_show_bawutask = ((Builder)integer).is_show_bawutask;
      this.f_share_img = ((Builder)integer).f_share_img;
      this.forum_share_link = ((Builder)integer).forum_share_link;
      this.risk_tip_pop = ((Builder)integer).risk_tip_pop;
      this.risk_tip_notice = ((Builder)integer).risk_tip_notice;
      this.risk_tip_pop_title = ((Builder)integer).risk_tip_pop_title;
      this.tip_list = Message.immutableCopyOf(((Builder)integer).tip_list);
      this.is_show_forumrule = ((Builder)integer).is_show_forumrule;
      this.deleted_reason_info = ((Builder)integer).deleted_reason_info;
      this.is_frs_mask = ((Builder)integer).is_frs_mask;
    } 
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2135951729, "Ltbclient/FrsPage/ForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2135951729, "Ltbclient/FrsPage/ForumInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String accelerate_cotent;
    
    public AcrossForumIcon across_forum_hide;
    
    public AcrossForumIcon across_forum_show;
    
    public Adkiller adkiller_data;
    
    public Integer album_open_photo_frs;
    
    public AnchorPower anchor_power;
    
    public String avatar;
    
    public List<Badges> badges;
    
    public Banner banner;
    
    public BannerList banner_list;
    
    public Integer can_use_accelerate;
    
    public Integer cur_score;
    
    public DeletedReasonInfo deleted_reason_info;
    
    public String f_share_img;
    
    public Integer favo_type;
    
    public String first_class;
    
    public ForumButton forum_button;
    
    public String forum_game_label;
    
    public String forum_share_link;
    
    public List<Calendar> forum_sign_calendar;
    
    public MemberShowIcon forumvip_show_icon;
    
    public List<GameInfo> game_card;
    
    public String game_name;
    
    public String game_url;
    
    public List<Classify> good_classify;
    
    public Integer has_frs_star;
    
    public Integer has_game;
    
    public Integer has_paper;
    
    public Integer has_postpre;
    
    public Long id;
    
    public Integer is_brand_forum;
    
    public Integer is_exists;
    
    public Integer is_forbidden;
    
    public Integer is_frs_mask;
    
    public Integer is_like;
    
    public Integer is_live_game;
    
    public Integer is_live_game_forum;
    
    public Integer is_local_effect;
    
    public Integer is_new_game_forum;
    
    public Integer is_private_forum;
    
    public String is_readonly;
    
    public Integer is_search_people;
    
    public Integer is_show_all_top_thread;
    
    public Integer is_show_bawutask;
    
    public Integer is_show_forumrule;
    
    public Integer is_stage_forum;
    
    public Integer is_support_local;
    
    public String is_top_img;
    
    public Integer level_id;
    
    public String level_name;
    
    public Integer levelup_score;
    
    public List<Manager> managers;
    
    public Integer meizhi_tag;
    
    public Integer member_num;
    
    public String name;
    
    public TopNews news_info;
    
    public Integer post_num;
    
    public PostPrefix post_prefix;
    
    public PostTopic post_topic;
    
    public RealTime realtime_data;
    
    public List<RecommendForum> recommend_forum;
    
    public RecomUserInfo recommend_user_info;
    
    public String risk_tip_notice;
    
    public String risk_tip_pop;
    
    public String risk_tip_pop_title;
    
    public String second_class;
    
    public SignInfo sign_in_info;
    
    public String slogan;
    
    public String special_forum_type;
    
    public String superboy;
    
    public TagInfo tag_info;
    
    public ThemeColorInfo theme_color;
    
    public Integer thread_num;
    
    public String tids;
    
    public List<TipInfo> tip_list;
    
    public TopCode top_code;
    
    public TopNotice top_notice;
    
    public String topic_special_icon;
    
    public String topic_special_icon_right;
    
    public Integer user_level;
    
    public String warning_msg;
    
    public WorldCup worldcupinfo;
    
    public Yule yule;
    
    public Zhibo zhibo;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.id = param1ForumInfo.id;
      this.name = param1ForumInfo.name;
      this.first_class = param1ForumInfo.first_class;
      this.second_class = param1ForumInfo.second_class;
      this.is_exists = param1ForumInfo.is_exists;
      this.is_like = param1ForumInfo.is_like;
      this.user_level = param1ForumInfo.user_level;
      this.level_name = param1ForumInfo.level_name;
      this.member_num = param1ForumInfo.member_num;
      this.thread_num = param1ForumInfo.thread_num;
      this.post_num = param1ForumInfo.post_num;
      this.has_frs_star = param1ForumInfo.has_frs_star;
      this.cur_score = param1ForumInfo.cur_score;
      this.levelup_score = param1ForumInfo.levelup_score;
      this.sign_in_info = param1ForumInfo.sign_in_info;
      this.zhibo = param1ForumInfo.zhibo;
      this.managers = Message.copyOf(param1ForumInfo.managers);
      this.forum_sign_calendar = Message.copyOf(param1ForumInfo.forum_sign_calendar);
      this.is_search_people = param1ForumInfo.is_search_people;
      this.tids = param1ForumInfo.tids;
      this.good_classify = Message.copyOf(param1ForumInfo.good_classify);
      this.is_readonly = param1ForumInfo.is_readonly;
      this.album_open_photo_frs = param1ForumInfo.album_open_photo_frs;
      this.avatar = param1ForumInfo.avatar;
      this.slogan = param1ForumInfo.slogan;
      this.has_postpre = param1ForumInfo.has_postpre;
      this.forum_button = param1ForumInfo.forum_button;
      this.top_notice = param1ForumInfo.top_notice;
      this.has_paper = param1ForumInfo.has_paper;
      this.is_stage_forum = param1ForumInfo.is_stage_forum;
      this.meizhi_tag = param1ForumInfo.meizhi_tag;
      this.banner = param1ForumInfo.banner;
      this.banner_list = param1ForumInfo.banner_list;
      this.badges = Message.copyOf(param1ForumInfo.badges);
      this.level_id = param1ForumInfo.level_id;
      this.is_forbidden = param1ForumInfo.is_forbidden;
      this.favo_type = param1ForumInfo.favo_type;
      this.tag_info = param1ForumInfo.tag_info;
      this.post_prefix = param1ForumInfo.post_prefix;
      this.superboy = param1ForumInfo.superboy;
      this.is_support_local = param1ForumInfo.is_support_local;
      this.is_local_effect = param1ForumInfo.is_local_effect;
      this.recommend_forum = Message.copyOf(param1ForumInfo.recommend_forum);
      this.anchor_power = param1ForumInfo.anchor_power;
      this.worldcupinfo = param1ForumInfo.worldcupinfo;
      this.has_game = param1ForumInfo.has_game;
      this.game_url = param1ForumInfo.game_url;
      this.recommend_user_info = param1ForumInfo.recommend_user_info;
      this.can_use_accelerate = param1ForumInfo.can_use_accelerate;
      this.accelerate_cotent = param1ForumInfo.accelerate_cotent;
      this.top_code = param1ForumInfo.top_code;
      this.news_info = param1ForumInfo.news_info;
      this.game_card = Message.copyOf(param1ForumInfo.game_card);
      this.game_name = param1ForumInfo.game_name;
      this.forumvip_show_icon = param1ForumInfo.forumvip_show_icon;
      this.adkiller_data = param1ForumInfo.adkiller_data;
      this.yule = param1ForumInfo.yule;
      this.realtime_data = param1ForumInfo.realtime_data;
      this.across_forum_show = param1ForumInfo.across_forum_show;
      this.post_topic = param1ForumInfo.post_topic;
      this.across_forum_hide = param1ForumInfo.across_forum_hide;
      this.is_live_game_forum = param1ForumInfo.is_live_game_forum;
      this.is_live_game = param1ForumInfo.is_live_game;
      this.is_new_game_forum = param1ForumInfo.is_new_game_forum;
      this.forum_game_label = param1ForumInfo.forum_game_label;
      this.warning_msg = param1ForumInfo.warning_msg;
      this.special_forum_type = param1ForumInfo.special_forum_type;
      this.topic_special_icon = param1ForumInfo.topic_special_icon;
      this.topic_special_icon_right = param1ForumInfo.topic_special_icon_right;
      this.is_brand_forum = param1ForumInfo.is_brand_forum;
      this.is_show_all_top_thread = param1ForumInfo.is_show_all_top_thread;
      this.theme_color = param1ForumInfo.theme_color;
      this.is_top_img = param1ForumInfo.is_top_img;
      this.is_private_forum = param1ForumInfo.is_private_forum;
      this.is_show_bawutask = param1ForumInfo.is_show_bawutask;
      this.f_share_img = param1ForumInfo.f_share_img;
      this.forum_share_link = param1ForumInfo.forum_share_link;
      this.risk_tip_pop = param1ForumInfo.risk_tip_pop;
      this.risk_tip_notice = param1ForumInfo.risk_tip_notice;
      this.risk_tip_pop_title = param1ForumInfo.risk_tip_pop_title;
      this.tip_list = Message.copyOf(param1ForumInfo.tip_list);
      this.is_show_forumrule = param1ForumInfo.is_show_forumrule;
      this.deleted_reason_info = param1ForumInfo.deleted_reason_info;
      this.is_frs_mask = param1ForumInfo.is_frs_mask;
    }
    
    public ForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumInfo)interceptResult.objValue; 
      } 
      return new ForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
