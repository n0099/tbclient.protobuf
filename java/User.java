import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActivitySponsor;
import tbclient.AlaLiveInfo;
import tbclient.AlaUserInfo;
import tbclient.BaijiahaoInfo;
import tbclient.Balv;
import tbclient.BawuThrones;
import tbclient.BazhuSign;
import tbclient.BirthdayInfo;
import tbclient.BusinessAccountInfo;
import tbclient.CallFansInfo;
import tbclient.ConsumeInfo;
import tbclient.CreationData;
import tbclient.Ecom;
import tbclient.EsportInfo;
import tbclient.ForumToolPerm;
import tbclient.GiftInfo;
import tbclient.GodInfo;
import tbclient.Icon;
import tbclient.LikeForumInfo;
import tbclient.LiveRoomInfo;
import tbclient.MyGroupInfo;
import tbclient.NewGodInfo;
import tbclient.NewParrScores;
import tbclient.NewUser;
import tbclient.NovelFansInfo;
import tbclient.PayMemberInfo;
import tbclient.Pendant;
import tbclient.PrivSets;
import tbclient.SimpleUser;
import tbclient.SpringVirtualUser;
import tbclient.TbVipInfo;
import tbclient.ThemeCardInUser;
import tbclient.TshowInfo;
import tbclient.TwAnchorProfitItem;
import tbclient.TwZhiBoUser;
import tbclient.User;
import tbclient.UserPics;
import tbclient.UserVideoChannelInfo;
import tbclient.UserVipInfo;
import tbclient.VipCloseAd;
import tbclient.VipShowInfo;
import tbclient.WorkCreatorInfo;

public final class User extends Message {
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_APPEAL_THREAD_POPOVER = "";
  
  public static final String DEFAULT_BAWU_TYPE = "";
  
  public static final String DEFAULT_BDUSS = "";
  
  public static final String DEFAULT_BG_PIC = "";
  
  public static final Integer DEFAULT_BIMG_END_TIME;
  
  public static final String DEFAULT_BIMG_URL = "";
  
  public static final Integer DEFAULT_BOOKMARK_COUNT;
  
  public static final Integer DEFAULT_BOOKMARK_NEW_COUNT;
  
  public static final Integer DEFAULT_CAN_MODIFY_AVATAR;
  
  public static final Integer DEFAULT_CONCERN_NUM;
  
  public static final Integer DEFAULT_DISPLAY_AUTH_TYPE;
  
  public static final Integer DEFAULT_EACH_OTHER_FRIEND;
  
  public static final String DEFAULT_FANS_NICKNAME = "";
  
  public static final Integer DEFAULT_FANS_NUM;
  
  public static final Integer DEFAULT_FAVORITE_NUM;
  
  public static final String DEFAULT_FOLLOW_FROM = "";
  
  public static final List<ForumToolPerm> DEFAULT_FORUM_TOOL_AUTH;
  
  public static final Long DEFAULT_FRIEND_NUM;
  
  public static final Integer DEFAULT_GENDER;
  
  public static final List<GiftInfo> DEFAULT_GIFT_LIST;
  
  public static final Integer DEFAULT_GIFT_NUM;
  
  public static final List<MyGroupInfo> DEFAULT_GROUPLIST;
  
  public static final Integer DEFAULT_HAS_BOTTLE_ENTER;
  
  public static final Integer DEFAULT_HAS_CONCERNED;
  
  public static final Integer DEFAULT_HEAVY_USER;
  
  public static final List<Icon> DEFAULT_ICONINFO;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_INFLUENCE;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_IOS_BIMG_FORMAT = "";
  
  public static final String DEFAULT_IP = "";
  
  public static final Integer DEFAULT_IS_BAWU;
  
  public static final Integer DEFAULT_IS_COREUSER;
  
  public static final Integer DEFAULT_IS_DEFAULT_AVATAR;
  
  public static final Integer DEFAULT_IS_FANS;
  
  public static final Integer DEFAULT_IS_FRIEND;
  
  public static final Integer DEFAULT_IS_GUANFANG;
  
  public static final Integer DEFAULT_IS_HUINIBUKE;
  
  public static final Integer DEFAULT_IS_INTERESTMAN;
  
  public static final Integer DEFAULT_IS_INVITED;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_LOGIN;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final Integer DEFAULT_IS_MASK;
  
  public static final Integer DEFAULT_IS_MEM;
  
  public static final Integer DEFAULT_IS_SELECT_TAIL;
  
  public static final Integer DEFAULT_IS_SHOW_REDPACKET;
  
  public static final Integer DEFAULT_IS_VERIFY;
  
  public static final Integer DEFAULT_IS_VIDEOBIGGIE;
  
  public static final Integer DEFAULT_LEFT_CALL_NUM;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_LEVEL_INFLUENCE = "";
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final List<LikeForumInfo> DEFAULT_LIKEFORUM;
  
  public static final List<BazhuSign> DEFAULT_MANAGER_FORUM;
  
  public static final Integer DEFAULT_MEIZHI_LEVEL;
  
  public static final String DEFAULT_MODIFY_AVATAR_DESC = "";
  
  public static final List<SimpleUser> DEFAULT_MUTE_USER;
  
  public static final Integer DEFAULT_MY_LIKE_NUM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final List<TshowInfo> DEFAULT_NEW_TSHOW_ICON;
  
  public static final Integer DEFAULT_NICKNAME_UPDATE_TIME;
  
