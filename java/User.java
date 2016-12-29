package tbclient;

import com.baidu.location.BDLocation;
import com.baidu.tbadk.TbConfig;
import com.baidu.tieba.r;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class User extends Message {
    public static final String DEFAULT_BAWU_TYPE = "";
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_BG_PIC = "";
    public static final String DEFAULT_BIMG_URL = "";
    public static final String DEFAULT_FANS_NICKNAME = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_IOS_BIMG_FORMAT = "";
    public static final String DEFAULT_IP = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PASSWD = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PORTRAITH = "";
    public static final String DEFAULT_RANK = "";
    public static final String DEFAULT_SEAL_PREFIX = "";
    public static final String DEFAULT_TB_AGE = "";
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String BDUSS;
    @ProtoField(tag = 71)
    public final ActivitySponsor activity_sponsor;
    @ProtoField(tag = 78)
    public final AlaUserInfo ala_info;
    @ProtoField(tag = 10)
    public final Balv balv;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String bawu_type;
    @ProtoField(tag = 58, type = Message.Datatype.STRING)
    public final String bg_pic;
    @ProtoField(tag = r.l.PullToRefresh_headerTextColor, type = Message.Datatype.INT32)
    public final Integer bimg_end_time;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String bimg_url;
    @ProtoField(tag = 53, type = Message.Datatype.INT32)
    public final Integer bookmark_count;
    @ProtoField(tag = 54, type = Message.Datatype.INT32)
    public final Integer bookmark_new_count;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer concern_num;
    @ProtoField(tag = BDLocation.TypeOffLineLocationNetworkFail)
    public final ConsumeInfo consume_info;
    @ProtoField(tag = 74)
    public final Ecom ecom;
    @ProtoField(tag = 57, type = Message.Datatype.STRING)
    public final String fans_nickname;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer fans_num;
    @ProtoField(tag = 56, type = Message.Datatype.INT64)
    public final Long friend_num;
    @ProtoField(tag = 42, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(label = Message.Label.REPEATED, tag = 50)
    public final List<GiftInfo> gift_list;
    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer gift_num;
    @ProtoField(tag = BDLocation.TypeCriteriaException)
    public final GodInfo god_data;
    @ProtoField(label = Message.Label.REPEATED, tag = 48)
    public final List<MyGroupInfo> groupList;
    @ProtoField(tag = 80, type = Message.Datatype.INT32)
    public final Integer has_bottle_enter;
    @ProtoField(tag = 35, type = Message.Datatype.INT32)
    public final Integer has_concerned;
    @ProtoField(tag = BDLocation.TypeNetWorkException, type = Message.Datatype.INT32)
    public final Integer heavy_user;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<Icon> iconinfo;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long id;
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
    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer is_friend;
    @ProtoField(tag = 52, type = Message.Datatype.INT32)
    public final Integer is_guanfang;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer is_huinibuke;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_interestman;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_login;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_manager;
    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer is_mask;
    @ProtoField(tag = r.l.PullToRefresh_headerBackground, type = Message.Datatype.INT32)
    public final Integer is_mem;
    @ProtoField(tag = 51, type = Message.Datatype.INT32)
    public final Integer is_select_tail;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_verify;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 47)
    public final List<LikeForumInfo> likeForum;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer meizhi_level;
    @ProtoField(label = Message.Label.REPEATED, tag = 55)
    public final List<SimpleUser> mute_user;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer my_like_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(label = Message.Label.REPEATED, tag = BDLocation.TypeCacheLocation)
    public final List<TshowInfo> new_tshow_icon;
    @ProtoField(tag = 8)
    public final NewUser new_user_info;
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
    @ProtoField(tag = r.l.PullToRefresh_mode)
    public final PayMemberInfo pay_member_info;
    @ProtoField(tag = 77)
    public final Pendant pendant;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String portraith;
    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = TbConfig.VIEW_IMAGE_QUALITY_LOW_VALUE)
    public final PrivSets priv_sets;
    @ProtoField(label = Message.Label.REPEATED, tag = BDLocation.TypeOffLineLocationFail)
    public final List<TwAnchorProfitItem> profit_list;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String rank;
    @ProtoField(tag = 79, type = Message.Datatype.STRING)
    public final String seal_prefix;
    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(tag = r.l.PullToRefresh_adapterViewBackground, type = Message.Datatype.STRING)
    public final String tb_age;
    @ProtoField(tag = 72)
    public final TbVipInfo tb_vip;
    @ProtoField(tag = 69)
    public final ThemeCardInUser theme_card;
    @ProtoField(tag = 76, type = Message.Datatype.INT32)
    public final Integer total_visitor_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 18)
    public final List<TshowInfo> tshow_icon;
    @ProtoField(tag = BDLocation.TypeOffLineLocation)
    public final TwZhiBoUser tw_anchor_info;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(label = Message.Label.REPEATED, tag = 44)
    public final List<UserPics> user_pics;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer user_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer userhide;
    @ProtoField(tag = BDLocation.TypeGpsLocation)
    public final UserVipInfo vipInfo;
    @ProtoField(tag = 70)
    public final VipCloseAd vip_close_ad;
    @ProtoField(tag = 64)
    public final VipShowInfo vip_show_info;
    @ProtoField(tag = 75, type = Message.Datatype.INT32)
    public final Integer visitor_num;
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

    /* synthetic */ User(Builder builder, boolean z, User user) {
        this(builder, z);
    }

    private User(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_login == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = builder.is_login;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.name_show == null) {
                this.name_show = "";
            } else {
                this.name_show = builder.name_show;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.no_un == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = builder.no_un;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            this.new_user_info = builder.new_user_info;
            if (builder.userhide == null) {
                this.userhide = DEFAULT_USERHIDE;
            } else {
                this.userhide = builder.userhide;
            }
            this.balv = builder.balv;
            if (builder.is_manager == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = builder.is_manager;
            }
            if (builder.rank == null) {
                this.rank = "";
            } else {
                this.rank = builder.rank;
            }
            if (builder.bimg_url == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = builder.bimg_url;
            }
            if (builder.meizhi_level == null) {
                this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
            } else {
                this.meizhi_level = builder.meizhi_level;
            }
            if (builder.is_verify == null) {
                this.is_verify = DEFAULT_IS_VERIFY;
            } else {
                this.is_verify = builder.is_verify;
            }
            if (builder.is_interestman == null) {
                this.is_interestman = DEFAULT_IS_INTERESTMAN;
            } else {
                this.is_interestman = builder.is_interestman;
            }
            if (builder.iconinfo == null) {
                this.iconinfo = DEFAULT_ICONINFO;
            } else {
                this.iconinfo = immutableCopyOf(builder.iconinfo);
            }
            if (builder.tshow_icon == null) {
                this.tshow_icon = DEFAULT_TSHOW_ICON;
            } else {
                this.tshow_icon = immutableCopyOf(builder.tshow_icon);
            }
            if (builder.user_type == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = builder.user_type;
            }
            if (builder.is_coreuser == null) {
                this.is_coreuser = DEFAULT_IS_COREUSER;
            } else {
                this.is_coreuser = builder.is_coreuser;
            }
            if (builder.is_huinibuke == null) {
                this.is_huinibuke = DEFAULT_IS_HUINIBUKE;
            } else {
                this.is_huinibuke = builder.is_huinibuke;
            }
            if (builder.ios_bimg_format == null) {
                this.ios_bimg_format = "";
            } else {
                this.ios_bimg_format = builder.ios_bimg_format;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = builder.level_id;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.is_bawu == null) {
                this.is_bawu = DEFAULT_IS_BAWU;
            } else {
                this.is_bawu = builder.is_bawu;
            }
            if (builder.bawu_type == null) {
                this.bawu_type = "";
            } else {
                this.bawu_type = builder.bawu_type;
            }
            if (builder.portraith == null) {
                this.portraith = "";
            } else {
                this.portraith = builder.portraith;
            }
            if (builder.ip == null) {
                this.ip = "";
            } else {
                this.ip = builder.ip;
            }
            if (builder.BDUSS == null) {
                this.BDUSS = "";
            } else {
                this.BDUSS = builder.BDUSS;
            }
            if (builder.fans_num == null) {
                this.fans_num = DEFAULT_FANS_NUM;
            } else {
                this.fans_num = builder.fans_num;
            }
            if (builder.concern_num == null) {
                this.concern_num = DEFAULT_CONCERN_NUM;
            } else {
                this.concern_num = builder.concern_num;
            }
            if (builder.sex == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = builder.sex;
            }
            if (builder.my_like_num == null) {
                this.my_like_num = DEFAULT_MY_LIKE_NUM;
            } else {
                this.my_like_num = builder.my_like_num;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.has_concerned == null) {
                this.has_concerned = DEFAULT_HAS_CONCERNED;
            } else {
                this.has_concerned = builder.has_concerned;
            }
            if (builder.passwd == null) {
                this.passwd = "";
            } else {
                this.passwd = builder.passwd;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.tb_age == null) {
                this.tb_age = "";
            } else {
                this.tb_age = builder.tb_age;
            }
            if (builder.is_mem == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = builder.is_mem;
            }
            if (builder.bimg_end_time == null) {
                this.bimg_end_time = DEFAULT_BIMG_END_TIME;
            } else {
                this.bimg_end_time = builder.bimg_end_time;
            }
            this.pay_member_info = builder.pay_member_info;
            if (builder.gender == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = builder.gender;
            }
            if (builder.is_mask == null) {
                this.is_mask = DEFAULT_IS_MASK;
            } else {
                this.is_mask = builder.is_mask;
            }
            if (builder.user_pics == null) {
                this.user_pics = DEFAULT_USER_PICS;
            } else {
                this.user_pics = immutableCopyOf(builder.user_pics);
            }
            this.priv_sets = builder.priv_sets;
            if (builder.is_friend == null) {
                this.is_friend = DEFAULT_IS_FRIEND;
            } else {
                this.is_friend = builder.is_friend;
            }
            if (builder.likeForum == null) {
                this.likeForum = DEFAULT_LIKEFORUM;
            } else {
                this.likeForum = immutableCopyOf(builder.likeForum);
            }
            if (builder.groupList == null) {
                this.groupList = DEFAULT_GROUPLIST;
            } else {
                this.groupList = immutableCopyOf(builder.groupList);
            }
            if (builder.gift_num == null) {
                this.gift_num = DEFAULT_GIFT_NUM;
            } else {
                this.gift_num = builder.gift_num;
            }
            if (builder.gift_list == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = immutableCopyOf(builder.gift_list);
            }
            if (builder.is_select_tail == null) {
                this.is_select_tail = DEFAULT_IS_SELECT_TAIL;
            } else {
                this.is_select_tail = builder.is_select_tail;
            }
            if (builder.is_guanfang == null) {
                this.is_guanfang = DEFAULT_IS_GUANFANG;
            } else {
                this.is_guanfang = builder.is_guanfang;
            }
            if (builder.bookmark_count == null) {
                this.bookmark_count = DEFAULT_BOOKMARK_COUNT;
            } else {
                this.bookmark_count = builder.bookmark_count;
            }
            if (builder.bookmark_new_count == null) {
                this.bookmark_new_count = DEFAULT_BOOKMARK_NEW_COUNT;
            } else {
                this.bookmark_new_count = builder.bookmark_new_count;
            }
            if (builder.mute_user == null) {
                this.mute_user = DEFAULT_MUTE_USER;
            } else {
                this.mute_user = immutableCopyOf(builder.mute_user);
            }
            if (builder.friend_num == null) {
                this.friend_num = DEFAULT_FRIEND_NUM;
            } else {
                this.friend_num = builder.friend_num;
            }
            if (builder.fans_nickname == null) {
                this.fans_nickname = "";
            } else {
                this.fans_nickname = builder.fans_nickname;
            }
            if (builder.bg_pic == null) {
                this.bg_pic = "";
            } else {
                this.bg_pic = builder.bg_pic;
            }
            this.parr_scores = builder.parr_scores;
            this.novel_fans_info = builder.novel_fans_info;
            this.vipInfo = builder.vipInfo;
            this.god_data = builder.god_data;
            if (builder.heavy_user == null) {
                this.heavy_user = DEFAULT_HEAVY_USER;
            } else {
                this.heavy_user = builder.heavy_user;
            }
            this.vip_show_info = builder.vip_show_info;
            if (builder.new_tshow_icon == null) {
                this.new_tshow_icon = DEFAULT_NEW_TSHOW_ICON;
            } else {
                this.new_tshow_icon = immutableCopyOf(builder.new_tshow_icon);
            }
            this.tw_anchor_info = builder.tw_anchor_info;
            if (builder.profit_list == null) {
                this.profit_list = DEFAULT_PROFIT_LIST;
            } else {
                this.profit_list = immutableCopyOf(builder.profit_list);
            }
            this.consume_info = builder.consume_info;
            this.theme_card = builder.theme_card;
            this.vip_close_ad = builder.vip_close_ad;
            this.activity_sponsor = builder.activity_sponsor;
            this.tb_vip = builder.tb_vip;
            if (builder.no_post_high == null) {
                this.no_post_high = DEFAULT_NO_POST_HIGH;
            } else {
                this.no_post_high = builder.no_post_high;
            }
            this.ecom = builder.ecom;
            if (builder.visitor_num == null) {
                this.visitor_num = DEFAULT_VISITOR_NUM;
            } else {
                this.visitor_num = builder.visitor_num;
            }
            if (builder.total_visitor_num == null) {
                this.total_visitor_num = DEFAULT_TOTAL_VISITOR_NUM;
            } else {
                this.total_visitor_num = builder.total_visitor_num;
            }
            this.pendant = builder.pendant;
            this.ala_info = builder.ala_info;
            if (builder.seal_prefix == null) {
                this.seal_prefix = "";
            } else {
                this.seal_prefix = builder.seal_prefix;
            }
            if (builder.has_bottle_enter == null) {
                this.has_bottle_enter = DEFAULT_HAS_BOTTLE_ENTER;
                return;
            } else {
                this.has_bottle_enter = builder.has_bottle_enter;
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
        this.iconinfo = immutableCopyOf(builder.iconinfo);
        this.tshow_icon = immutableCopyOf(builder.tshow_icon);
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
        this.user_pics = immutableCopyOf(builder.user_pics);
        this.priv_sets = builder.priv_sets;
        this.is_friend = builder.is_friend;
        this.likeForum = immutableCopyOf(builder.likeForum);
        this.groupList = immutableCopyOf(builder.groupList);
        this.gift_num = builder.gift_num;
        this.gift_list = immutableCopyOf(builder.gift_list);
        this.is_select_tail = builder.is_select_tail;
        this.is_guanfang = builder.is_guanfang;
        this.bookmark_count = builder.bookmark_count;
        this.bookmark_new_count = builder.bookmark_new_count;
        this.mute_user = immutableCopyOf(builder.mute_user);
        this.friend_num = builder.friend_num;
        this.fans_nickname = builder.fans_nickname;
        this.bg_pic = builder.bg_pic;
        this.parr_scores = builder.parr_scores;
        this.novel_fans_info = builder.novel_fans_info;
        this.vipInfo = builder.vipInfo;
        this.god_data = builder.god_data;
        this.heavy_user = builder.heavy_user;
        this.vip_show_info = builder.vip_show_info;
        this.new_tshow_icon = immutableCopyOf(builder.new_tshow_icon);
        this.tw_anchor_info = builder.tw_anchor_info;
        this.profit_list = immutableCopyOf(builder.profit_list);
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<User> {
        public String BDUSS;
        public ActivitySponsor activity_sponsor;
        public AlaUserInfo ala_info;
        public Balv balv;
        public String bawu_type;
        public String bg_pic;
        public Integer bimg_end_time;
        public String bimg_url;
        public Integer bookmark_count;
        public Integer bookmark_new_count;
        public Integer concern_num;
        public ConsumeInfo consume_info;
        public Ecom ecom;
        public String fans_nickname;
        public Integer fans_num;
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
        public String intro;
        public String ios_bimg_format;
        public String ip;
        public Integer is_bawu;
        public Integer is_coreuser;
        public Integer is_friend;
        public Integer is_guanfang;
        public Integer is_huinibuke;
        public Integer is_interestman;
        public Integer is_like;
        public Integer is_login;
        public Integer is_manager;
        public Integer is_mask;
        public Integer is_mem;
        public Integer is_select_tail;
        public Integer is_verify;
        public Integer level_id;
        public List<LikeForumInfo> likeForum;
        public Integer meizhi_level;
        public List<SimpleUser> mute_user;
        public Integer my_like_num;
        public String name;
        public String name_show;
        public List<TshowInfo> new_tshow_icon;
        public NewUser new_user_info;
        public Integer no_post_high;
        public Integer no_un;
        public NovelFansInfo novel_fans_info;
        public NewParrScores parr_scores;
        public String passwd;
        public PayMemberInfo pay_member_info;
        public Pendant pendant;
        public String portrait;
        public String portraith;
        public Integer post_num;
        public PrivSets priv_sets;
        public List<TwAnchorProfitItem> profit_list;
        public String rank;
        public String seal_prefix;
        public Integer sex;
        public String tb_age;
        public TbVipInfo tb_vip;
        public ThemeCardInUser theme_card;
        public Integer total_visitor_num;
        public List<TshowInfo> tshow_icon;
        public TwZhiBoUser tw_anchor_info;
        public Integer type;
        public List<UserPics> user_pics;
        public Integer user_type;
        public Integer userhide;
        public UserVipInfo vipInfo;
        public VipCloseAd vip_close_ad;
        public VipShowInfo vip_show_info;
        public Integer visitor_num;

        public Builder() {
        }

        public Builder(User user) {
            super(user);
            if (user != null) {
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
                this.iconinfo = User.copyOf(user.iconinfo);
                this.tshow_icon = User.copyOf(user.tshow_icon);
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
                this.user_pics = User.copyOf(user.user_pics);
                this.priv_sets = user.priv_sets;
                this.is_friend = user.is_friend;
                this.likeForum = User.copyOf(user.likeForum);
                this.groupList = User.copyOf(user.groupList);
                this.gift_num = user.gift_num;
                this.gift_list = User.copyOf(user.gift_list);
                this.is_select_tail = user.is_select_tail;
                this.is_guanfang = user.is_guanfang;
                this.bookmark_count = user.bookmark_count;
                this.bookmark_new_count = user.bookmark_new_count;
                this.mute_user = User.copyOf(user.mute_user);
                this.friend_num = user.friend_num;
                this.fans_nickname = user.fans_nickname;
                this.bg_pic = user.bg_pic;
                this.parr_scores = user.parr_scores;
                this.novel_fans_info = user.novel_fans_info;
                this.vipInfo = user.vipInfo;
                this.god_data = user.god_data;
                this.heavy_user = user.heavy_user;
                this.vip_show_info = user.vip_show_info;
                this.new_tshow_icon = User.copyOf(user.new_tshow_icon);
                this.tw_anchor_info = user.tw_anchor_info;
                this.profit_list = User.copyOf(user.profit_list);
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User build(boolean z) {
            return new User(this, z, null);
        }
    }
}
