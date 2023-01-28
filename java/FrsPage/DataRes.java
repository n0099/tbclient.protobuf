package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdMixFloor;
import tbclient.AddBawuPopInfo;
import tbclient.AlaLiveNotify;
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.BannerUserStory;
import tbclient.BottomMenu;
import tbclient.CategoryInfo;
import tbclient.Esport;
import tbclient.ForumArIno;
import tbclient.ForumPresentInfo;
import tbclient.ForumRuleStatus;
import tbclient.FrsPageUserExtend;
import tbclient.FrsTabInfo;
import tbclient.FrsVideo;
import tbclient.HotUserRankEntry;
import tbclient.ItemInfo;
import tbclient.NaGuide;
import tbclient.Novel;
import tbclient.Page;
import tbclient.PopInfo;
import tbclient.PrivatePopInfo;
import tbclient.RecommendInfo;
import tbclient.RedpacketRain;
import tbclient.SdkTopicThread;
import tbclient.ServiceArea;
import tbclient.SignActivityInfo;
import tbclient.SmartApp;
import tbclient.StarVoice;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.VitalityInfo;
import tbclient.WindowToast;
import tbclient.ZhiBoInfoTW;

public final class DataRes extends Message {
  public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST;
  
  public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final Integer DEFAULT_ALA_INSERT_FLOOR;
  
  public static final List<ThreadInfo> DEFAULT_ALA_INSERT_THREAD;
  
  public static final Integer DEFAULT_ALA_LIVE_COUNT;
  
  public static final List<ThreadInfo> DEFAULT_ALA_STAGE_LIST;
  
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final List<BannerThreadInfo> DEFAULT_BANNER_THREAD_LIST;
  
  public static final String DEFAULT_BAWU_ENTER_URL = "";
  
  public static final Integer DEFAULT_BAWU_UNREAD_NOTICE_NUM;
  
  public static final List<BottomMenu> DEFAULT_BOTTOM_MENU;
  
  public static final List<ThreadInfo> DEFAULT_CARD_SHIPIN_INFO;
  
  public static final List<ThreadInfo> DEFAULT_CARD_SHIPIN_NEW;
  
  public static final List<Integer> DEFAULT_CARD_SHIPIN_POS;
  
  public static final List<CategoryInfo> DEFAULT_CATEGORY_LIST;
  
  public static final List<ColorEgg> DEFAULT_COLOR_EGG;
  
  public static final Integer DEFAULT_CTIME;
  
  public static final Integer DEFAULT_FORTUNE_BAG;
  
  public static final String DEFAULT_FORTUNE_DESC = "";
  
  public static final List<AnchorInfo> DEFAULT_FORUM_LIVEGROUP_LIST;
  
  public static final List<FrsTabInfo> DEFAULT_FRS_GAME_TAB_INFO;
  
  public static final Integer DEFAULT_FRS_TAB_DEFAULT;
  
  public static final List<FrsTabInfo> DEFAULT_FRS_TAB_INFO;
  
  public static final Integer DEFAULT_GAME_DEFAULT_TAB_ID;
  
  public static final Integer DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO;
  
  public static final Integer DEFAULT_IS_GET_HORSE_RACE_LAMP;
  
  public static final Integer DEFAULT_IS_MEMBER_BROADCAST_FORUM;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final List<LiveFuseForumData> DEFAULT_LIVE_FUSE_FORUM;
  
  public static final Long DEFAULT_LOGID;
  
  public static final Integer DEFAULT_NEED_LOG;
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final Integer DEFAULT_SCHOOL_RECOM_POS;
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final List<ServiceArea> DEFAULT_SERVICE_AREA;
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final List<String> DEFAULT_SMART_APP_AVATAR;
  
  public static final Integer DEFAULT_SMART_FRS_TYPE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<StarEnter> DEFAULT_STAR_ENTER;
  
  public static final List<Long> DEFAULT_THREAD_ID_LIST;
  
  public static final List<ThreadIdListInfo> DEFAULT_THREAD_ID_LIST_INFO;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TRENDS_REDPOINT;
  
  public static final List<ZhiBoInfoTW> DEFAULT_TWZHIBO_INFO;
  
  public static final Integer DEFAULT_TWZHIBO_POS;
  
  public static final List<User> DEFAULT_USER_LIST;
  
  public static final Integer DEFAULT_VIDEO_AUTO_PLAY;
  
  public static final Integer DEFAULT_VOICE_ROOM_CONFIG;
  
  public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST;
  
  public static final List<WindowToast> DEFAULT_WINDOW_TOAST;
  
  @ProtoField(tag = 87)
  public final ActivityConfig activity_config;
  