  public static final Integer DEFAULT_NO_POST_HIGH;
  
  public static final Integer DEFAULT_NO_UN;
  
  public static final String DEFAULT_PASSWD = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_PORTRAITH = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_PRIV_THREAD;
  
  public static final List<TwAnchorProfitItem> DEFAULT_PROFIT_LIST;
  
  public static final String DEFAULT_RANK = "";
  
  public static final String DEFAULT_SEAL_PREFIX = "";
  
  public static final Integer DEFAULT_SEX;
  
  public static final Integer DEFAULT_SHOW_PB_PRIVATE_FLAG;
  
  public static final String DEFAULT_TB_AGE = "";
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final String DEFAULT_TIEBA_UID = "";
  
  public static final Integer DEFAULT_TOTAL_AGREE_NUM;
  
  public static final Integer DEFAULT_TOTAL_VISITOR_NUM;
  
  public static final List<TshowInfo> DEFAULT_TSHOW_ICON;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_UK = "";
  
  public static final Integer DEFAULT_USERHIDE;
  
  public static final List<UserPics> DEFAULT_USER_PICS;
  
  public static final Integer DEFAULT_USER_TYPE;
  
  public static final Integer DEFAULT_VISITOR_NUM;
  
  public static final Integer DEFAULT_WORK_NUM;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String BDUSS;
  
  @ProtoField(tag = 71)
  public final ActivitySponsor activity_sponsor;
  
  @ProtoField(tag = 88, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 78)
  public final AlaUserInfo ala_info;
  
  @ProtoField(tag = 85)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(tag = 112, type = Message.Datatype.STRING)
  public final String appeal_thread_popover;
  
  @ProtoField(tag = 95)
  public final BaijiahaoInfo baijiahao_info;
  
  @ProtoField(tag = 10)
  public final Balv balv;
  
  @ProtoField(tag = 103)
  public final BawuThrones bawu_thrones;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String bawu_type;
  
  @ProtoField(tag = 105)
  public final BazhuSign bazhu_grade;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String bg_pic;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer bimg_end_time;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String bimg_url;
  
  @ProtoField(tag = 96)
  public final BirthdayInfo birthday_info;
  
  @ProtoField(tag = 53, type = Message.Datatype.INT32)
  public final Integer bookmark_count;
  
  @ProtoField(tag = 54, type = Message.Datatype.INT32)
  public final Integer bookmark_new_count;
  
  @ProtoField(tag = 111)
  public final BusinessAccountInfo business_account_info;
  
  @ProtoField(tag = 104)
  public final CallFansInfo call_fans_info;
  
  @ProtoField(tag = 97, type = Message.Datatype.INT32)
  public final Integer can_modify_avatar;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer concern_num;
  
  @ProtoField(tag = 68)
  public final ConsumeInfo consume_info;
  
  @ProtoField(tag = 108)
  public final CreationData creation_data;
  
  @ProtoField(tag = 123, type = Message.Datatype.INT32)
  public final Integer display_auth_type;
  
  @ProtoField(tag = 83, type = Message.Datatype.INT32)
  public final Integer each_other_friend;
  
  @ProtoField(tag = 74)
  public final Ecom ecom;
  
  @ProtoField(tag = 84)
  public final EsportInfo esport_data;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String fans_nickname;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer fans_num;
  
  @ProtoField(tag = 109, type = Message.Datatype.INT32)
  public final Integer favorite_num;
  
