package tbclient;

import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class User extends Message {
    public static final String DEFAULT_APPEAL_THREAD_POPOVER = "";
    public static final String DEFAULT_AVATAR_URL = "";
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_BG_PIC = "";
    public static final String DEFAULT_BIMG_URL = "";
    public static final String DEFAULT_DISPLAY_INTRO = "";
    public static final String DEFAULT_DYNAMIC_URL = "";
    public static final String DEFAULT_EDITING_NICKNAME = "";
    public static final String DEFAULT_FANS_NICKNAME = "";
    public static final String DEFAULT_FOLLOW_FROM = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_IOS_BIMG_FORMAT = "";
    public static final String DEFAULT_IOS_B_URL = "";
    public static final String DEFAULT_IP = "";
    public static final String DEFAULT_IP_ADDRESS = "";
    public static final String DEFAULT_LEVEL_INFLUENCE = "";
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final String DEFAULT_MODIFY_AVATAR_DESC = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PASSWD = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PORTRAITH = "";
    public static final String DEFAULT_RANK = "";
    public static final String DEFAULT_SEAL_PREFIX = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_TB_AGE = "";
    public static final String DEFAULT_TIEBA_UID = "";
    public static final String DEFAULT_UK = "";
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
    @ProtoField(tag = Cea708Decoder.COMMAND_DF0, type = Message.Datatype.STRING)
    public final String avatar_url;
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
    @ProtoField(tag = 138, type = Message.Datatype.STRING)
    public final String display_intro;
    @ProtoField(tag = Cea708Decoder.COMMAND_DLW, type = Message.Datatype.STRING)
    public final String dynamic_url;
    @ProtoField(tag = 83, type = Message.Datatype.INT32)
    public final Integer each_other_friend;
    @ProtoField(tag = 74)
    public final Ecom ecom;
    @ProtoField(tag = 126)
    public final EditConfig edit_config;
    @ProtoField(tag = 129, type = Message.Datatype.STRING)
    public final String editing_nickname;
    @ProtoField(tag = 149, type = Message.Datatype.INT32)
    public final Integer enable_new_homepage;
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
    @ProtoField(tag = 147, type = Message.Datatype.STRING)
    public final String ios_b_url;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String ios_bimg_format;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String ip;
    @ProtoField(tag = 127, type = Message.Datatype.STRING)
    public final String ip_address;
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
    @ProtoField(tag = 128, type = Message.Datatype.INT32)
    public final Integer is_nickname_editing;
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
    @ProtoField(label = Message.Label.REPEATED, tag = Cea708Decoder.COMMAND_TGW, type = Message.Datatype.STRING)
    public final List<String> new_icon_url;
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
    @ProtoField(tag = 148, type = Message.Datatype.INT64)
    public final Long pa;
    @ProtoField(tag = 59)
    public final NewParrScores parr_scores;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String passwd;
    @ProtoField(tag = 41)
    public final PayMemberInfo pay_member_info;
    @ProtoField(tag = 77)
    public final Pendant pendant;
    @ProtoField(label = Message.Label.REPEATED, tag = Cea708Decoder.COMMAND_SPL, type = Message.Datatype.STRING)
    public final List<String> pendants;
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
    @ProtoField(tag = 145)
    public final ShakeAdSwitch shake_ad_switch;
    @ProtoField(tag = 117, type = Message.Datatype.INT32)
    public final Integer show_pb_private_flag;
    @ProtoField(tag = 82)
    public final SpringVirtualUser spring_virtual_user;
    @ProtoField(label = Message.Label.REPEATED, tag = Cea708Decoder.COMMAND_SWA)
    public final List<TagsInfo> tags;
    @ProtoField(tag = 150, type = Message.Datatype.STRING)
    public final String target_scheme;
    @ProtoField(tag = 38, type = Message.Datatype.STRING)
    public final String tb_age;
    @ProtoField(tag = 72)
    public final TbVipInfo tb_vip;
    @ProtoField(tag = Cea708Decoder.COMMAND_DLC)
    public final ThemeBackgroundInUser theme_background;
    @ProtoField(tag = 69)
    public final ThemeCardInUser theme_card;
    @ProtoField(tag = Cea708Decoder.COMMAND_RST)
    public final ThemeMyTab theme_my_tab;
    @ProtoField(tag = 141)
    public final ThemeTailInUser theme_tail;
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
    @ProtoField(tag = Cea708Decoder.COMMAND_DSW)
    public final UserGrowth user_growth;
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
    @ProtoField(tag = 136)
    public final VirtualImageInfo virtual_image_info;
    @ProtoField(tag = 75, type = Message.Datatype.INT32)
    public final Integer visitor_num;
    @ProtoField(tag = 124)
    public final WorkCreatorInfo work_creator_info;
    @ProtoField(tag = 116, type = Message.Datatype.UINT32)
    public final Integer work_num;
    @ProtoField(tag = 119)
    public final CreationData workcreation_data;
    @ProtoField(tag = Cea708Decoder.COMMAND_SPA)
    public final WorldCupInfo world_cup_info;
    public static final Integer DEFAULT_IS_LOGIN = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_NO_UN = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_USERHIDE = 0;
    public static final Integer DEFAULT_IS_MANAGER = 0;
    public static final Integer DEFAULT_MEIZHI_LEVEL = 0;
    public static final Integer DEFAULT_IS_VERIFY = 0;
    public static final Integer DEFAULT_IS_INTERESTMAN = 0;
    public static final List<Icon> DEFAULT_ICONINFO = Collections.emptyList();
    public static final List<TshowInfo> DEFAULT_TSHOW_ICON = Collections.emptyList();
    public static final Integer DEFAULT_USER_TYPE = 0;
    public static final Integer DEFAULT_IS_COREUSER = 0;
    public static final Integer DEFAULT_IS_HUINIBUKE = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_IS_BAWU = 0;
    public static final Integer DEFAULT_FANS_NUM = 0;
    public static final Integer DEFAULT_CONCERN_NUM = 0;
    public static final Integer DEFAULT_SEX = 0;
    public static final Integer DEFAULT_MY_LIKE_NUM = 0;
    public static final Integer DEFAULT_HAS_CONCERNED = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_MEM = 0;
    public static final Integer DEFAULT_BIMG_END_TIME = 0;
    public static final Integer DEFAULT_GENDER = 0;
    public static final Integer DEFAULT_IS_MASK = 0;
    public static final List<UserPics> DEFAULT_USER_PICS = Collections.emptyList();
    public static final Integer DEFAULT_IS_FRIEND = 0;
    public static final List<LikeForumInfo> DEFAULT_LIKEFORUM = Collections.emptyList();
    public static final List<MyGroupInfo> DEFAULT_GROUPLIST = Collections.emptyList();
    public static final Integer DEFAULT_GIFT_NUM = 0;
    public static final List<GiftInfo> DEFAULT_GIFT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_SELECT_TAIL = 0;
    public static final Integer DEFAULT_IS_GUANFANG = 0;
    public static final Integer DEFAULT_BOOKMARK_COUNT = 0;
    public static final Integer DEFAULT_BOOKMARK_NEW_COUNT = 0;
    public static final List<SimpleUser> DEFAULT_MUTE_USER = Collections.emptyList();
    public static final Long DEFAULT_FRIEND_NUM = 0L;
    public static final Integer DEFAULT_HEAVY_USER = 0;
    public static final List<TshowInfo> DEFAULT_NEW_TSHOW_ICON = Collections.emptyList();
    public static final List<TwAnchorProfitItem> DEFAULT_PROFIT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_NO_POST_HIGH = 0;
    public static final Integer DEFAULT_VISITOR_NUM = 0;
    public static final Integer DEFAULT_TOTAL_VISITOR_NUM = 0;
    public static final Integer DEFAULT_HAS_BOTTLE_ENTER = 0;
    public static final Integer DEFAULT_EACH_OTHER_FRIEND = 0;
    public static final Integer DEFAULT_NICKNAME_UPDATE_TIME = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_LEFT_CALL_NUM = 0;
    public static final Integer DEFAULT_IS_INVITED = 0;
    public static final Integer DEFAULT_IS_FANS = 0;
    public static final Integer DEFAULT_PRIV_THREAD = 0;
    public static final Integer DEFAULT_IS_VIDEOBIGGIE = 0;
    public static final Integer DEFAULT_IS_SHOW_REDPACKET = 0;
    public static final Integer DEFAULT_CAN_MODIFY_AVATAR = 0;
    public static final Integer DEFAULT_INFLUENCE = 0;
    public static final Integer DEFAULT_IS_DEFAULT_AVATAR = 0;
    public static final Integer DEFAULT_FAVORITE_NUM = 0;
    public static final List<ForumToolPerm> DEFAULT_FORUM_TOOL_AUTH = Collections.emptyList();
    public static final Integer DEFAULT_WORK_NUM = 0;
    public static final Integer DEFAULT_SHOW_PB_PRIVATE_FLAG = 0;
    public static final Integer DEFAULT_TOTAL_AGREE_NUM = 0;
    public static final List<BazhuSign> DEFAULT_MANAGER_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_DISPLAY_AUTH_TYPE = 0;
    public static final Integer DEFAULT_IS_NICKNAME_EDITING = 0;
    public static final List<String> DEFAULT_NEW_ICON_URL = Collections.emptyList();
    public static final List<String> DEFAULT_PENDANTS = Collections.emptyList();
    public static final Long DEFAULT_PA = 0L;
    public static final Integer DEFAULT_ENABLE_NEW_HOMEPAGE = 0;
    public static final List<TagsInfo> DEFAULT_TAGS = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<User> {
        public String BDUSS;
        public ActivitySponsor activity_sponsor;
        public Integer agree_num;
        public AlaUserInfo ala_info;
        public AlaLiveInfo ala_live_info;
        public String appeal_thread_popover;
        public String avatar_url;
        public BaijiahaoInfo baijiahao_info;
        public Balv balv;
        public BawuThrones bawu_thrones;
        public String bawu_type;
        public BazhuSign bazhu_grade;
        public String bg_pic;
        public Integer bimg_end_time;
        public String bimg_url;
        public BirthdayInfo birthday_info;
        public Integer bookmark_count;
        public Integer bookmark_new_count;
        public BusinessAccountInfo business_account_info;
        public CallFansInfo call_fans_info;
        public Integer can_modify_avatar;
        public Integer concern_num;
        public ConsumeInfo consume_info;
        public CreationData creation_data;
        public Integer display_auth_type;
        public String display_intro;
        public String dynamic_url;
        public Integer each_other_friend;
        public Ecom ecom;
        public EditConfig edit_config;
        public String editing_nickname;
        public Integer enable_new_homepage;
        public EsportInfo esport_data;
        public String fans_nickname;
        public Integer fans_num;
        public Integer favorite_num;
        public String follow_from;
        public List<ForumToolPerm> forum_tool_auth;
        public Long friend_num;
        public Integer gender;
        public List<GiftInfo> gift_list;
        public Integer gift_num;
        public GodInfo god_data;
        public List<MyGroupInfo> groupList;
        public Integer has_bottle_enter;
        public Integer has_concerned;
        public Integer heavy_user;
        public List<Icon> iconinfo;
        public Long id;
        public Integer influence;
        public String intro;
        public String ios_b_url;
        public String ios_bimg_format;
        public String ip;
        public String ip_address;
        public Integer is_bawu;
        public Integer is_coreuser;
        public Integer is_default_avatar;
        public Integer is_fans;
        public Integer is_friend;
        public Integer is_guanfang;
        public Integer is_huinibuke;
        public Integer is_interestman;
        public Integer is_invited;
        public Integer is_like;
        public Integer is_login;
        public Integer is_manager;
        public Integer is_mask;
        public Integer is_mem;
        public Integer is_nickname_editing;
        public Integer is_select_tail;
        public Integer is_show_redpacket;
        public Integer is_verify;
        public Integer is_videobiggie;
        public Integer left_call_num;
        public Integer level_id;
        public String level_influence;
        public String level_name;
        public List<LikeForumInfo> likeForum;
        public LiveRoomInfo live_room_info;
        public List<BazhuSign> manager_forum;
        public Integer meizhi_level;
        public String modify_avatar_desc;
        public List<SimpleUser> mute_user;
        public Integer my_like_num;
        public String name;
        public String name_show;
        public NewGodInfo new_god_data;
        public List<String> new_icon_url;
        public List<TshowInfo> new_tshow_icon;
        public NewUser new_user_info;
        public Integer nickname_update_time;
        public Integer no_post_high;
        public Integer no_un;
        public NovelFansInfo novel_fans_info;
        public Long pa;
        public NewParrScores parr_scores;
        public String passwd;
        public PayMemberInfo pay_member_info;
        public Pendant pendant;
        public List<String> pendants;
        public String portrait;
        public String portraith;
        public Integer post_num;
        public PrivSets priv_sets;
        public Integer priv_thread;
        public List<TwAnchorProfitItem> profit_list;
        public String rank;
        public String seal_prefix;
        public Integer sex;
        public ShakeAdSwitch shake_ad_switch;
        public Integer show_pb_private_flag;
        public SpringVirtualUser spring_virtual_user;
        public List<TagsInfo> tags;
        public String target_scheme;
        public String tb_age;
        public TbVipInfo tb_vip;
        public ThemeBackgroundInUser theme_background;
        public ThemeCardInUser theme_card;
        public ThemeMyTab theme_my_tab;
        public ThemeTailInUser theme_tail;
        public Integer thread_num;
        public String tieba_uid;
        public Integer total_agree_num;
        public Integer total_visitor_num;
        public List<TshowInfo> tshow_icon;
        public TwZhiBoUser tw_anchor_info;
        public Integer type;
        public String uk;
        public UserGrowth user_growth;
        public List<UserPics> user_pics;
        public Integer user_type;
        public Integer userhide;
        public UserVideoChannelInfo video_channel_info;
        public UserVipInfo vipInfo;
        public VipCloseAd vip_close_ad;
        public VipShowInfo vip_show_info;
        public VirtualImageInfo virtual_image_info;
        public Integer visitor_num;
        public WorkCreatorInfo work_creator_info;
        public Integer work_num;
        public CreationData workcreation_data;
        public WorldCupInfo world_cup_info;

        public Builder() {
        }

        public Builder(User user) {
            super(user);
            if (user == null) {
                return;
            }
            this.is_login = user.is_login;
            this.id = user.id;
            this.name = user.name;
            this.name_show = user.name_show;
            this.portrait = user.portrait;
            this.no_un = user.no_un;
            this.type = user.type;
            this.new_user_info = user.new_user_info;
            this.userhide = user.userhide;
            this.balv = user.balv;
            this.is_manager = user.is_manager;
            this.rank = user.rank;
            this.bimg_url = user.bimg_url;
            this.meizhi_level = user.meizhi_level;
            this.is_verify = user.is_verify;
            this.is_interestman = user.is_interestman;
            this.iconinfo = Message.copyOf(user.iconinfo);
            this.tshow_icon = Message.copyOf(user.tshow_icon);
            this.user_type = user.user_type;
            this.is_coreuser = user.is_coreuser;
            this.is_huinibuke = user.is_huinibuke;
            this.ios_bimg_format = user.ios_bimg_format;
            this.level_id = user.level_id;
            this.is_like = user.is_like;
            this.is_bawu = user.is_bawu;
            this.bawu_type = user.bawu_type;
            this.portraith = user.portraith;
            this.ip = user.ip;
            this.BDUSS = user.BDUSS;
            this.fans_num = user.fans_num;
            this.concern_num = user.concern_num;
            this.sex = user.sex;
            this.my_like_num = user.my_like_num;
            this.intro = user.intro;
            this.has_concerned = user.has_concerned;
            this.passwd = user.passwd;
            this.post_num = user.post_num;
            this.tb_age = user.tb_age;
            this.is_mem = user.is_mem;
            this.bimg_end_time = user.bimg_end_time;
            this.pay_member_info = user.pay_member_info;
            this.gender = user.gender;
            this.is_mask = user.is_mask;
            this.user_pics = Message.copyOf(user.user_pics);
            this.priv_sets = user.priv_sets;
            this.is_friend = user.is_friend;
            this.likeForum = Message.copyOf(user.likeForum);
            this.groupList = Message.copyOf(user.groupList);
            this.gift_num = user.gift_num;
            this.gift_list = Message.copyOf(user.gift_list);
            this.is_select_tail = user.is_select_tail;
            this.is_guanfang = user.is_guanfang;
            this.bookmark_count = user.bookmark_count;
            this.bookmark_new_count = user.bookmark_new_count;
            this.mute_user = Message.copyOf(user.mute_user);
            this.friend_num = user.friend_num;
            this.fans_nickname = user.fans_nickname;
            this.bg_pic = user.bg_pic;
            this.parr_scores = user.parr_scores;
            this.novel_fans_info = user.novel_fans_info;
            this.vipInfo = user.vipInfo;
            this.god_data = user.god_data;
            this.heavy_user = user.heavy_user;
            this.vip_show_info = user.vip_show_info;
            this.new_tshow_icon = Message.copyOf(user.new_tshow_icon);
            this.tw_anchor_info = user.tw_anchor_info;
            this.profit_list = Message.copyOf(user.profit_list);
            this.consume_info = user.consume_info;
            this.theme_card = user.theme_card;
            this.vip_close_ad = user.vip_close_ad;
            this.activity_sponsor = user.activity_sponsor;
            this.tb_vip = user.tb_vip;
            this.no_post_high = user.no_post_high;
            this.ecom = user.ecom;
            this.visitor_num = user.visitor_num;
            this.total_visitor_num = user.total_visitor_num;
            this.pendant = user.pendant;
            this.ala_info = user.ala_info;
            this.seal_prefix = user.seal_prefix;
            this.has_bottle_enter = user.has_bottle_enter;
            this.video_channel_info = user.video_channel_info;
            this.spring_virtual_user = user.spring_virtual_user;
            this.each_other_friend = user.each_other_friend;
            this.esport_data = user.esport_data;
            this.ala_live_info = user.ala_live_info;
            this.nickname_update_time = user.nickname_update_time;
            this.thread_num = user.thread_num;
            this.agree_num = user.agree_num;
            this.left_call_num = user.left_call_num;
            this.is_invited = user.is_invited;
            this.is_fans = user.is_fans;
            this.priv_thread = user.priv_thread;
            this.is_videobiggie = user.is_videobiggie;
            this.is_show_redpacket = user.is_show_redpacket;
            this.baijiahao_info = user.baijiahao_info;
            this.birthday_info = user.birthday_info;
            this.can_modify_avatar = user.can_modify_avatar;
            this.modify_avatar_desc = user.modify_avatar_desc;
            this.influence = user.influence;
            this.level_influence = user.level_influence;
            this.new_god_data = user.new_god_data;
            this.bawu_thrones = user.bawu_thrones;
            this.call_fans_info = user.call_fans_info;
            this.bazhu_grade = user.bazhu_grade;
            this.is_default_avatar = user.is_default_avatar;
            this.uk = user.uk;
            this.creation_data = user.creation_data;
            this.favorite_num = user.favorite_num;
            this.live_room_info = user.live_room_info;
            this.business_account_info = user.business_account_info;
            this.appeal_thread_popover = user.appeal_thread_popover;
            this.forum_tool_auth = Message.copyOf(user.forum_tool_auth);
            this.work_num = user.work_num;
            this.show_pb_private_flag = user.show_pb_private_flag;
            this.total_agree_num = user.total_agree_num;
            this.workcreation_data = user.workcreation_data;
            this.tieba_uid = user.tieba_uid;
            this.follow_from = user.follow_from;
            this.manager_forum = Message.copyOf(user.manager_forum);
            this.display_auth_type = user.display_auth_type;
            this.work_creator_info = user.work_creator_info;
            this.level_name = user.level_name;
            this.edit_config = user.edit_config;
            this.ip_address = user.ip_address;
            this.is_nickname_editing = user.is_nickname_editing;
            this.editing_nickname = user.editing_nickname;
            this.virtual_image_info = user.virtual_image_info;
            this.user_growth = user.user_growth;
            this.display_intro = user.display_intro;
            this.new_icon_url = Message.copyOf(user.new_icon_url);
            this.dynamic_url = user.dynamic_url;
            this.theme_tail = user.theme_tail;
            this.theme_background = user.theme_background;
            this.theme_my_tab = user.theme_my_tab;
            this.world_cup_info = user.world_cup_info;
            this.shake_ad_switch = user.shake_ad_switch;
            this.pendants = Message.copyOf(user.pendants);
            this.ios_b_url = user.ios_b_url;
            this.pa = user.pa;
            this.enable_new_homepage = user.enable_new_homepage;
            this.target_scheme = user.target_scheme;
            this.tags = Message.copyOf(user.tags);
            this.avatar_url = user.avatar_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User build(boolean z) {
            return new User(this, z);
        }
    }

    public User(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_login;
            if (num == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = num;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Integer num2 = builder.no_un;
            if (num2 == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = num2;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            this.new_user_info = builder.new_user_info;
            Integer num4 = builder.userhide;
            if (num4 == null) {
                this.userhide = DEFAULT_USERHIDE;
            } else {
                this.userhide = num4;
            }
            this.balv = builder.balv;
            Integer num5 = builder.is_manager;
            if (num5 == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = num5;
            }
            String str4 = builder.rank;
            if (str4 == null) {
                this.rank = "";
            } else {
                this.rank = str4;
            }
            String str5 = builder.bimg_url;
            if (str5 == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = str5;
            }
            Integer num6 = builder.meizhi_level;
            if (num6 == null) {
                this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
            } else {
                this.meizhi_level = num6;
            }
            Integer num7 = builder.is_verify;
            if (num7 == null) {
                this.is_verify = DEFAULT_IS_VERIFY;
            } else {
                this.is_verify = num7;
            }
            Integer num8 = builder.is_interestman;
            if (num8 == null) {
                this.is_interestman = DEFAULT_IS_INTERESTMAN;
            } else {
                this.is_interestman = num8;
            }
            List<Icon> list = builder.iconinfo;
            if (list == null) {
                this.iconinfo = DEFAULT_ICONINFO;
            } else {
                this.iconinfo = Message.immutableCopyOf(list);
            }
            List<TshowInfo> list2 = builder.tshow_icon;
            if (list2 == null) {
                this.tshow_icon = DEFAULT_TSHOW_ICON;
            } else {
                this.tshow_icon = Message.immutableCopyOf(list2);
            }
            Integer num9 = builder.user_type;
            if (num9 == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = num9;
            }
            Integer num10 = builder.is_coreuser;
            if (num10 == null) {
                this.is_coreuser = DEFAULT_IS_COREUSER;
            } else {
                this.is_coreuser = num10;
            }
            Integer num11 = builder.is_huinibuke;
            if (num11 == null) {
                this.is_huinibuke = DEFAULT_IS_HUINIBUKE;
            } else {
                this.is_huinibuke = num11;
            }
            String str6 = builder.ios_bimg_format;
            if (str6 == null) {
                this.ios_bimg_format = "";
            } else {
                this.ios_bimg_format = str6;
            }
            Integer num12 = builder.level_id;
            if (num12 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num12;
            }
            Integer num13 = builder.is_like;
            if (num13 == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num13;
            }
            Integer num14 = builder.is_bawu;
            if (num14 == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = num14;
            }
            String str7 = builder.bawu_type;
            if (str7 == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = str7;
            }
            String str8 = builder.portraith;
            if (str8 == null) {
                this.portraith = "";
            } else {
                this.portraith = str8;
            }
            String str9 = builder.ip;
            if (str9 == null) {
                this.ip = "";
            } else {
                this.ip = str9;
            }
            String str10 = builder.BDUSS;
            if (str10 == null) {
                this.BDUSS = "";
            } else {
                this.BDUSS = str10;
            }
            Integer num15 = builder.fans_num;
            if (num15 == null) {
                this.fans_num = DEFAULT_FANS_NUM;
            } else {
                this.fans_num = num15;
            }
            Integer num16 = builder.concern_num;
            if (num16 == null) {
                this.concern_num = DEFAULT_CONCERN_NUM;
            } else {
                this.concern_num = num16;
            }
            Integer num17 = builder.sex;
            if (num17 == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num17;
            }
            Integer num18 = builder.my_like_num;
            if (num18 == null) {
                this.my_like_num = DEFAULT_MY_LIKE_NUM;
            } else {
                this.my_like_num = num18;
            }
            String str11 = builder.intro;
            if (str11 == null) {
                this.intro = "";
            } else {
                this.intro = str11;
            }
            Integer num19 = builder.has_concerned;
            if (num19 == null) {
                this.has_concerned = DEFAULT_HAS_CONCERNED;
            } else {
                this.has_concerned = num19;
            }
            String str12 = builder.passwd;
            if (str12 == null) {
                this.passwd = "";
            } else {
                this.passwd = str12;
            }
            Integer num20 = builder.post_num;
            if (num20 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num20;
            }
            String str13 = builder.tb_age;
            if (str13 == null) {
                this.tb_age = "";
            } else {
                this.tb_age = str13;
            }
            Integer num21 = builder.is_mem;
            if (num21 == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = num21;
            }
            Integer num22 = builder.bimg_end_time;
            if (num22 == null) {
                this.bimg_end_time = DEFAULT_BIMG_END_TIME;
            } else {
                this.bimg_end_time = num22;
            }
            this.pay_member_info = builder.pay_member_info;
            Integer num23 = builder.gender;
            if (num23 == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = num23;
            }
            Integer num24 = builder.is_mask;
            if (num24 == null) {
                this.is_mask = DEFAULT_IS_MASK;
            } else {
                this.is_mask = num24;
            }
            List<UserPics> list3 = builder.user_pics;
            if (list3 == null) {
                this.user_pics = DEFAULT_USER_PICS;
            } else {
                this.user_pics = Message.immutableCopyOf(list3);
            }
            this.priv_sets = builder.priv_sets;
            Integer num25 = builder.is_friend;
            if (num25 == null) {
                this.is_friend = DEFAULT_IS_FRIEND;
            } else {
                this.is_friend = num25;
            }
            List<LikeForumInfo> list4 = builder.likeForum;
            if (list4 == null) {
                this.likeForum = DEFAULT_LIKEFORUM;
            } else {
                this.likeForum = Message.immutableCopyOf(list4);
            }
            List<MyGroupInfo> list5 = builder.groupList;
            if (list5 == null) {
                this.groupList = DEFAULT_GROUPLIST;
            } else {
                this.groupList = Message.immutableCopyOf(list5);
            }
            Integer num26 = builder.gift_num;
            if (num26 == null) {
                this.gift_num = DEFAULT_GIFT_NUM;
            } else {
                this.gift_num = num26;
            }
            List<GiftInfo> list6 = builder.gift_list;
            if (list6 == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = Message.immutableCopyOf(list6);
            }
            Integer num27 = builder.is_select_tail;
            if (num27 == null) {
                this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
            } else {
                this.is_select_tail = num27;
            }
            Integer num28 = builder.is_guanfang;
            if (num28 == null) {
                this.is_guanfang = DEFAULT_IS_GUANFANG;
            } else {
                this.is_guanfang = num28;
            }
            Integer num29 = builder.bookmark_count;
            if (num29 == null) {
                this.bookmark_count = DEFAULT_BOOKMARK_COUNT;
            } else {
                this.bookmark_count = num29;
            }
            Integer num30 = builder.bookmark_new_count;
            if (num30 == null) {
                this.bookmark_new_count = DEFAULT_BOOKMARK_NEW_COUNT;
            } else {
                this.bookmark_new_count = num30;
            }
            List<SimpleUser> list7 = builder.mute_user;
            if (list7 == null) {
                this.mute_user = DEFAULT_MUTE_USER;
            } else {
                this.mute_user = Message.immutableCopyOf(list7);
            }
            Long l2 = builder.friend_num;
            if (l2 == null) {
                this.friend_num = DEFAULT_FRIEND_NUM;
            } else {
                this.friend_num = l2;
            }
            String str14 = builder.fans_nickname;
            if (str14 == null) {
                this.fans_nickname = "";
            } else {
                this.fans_nickname = str14;
            }
            String str15 = builder.bg_pic;
            if (str15 == null) {
                this.bg_pic = "";
            } else {
                this.bg_pic = str15;
            }
            this.parr_scores = builder.parr_scores;
            this.novel_fans_info = builder.novel_fans_info;
            this.vipInfo = builder.vipInfo;
            this.god_data = builder.god_data;
            Integer num31 = builder.heavy_user;
            if (num31 == null) {
                this.heavy_user = DEFAULT_HEAVY_USER;
            } else {
                this.heavy_user = num31;
            }
            this.vip_show_info = builder.vip_show_info;
            List<TshowInfo> list8 = builder.new_tshow_icon;
            if (list8 == null) {
                this.new_tshow_icon = DEFAULT_NEW_TSHOW_ICON;
            } else {
                this.new_tshow_icon = Message.immutableCopyOf(list8);
            }
            this.tw_anchor_info = builder.tw_anchor_info;
            List<TwAnchorProfitItem> list9 = builder.profit_list;
            if (list9 == null) {
                this.profit_list = DEFAULT_PROFIT_LIST;
            } else {
                this.profit_list = Message.immutableCopyOf(list9);
            }
            this.consume_info = builder.consume_info;
            this.theme_card = builder.theme_card;
            this.vip_close_ad = builder.vip_close_ad;
            this.activity_sponsor = builder.activity_sponsor;
            this.tb_vip = builder.tb_vip;
            Integer num32 = builder.no_post_high;
            if (num32 == null) {
                this.no_post_high = DEFAULT_NO_POST_HIGH;
            } else {
                this.no_post_high = num32;
            }
            this.ecom = builder.ecom;
            Integer num33 = builder.visitor_num;
            if (num33 == null) {
                this.visitor_num = DEFAULT_VISITOR_NUM;
            } else {
                this.visitor_num = num33;
            }
            Integer num34 = builder.total_visitor_num;
            if (num34 == null) {
                this.total_visitor_num = DEFAULT_TOTAL_VISITOR_NUM;
            } else {
                this.total_visitor_num = num34;
            }
            this.pendant = builder.pendant;
            this.ala_info = builder.ala_info;
            String str16 = builder.seal_prefix;
            if (str16 == null) {
                this.seal_prefix = "";
            } else {
                this.seal_prefix = str16;
            }
            Integer num35 = builder.has_bottle_enter;
            if (num35 == null) {
                this.has_bottle_enter = DEFAULT_HAS_BOTTLE_ENTER;
            } else {
                this.has_bottle_enter = num35;
            }
            this.video_channel_info = builder.video_channel_info;
            this.spring_virtual_user = builder.spring_virtual_user;
            Integer num36 = builder.each_other_friend;
            if (num36 == null) {
                this.each_other_friend = DEFAULT_EACH_OTHER_FRIEND;
            } else {
                this.each_other_friend = num36;
            }
            this.esport_data = builder.esport_data;
            this.ala_live_info = builder.ala_live_info;
            Integer num37 = builder.nickname_update_time;
            if (num37 == null) {
                this.nickname_update_time = DEFAULT_NICKNAME_UPDATE_TIME;
            } else {
                this.nickname_update_time = num37;
            }
            Integer num38 = builder.thread_num;
            if (num38 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num38;
            }
            Integer num39 = builder.agree_num;
            if (num39 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = num39;
            }
            Integer num40 = builder.left_call_num;
            if (num40 == null) {
                this.left_call_num = DEFAULT_LEFT_CALL_NUM;
            } else {
                this.left_call_num = num40;
            }
            Integer num41 = builder.is_invited;
            if (num41 == null) {
                this.is_invited = DEFAULT_IS_INVITED;
            } else {
                this.is_invited = num41;
            }
            Integer num42 = builder.is_fans;
            if (num42 == null) {
                this.is_fans = DEFAULT_IS_FANS;
            } else {
                this.is_fans = num42;
            }
            Integer num43 = builder.priv_thread;
            if (num43 == null) {
                this.priv_thread = DEFAULT_PRIV_THREAD;
            } else {
                this.priv_thread = num43;
            }
            Integer num44 = builder.is_videobiggie;
            if (num44 == null) {
                this.is_videobiggie = DEFAULT_IS_VIDEOBIGGIE;
            } else {
                this.is_videobiggie = num44;
            }
            Integer num45 = builder.is_show_redpacket;
            if (num45 == null) {
                this.is_show_redpacket = DEFAULT_IS_SHOW_REDPACKET;
            } else {
                this.is_show_redpacket = num45;
            }
            this.baijiahao_info = builder.baijiahao_info;
            this.birthday_info = builder.birthday_info;
            Integer num46 = builder.can_modify_avatar;
            if (num46 == null) {
                this.can_modify_avatar = DEFAULT_CAN_MODIFY_AVATAR;
            } else {
                this.can_modify_avatar = num46;
            }
            String str17 = builder.modify_avatar_desc;
            if (str17 == null) {
                this.modify_avatar_desc = "";
            } else {
                this.modify_avatar_desc = str17;
            }
            Integer num47 = builder.influence;
            if (num47 == null) {
                this.influence = DEFAULT_INFLUENCE;
            } else {
                this.influence = num47;
            }
            String str18 = builder.level_influence;
            if (str18 == null) {
                this.level_influence = "";
            } else {
                this.level_influence = str18;
            }
            this.new_god_data = builder.new_god_data;
            this.bawu_thrones = builder.bawu_thrones;
            this.call_fans_info = builder.call_fans_info;
            this.bazhu_grade = builder.bazhu_grade;
            Integer num48 = builder.is_default_avatar;
            if (num48 == null) {
                this.is_default_avatar = DEFAULT_IS_DEFAULT_AVATAR;
            } else {
                this.is_default_avatar = num48;
            }
            String str19 = builder.uk;
            if (str19 == null) {
                this.uk = "";
            } else {
                this.uk = str19;
            }
            this.creation_data = builder.creation_data;
            Integer num49 = builder.favorite_num;
            if (num49 == null) {
                this.favorite_num = DEFAULT_FAVORITE_NUM;
            } else {
                this.favorite_num = num49;
            }
            this.live_room_info = builder.live_room_info;
            this.business_account_info = builder.business_account_info;
            String str20 = builder.appeal_thread_popover;
            if (str20 == null) {
                this.appeal_thread_popover = "";
            } else {
                this.appeal_thread_popover = str20;
            }
            List<ForumToolPerm> list10 = builder.forum_tool_auth;
            if (list10 == null) {
                this.forum_tool_auth = DEFAULT_FORUM_TOOL_AUTH;
            } else {
                this.forum_tool_auth = Message.immutableCopyOf(list10);
            }
            Integer num50 = builder.work_num;
            if (num50 == null) {
                this.work_num = DEFAULT_WORK_NUM;
            } else {
                this.work_num = num50;
            }
            Integer num51 = builder.show_pb_private_flag;
            if (num51 == null) {
                this.show_pb_private_flag = DEFAULT_SHOW_PB_PRIVATE_FLAG;
            } else {
                this.show_pb_private_flag = num51;
            }
            Integer num52 = builder.total_agree_num;
            if (num52 == null) {
                this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
            } else {
                this.total_agree_num = num52;
            }
            this.workcreation_data = builder.workcreation_data;
            String str21 = builder.tieba_uid;
            if (str21 == null) {
                this.tieba_uid = "";
            } else {
                this.tieba_uid = str21;
            }
            String str22 = builder.follow_from;
            if (str22 == null) {
                this.follow_from = "";
            } else {
                this.follow_from = str22;
            }
            List<BazhuSign> list11 = builder.manager_forum;
            if (list11 == null) {
                this.manager_forum = DEFAULT_MANAGER_FORUM;
            } else {
                this.manager_forum = Message.immutableCopyOf(list11);
            }
            Integer num53 = builder.display_auth_type;
            if (num53 == null) {
                this.display_auth_type = DEFAULT_DISPLAY_AUTH_TYPE;
            } else {
                this.display_auth_type = num53;
            }
            this.work_creator_info = builder.work_creator_info;
            String str23 = builder.level_name;
            if (str23 == null) {
                this.level_name = "";
            } else {
                this.level_name = str23;
            }
            this.edit_config = builder.edit_config;
            String str24 = builder.ip_address;
            if (str24 == null) {
                this.ip_address = "";
            } else {
                this.ip_address = str24;
            }
            Integer num54 = builder.is_nickname_editing;
            if (num54 == null) {
                this.is_nickname_editing = DEFAULT_IS_NICKNAME_EDITING;
            } else {
                this.is_nickname_editing = num54;
            }
            String str25 = builder.editing_nickname;
            if (str25 == null) {
                this.editing_nickname = "";
            } else {
                this.editing_nickname = str25;
            }
            this.virtual_image_info = builder.virtual_image_info;
            this.user_growth = builder.user_growth;
            String str26 = builder.display_intro;
            if (str26 == null) {
                this.display_intro = "";
            } else {
                this.display_intro = str26;
            }
            List<String> list12 = builder.new_icon_url;
            if (list12 == null) {
                this.new_icon_url = DEFAULT_NEW_ICON_URL;
            } else {
                this.new_icon_url = Message.immutableCopyOf(list12);
            }
            String str27 = builder.dynamic_url;
            if (str27 == null) {
                this.dynamic_url = "";
            } else {
                this.dynamic_url = str27;
            }
            this.theme_tail = builder.theme_tail;
            this.theme_background = builder.theme_background;
            this.theme_my_tab = builder.theme_my_tab;
            this.world_cup_info = builder.world_cup_info;
            this.shake_ad_switch = builder.shake_ad_switch;
            List<String> list13 = builder.pendants;
            if (list13 == null) {
                this.pendants = DEFAULT_PENDANTS;
            } else {
                this.pendants = Message.immutableCopyOf(list13);
            }
            String str28 = builder.ios_b_url;
            if (str28 == null) {
                this.ios_b_url = "";
            } else {
                this.ios_b_url = str28;
            }
            Long l3 = builder.pa;
            if (l3 == null) {
                this.pa = DEFAULT_PA;
            } else {
                this.pa = l3;
            }
            Integer num55 = builder.enable_new_homepage;
            if (num55 == null) {
                this.enable_new_homepage = DEFAULT_ENABLE_NEW_HOMEPAGE;
            } else {
                this.enable_new_homepage = num55;
            }
            String str29 = builder.target_scheme;
            if (str29 == null) {
                this.target_scheme = "";
            } else {
                this.target_scheme = str29;
            }
            List<TagsInfo> list14 = builder.tags;
            if (list14 == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list14);
            }
            String str30 = builder.avatar_url;
            if (str30 == null) {
                this.avatar_url = "";
                return;
            } else {
                this.avatar_url = str30;
                return;
            }
        }
        this.is_login = builder.is_login;
        this.id = builder.id;
        this.name = builder.name;
        this.name_show = builder.name_show;
        this.portrait = builder.portrait;
        this.no_un = builder.no_un;
        this.type = builder.type;
        this.new_user_info = builder.new_user_info;
        this.userhide = builder.userhide;
        this.balv = builder.balv;
        this.is_manager = builder.is_manager;
        this.rank = builder.rank;
        this.bimg_url = builder.bimg_url;
        this.meizhi_level = builder.meizhi_level;
        this.is_verify = builder.is_verify;
        this.is_interestman = builder.is_interestman;
        this.iconinfo = Message.immutableCopyOf(builder.iconinfo);
        this.tshow_icon = Message.immutableCopyOf(builder.tshow_icon);
        this.user_type = builder.user_type;
        this.is_coreuser = builder.is_coreuser;
        this.is_huinibuke = builder.is_huinibuke;
        this.ios_bimg_format = builder.ios_bimg_format;
        this.level_id = builder.level_id;
        this.is_like = builder.is_like;
        this.is_bawu = builder.is_bawu;
        this.bawu_type = builder.bawu_type;
        this.portraith = builder.portraith;
        this.ip = builder.ip;
        this.BDUSS = builder.BDUSS;
        this.fans_num = builder.fans_num;
        this.concern_num = builder.concern_num;
        this.sex = builder.sex;
        this.my_like_num = builder.my_like_num;
        this.intro = builder.intro;
        this.has_concerned = builder.has_concerned;
        this.passwd = builder.passwd;
        this.post_num = builder.post_num;
        this.tb_age = builder.tb_age;
        this.is_mem = builder.is_mem;
        this.bimg_end_time = builder.bimg_end_time;
        this.pay_member_info = builder.pay_member_info;
        this.gender = builder.gender;
        this.is_mask = builder.is_mask;
        this.user_pics = Message.immutableCopyOf(builder.user_pics);
        this.priv_sets = builder.priv_sets;
        this.is_friend = builder.is_friend;
        this.likeForum = Message.immutableCopyOf(builder.likeForum);
        this.groupList = Message.immutableCopyOf(builder.groupList);
        this.gift_num = builder.gift_num;
        this.gift_list = Message.immutableCopyOf(builder.gift_list);
        this.is_select_tail = builder.is_select_tail;
        this.is_guanfang = builder.is_guanfang;
        this.bookmark_count = builder.bookmark_count;
        this.bookmark_new_count = builder.bookmark_new_count;
        this.mute_user = Message.immutableCopyOf(builder.mute_user);
        this.friend_num = builder.friend_num;
        this.fans_nickname = builder.fans_nickname;
        this.bg_pic = builder.bg_pic;
        this.parr_scores = builder.parr_scores;
        this.novel_fans_info = builder.novel_fans_info;
        this.vipInfo = builder.vipInfo;
        this.god_data = builder.god_data;
        this.heavy_user = builder.heavy_user;
        this.vip_show_info = builder.vip_show_info;
        this.new_tshow_icon = Message.immutableCopyOf(builder.new_tshow_icon);
        this.tw_anchor_info = builder.tw_anchor_info;
        this.profit_list = Message.immutableCopyOf(builder.profit_list);
        this.consume_info = builder.consume_info;
        this.theme_card = builder.theme_card;
        this.vip_close_ad = builder.vip_close_ad;
        this.activity_sponsor = builder.activity_sponsor;
        this.tb_vip = builder.tb_vip;
        this.no_post_high = builder.no_post_high;
        this.ecom = builder.ecom;
        this.visitor_num = builder.visitor_num;
        this.total_visitor_num = builder.total_visitor_num;
        this.pendant = builder.pendant;
        this.ala_info = builder.ala_info;
        this.seal_prefix = builder.seal_prefix;
        this.has_bottle_enter = builder.has_bottle_enter;
        this.video_channel_info = builder.video_channel_info;
        this.spring_virtual_user = builder.spring_virtual_user;
        this.each_other_friend = builder.each_other_friend;
        this.esport_data = builder.esport_data;
        this.ala_live_info = builder.ala_live_info;
        this.nickname_update_time = builder.nickname_update_time;
        this.thread_num = builder.thread_num;
        this.agree_num = builder.agree_num;
        this.left_call_num = builder.left_call_num;
        this.is_invited = builder.is_invited;
        this.is_fans = builder.is_fans;
        this.priv_thread = builder.priv_thread;
        this.is_videobiggie = builder.is_videobiggie;
        this.is_show_redpacket = builder.is_show_redpacket;
        this.baijiahao_info = builder.baijiahao_info;
        this.birthday_info = builder.birthday_info;
        this.can_modify_avatar = builder.can_modify_avatar;
        this.modify_avatar_desc = builder.modify_avatar_desc;
        this.influence = builder.influence;
        this.level_influence = builder.level_influence;
        this.new_god_data = builder.new_god_data;
        this.bawu_thrones = builder.bawu_thrones;
        this.call_fans_info = builder.call_fans_info;
        this.bazhu_grade = builder.bazhu_grade;
        this.is_default_avatar = builder.is_default_avatar;
        this.uk = builder.uk;
        this.creation_data = builder.creation_data;
        this.favorite_num = builder.favorite_num;
        this.live_room_info = builder.live_room_info;
        this.business_account_info = builder.business_account_info;
        this.appeal_thread_popover = builder.appeal_thread_popover;
        this.forum_tool_auth = Message.immutableCopyOf(builder.forum_tool_auth);
        this.work_num = builder.work_num;
        this.show_pb_private_flag = builder.show_pb_private_flag;
        this.total_agree_num = builder.total_agree_num;
        this.workcreation_data = builder.workcreation_data;
        this.tieba_uid = builder.tieba_uid;
        this.follow_from = builder.follow_from;
        this.manager_forum = Message.immutableCopyOf(builder.manager_forum);
        this.display_auth_type = builder.display_auth_type;
        this.work_creator_info = builder.work_creator_info;
        this.level_name = builder.level_name;
        this.edit_config = builder.edit_config;
        this.ip_address = builder.ip_address;
        this.is_nickname_editing = builder.is_nickname_editing;
        this.editing_nickname = builder.editing_nickname;
        this.virtual_image_info = builder.virtual_image_info;
        this.user_growth = builder.user_growth;
        this.display_intro = builder.display_intro;
        this.new_icon_url = Message.immutableCopyOf(builder.new_icon_url);
        this.dynamic_url = builder.dynamic_url;
        this.theme_tail = builder.theme_tail;
        this.theme_background = builder.theme_background;
        this.theme_my_tab = builder.theme_my_tab;
        this.world_cup_info = builder.world_cup_info;
        this.shake_ad_switch = builder.shake_ad_switch;
        this.pendants = Message.immutableCopyOf(builder.pendants);
        this.ios_b_url = builder.ios_b_url;
        this.pa = builder.pa;
        this.enable_new_homepage = builder.enable_new_homepage;
        this.target_scheme = builder.target_scheme;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.avatar_url = builder.avatar_url;
    }
}