  @ProtoField(tag = 23)
  public final ActivityHead activityhead;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 113)
  public final List<AdMixFloor> ad_mix_list;
  
  @ProtoField(tag = 114, type = Message.Datatype.STRING)
  public final String ad_sample_map_key;
  
  @ProtoField(tag = 112, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 107)
  public final AddBawuPopInfo add_bawu_pop;
  
  @ProtoField(tag = 65)
  public final AgreeBanner agree_banner;
  
  @ProtoField(tag = 77, type = Message.Datatype.INT32)
  public final Integer ala_insert_floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 75)
  public final List<ThreadInfo> ala_insert_thread;
  
  @ProtoField(tag = 57, type = Message.Datatype.UINT32)
  public final Integer ala_live_count;
  
  @ProtoField(tag = 76)
  public final AlaLiveInsert ala_live_insert;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 80)
  public final List<ThreadInfo> ala_stage_list;
  
  @ProtoField(tag = 5)
  public final Anti anti;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String asp_shown_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 45)
  public final List<BannerThreadInfo> banner_thread_list;
  
  @ProtoField(tag = 70)
  public final BannerUserStory banner_user_story;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String bawu_enter_url;
  
  @ProtoField(tag = 117, type = Message.Datatype.INT32)
  public final Integer bawu_unread_notice_num;
  
  @ProtoField(tag = 115)
  public final PrivatePopInfo bawutask_pop;
  
  @ProtoField(tag = 101)
  public final WindowToast bazhu_exam_fail;
  
  @ProtoField(tag = 50)
  public final ForumBookInfo book_info;
  
  @ProtoField(tag = 58)
  public final Bottle bottle;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 92)
  public final List<BottomMenu> bottom_menu;
  
  @ProtoField(tag = 91)
  public final BrandForumInfo brand_forum_info;
  
  @ProtoField(tag = 99)
  public final BusinessPromot business_promot;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 35)
  public final List<ThreadInfo> card_shipin_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 55)
  public final List<ThreadInfo> card_shipin_new;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 54, type = Message.Datatype.INT32)
  public final List<Integer> card_shipin_pos;
  
  @ProtoField(tag = 43)
  public final CarrierEnter carrier_enter;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 28)
  public final List<CategoryInfo> category_list;
  
  @ProtoField(tag = 33)
  public final ClientPlatform client_platform;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<ColorEgg> color_egg;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer ctime;
  
  @ProtoField(tag = 61)
  public final PopInfo enter_pop_info;
  
  @ProtoField(tag = 63)
  public final Esport esport;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer fortune_bag;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String fortune_desc;
  
  @ProtoField(tag = 2)
  public final ForumInfo forum;
  
  @ProtoField(tag = 78)
  public final ForumArIno forum_ar_info;
  
  @ProtoField(tag = 120)
  public final ForumGroup forum_group;
  
  @ProtoField(tag = 72)
  public final ForumHeadIcon forum_head_icon;
  
  @ProtoField(tag = 52)
  public final ForumHeadlineImgInfo forum_headline_img_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<AnchorInfo> forum_livegroup_list;
  
  @ProtoField(tag = 51)
  public final ForumPresentInfo forum_present_info;
  
  @ProtoField(tag = 105)
  public final ForumRuleStatus forum_rule;
  
  @ProtoField(tag = 121)
  public final FrsBannerHeader frs_banner_header;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 68)
  public final List<FrsTabInfo> frs_game_tab_info;
  
  @ProtoField(tag = 3)
  public final StarInfo frs_star;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer frs_tab_default;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<FrsTabInfo> frs_tab_info;
  
  @ProtoField(tag = 109)
  public final PopInfo frsmask_pop_info;
  
  @ProtoField(tag = 74, type = Message.Datatype.INT32)
  public final Integer game_default_tab_id;
  
  @ProtoField(tag = 18)
  public final GconAccount gcon_account;
  
  @ProtoField(tag = 6)
  public final Group group;
  
  @ProtoField(tag = 34)
  public final HeadSdk head_sdk;
  
  @ProtoField(tag = 26)
  public final ZhiBoInfoTW hot_twzhibo_info;
  
  @ProtoField(tag = 102)
  public final HotUserRankEntry hot_user_entry;
  
  @ProtoField(tag = 15)
  public final Info info;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer is_auto_play_forumheadvideo;
  
  @ProtoField(tag = 104, type = Message.Datatype.INT32)
  public final Integer is_get_horse_race_lamp;
  
  @ProtoField(tag = 119, type = Message.Datatype.INT32)
  public final Integer is_member_broadcast_forum;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 103)
  public final ItemInfo item_info;
  
  @ProtoField(tag = 69)
  public final AlaLiveNotify live_frs_notify;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 116)
  public final List<LiveFuseForumData> live_fuse_forum;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT64)
  public final Long logid;
  
  @ProtoField(tag = 67)
  public final NaGuide na_guide;
  
  @ProtoField(tag = 37)
  public final NavTabInfo nav_tab_info;
  
  @ProtoField(tag = 96)
  public final NebulaHotThreads nebula_hot_threads;
  
  @ProtoField(tag = 48, type = Message.Datatype.INT32)
  public final Integer need_log;
  
  @ProtoField(tag = 25)
  public final Novel novel;
  
  @ProtoField(tag = 53)
  public final NtSpreadInfo ntspread;
  
  @ProtoField(tag = 4)
  public final Page page;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 98)
  public final ForumActiveInfo private_forum_active_info;
  
  @ProtoField(tag = 97)
  public final PrivateForumTotalInfo private_forum_info;
  
  @ProtoField(tag = 29)
  public final PushThreadInfo push_thread_info;
  
  @ProtoField(tag = 86)
  public final RecomPostTopic recom_post_topic;
  
  @ProtoField(tag = 46)
  public final RecommendBook recommend_book;
  
  @ProtoField(tag = 118)
  public final RecreationRankInfo recreation_rank_info;
  
  @ProtoField(tag = 90)
  public final RedpacketRain redpacketrain;
  
  @ProtoField(tag = 40)
  public final RecommendInfo school_recom_info;
  
  @ProtoField(tag = 41, type = Message.Datatype.UINT32)
  public final Integer school_recom_pos;
  
  @ProtoField(tag = 31)
  public final SdkTopicThread sdk_topic_thread;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 100)
  public final List<ServiceArea> service_area;
  
  @ProtoField(tag = 108, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
  @ProtoField(tag = 106)
  public final SignActivityInfo sign_activity_info;
  
  @ProtoField(tag = 95)
  public final SmartApp smart_app;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 94, type = Message.Datatype.STRING)
  public final List<String> smart_app_avatar;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer smart_frs_type;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20)
  public final List<StarEnter> star_enter;
  
  @ProtoField(tag = 81)
  public final StarRank star_rank_info;
  
  @ProtoField(tag = 88)
  public final StarVoice star_voice;
  
  @ProtoField(tag = 30)
  public final ThreadInfo store_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.INT64)
  public final List<Long> thread_id_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 64)
  public final List<ThreadIdListInfo> thread_id_list_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 82, type = Message.Datatype.INT32)
  public final Integer trends_redpoint;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 24)
  public final List<ZhiBoInfoTW> twzhibo_info;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer twzhibo_pos;
  
  @ProtoField(tag = 1)
  public final User user;
  
  @ProtoField(tag = 71)
  public final FrsPageUserExtend user_extend;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<User> user_list;
  
  @ProtoField(tag = 73)
  public final FrsVideo video;
  
  @ProtoField(tag = 93, type = Message.Datatype.INT32)
  public final Integer video_auto_play;
  
  @ProtoField(tag = 42)
  public final VitalityInfo vitality_info;
  
  @ProtoField(tag = 111, type = Message.Datatype.INT32)
  public final Integer voice_room_config;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 110)
  public final List<ThreadInfo> voice_room_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 85)
  public final List<WindowToast> window_toast;
  
  @ProtoField(tag = 89)
  public final WorldcupSkin worldcup_skin;
  
  static {
    DEFAULT_THREAD_ID_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_FORTUNE_BAG = integer;
    DEFAULT_TIME = integer;
    DEFAULT_CTIME = integer;
    DEFAULT_LOGID = Long.valueOf(0L);
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_FORUM_LIVEGROUP_LIST = Collections.emptyList();
    DEFAULT_USER_LIST = Collections.emptyList();
    DEFAULT_STAR_ENTER = Collections.emptyList();
    DEFAULT_COLOR_EGG = Collections.emptyList();
    DEFAULT_FRS_TAB_INFO = Collections.emptyList();
    DEFAULT_TWZHIBO_INFO = Collections.emptyList();
    DEFAULT_TWZHIBO_POS = integer;
    DEFAULT_CATEGORY_LIST = Collections.emptyList();
    DEFAULT_CARD_SHIPIN_INFO = Collections.emptyList();
    DEFAULT_FRS_TAB_DEFAULT = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_SCHOOL_RECOM_POS = integer;
    DEFAULT_BANNER_THREAD_LIST = Collections.emptyList();
    DEFAULT_SMART_FRS_TYPE = integer;
    DEFAULT_NEED_LOG = integer;
    DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO = integer;
    DEFAULT_CARD_SHIPIN_POS = Collections.emptyList();
    DEFAULT_CARD_SHIPIN_NEW = Collections.emptyList();
    DEFAULT_ALA_LIVE_COUNT = integer;
    DEFAULT_THREAD_ID_LIST_INFO = Collections.emptyList();
    DEFAULT_FRS_GAME_TAB_INFO = Collections.emptyList();
    DEFAULT_GAME_DEFAULT_TAB_ID = integer;
    DEFAULT_ALA_INSERT_THREAD = Collections.emptyList();
    DEFAULT_ALA_INSERT_FLOOR = integer;
    DEFAULT_ALA_STAGE_LIST = Collections.emptyList();
    DEFAULT_TRENDS_REDPOINT = integer;
    DEFAULT_WINDOW_TOAST = Collections.emptyList();
    DEFAULT_BOTTOM_MENU = Collections.emptyList();
    DEFAULT_VIDEO_AUTO_PLAY = integer;
    DEFAULT_SMART_APP_AVATAR = Collections.emptyList();
    DEFAULT_SERVICE_AREA = Collections.emptyList();
    DEFAULT_IS_GET_HORSE_RACE_LAMP = integer;
    DEFAULT_SHOW_ADSENSE = integer;
    DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
    DEFAULT_VOICE_ROOM_CONFIG = integer;
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_AD_MIX_LIST = Collections.emptyList();
    DEFAULT_LIVE_FUSE_FORUM = Collections.emptyList();
    DEFAULT_BAWU_UNREAD_NOTICE_NUM = integer;
    DEFAULT_IS_MEMBER_BROADCAST_FORUM = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.frs_star = paramBuilder.frs_star;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.group = paramBuilder.group;
      List<ThreadInfo> list23 = paramBuilder.thread_list;
      if (list23 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list23);
      } 
      List<Long> list22 = paramBuilder.thread_id_list;
      if (list22 == null) {
        this.thread_id_list = DEFAULT_THREAD_ID_LIST;
      } else {
        this.thread_id_list = Message.immutableCopyOf(list22);
      } 
      Integer integer13 = paramBuilder.is_new_url;
      if (integer13 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer13;
      } 
      integer13 = paramBuilder.fortune_bag;
      if (integer13 == null) {
        this.fortune_bag = DEFAULT_FORTUNE_BAG;
      } else {
        this.fortune_bag = integer13;
      } 
      integer13 = paramBuilder.time;
      if (integer13 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer13;
      } 
      integer13 = paramBuilder.ctime;
      if (integer13 == null) {
        this.ctime = DEFAULT_CTIME;
      } else {
        this.ctime = integer13;
      } 
      Long long_ = paramBuilder.logid;
      if (long_ == null) {
        this.logid = DEFAULT_LOGID;
      } else {
        this.logid = long_;
      } 
      Integer integer12 = paramBuilder.server_time;
      if (integer12 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer12;
      } 
      this.info = paramBuilder.info;
      List<AnchorInfo> list21 = paramBuilder.forum_livegroup_list;
      if (list21 == null) {
        this.forum_livegroup_list = DEFAULT_FORUM_LIVEGROUP_LIST;
      } else {
        this.forum_livegroup_list = Message.immutableCopyOf(list21);
      } 
      List<User> list20 = paramBuilder.user_list;
      if (list20 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list20);
      } 
      this.gcon_account = paramBuilder.gcon_account;
      String str5 = paramBuilder.fortune_desc;
      if (str5 == null) {
        this.fortune_desc = "";
      } else {
        this.fortune_desc = str5;
      } 
      List<StarEnter> list19 = paramBuilder.star_enter;
      if (list19 == null) {
        this.star_enter = DEFAULT_STAR_ENTER;
      } else {
        this.star_enter = Message.immutableCopyOf(list19);
      } 
      List<ColorEgg> list18 = paramBuilder.color_egg;
      if (list18 == null) {
        this.color_egg = DEFAULT_COLOR_EGG;
      } else {
        this.color_egg = Message.immutableCopyOf(list18);
      } 
      List<FrsTabInfo> list17 = paramBuilder.frs_tab_info;
      if (list17 == null) {
        this.frs_tab_info = DEFAULT_FRS_TAB_INFO;
      } else {
        this.frs_tab_info = Message.immutableCopyOf(list17);
      } 
      this.activityhead = paramBuilder.activityhead;
      List<ZhiBoInfoTW> list16 = paramBuilder.twzhibo_info;
      if (list16 == null) {
        this.twzhibo_info = DEFAULT_TWZHIBO_INFO;
      } else {
        this.twzhibo_info = Message.immutableCopyOf(list16);
      } 
      this.novel = paramBuilder.novel;
      this.hot_twzhibo_info = paramBuilder.hot_twzhibo_info;
      Integer integer11 = paramBuilder.twzhibo_pos;
      if (integer11 == null) {
        this.twzhibo_pos = DEFAULT_TWZHIBO_POS;
      } else {
        this.twzhibo_pos = integer11;
      } 
      List<CategoryInfo> list15 = paramBuilder.category_list;
      if (list15 == null) {
        this.category_list = DEFAULT_CATEGORY_LIST;
      } else {
        this.category_list = Message.immutableCopyOf(list15);
      } 
      this.push_thread_info = paramBuilder.push_thread_info;
      this.store_card = paramBuilder.store_card;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      String str4 = paramBuilder.bawu_enter_url;
      if (str4 == null) {
        this.bawu_enter_url = "";
      } else {
        this.bawu_enter_url = str4;
      } 
      this.client_platform = paramBuilder.client_platform;
      this.head_sdk = paramBuilder.head_sdk;
      List<ThreadInfo> list14 = paramBuilder.card_shipin_info;
      if (list14 == null) {
        this.card_shipin_info = DEFAULT_CARD_SHIPIN_INFO;
      } else {
        this.card_shipin_info = Message.immutableCopyOf(list14);
      } 
      this.nav_tab_info = paramBuilder.nav_tab_info;
      Integer integer10 = paramBuilder.frs_tab_default;
      if (integer10 == null) {
        this.frs_tab_default = DEFAULT_FRS_TAB_DEFAULT;
      } else {
        this.frs_tab_default = integer10;
      } 
      integer10 = paramBuilder.sort_type;
      if (integer10 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer10;
      } 
      this.school_recom_info = paramBuilder.school_recom_info;
      integer10 = paramBuilder.school_recom_pos;
      if (integer10 == null) {
        this.school_recom_pos = DEFAULT_SCHOOL_RECOM_POS;
      } else {
        this.school_recom_pos = integer10;
      } 
      this.vitality_info = paramBuilder.vitality_info;
      this.carrier_enter = paramBuilder.carrier_enter;
      List<BannerThreadInfo> list13 = paramBuilder.banner_thread_list;
      if (list13 == null) {
        this.banner_thread_list = DEFAULT_BANNER_THREAD_LIST;
      } else {
        this.banner_thread_list = Message.immutableCopyOf(list13);
      } 
      this.recommend_book = paramBuilder.recommend_book;
      Integer integer9 = paramBuilder.smart_frs_type;
      if (integer9 == null) {
        this.smart_frs_type = DEFAULT_SMART_FRS_TYPE;
      } else {
        this.smart_frs_type = integer9;
      } 
      integer9 = paramBuilder.need_log;
      if (integer9 == null) {
        this.need_log = DEFAULT_NEED_LOG;
      } else {
        this.need_log = integer9;
      } 
      integer9 = paramBuilder.is_auto_play_forumheadvideo;
      if (integer9 == null) {
        this.is_auto_play_forumheadvideo = DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO;
      } else {
        this.is_auto_play_forumheadvideo = integer9;
      } 
      this.book_info = paramBuilder.book_info;
      this.forum_present_info = paramBuilder.forum_present_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      this.ntspread = paramBuilder.ntspread;
      List<Integer> list12 = paramBuilder.card_shipin_pos;
      if (list12 == null) {
        this.card_shipin_pos = DEFAULT_CARD_SHIPIN_POS;
      } else {
        this.card_shipin_pos = Message.immutableCopyOf(list12);
      } 
      List<ThreadInfo> list11 = paramBuilder.card_shipin_new;
      if (list11 == null) {
        this.card_shipin_new = DEFAULT_CARD_SHIPIN_NEW;
      } else {
        this.card_shipin_new = Message.immutableCopyOf(list11);
      } 
      String str3 = paramBuilder.asp_shown_info;
      if (str3 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str3;
      } 
      Integer integer8 = paramBuilder.ala_live_count;
      if (integer8 == null) {
        this.ala_live_count = DEFAULT_ALA_LIVE_COUNT;
      } else {
        this.ala_live_count = integer8;
      } 
      this.bottle = paramBuilder.bottle;
      this.enter_pop_info = paramBuilder.enter_pop_info;
      String str2 = paramBuilder.partial_visible_toast;
      if (str2 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str2;
      } 
      this.esport = paramBuilder.esport;
      List<ThreadIdListInfo> list10 = paramBuilder.thread_id_list_info;
      if (list10 == null) {
        this.thread_id_list_info = DEFAULT_THREAD_ID_LIST_INFO;
      } else {
        this.thread_id_list_info = Message.immutableCopyOf(list10);
      } 
      this.agree_banner = paramBuilder.agree_banner;
      this.na_guide = paramBuilder.na_guide;
      List<FrsTabInfo> list9 = paramBuilder.frs_game_tab_info;
      if (list9 == null) {
        this.frs_game_tab_info = DEFAULT_FRS_GAME_TAB_INFO;
      } else {
        this.frs_game_tab_info = Message.immutableCopyOf(list9);
      } 
      this.live_frs_notify = paramBuilder.live_frs_notify;
      this.banner_user_story = paramBuilder.banner_user_story;
      this.user_extend = paramBuilder.user_extend;
      this.forum_head_icon = paramBuilder.forum_head_icon;
      this.video = paramBuilder.video;
      Integer integer7 = paramBuilder.game_default_tab_id;
      if (integer7 == null) {
        this.game_default_tab_id = DEFAULT_GAME_DEFAULT_TAB_ID;
      } else {
        this.game_default_tab_id = integer7;
      } 
      List<ThreadInfo> list8 = paramBuilder.ala_insert_thread;
      if (list8 == null) {
        this.ala_insert_thread = DEFAULT_ALA_INSERT_THREAD;
      } else {
        this.ala_insert_thread = Message.immutableCopyOf(list8);
      } 
      this.ala_live_insert = paramBuilder.ala_live_insert;
      Integer integer6 = paramBuilder.ala_insert_floor;
      if (integer6 == null) {
        this.ala_insert_floor = DEFAULT_ALA_INSERT_FLOOR;
      } else {
        this.ala_insert_floor = integer6;
      } 
      this.forum_ar_info = paramBuilder.forum_ar_info;
      List<ThreadInfo> list7 = paramBuilder.ala_stage_list;
      if (list7 == null) {
        this.ala_stage_list = DEFAULT_ALA_STAGE_LIST;
      } else {
        this.ala_stage_list = Message.immutableCopyOf(list7);
      } 
      this.star_rank_info = paramBuilder.star_rank_info;
      Integer integer5 = paramBuilder.trends_redpoint;
      if (integer5 == null) {
        this.trends_redpoint = DEFAULT_TRENDS_REDPOINT;
      } else {
        this.trends_redpoint = integer5;
      } 
      List<WindowToast> list6 = paramBuilder.window_toast;
      if (list6 == null) {
        this.window_toast = DEFAULT_WINDOW_TOAST;
      } else {
        this.window_toast = Message.immutableCopyOf(list6);
      } 
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.activity_config = paramBuilder.activity_config;
      this.star_voice = paramBuilder.star_voice;
      this.worldcup_skin = paramBuilder.worldcup_skin;
      this.redpacketrain = paramBuilder.redpacketrain;
      this.brand_forum_info = paramBuilder.brand_forum_info;
      List<BottomMenu> list5 = paramBuilder.bottom_menu;
      if (list5 == null) {
        this.bottom_menu = DEFAULT_BOTTOM_MENU;
      } else {
        this.bottom_menu = Message.immutableCopyOf(list5);
      } 
      Integer integer4 = paramBuilder.video_auto_play;
      if (integer4 == null) {
        this.video_auto_play = DEFAULT_VIDEO_AUTO_PLAY;
      } else {
        this.video_auto_play = integer4;
      } 
      List<String> list4 = paramBuilder.smart_app_avatar;
      if (list4 == null) {
        this.smart_app_avatar = DEFAULT_SMART_APP_AVATAR;
      } else {
        this.smart_app_avatar = Message.immutableCopyOf(list4);
      } 
      this.smart_app = paramBuilder.smart_app;
      this.nebula_hot_threads = paramBuilder.nebula_hot_threads;
      this.private_forum_info = paramBuilder.private_forum_info;
      this.private_forum_active_info = paramBuilder.private_forum_active_info;
      this.business_promot = paramBuilder.business_promot;
      List<ServiceArea> list3 = paramBuilder.service_area;
      if (list3 == null) {
        this.service_area = DEFAULT_SERVICE_AREA;
      } else {
        this.service_area = Message.immutableCopyOf(list3);
      } 
      this.bazhu_exam_fail = paramBuilder.bazhu_exam_fail;
      this.hot_user_entry = paramBuilder.hot_user_entry;
      this.item_info = paramBuilder.item_info;
      Integer integer3 = paramBuilder.is_get_horse_race_lamp;
      if (integer3 == null) {
        this.is_get_horse_race_lamp = DEFAULT_IS_GET_HORSE_RACE_LAMP;
      } else {
        this.is_get_horse_race_lamp = integer3;
      } 
      this.forum_rule = paramBuilder.forum_rule;
      this.sign_activity_info = paramBuilder.sign_activity_info;
      this.add_bawu_pop = paramBuilder.add_bawu_pop;
      integer3 = paramBuilder.show_adsense;
      if (integer3 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer3;
      } 
      this.frsmask_pop_info = paramBuilder.frsmask_pop_info;
      List<ThreadInfo> list2 = paramBuilder.voice_room_list;
      if (list2 == null) {
        this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
      } else {
        this.voice_room_list = Message.immutableCopyOf(list2);
      } 
      Integer integer2 = paramBuilder.voice_room_config;
      if (integer2 == null) {
        this.voice_room_config = DEFAULT_VOICE_ROOM_CONFIG;
      } else {
        this.voice_room_config = integer2;
      } 
      integer2 = paramBuilder.ad_show_select;
      if (integer2 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer2;
      } 
      List<AdMixFloor> list1 = paramBuilder.ad_mix_list;
      if (list1 == null) {
        this.ad_mix_list = DEFAULT_AD_MIX_LIST;
      } else {
        this.ad_mix_list = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.ad_sample_map_key;
      if (str1 == null) {
        this.ad_sample_map_key = "";
      } else {
        this.ad_sample_map_key = str1;
      } 
      this.bawutask_pop = paramBuilder.bawutask_pop;
      List<LiveFuseForumData> list = paramBuilder.live_fuse_forum;
      if (list == null) {
        this.live_fuse_forum = DEFAULT_LIVE_FUSE_FORUM;
      } else {
        this.live_fuse_forum = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.bawu_unread_notice_num;
      if (integer1 == null) {
        this.bawu_unread_notice_num = DEFAULT_BAWU_UNREAD_NOTICE_NUM;
      } else {
        this.bawu_unread_notice_num = integer1;
      } 
      this.recreation_rank_info = paramBuilder.recreation_rank_info;
      integer1 = paramBuilder.is_member_broadcast_forum;
      if (integer1 == null) {
        this.is_member_broadcast_forum = DEFAULT_IS_MEMBER_BROADCAST_FORUM;
      } else {
        this.is_member_broadcast_forum = integer1;
      } 
      this.forum_group = paramBuilder.forum_group;
      this.frs_banner_header = paramBuilder.frs_banner_header;
    } else {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.frs_star = paramBuilder.frs_star;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.group = paramBuilder.group;
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.thread_id_list = Message.immutableCopyOf(paramBuilder.thread_id_list);
      this.is_new_url = paramBuilder.is_new_url;
      this.fortune_bag = paramBuilder.fortune_bag;
      this.time = paramBuilder.time;
      this.ctime = paramBuilder.ctime;
      this.logid = paramBuilder.logid;
      this.server_time = paramBuilder.server_time;
      this.info = paramBuilder.info;
      this.forum_livegroup_list = Message.immutableCopyOf(paramBuilder.forum_livegroup_list);
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.gcon_account = paramBuilder.gcon_account;
      this.fortune_desc = paramBuilder.fortune_desc;
      this.star_enter = Message.immutableCopyOf(paramBuilder.star_enter);
      this.color_egg = Message.immutableCopyOf(paramBuilder.color_egg);
      this.frs_tab_info = Message.immutableCopyOf(paramBuilder.frs_tab_info);
      this.activityhead = paramBuilder.activityhead;
      this.twzhibo_info = Message.immutableCopyOf(paramBuilder.twzhibo_info);
      this.novel = paramBuilder.novel;
      this.hot_twzhibo_info = paramBuilder.hot_twzhibo_info;
      this.twzhibo_pos = paramBuilder.twzhibo_pos;
      this.category_list = Message.immutableCopyOf(paramBuilder.category_list);
      this.push_thread_info = paramBuilder.push_thread_info;
      this.store_card = paramBuilder.store_card;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      this.bawu_enter_url = paramBuilder.bawu_enter_url;
      this.client_platform = paramBuilder.client_platform;
      this.head_sdk = paramBuilder.head_sdk;
      this.card_shipin_info = Message.immutableCopyOf(paramBuilder.card_shipin_info);
      this.nav_tab_info = paramBuilder.nav_tab_info;
      this.frs_tab_default = paramBuilder.frs_tab_default;
      this.sort_type = paramBuilder.sort_type;
      this.school_recom_info = paramBuilder.school_recom_info;
      this.school_recom_pos = paramBuilder.school_recom_pos;
      this.vitality_info = paramBuilder.vitality_info;
      this.carrier_enter = paramBuilder.carrier_enter;
      this.banner_thread_list = Message.immutableCopyOf(paramBuilder.banner_thread_list);
      this.recommend_book = paramBuilder.recommend_book;
      this.smart_frs_type = paramBuilder.smart_frs_type;
      this.need_log = paramBuilder.need_log;
      this.is_auto_play_forumheadvideo = paramBuilder.is_auto_play_forumheadvideo;
      this.book_info = paramBuilder.book_info;
      this.forum_present_info = paramBuilder.forum_present_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      this.ntspread = paramBuilder.ntspread;
      this.card_shipin_pos = Message.immutableCopyOf(paramBuilder.card_shipin_pos);
      this.card_shipin_new = Message.immutableCopyOf(paramBuilder.card_shipin_new);
      this.asp_shown_info = paramBuilder.asp_shown_info;
      this.ala_live_count = paramBuilder.ala_live_count;
      this.bottle = paramBuilder.bottle;
      this.enter_pop_info = paramBuilder.enter_pop_info;
      this.partial_visible_toast = paramBuilder.partial_visible_toast;
      this.esport = paramBuilder.esport;
      this.thread_id_list_info = Message.immutableCopyOf(paramBuilder.thread_id_list_info);
      this.agree_banner = paramBuilder.agree_banner;
      this.na_guide = paramBuilder.na_guide;
      this.frs_game_tab_info = Message.immutableCopyOf(paramBuilder.frs_game_tab_info);
      this.live_frs_notify = paramBuilder.live_frs_notify;
      this.banner_user_story = paramBuilder.banner_user_story;
      this.user_extend = paramBuilder.user_extend;
      this.forum_head_icon = paramBuilder.forum_head_icon;
      this.video = paramBuilder.video;
      this.game_default_tab_id = paramBuilder.game_default_tab_id;
      this.ala_insert_thread = Message.immutableCopyOf(paramBuilder.ala_insert_thread);
      this.ala_live_insert = paramBuilder.ala_live_insert;
      this.ala_insert_floor = paramBuilder.ala_insert_floor;
      this.forum_ar_info = paramBuilder.forum_ar_info;
      this.ala_stage_list = Message.immutableCopyOf(paramBuilder.ala_stage_list);
      this.star_rank_info = paramBuilder.star_rank_info;
      this.trends_redpoint = paramBuilder.trends_redpoint;
      this.window_toast = Message.immutableCopyOf(paramBuilder.window_toast);
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.activity_config = paramBuilder.activity_config;
      this.star_voice = paramBuilder.star_voice;
      this.worldcup_skin = paramBuilder.worldcup_skin;
      this.redpacketrain = paramBuilder.redpacketrain;
      this.brand_forum_info = paramBuilder.brand_forum_info;
      this.bottom_menu = Message.immutableCopyOf(paramBuilder.bottom_menu);
      this.video_auto_play = paramBuilder.video_auto_play;
      this.smart_app_avatar = Message.immutableCopyOf(paramBuilder.smart_app_avatar);
      this.smart_app = paramBuilder.smart_app;
      this.nebula_hot_threads = paramBuilder.nebula_hot_threads;
      this.private_forum_info = paramBuilder.private_forum_info;
      this.private_forum_active_info = paramBuilder.private_forum_active_info;
      this.business_promot = paramBuilder.business_promot;
      this.service_area = Message.immutableCopyOf(paramBuilder.service_area);
      this.bazhu_exam_fail = paramBuilder.bazhu_exam_fail;
      this.hot_user_entry = paramBuilder.hot_user_entry;
      this.item_info = paramBuilder.item_info;
      this.is_get_horse_race_lamp = paramBuilder.is_get_horse_race_lamp;
      this.forum_rule = paramBuilder.forum_rule;
      this.sign_activity_info = paramBuilder.sign_activity_info;
      this.add_bawu_pop = paramBuilder.add_bawu_pop;
      this.show_adsense = paramBuilder.show_adsense;
      this.frsmask_pop_info = paramBuilder.frsmask_pop_info;
      this.voice_room_list = Message.immutableCopyOf(paramBuilder.voice_room_list);
      this.voice_room_config = paramBuilder.voice_room_config;
      this.ad_show_select = paramBuilder.ad_show_select;
      this.ad_mix_list = Message.immutableCopyOf(paramBuilder.ad_mix_list);
      this.ad_sample_map_key = paramBuilder.ad_sample_map_key;
      this.bawutask_pop = paramBuilder.bawutask_pop;
      this.live_fuse_forum = Message.immutableCopyOf(paramBuilder.live_fuse_forum);
      this.bawu_unread_notice_num = paramBuilder.bawu_unread_notice_num;
      this.recreation_rank_info = paramBuilder.recreation_rank_info;
      this.is_member_broadcast_forum = paramBuilder.is_member_broadcast_forum;
      this.forum_group = paramBuilder.forum_group;
      this.frs_banner_header = paramBuilder.frs_banner_header;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ActivityConfig activity_config;
    
    public ActivityHead activityhead;
    
    public List<AdMixFloor> ad_mix_list;
    
    public String ad_sample_map_key;
    
    public Integer ad_show_select;
    
    public AddBawuPopInfo add_bawu_pop;
    
    public AgreeBanner agree_banner;
    
    public Integer ala_insert_floor;
    
    public List<ThreadInfo> ala_insert_thread;
    
    public Integer ala_live_count;
    
    public AlaLiveInsert ala_live_insert;
    
    public List<ThreadInfo> ala_stage_list;
    
    public Anti anti;
    
    public String asp_shown_info;
    
    public List<BannerThreadInfo> banner_thread_list;
    
    public BannerUserStory banner_user_story;
    
    public String bawu_enter_url;
    
    public Integer bawu_unread_notice_num;
    
    public PrivatePopInfo bawutask_pop;
    
    public WindowToast bazhu_exam_fail;
    
    public ForumBookInfo book_info;
    
    public Bottle bottle;
    
    public List<BottomMenu> bottom_menu;
    
    public BrandForumInfo brand_forum_info;
    
    public BusinessPromot business_promot;
    
    public List<ThreadInfo> card_shipin_info;
    
    public List<ThreadInfo> card_shipin_new;
    
    public List<Integer> card_shipin_pos;
    
    public CarrierEnter carrier_enter;
    
    public List<CategoryInfo> category_list;
    
    public ClientPlatform client_platform;
    
    public List<ColorEgg> color_egg;
    
    public Integer ctime;
    
    public PopInfo enter_pop_info;
    
    public Esport esport;
    
    public Integer fortune_bag;
    
    public String fortune_desc;
    
    public ForumInfo forum;
    
    public ForumArIno forum_ar_info;
    
    public ForumGroup forum_group;
    
    public ForumHeadIcon forum_head_icon;
    
    public ForumHeadlineImgInfo forum_headline_img_info;
    
    public List<AnchorInfo> forum_livegroup_list;
    
    public ForumPresentInfo forum_present_info;
    
    public ForumRuleStatus forum_rule;
    
    public FrsBannerHeader frs_banner_header;
    
    public List<FrsTabInfo> frs_game_tab_info;
    
    public StarInfo frs_star;
    
    public Integer frs_tab_default;
    
    public List<FrsTabInfo> frs_tab_info;
    
    public PopInfo frsmask_pop_info;
    
    public Integer game_default_tab_id;
    
    public GconAccount gcon_account;
    
    public Group group;
    
    public HeadSdk head_sdk;
    
    public ZhiBoInfoTW hot_twzhibo_info;
    
    public HotUserRankEntry hot_user_entry;
    
    public Info info;
    
    public Integer is_auto_play_forumheadvideo;
    
    public Integer is_get_horse_race_lamp;
    
    public Integer is_member_broadcast_forum;
    
    public Integer is_new_url;
    
    public ItemInfo item_info;
    
    public AlaLiveNotify live_frs_notify;
    
    public List<LiveFuseForumData> live_fuse_forum;
    
    public Long logid;
    
    public NaGuide na_guide;
    
    public NavTabInfo nav_tab_info;
    
    public NebulaHotThreads nebula_hot_threads;
    
    public Integer need_log;
    
    public Novel novel;
    
    public NtSpreadInfo ntspread;
    
    public Page page;
    
    public String partial_visible_toast;
    
    public ForumActiveInfo private_forum_active_info;
    
    public PrivateForumTotalInfo private_forum_info;
    
    public PushThreadInfo push_thread_info;
    
    public RecomPostTopic recom_post_topic;
    
    public RecommendBook recommend_book;
    
    public RecreationRankInfo recreation_rank_info;
    
    public RedpacketRain redpacketrain;
    
    public RecommendInfo school_recom_info;
    
    public Integer school_recom_pos;
    
    public SdkTopicThread sdk_topic_thread;
    
    public Integer server_time;
    
    public List<ServiceArea> service_area;
    
    public Integer show_adsense;
    
    public SignActivityInfo sign_activity_info;
    
    public SmartApp smart_app;
    
    public List<String> smart_app_avatar;
    
    public Integer smart_frs_type;
    
    public Integer sort_type;
    
    public List<StarEnter> star_enter;
    
    public StarRank star_rank_info;
    
    public StarVoice star_voice;
    
    public ThreadInfo store_card;
    
    public List<Long> thread_id_list;
    
    public List<ThreadIdListInfo> thread_id_list_info;
    
    public List<ThreadInfo> thread_list;
    
    public Integer time;
    
    public Integer trends_redpoint;
    
    public List<ZhiBoInfoTW> twzhibo_info;
    
    public Integer twzhibo_pos;
    
    public User user;
    
    public FrsPageUserExtend user_extend;
    
    public List<User> user_list;
    
    public FrsVideo video;
    
    public Integer video_auto_play;
    
    public VitalityInfo vitality_info;
    
    public Integer voice_room_config;
    
    public List<ThreadInfo> voice_room_list;
    
    public List<WindowToast> window_toast;
    
    public WorldcupSkin worldcup_skin;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.forum = param1DataRes.forum;
      this.frs_star = param1DataRes.frs_star;
      this.page = param1DataRes.page;
      this.anti = param1DataRes.anti;
      this.group = param1DataRes.group;
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.thread_id_list = Message.copyOf(param1DataRes.thread_id_list);
      this.is_new_url = param1DataRes.is_new_url;
      this.fortune_bag = param1DataRes.fortune_bag;
      this.time = param1DataRes.time;
      this.ctime = param1DataRes.ctime;
      this.logid = param1DataRes.logid;
      this.server_time = param1DataRes.server_time;
      this.info = param1DataRes.info;
      this.forum_livegroup_list = Message.copyOf(param1DataRes.forum_livegroup_list);
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.gcon_account = param1DataRes.gcon_account;
      this.fortune_desc = param1DataRes.fortune_desc;
      this.star_enter = Message.copyOf(param1DataRes.star_enter);
      this.color_egg = Message.copyOf(param1DataRes.color_egg);
      this.frs_tab_info = Message.copyOf(param1DataRes.frs_tab_info);
      this.activityhead = param1DataRes.activityhead;
      this.twzhibo_info = Message.copyOf(param1DataRes.twzhibo_info);
      this.novel = param1DataRes.novel;
      this.hot_twzhibo_info = param1DataRes.hot_twzhibo_info;
      this.twzhibo_pos = param1DataRes.twzhibo_pos;
      this.category_list = Message.copyOf(param1DataRes.category_list);
      this.push_thread_info = param1DataRes.push_thread_info;
      this.store_card = param1DataRes.store_card;
      this.sdk_topic_thread = param1DataRes.sdk_topic_thread;
      this.bawu_enter_url = param1DataRes.bawu_enter_url;
      this.client_platform = param1DataRes.client_platform;
      this.head_sdk = param1DataRes.head_sdk;
      this.card_shipin_info = Message.copyOf(param1DataRes.card_shipin_info);
      this.nav_tab_info = param1DataRes.nav_tab_info;
      this.frs_tab_default = param1DataRes.frs_tab_default;
      this.sort_type = param1DataRes.sort_type;
      this.school_recom_info = param1DataRes.school_recom_info;
      this.school_recom_pos = param1DataRes.school_recom_pos;
      this.vitality_info = param1DataRes.vitality_info;
      this.carrier_enter = param1DataRes.carrier_enter;
      this.banner_thread_list = Message.copyOf(param1DataRes.banner_thread_list);
      this.recommend_book = param1DataRes.recommend_book;
      this.smart_frs_type = param1DataRes.smart_frs_type;
      this.need_log = param1DataRes.need_log;
      this.is_auto_play_forumheadvideo = param1DataRes.is_auto_play_forumheadvideo;
      this.book_info = param1DataRes.book_info;
      this.forum_present_info = param1DataRes.forum_present_info;
      this.forum_headline_img_info = param1DataRes.forum_headline_img_info;
      this.ntspread = param1DataRes.ntspread;
      this.card_shipin_pos = Message.copyOf(param1DataRes.card_shipin_pos);
      this.card_shipin_new = Message.copyOf(param1DataRes.card_shipin_new);
      this.asp_shown_info = param1DataRes.asp_shown_info;
      this.ala_live_count = param1DataRes.ala_live_count;
      this.bottle = param1DataRes.bottle;
      this.enter_pop_info = param1DataRes.enter_pop_info;
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
      this.esport = param1DataRes.esport;
      this.thread_id_list_info = Message.copyOf(param1DataRes.thread_id_list_info);
      this.agree_banner = param1DataRes.agree_banner;
      this.na_guide = param1DataRes.na_guide;
      this.frs_game_tab_info = Message.copyOf(param1DataRes.frs_game_tab_info);
      this.live_frs_notify = param1DataRes.live_frs_notify;
      this.banner_user_story = param1DataRes.banner_user_story;
      this.user_extend = param1DataRes.user_extend;
      this.forum_head_icon = param1DataRes.forum_head_icon;
      this.video = param1DataRes.video;
      this.game_default_tab_id = param1DataRes.game_default_tab_id;
      this.ala_insert_thread = Message.copyOf(param1DataRes.ala_insert_thread);
      this.ala_live_insert = param1DataRes.ala_live_insert;
      this.ala_insert_floor = param1DataRes.ala_insert_floor;
      this.forum_ar_info = param1DataRes.forum_ar_info;
      this.ala_stage_list = Message.copyOf(param1DataRes.ala_stage_list);
      this.star_rank_info = param1DataRes.star_rank_info;
      this.trends_redpoint = param1DataRes.trends_redpoint;
      this.window_toast = Message.copyOf(param1DataRes.window_toast);
      this.recom_post_topic = param1DataRes.recom_post_topic;
      this.activity_config = param1DataRes.activity_config;
      this.star_voice = param1DataRes.star_voice;
      this.worldcup_skin = param1DataRes.worldcup_skin;
      this.redpacketrain = param1DataRes.redpacketrain;
      this.brand_forum_info = param1DataRes.brand_forum_info;
      this.bottom_menu = Message.copyOf(param1DataRes.bottom_menu);
      this.video_auto_play = param1DataRes.video_auto_play;
      this.smart_app_avatar = Message.copyOf(param1DataRes.smart_app_avatar);
      this.smart_app = param1DataRes.smart_app;
      this.nebula_hot_threads = param1DataRes.nebula_hot_threads;
      this.private_forum_info = param1DataRes.private_forum_info;
      this.private_forum_active_info = param1DataRes.private_forum_active_info;
      this.business_promot = param1DataRes.business_promot;
      this.service_area = Message.copyOf(param1DataRes.service_area);
      this.bazhu_exam_fail = param1DataRes.bazhu_exam_fail;
      this.hot_user_entry = param1DataRes.hot_user_entry;
      this.item_info = param1DataRes.item_info;
      this.is_get_horse_race_lamp = param1DataRes.is_get_horse_race_lamp;
      this.forum_rule = param1DataRes.forum_rule;
      this.sign_activity_info = param1DataRes.sign_activity_info;
      this.add_bawu_pop = param1DataRes.add_bawu_pop;
      this.show_adsense = param1DataRes.show_adsense;
      this.frsmask_pop_info = param1DataRes.frsmask_pop_info;
      this.voice_room_list = Message.copyOf(param1DataRes.voice_room_list);
      this.voice_room_config = param1DataRes.voice_room_config;
      this.ad_show_select = param1DataRes.ad_show_select;
      this.ad_mix_list = Message.copyOf(param1DataRes.ad_mix_list);
      this.ad_sample_map_key = param1DataRes.ad_sample_map_key;
      this.bawutask_pop = param1DataRes.bawutask_pop;
      this.live_fuse_forum = Message.copyOf(param1DataRes.live_fuse_forum);
      this.bawu_unread_notice_num = param1DataRes.bawu_unread_notice_num;
      this.recreation_rank_info = param1DataRes.recreation_rank_info;
      this.is_member_broadcast_forum = param1DataRes.is_member_broadcast_forum;
      this.forum_group = param1DataRes.forum_group;
      this.frs_banner_header = param1DataRes.frs_banner_header;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