  @ProtoField(tag = 121, type = Message.Datatype.STRING)
  public final String follow_from;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 113)
  public final List<ForumToolPerm> forum_tool_auth;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT64)
  public final Long friend_num;
  
  @ProtoField(tag = 42, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 50)
  public final List<GiftInfo> gift_list;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer gift_num;
  
  @ProtoField(tag = 62)
  public final GodInfo god_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 48)
  public final List<MyGroupInfo> groupList;
  
  @ProtoField(tag = 80, type = Message.Datatype.INT32)
  public final Integer has_bottle_enter;
  
  @ProtoField(tag = 35, type = Message.Datatype.INT32)
  public final Integer has_concerned;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer heavy_user;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<Icon> iconinfo;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 99, type = Message.Datatype.INT32)
  public final Integer influence;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String ios_bimg_format;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String ip;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer is_bawu;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_coreuser;
  
  @ProtoField(tag = 106, type = Message.Datatype.INT32)
  public final Integer is_default_avatar;
  
  @ProtoField(tag = 91, type = Message.Datatype.INT32)
  public final Integer is_fans;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT32)
  public final Integer is_friend;
  
  @ProtoField(tag = 52, type = Message.Datatype.INT32)
  public final Integer is_guanfang;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer is_huinibuke;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_interestman;
  
  @ProtoField(tag = 90, type = Message.Datatype.INT32)
  public final Integer is_invited;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_login;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_mask;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer is_mem;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT32)
  public final Integer is_select_tail;
  
  @ProtoField(tag = 94, type = Message.Datatype.INT32)
  public final Integer is_show_redpacket;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_verify;
  
  @ProtoField(tag = 93, type = Message.Datatype.INT32)
  public final Integer is_videobiggie;
  
  @ProtoField(tag = 89, type = Message.Datatype.INT32)
  public final Integer left_call_num;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 100, type = Message.Datatype.STRING)
  public final String level_influence;
  
  @ProtoField(tag = 125, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 47)
  public final List<LikeForumInfo> likeForum;
  
  @ProtoField(tag = 110)
  public final LiveRoomInfo live_room_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 122)
  public final List<BazhuSign> manager_forum;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer meizhi_level;
  
  @ProtoField(tag = 98, type = Message.Datatype.STRING)
  public final String modify_avatar_desc;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 55)
  public final List<SimpleUser> mute_user;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer my_like_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 101)
  public final NewGodInfo new_god_data;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 65)
  public final List<TshowInfo> new_tshow_icon;
  
  @ProtoField(tag = 8)
  public final NewUser new_user_info;
  
  @ProtoField(tag = 86, type = Message.Datatype.INT32)
  public final Integer nickname_update_time;
  
  @ProtoField(tag = 73, type = Message.Datatype.UINT32)
  public final Integer no_post_high;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer no_un;
  
  @ProtoField(tag = 60)
  public final NovelFansInfo novel_fans_info;
  
  @ProtoField(tag = 59)
  public final NewParrScores parr_scores;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String passwd;
  
  @ProtoField(tag = 41)
  public final PayMemberInfo pay_member_info;
  
  @ProtoField(tag = 77)
  public final Pendant pendant;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String portraith;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 45)
  public final PrivSets priv_sets;
  
  @ProtoField(tag = 92, type = Message.Datatype.INT32)
  public final Integer priv_thread;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 67)
  public final List<TwAnchorProfitItem> profit_list;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String rank;
  
  @ProtoField(tag = 79, type = Message.Datatype.STRING)
  public final String seal_prefix;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer sex;
  
  @ProtoField(tag = 117, type = Message.Datatype.INT32)
  public final Integer show_pb_private_flag;
  
  @ProtoField(tag = 82)
  public final SpringVirtualUser spring_virtual_user;
  
  @ProtoField(tag = 38, type = Message.Datatype.STRING)
  public final String tb_age;
  
  @ProtoField(tag = 72)
  public final TbVipInfo tb_vip;
  
  @ProtoField(tag = 69)
  public final ThemeCardInUser theme_card;
  
  @ProtoField(tag = 87, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 120, type = Message.Datatype.STRING)
  public final String tieba_uid;
  
  @ProtoField(tag = 118, type = Message.Datatype.UINT32)
  public final Integer total_agree_num;
  
  @ProtoField(tag = 76, type = Message.Datatype.INT32)
  public final Integer total_visitor_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 18)
  public final List<TshowInfo> tshow_icon;
  
  @ProtoField(tag = 66)
  public final TwZhiBoUser tw_anchor_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 107, type = Message.Datatype.STRING)
  public final String uk;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 44)
  public final List<UserPics> user_pics;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer user_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer userhide;
  
  @ProtoField(tag = 81)
  public final UserVideoChannelInfo video_channel_info;
  
  @ProtoField(tag = 61)
  public final UserVipInfo vipInfo;
  
  @ProtoField(tag = 70)
  public final VipCloseAd vip_close_ad;
  
  @ProtoField(tag = 64)
  public final VipShowInfo vip_show_info;
  
  @ProtoField(tag = 75, type = Message.Datatype.INT32)
  public final Integer visitor_num;
  
  @ProtoField(tag = 124)
  public final WorkCreatorInfo work_creator_info;
  
  @ProtoField(tag = 116, type = Message.Datatype.UINT32)
  public final Integer work_num;
  
  @ProtoField(tag = 119)
  public final CreationData workcreation_data;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1086032090, "Ltbclient/User;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1086032090, "Ltbclient/User;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LOGIN = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_NO_UN = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_USERHIDE = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_MEIZHI_LEVEL = integer;
    DEFAULT_IS_VERIFY = integer;
    DEFAULT_IS_INTERESTMAN = integer;
    DEFAULT_ICONINFO = Collections.emptyList();
    DEFAULT_TSHOW_ICON = Collections.emptyList();
    DEFAULT_USER_TYPE = integer;
    DEFAULT_IS_COREUSER = integer;
    DEFAULT_IS_HUINIBUKE = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_IS_BAWU = integer;
    DEFAULT_FANS_NUM = integer;
    DEFAULT_CONCERN_NUM = integer;
    DEFAULT_SEX = integer;
    DEFAULT_MY_LIKE_NUM = integer;
    DEFAULT_HAS_CONCERNED = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_MEM = integer;
    DEFAULT_BIMG_END_TIME = integer;
    DEFAULT_GENDER = integer;
    DEFAULT_IS_MASK = integer;
    DEFAULT_USER_PICS = Collections.emptyList();
    DEFAULT_IS_FRIEND = integer;
    DEFAULT_LIKEFORUM = Collections.emptyList();
    DEFAULT_GROUPLIST = Collections.emptyList();
    DEFAULT_GIFT_NUM = integer;
    DEFAULT_GIFT_LIST = Collections.emptyList();
    DEFAULT_IS_SELECT_TAIL = integer;
    DEFAULT_IS_GUANFANG = integer;
    DEFAULT_BOOKMARK_COUNT = integer;
    DEFAULT_BOOKMARK_NEW_COUNT = integer;
    DEFAULT_MUTE_USER = Collections.emptyList();
    DEFAULT_FRIEND_NUM = long_;
    DEFAULT_HEAVY_USER = integer;
    DEFAULT_NEW_TSHOW_ICON = Collections.emptyList();
    DEFAULT_PROFIT_LIST = Collections.emptyList();
    DEFAULT_NO_POST_HIGH = integer;
    DEFAULT_VISITOR_NUM = integer;
    DEFAULT_TOTAL_VISITOR_NUM = integer;
    DEFAULT_HAS_BOTTLE_ENTER = integer;
    DEFAULT_EACH_OTHER_FRIEND = integer;
    DEFAULT_NICKNAME_UPDATE_TIME = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_LEFT_CALL_NUM = integer;
    DEFAULT_IS_INVITED = integer;
    DEFAULT_IS_FANS = integer;
    DEFAULT_PRIV_THREAD = integer;
    DEFAULT_IS_VIDEOBIGGIE = integer;
    DEFAULT_IS_SHOW_REDPACKET = integer;
    DEFAULT_CAN_MODIFY_AVATAR = integer;
    DEFAULT_INFLUENCE = integer;
    DEFAULT_IS_DEFAULT_AVATAR = integer;
    DEFAULT_FAVORITE_NUM = integer;
    DEFAULT_FORUM_TOOL_AUTH = Collections.emptyList();
    DEFAULT_WORK_NUM = integer;
    DEFAULT_SHOW_PB_PRIVATE_FLAG = integer;
    DEFAULT_TOTAL_AGREE_NUM = integer;
    DEFAULT_MANAGER_FORUM = Collections.emptyList();
    DEFAULT_DISPLAY_AUTH_TYPE = integer;
  }
  
  public User(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer20 = paramBuilder.is_login;
      if (integer20 == null) {
        this.is_login = DEFAULT_IS_LOGIN;
      } else {
        this.is_login = integer20;
      } 
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      String str14 = paramBuilder.name;
      if (str14 == null) {
        this.name = "";
      } else {
        this.name = str14;
      } 
      str14 = paramBuilder.name_show;
      if (str14 == null) {
        this.name_show = "";
      } else {
        this.name_show = str14;
      } 
      str14 = paramBuilder.portrait;
      if (str14 == null) {
        this.portrait = "";
      } else {
        this.portrait = str14;
      } 
      Integer integer19 = paramBuilder.no_un;
      if (integer19 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer19;
      } 
      integer19 = paramBuilder.type;
      if (integer19 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer19;
      } 
      this.new_user_info = paramBuilder.new_user_info;
      integer19 = paramBuilder.userhide;
      if (integer19 == null) {
        this.userhide = DEFAULT_USERHIDE;
      } else {
        this.userhide = integer19;
      } 
      this.balv = paramBuilder.balv;
      integer19 = paramBuilder.is_manager;
      if (integer19 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer19;
      } 
      String str13 = paramBuilder.rank;
      if (str13 == null) {
        this.rank = "";
      } else {
        this.rank = str13;
      } 
      str13 = paramBuilder.bimg_url;
      if (str13 == null) {
        this.bimg_url = "";
      } else {
        this.bimg_url = str13;
      } 
      Integer integer18 = paramBuilder.meizhi_level;
      if (integer18 == null) {
        this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
      } else {
        this.meizhi_level = integer18;
      } 
      integer18 = paramBuilder.is_verify;
      if (integer18 == null) {
        this.is_verify = DEFAULT_IS_VERIFY;
      } else {
        this.is_verify = integer18;
      } 
      integer18 = paramBuilder.is_interestman;
      if (integer18 == null) {
        this.is_interestman = DEFAULT_IS_INTERESTMAN;
      } else {
        this.is_interestman = integer18;
      } 
      List list8 = paramBuilder.iconinfo;
      if (list8 == null) {
        this.iconinfo = DEFAULT_ICONINFO;
      } else {
        this.iconinfo = Message.immutableCopyOf(list8);
      } 
      list8 = paramBuilder.tshow_icon;
      if (list8 == null) {
        this.tshow_icon = DEFAULT_TSHOW_ICON;
      } else {
        this.tshow_icon = Message.immutableCopyOf(list8);
      } 
      Integer integer17 = paramBuilder.user_type;
      if (integer17 == null) {
        this.user_type = DEFAULT_USER_TYPE;
      } else {
        this.user_type = integer17;
      } 
      integer17 = paramBuilder.is_coreuser;
      if (integer17 == null) {
        this.is_coreuser = DEFAULT_IS_COREUSER;
      } else {
        this.is_coreuser = integer17;
      } 
      integer17 = paramBuilder.is_huinibuke;
      if (integer17 == null) {
        this.is_huinibuke = DEFAULT_IS_HUINIBUKE;
      } else {
        this.is_huinibuke = integer17;
      } 
      String str12 = paramBuilder.ios_bimg_format;
      if (str12 == null) {
        this.ios_bimg_format = "";
      } else {
        this.ios_bimg_format = str12;
      } 
      Integer integer16 = paramBuilder.level_id;
      if (integer16 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer16;
      } 
      integer16 = paramBuilder.is_like;
      if (integer16 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer16;
      } 
      integer16 = paramBuilder.is_bawu;
      if (integer16 == null) {
        this.is_bawu = DEFAULT_IS_BAWU;
      } else {
        this.is_bawu = integer16;
      } 
      String str11 = paramBuilder.bawu_type;
      if (str11 == null) {
        this.bawu_type = "";
      } else {
        this.bawu_type = str11;
      } 
      str11 = paramBuilder.portraith;
      if (str11 == null) {
        this.portraith = "";
      } else {
        this.portraith = str11;
      } 
      str11 = paramBuilder.ip;
      if (str11 == null) {
        this.ip = "";
      } else {
        this.ip = str11;
      } 
      str11 = paramBuilder.BDUSS;
      if (str11 == null) {
        this.BDUSS = "";
      } else {
        this.BDUSS = str11;
      } 
      Integer integer15 = paramBuilder.fans_num;
      if (integer15 == null) {
        this.fans_num = DEFAULT_FANS_NUM;
      } else {
        this.fans_num = integer15;
      } 
      integer15 = paramBuilder.concern_num;
      if (integer15 == null) {
        this.concern_num = DEFAULT_CONCERN_NUM;
      } else {
        this.concern_num = integer15;
      } 
      integer15 = paramBuilder.sex;
      if (integer15 == null) {
        this.sex = DEFAULT_SEX;
      } else {
        this.sex = integer15;
      } 
      integer15 = paramBuilder.my_like_num;
      if (integer15 == null) {
        this.my_like_num = DEFAULT_MY_LIKE_NUM;
      } else {
        this.my_like_num = integer15;
      } 
      String str10 = paramBuilder.intro;
      if (str10 == null) {
        this.intro = "";
      } else {
        this.intro = str10;
      } 
      Integer integer14 = paramBuilder.has_concerned;
      if (integer14 == null) {
        this.has_concerned = DEFAULT_HAS_CONCERNED;
      } else {
        this.has_concerned = integer14;
      } 
      String str9 = paramBuilder.passwd;
      if (str9 == null) {
        this.passwd = "";
      } else {
        this.passwd = str9;
      } 
      Integer integer13 = paramBuilder.post_num;
      if (integer13 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer13;
      } 
      String str8 = paramBuilder.tb_age;
      if (str8 == null) {
        this.tb_age = "";
      } else {
        this.tb_age = str8;
      } 
      Integer integer12 = paramBuilder.is_mem;
      if (integer12 == null) {
        this.is_mem = DEFAULT_IS_MEM;
      } else {
        this.is_mem = integer12;
      } 
      integer12 = paramBuilder.bimg_end_time;
      if (integer12 == null) {
        this.bimg_end_time = DEFAULT_BIMG_END_TIME;
      } else {
        this.bimg_end_time = integer12;
      } 
      this.pay_member_info = paramBuilder.pay_member_info;
      integer12 = paramBuilder.gender;
      if (integer12 == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer12;
      } 
      integer12 = paramBuilder.is_mask;
      if (integer12 == null) {
        this.is_mask = DEFAULT_IS_MASK;
      } else {
        this.is_mask = integer12;
      } 
      List list7 = paramBuilder.user_pics;
      if (list7 == null) {
        this.user_pics = DEFAULT_USER_PICS;
      } else {
        this.user_pics = Message.immutableCopyOf(list7);
      } 
      this.priv_sets = paramBuilder.priv_sets;
      Integer integer11 = paramBuilder.is_friend;
      if (integer11 == null) {
        this.is_friend = DEFAULT_IS_FRIEND;
      } else {
        this.is_friend = integer11;
      } 
      List list6 = paramBuilder.likeForum;
      if (list6 == null) {
        this.likeForum = DEFAULT_LIKEFORUM;
      } else {
        this.likeForum = Message.immutableCopyOf(list6);
      } 
      list6 = paramBuilder.groupList;
      if (list6 == null) {
        this.groupList = DEFAULT_GROUPLIST;
      } else {
        this.groupList = Message.immutableCopyOf(list6);
      } 
      Integer integer10 = paramBuilder.gift_num;
      if (integer10 == null) {
        this.gift_num = DEFAULT_GIFT_NUM;
      } else {
        this.gift_num = integer10;
      } 
      List list5 = paramBuilder.gift_list;
      if (list5 == null) {
        this.gift_list = DEFAULT_GIFT_LIST;
      } else {
        this.gift_list = Message.immutableCopyOf(list5);
      } 
      Integer integer9 = paramBuilder.is_select_tail;
      if (integer9 == null) {
        this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
      } else {
        this.is_select_tail = integer9;
      } 
      integer9 = paramBuilder.is_guanfang;
      if (integer9 == null) {
        this.is_guanfang = DEFAULT_IS_GUANFANG;
      } else {
        this.is_guanfang = integer9;
      } 
      integer9 = paramBuilder.bookmark_count;
      if (integer9 == null) {
        this.bookmark_count = DEFAULT_BOOKMARK_COUNT;
      } else {
        this.bookmark_count = integer9;
      } 
      integer9 = paramBuilder.bookmark_new_count;
      if (integer9 == null) {
        this.bookmark_new_count = DEFAULT_BOOKMARK_NEW_COUNT;
      } else {
        this.bookmark_new_count = integer9;
      } 
      List list4 = paramBuilder.mute_user;
      if (list4 == null) {
        this.mute_user = DEFAULT_MUTE_USER;
      } else {
        this.mute_user = Message.immutableCopyOf(list4);
      } 
      Long long_1 = paramBuilder.friend_num;
      if (long_1 == null) {
        this.friend_num = DEFAULT_FRIEND_NUM;
      } else {
        this.friend_num = long_1;
      } 
      String str7 = paramBuilder.fans_nickname;
      if (str7 == null) {
        this.fans_nickname = "";
      } else {
        this.fans_nickname = str7;
      } 
      str7 = paramBuilder.bg_pic;
      if (str7 == null) {
        this.bg_pic = "";
      } else {
        this.bg_pic = str7;
      } 
      this.parr_scores = paramBuilder.parr_scores;
      this.novel_fans_info = paramBuilder.novel_fans_info;
      this.vipInfo = paramBuilder.vipInfo;
      this.god_data = paramBuilder.god_data;
      Integer integer8 = paramBuilder.heavy_user;
      if (integer8 == null) {
        this.heavy_user = DEFAULT_HEAVY_USER;
      } else {
        this.heavy_user = integer8;
      } 
      this.vip_show_info = paramBuilder.vip_show_info;
      List list3 = paramBuilder.new_tshow_icon;
      if (list3 == null) {
        this.new_tshow_icon = DEFAULT_NEW_TSHOW_ICON;
      } else {
        this.new_tshow_icon = Message.immutableCopyOf(list3);
      } 
      this.tw_anchor_info = paramBuilder.tw_anchor_info;
      list3 = paramBuilder.profit_list;
      if (list3 == null) {
        this.profit_list = DEFAULT_PROFIT_LIST;
      } else {
        this.profit_list = Message.immutableCopyOf(list3);
      } 
      this.consume_info = paramBuilder.consume_info;
      this.theme_card = paramBuilder.theme_card;
      this.vip_close_ad = paramBuilder.vip_close_ad;
      this.activity_sponsor = paramBuilder.activity_sponsor;
      this.tb_vip = paramBuilder.tb_vip;
      Integer integer7 = paramBuilder.no_post_high;
      if (integer7 == null) {
        this.no_post_high = DEFAULT_NO_POST_HIGH;
      } else {
        this.no_post_high = integer7;
      } 
      this.ecom = paramBuilder.ecom;
      integer7 = paramBuilder.visitor_num;
      if (integer7 == null) {
        this.visitor_num = DEFAULT_VISITOR_NUM;
      } else {
        this.visitor_num = integer7;
      } 
      integer7 = paramBuilder.total_visitor_num;
      if (integer7 == null) {
        this.total_visitor_num = DEFAULT_TOTAL_VISITOR_NUM;
      } else {
        this.total_visitor_num = integer7;
      } 
      this.pendant = paramBuilder.pendant;
      this.ala_info = paramBuilder.ala_info;
      String str6 = paramBuilder.seal_prefix;
      if (str6 == null) {
        this.seal_prefix = "";
      } else {
        this.seal_prefix = str6;
      } 
      Integer integer6 = paramBuilder.has_bottle_enter;
      if (integer6 == null) {
        this.has_bottle_enter = DEFAULT_HAS_BOTTLE_ENTER;
      } else {
        this.has_bottle_enter = integer6;
      } 
      this.video_channel_info = paramBuilder.video_channel_info;
      this.spring_virtual_user = paramBuilder.spring_virtual_user;
      integer6 = paramBuilder.each_other_friend;
      if (integer6 == null) {
        this.each_other_friend = DEFAULT_EACH_OTHER_FRIEND;
      } else {
        this.each_other_friend = integer6;
      } 
      this.esport_data = paramBuilder.esport_data;
      this.ala_live_info = paramBuilder.ala_live_info;
      integer6 = paramBuilder.nickname_update_time;
      if (integer6 == null) {
        this.nickname_update_time = DEFAULT_NICKNAME_UPDATE_TIME;
      } else {
        this.nickname_update_time = integer6;
      } 
      integer6 = paramBuilder.thread_num;
      if (integer6 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer6;
      } 
      integer6 = paramBuilder.agree_num;
      if (integer6 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer6;
      } 
      integer6 = paramBuilder.left_call_num;
      if (integer6 == null) {
        this.left_call_num = DEFAULT_LEFT_CALL_NUM;
      } else {
        this.left_call_num = integer6;
      } 
      integer6 = paramBuilder.is_invited;
      if (integer6 == null) {
        this.is_invited = DEFAULT_IS_INVITED;
      } else {
        this.is_invited = integer6;
      } 
      integer6 = paramBuilder.is_fans;
      if (integer6 == null) {
        this.is_fans = DEFAULT_IS_FANS;
      } else {
        this.is_fans = integer6;
      } 
      integer6 = paramBuilder.priv_thread;
      if (integer6 == null) {
        this.priv_thread = DEFAULT_PRIV_THREAD;
      } else {
        this.priv_thread = integer6;
      } 
      integer6 = paramBuilder.is_videobiggie;
      if (integer6 == null) {
        this.is_videobiggie = DEFAULT_IS_VIDEOBIGGIE;
      } else {
        this.is_videobiggie = integer6;
      } 
      integer6 = paramBuilder.is_show_redpacket;
      if (integer6 == null) {
        this.is_show_redpacket = DEFAULT_IS_SHOW_REDPACKET;
      } else {
        this.is_show_redpacket = integer6;
      } 
      this.baijiahao_info = paramBuilder.baijiahao_info;
      this.birthday_info = paramBuilder.birthday_info;
      integer6 = paramBuilder.can_modify_avatar;
      if (integer6 == null) {
        this.can_modify_avatar = DEFAULT_CAN_MODIFY_AVATAR;
      } else {
        this.can_modify_avatar = integer6;
      } 
      String str5 = paramBuilder.modify_avatar_desc;
      if (str5 == null) {
        this.modify_avatar_desc = "";
      } else {
        this.modify_avatar_desc = str5;
      } 
      Integer integer5 = paramBuilder.influence;
      if (integer5 == null) {
        this.influence = DEFAULT_INFLUENCE;
      } else {
        this.influence = integer5;
      } 
      String str4 = paramBuilder.level_influence;
      if (str4 == null) {
        this.level_influence = "";
      } else {
        this.level_influence = str4;
      } 
      this.new_god_data = paramBuilder.new_god_data;
      this.bawu_thrones = paramBuilder.bawu_thrones;
      this.call_fans_info = paramBuilder.call_fans_info;
      this.bazhu_grade = paramBuilder.bazhu_grade;
      Integer integer4 = paramBuilder.is_default_avatar;
      if (integer4 == null) {
        this.is_default_avatar = DEFAULT_IS_DEFAULT_AVATAR;
      } else {
        this.is_default_avatar = integer4;
      } 
      String str3 = paramBuilder.uk;
      if (str3 == null) {
        this.uk = "";
      } else {
        this.uk = str3;
      } 
      this.creation_data = paramBuilder.creation_data;
      Integer integer3 = paramBuilder.favorite_num;
      if (integer3 == null) {
        this.favorite_num = DEFAULT_FAVORITE_NUM;
      } else {
        this.favorite_num = integer3;
      } 
      this.live_room_info = paramBuilder.live_room_info;
      this.business_account_info = paramBuilder.business_account_info;
      String str2 = paramBuilder.appeal_thread_popover;
      if (str2 == null) {
        this.appeal_thread_popover = "";
      } else {
        this.appeal_thread_popover = str2;
      } 
      List list2 = paramBuilder.forum_tool_auth;
      if (list2 == null) {
        this.forum_tool_auth = DEFAULT_FORUM_TOOL_AUTH;
      } else {
        this.forum_tool_auth = Message.immutableCopyOf(list2);
      } 
      Integer integer2 = paramBuilder.work_num;
      if (integer2 == null) {
        this.work_num = DEFAULT_WORK_NUM;
      } else {
        this.work_num = integer2;
      } 
      integer2 = paramBuilder.show_pb_private_flag;
      if (integer2 == null) {
        this.show_pb_private_flag = DEFAULT_SHOW_PB_PRIVATE_FLAG;
      } else {
        this.show_pb_private_flag = integer2;
      } 
      integer2 = paramBuilder.total_agree_num;
      if (integer2 == null) {
        this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
      } else {
        this.total_agree_num = integer2;
      } 
      this.workcreation_data = paramBuilder.workcreation_data;
      String str1 = paramBuilder.tieba_uid;
      if (str1 == null) {
        this.tieba_uid = "";
      } else {
        this.tieba_uid = str1;
      } 
      str1 = paramBuilder.follow_from;
      if (str1 == null) {
        this.follow_from = "";
      } else {
        this.follow_from = str1;
      } 
      List list1 = paramBuilder.manager_forum;
      if (list1 == null) {
        this.manager_forum = DEFAULT_MANAGER_FORUM;
      } else {
        this.manager_forum = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.display_auth_type;
      if (integer1 == null) {
        this.display_auth_type = DEFAULT_DISPLAY_AUTH_TYPE;
      } else {
        this.display_auth_type = integer1;
      } 
      this.work_creator_info = paramBuilder.work_creator_info;
      str = paramBuilder.level_name;
      if (str == null) {
        this.level_name = "";
      } else {
        this.level_name = str;
      } 
    } else {
      this.is_login = ((Builder)str).is_login;
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.name_show = ((Builder)str).name_show;
      this.portrait = ((Builder)str).portrait;
      this.no_un = ((Builder)str).no_un;
      this.type = ((Builder)str).type;
      this.new_user_info = ((Builder)str).new_user_info;
      this.userhide = ((Builder)str).userhide;
      this.balv = ((Builder)str).balv;
      this.is_manager = ((Builder)str).is_manager;
      this.rank = ((Builder)str).rank;
      this.bimg_url = ((Builder)str).bimg_url;
      this.meizhi_level = ((Builder)str).meizhi_level;
      this.is_verify = ((Builder)str).is_verify;
      this.is_interestman = ((Builder)str).is_interestman;
      this.iconinfo = Message.immutableCopyOf(((Builder)str).iconinfo);
      this.tshow_icon = Message.immutableCopyOf(((Builder)str).tshow_icon);
      this.user_type = ((Builder)str).user_type;
      this.is_coreuser = ((Builder)str).is_coreuser;
      this.is_huinibuke = ((Builder)str).is_huinibuke;
      this.ios_bimg_format = ((Builder)str).ios_bimg_format;
      this.level_id = ((Builder)str).level_id;
      this.is_like = ((Builder)str).is_like;
      this.is_bawu = ((Builder)str).is_bawu;
      this.bawu_type = ((Builder)str).bawu_type;
      this.portraith = ((Builder)str).portraith;
      this.ip = ((Builder)str).ip;
      this.BDUSS = ((Builder)str).BDUSS;
      this.fans_num = ((Builder)str).fans_num;
      this.concern_num = ((Builder)str).concern_num;
      this.sex = ((Builder)str).sex;
      this.my_like_num = ((Builder)str).my_like_num;
      this.intro = ((Builder)str).intro;
      this.has_concerned = ((Builder)str).has_concerned;
      this.passwd = ((Builder)str).passwd;
      this.post_num = ((Builder)str).post_num;
      this.tb_age = ((Builder)str).tb_age;
      this.is_mem = ((Builder)str).is_mem;
      this.bimg_end_time = ((Builder)str).bimg_end_time;
      this.pay_member_info = ((Builder)str).pay_member_info;
      this.gender = ((Builder)str).gender;
      this.is_mask = ((Builder)str).is_mask;
      this.user_pics = Message.immutableCopyOf(((Builder)str).user_pics);
      this.priv_sets = ((Builder)str).priv_sets;
      this.is_friend = ((Builder)str).is_friend;
      this.likeForum = Message.immutableCopyOf(((Builder)str).likeForum);
      this.groupList = Message.immutableCopyOf(((Builder)str).groupList);
      this.gift_num = ((Builder)str).gift_num;
      this.gift_list = Message.immutableCopyOf(((Builder)str).gift_list);
      this.is_select_tail = ((Builder)str).is_select_tail;
      this.is_guanfang = ((Builder)str).is_guanfang;
      this.bookmark_count = ((Builder)str).bookmark_count;
      this.bookmark_new_count = ((Builder)str).bookmark_new_count;
      this.mute_user = Message.immutableCopyOf(((Builder)str).mute_user);
      this.friend_num = ((Builder)str).friend_num;
      this.fans_nickname = ((Builder)str).fans_nickname;
      this.bg_pic = ((Builder)str).bg_pic;
      this.parr_scores = ((Builder)str).parr_scores;
      this.novel_fans_info = ((Builder)str).novel_fans_info;
      this.vipInfo = ((Builder)str).vipInfo;
      this.god_data = ((Builder)str).god_data;
      this.heavy_user = ((Builder)str).heavy_user;
      this.vip_show_info = ((Builder)str).vip_show_info;
      this.new_tshow_icon = Message.immutableCopyOf(((Builder)str).new_tshow_icon);
      this.tw_anchor_info = ((Builder)str).tw_anchor_info;
      this.profit_list = Message.immutableCopyOf(((Builder)str).profit_list);
      this.consume_info = ((Builder)str).consume_info;
      this.theme_card = ((Builder)str).theme_card;
      this.vip_close_ad = ((Builder)str).vip_close_ad;
      this.activity_sponsor = ((Builder)str).activity_sponsor;
      this.tb_vip = ((Builder)str).tb_vip;
      this.no_post_high = ((Builder)str).no_post_high;
      this.ecom = ((Builder)str).ecom;
      this.visitor_num = ((Builder)str).visitor_num;
      this.total_visitor_num = ((Builder)str).total_visitor_num;
      this.pendant = ((Builder)str).pendant;
      this.ala_info = ((Builder)str).ala_info;
      this.seal_prefix = ((Builder)str).seal_prefix;
      this.has_bottle_enter = ((Builder)str).has_bottle_enter;
      this.video_channel_info = ((Builder)str).video_channel_info;
      this.spring_virtual_user = ((Builder)str).spring_virtual_user;
      this.each_other_friend = ((Builder)str).each_other_friend;
      this.esport_data = ((Builder)str).esport_data;
      this.ala_live_info = ((Builder)str).ala_live_info;
      this.nickname_update_time = ((Builder)str).nickname_update_time;
      this.thread_num = ((Builder)str).thread_num;
      this.agree_num = ((Builder)str).agree_num;
      this.left_call_num = ((Builder)str).left_call_num;
      this.is_invited = ((Builder)str).is_invited;
      this.is_fans = ((Builder)str).is_fans;
      this.priv_thread = ((Builder)str).priv_thread;
      this.is_videobiggie = ((Builder)str).is_videobiggie;
      this.is_show_redpacket = ((Builder)str).is_show_redpacket;
      this.baijiahao_info = ((Builder)str).baijiahao_info;
      this.birthday_info = ((Builder)str).birthday_info;
      this.can_modify_avatar = ((Builder)str).can_modify_avatar;
      this.modify_avatar_desc = ((Builder)str).modify_avatar_desc;
      this.influence = ((Builder)str).influence;
      this.level_influence = ((Builder)str).level_influence;
      this.new_god_data = ((Builder)str).new_god_data;
      this.bawu_thrones = ((Builder)str).bawu_thrones;
      this.call_fans_info = ((Builder)str).call_fans_info;
      this.bazhu_grade = ((Builder)str).bazhu_grade;
      this.is_default_avatar = ((Builder)str).is_default_avatar;
      this.uk = ((Builder)str).uk;
      this.creation_data = ((Builder)str).creation_data;
      this.favorite_num = ((Builder)str).favorite_num;
      this.live_room_info = ((Builder)str).live_room_info;
      this.business_account_info = ((Builder)str).business_account_info;
      this.appeal_thread_popover = ((Builder)str).appeal_thread_popover;
      this.forum_tool_auth = Message.immutableCopyOf(((Builder)str).forum_tool_auth);
      this.work_num = ((Builder)str).work_num;
      this.show_pb_private_flag = ((Builder)str).show_pb_private_flag;
      this.total_agree_num = ((Builder)str).total_agree_num;
      this.workcreation_data = ((Builder)str).workcreation_data;
      this.tieba_uid = ((Builder)str).tieba_uid;
      this.follow_from = ((Builder)str).follow_from;
      this.manager_forum = Message.immutableCopyOf(((Builder)str).manager_forum);
      this.display_auth_type = ((Builder)str).display_auth_type;
      this.work_creator_info = ((Builder)str).work_creator_info;
      this.level_name = ((Builder)str).level_name;
    } 
  }
}
