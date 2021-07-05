package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerList;
import tbclient.DeletedReasonInfo;
import tbclient.GameInfo;
import tbclient.ThemeColorInfo;
/* loaded from: classes10.dex */
public final class ForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
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
    public static final Long DEFAULT_ID;
    public static final Integer DEFAULT_IS_BRAND_FORUM;
    public static final Integer DEFAULT_IS_EXISTS;
    public static final Integer DEFAULT_IS_FORBIDDEN;
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
    public transient /* synthetic */ FieldHolder $fh;
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

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
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

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (forumInfo == null) {
                return;
            }
            this.id = forumInfo.id;
            this.name = forumInfo.name;
            this.first_class = forumInfo.first_class;
            this.second_class = forumInfo.second_class;
            this.is_exists = forumInfo.is_exists;
            this.is_like = forumInfo.is_like;
            this.user_level = forumInfo.user_level;
            this.level_name = forumInfo.level_name;
            this.member_num = forumInfo.member_num;
            this.thread_num = forumInfo.thread_num;
            this.post_num = forumInfo.post_num;
            this.has_frs_star = forumInfo.has_frs_star;
            this.cur_score = forumInfo.cur_score;
            this.levelup_score = forumInfo.levelup_score;
            this.sign_in_info = forumInfo.sign_in_info;
            this.zhibo = forumInfo.zhibo;
            this.managers = Message.copyOf(forumInfo.managers);
            this.forum_sign_calendar = Message.copyOf(forumInfo.forum_sign_calendar);
            this.is_search_people = forumInfo.is_search_people;
            this.tids = forumInfo.tids;
            this.good_classify = Message.copyOf(forumInfo.good_classify);
            this.is_readonly = forumInfo.is_readonly;
            this.album_open_photo_frs = forumInfo.album_open_photo_frs;
            this.avatar = forumInfo.avatar;
            this.slogan = forumInfo.slogan;
            this.has_postpre = forumInfo.has_postpre;
            this.forum_button = forumInfo.forum_button;
            this.top_notice = forumInfo.top_notice;
            this.has_paper = forumInfo.has_paper;
            this.is_stage_forum = forumInfo.is_stage_forum;
            this.meizhi_tag = forumInfo.meizhi_tag;
            this.banner = forumInfo.banner;
            this.banner_list = forumInfo.banner_list;
            this.badges = Message.copyOf(forumInfo.badges);
            this.level_id = forumInfo.level_id;
            this.is_forbidden = forumInfo.is_forbidden;
            this.favo_type = forumInfo.favo_type;
            this.tag_info = forumInfo.tag_info;
            this.post_prefix = forumInfo.post_prefix;
            this.superboy = forumInfo.superboy;
            this.is_support_local = forumInfo.is_support_local;
            this.is_local_effect = forumInfo.is_local_effect;
            this.recommend_forum = Message.copyOf(forumInfo.recommend_forum);
            this.anchor_power = forumInfo.anchor_power;
            this.worldcupinfo = forumInfo.worldcupinfo;
            this.has_game = forumInfo.has_game;
            this.game_url = forumInfo.game_url;
            this.recommend_user_info = forumInfo.recommend_user_info;
            this.can_use_accelerate = forumInfo.can_use_accelerate;
            this.accelerate_cotent = forumInfo.accelerate_cotent;
            this.top_code = forumInfo.top_code;
            this.news_info = forumInfo.news_info;
            this.game_card = Message.copyOf(forumInfo.game_card);
            this.game_name = forumInfo.game_name;
            this.forumvip_show_icon = forumInfo.forumvip_show_icon;
            this.adkiller_data = forumInfo.adkiller_data;
            this.yule = forumInfo.yule;
            this.realtime_data = forumInfo.realtime_data;
            this.across_forum_show = forumInfo.across_forum_show;
            this.post_topic = forumInfo.post_topic;
            this.across_forum_hide = forumInfo.across_forum_hide;
            this.is_live_game_forum = forumInfo.is_live_game_forum;
            this.is_live_game = forumInfo.is_live_game;
            this.is_new_game_forum = forumInfo.is_new_game_forum;
            this.forum_game_label = forumInfo.forum_game_label;
            this.warning_msg = forumInfo.warning_msg;
            this.special_forum_type = forumInfo.special_forum_type;
            this.topic_special_icon = forumInfo.topic_special_icon;
            this.topic_special_icon_right = forumInfo.topic_special_icon_right;
            this.is_brand_forum = forumInfo.is_brand_forum;
            this.is_show_all_top_thread = forumInfo.is_show_all_top_thread;
            this.theme_color = forumInfo.theme_color;
            this.is_top_img = forumInfo.is_top_img;
            this.is_private_forum = forumInfo.is_private_forum;
            this.is_show_bawutask = forumInfo.is_show_bawutask;
            this.f_share_img = forumInfo.f_share_img;
            this.forum_share_link = forumInfo.forum_share_link;
            this.risk_tip_pop = forumInfo.risk_tip_pop;
            this.risk_tip_notice = forumInfo.risk_tip_notice;
            this.risk_tip_pop_title = forumInfo.risk_tip_pop_title;
            this.tip_list = Message.copyOf(forumInfo.tip_list);
            this.is_show_forumrule = forumInfo.is_show_forumrule;
            this.deleted_reason_info = forumInfo.deleted_reason_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumInfo(this, z, null) : (ForumInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2135951729, "Ltbclient/FrsPage/ForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2135951729, "Ltbclient/FrsPage/ForumInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_IS_EXISTS = 0;
        DEFAULT_IS_LIKE = 0;
        DEFAULT_USER_LEVEL = 0;
        DEFAULT_MEMBER_NUM = 0;
        DEFAULT_THREAD_NUM = 0;
        DEFAULT_POST_NUM = 0;
        DEFAULT_HAS_FRS_STAR = 0;
        DEFAULT_CUR_SCORE = 0;
        DEFAULT_LEVELUP_SCORE = 0;
        DEFAULT_MANAGERS = Collections.emptyList();
        DEFAULT_FORUM_SIGN_CALENDAR = Collections.emptyList();
        DEFAULT_IS_SEARCH_PEOPLE = 0;
        DEFAULT_GOOD_CLASSIFY = Collections.emptyList();
        DEFAULT_ALBUM_OPEN_PHOTO_FRS = 0;
        DEFAULT_HAS_POSTPRE = 0;
        DEFAULT_HAS_PAPER = 0;
        DEFAULT_IS_STAGE_FORUM = 0;
        DEFAULT_MEIZHI_TAG = 0;
        DEFAULT_BADGES = Collections.emptyList();
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_IS_FORBIDDEN = 0;
        DEFAULT_FAVO_TYPE = 0;
        DEFAULT_IS_SUPPORT_LOCAL = 0;
        DEFAULT_IS_LOCAL_EFFECT = 0;
        DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
        DEFAULT_HAS_GAME = 0;
        DEFAULT_CAN_USE_ACCELERATE = 0;
        DEFAULT_GAME_CARD = Collections.emptyList();
        DEFAULT_IS_LIVE_GAME_FORUM = 0;
        DEFAULT_IS_LIVE_GAME = 0;
        DEFAULT_IS_NEW_GAME_FORUM = 0;
        DEFAULT_IS_BRAND_FORUM = 0;
        DEFAULT_IS_SHOW_ALL_TOP_THREAD = 0;
        DEFAULT_IS_PRIVATE_FORUM = 0;
        DEFAULT_IS_SHOW_BAWUTASK = 0;
        DEFAULT_TIP_LIST = Collections.emptyList();
        DEFAULT_IS_SHOW_FORUMRULE = 0;
    }

    public /* synthetic */ ForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
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
            String str2 = builder.first_class;
            if (str2 == null) {
                this.first_class = "";
            } else {
                this.first_class = str2;
            }
            String str3 = builder.second_class;
            if (str3 == null) {
                this.second_class = "";
            } else {
                this.second_class = str3;
            }
            Integer num = builder.is_exists;
            if (num == null) {
                this.is_exists = DEFAULT_IS_EXISTS;
            } else {
                this.is_exists = num;
            }
            Integer num2 = builder.is_like;
            if (num2 == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num2;
            }
            Integer num3 = builder.user_level;
            if (num3 == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = num3;
            }
            String str4 = builder.level_name;
            if (str4 == null) {
                this.level_name = "";
            } else {
                this.level_name = str4;
            }
            Integer num4 = builder.member_num;
            if (num4 == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = num4;
            }
            Integer num5 = builder.thread_num;
            if (num5 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num5;
            }
            Integer num6 = builder.post_num;
            if (num6 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num6;
            }
            Integer num7 = builder.has_frs_star;
            if (num7 == null) {
                this.has_frs_star = DEFAULT_HAS_FRS_STAR;
            } else {
                this.has_frs_star = num7;
            }
            Integer num8 = builder.cur_score;
            if (num8 == null) {
                this.cur_score = DEFAULT_CUR_SCORE;
            } else {
                this.cur_score = num8;
            }
            Integer num9 = builder.levelup_score;
            if (num9 == null) {
                this.levelup_score = DEFAULT_LEVELUP_SCORE;
            } else {
                this.levelup_score = num9;
            }
            this.sign_in_info = builder.sign_in_info;
            this.zhibo = builder.zhibo;
            List<Manager> list = builder.managers;
            if (list == null) {
                this.managers = DEFAULT_MANAGERS;
            } else {
                this.managers = Message.immutableCopyOf(list);
            }
            List<Calendar> list2 = builder.forum_sign_calendar;
            if (list2 == null) {
                this.forum_sign_calendar = DEFAULT_FORUM_SIGN_CALENDAR;
            } else {
                this.forum_sign_calendar = Message.immutableCopyOf(list2);
            }
            Integer num10 = builder.is_search_people;
            if (num10 == null) {
                this.is_search_people = DEFAULT_IS_SEARCH_PEOPLE;
            } else {
                this.is_search_people = num10;
            }
            String str5 = builder.tids;
            if (str5 == null) {
                this.tids = "";
            } else {
                this.tids = str5;
            }
            List<Classify> list3 = builder.good_classify;
            if (list3 == null) {
                this.good_classify = DEFAULT_GOOD_CLASSIFY;
            } else {
                this.good_classify = Message.immutableCopyOf(list3);
            }
            String str6 = builder.is_readonly;
            if (str6 == null) {
                this.is_readonly = "";
            } else {
                this.is_readonly = str6;
            }
            Integer num11 = builder.album_open_photo_frs;
            if (num11 == null) {
                this.album_open_photo_frs = DEFAULT_ALBUM_OPEN_PHOTO_FRS;
            } else {
                this.album_open_photo_frs = num11;
            }
            String str7 = builder.avatar;
            if (str7 == null) {
                this.avatar = "";
            } else {
                this.avatar = str7;
            }
            String str8 = builder.slogan;
            if (str8 == null) {
                this.slogan = "";
            } else {
                this.slogan = str8;
            }
            Integer num12 = builder.has_postpre;
            if (num12 == null) {
                this.has_postpre = DEFAULT_HAS_POSTPRE;
            } else {
                this.has_postpre = num12;
            }
            this.forum_button = builder.forum_button;
            this.top_notice = builder.top_notice;
            Integer num13 = builder.has_paper;
            if (num13 == null) {
                this.has_paper = DEFAULT_HAS_PAPER;
            } else {
                this.has_paper = num13;
            }
            Integer num14 = builder.is_stage_forum;
            if (num14 == null) {
                this.is_stage_forum = DEFAULT_IS_STAGE_FORUM;
            } else {
                this.is_stage_forum = num14;
            }
            Integer num15 = builder.meizhi_tag;
            if (num15 == null) {
                this.meizhi_tag = DEFAULT_MEIZHI_TAG;
            } else {
                this.meizhi_tag = num15;
            }
            this.banner = builder.banner;
            this.banner_list = builder.banner_list;
            List<Badges> list4 = builder.badges;
            if (list4 == null) {
                this.badges = DEFAULT_BADGES;
            } else {
                this.badges = Message.immutableCopyOf(list4);
            }
            Integer num16 = builder.level_id;
            if (num16 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num16;
            }
            Integer num17 = builder.is_forbidden;
            if (num17 == null) {
                this.is_forbidden = DEFAULT_IS_FORBIDDEN;
            } else {
                this.is_forbidden = num17;
            }
            Integer num18 = builder.favo_type;
            if (num18 == null) {
                this.favo_type = DEFAULT_FAVO_TYPE;
            } else {
                this.favo_type = num18;
            }
            this.tag_info = builder.tag_info;
            this.post_prefix = builder.post_prefix;
            String str9 = builder.superboy;
            if (str9 == null) {
                this.superboy = "";
            } else {
                this.superboy = str9;
            }
            Integer num19 = builder.is_support_local;
            if (num19 == null) {
                this.is_support_local = DEFAULT_IS_SUPPORT_LOCAL;
            } else {
                this.is_support_local = num19;
            }
            Integer num20 = builder.is_local_effect;
            if (num20 == null) {
                this.is_local_effect = DEFAULT_IS_LOCAL_EFFECT;
            } else {
                this.is_local_effect = num20;
            }
            List<RecommendForum> list5 = builder.recommend_forum;
            if (list5 == null) {
                this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
            } else {
                this.recommend_forum = Message.immutableCopyOf(list5);
            }
            this.anchor_power = builder.anchor_power;
            this.worldcupinfo = builder.worldcupinfo;
            Integer num21 = builder.has_game;
            if (num21 == null) {
                this.has_game = DEFAULT_HAS_GAME;
            } else {
                this.has_game = num21;
            }
            String str10 = builder.game_url;
            if (str10 == null) {
                this.game_url = "";
            } else {
                this.game_url = str10;
            }
            this.recommend_user_info = builder.recommend_user_info;
            Integer num22 = builder.can_use_accelerate;
            if (num22 == null) {
                this.can_use_accelerate = DEFAULT_CAN_USE_ACCELERATE;
            } else {
                this.can_use_accelerate = num22;
            }
            String str11 = builder.accelerate_cotent;
            if (str11 == null) {
                this.accelerate_cotent = "";
            } else {
                this.accelerate_cotent = str11;
            }
            this.top_code = builder.top_code;
            this.news_info = builder.news_info;
            List<GameInfo> list6 = builder.game_card;
            if (list6 == null) {
                this.game_card = DEFAULT_GAME_CARD;
            } else {
                this.game_card = Message.immutableCopyOf(list6);
            }
            String str12 = builder.game_name;
            if (str12 == null) {
                this.game_name = "";
            } else {
                this.game_name = str12;
            }
            this.forumvip_show_icon = builder.forumvip_show_icon;
            this.adkiller_data = builder.adkiller_data;
            this.yule = builder.yule;
            this.realtime_data = builder.realtime_data;
            this.across_forum_show = builder.across_forum_show;
            this.post_topic = builder.post_topic;
            this.across_forum_hide = builder.across_forum_hide;
            Integer num23 = builder.is_live_game_forum;
            if (num23 == null) {
                this.is_live_game_forum = DEFAULT_IS_LIVE_GAME_FORUM;
            } else {
                this.is_live_game_forum = num23;
            }
            Integer num24 = builder.is_live_game;
            if (num24 == null) {
                this.is_live_game = DEFAULT_IS_LIVE_GAME;
            } else {
                this.is_live_game = num24;
            }
            Integer num25 = builder.is_new_game_forum;
            if (num25 == null) {
                this.is_new_game_forum = DEFAULT_IS_NEW_GAME_FORUM;
            } else {
                this.is_new_game_forum = num25;
            }
            String str13 = builder.forum_game_label;
            if (str13 == null) {
                this.forum_game_label = "";
            } else {
                this.forum_game_label = str13;
            }
            String str14 = builder.warning_msg;
            if (str14 == null) {
                this.warning_msg = "";
            } else {
                this.warning_msg = str14;
            }
            String str15 = builder.special_forum_type;
            if (str15 == null) {
                this.special_forum_type = "";
            } else {
                this.special_forum_type = str15;
            }
            String str16 = builder.topic_special_icon;
            if (str16 == null) {
                this.topic_special_icon = "";
            } else {
                this.topic_special_icon = str16;
            }
            String str17 = builder.topic_special_icon_right;
            if (str17 == null) {
                this.topic_special_icon_right = "";
            } else {
                this.topic_special_icon_right = str17;
            }
            Integer num26 = builder.is_brand_forum;
            if (num26 == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = num26;
            }
            Integer num27 = builder.is_show_all_top_thread;
            if (num27 == null) {
                this.is_show_all_top_thread = DEFAULT_IS_SHOW_ALL_TOP_THREAD;
            } else {
                this.is_show_all_top_thread = num27;
            }
            this.theme_color = builder.theme_color;
            String str18 = builder.is_top_img;
            if (str18 == null) {
                this.is_top_img = "";
            } else {
                this.is_top_img = str18;
            }
            Integer num28 = builder.is_private_forum;
            if (num28 == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num28;
            }
            Integer num29 = builder.is_show_bawutask;
            if (num29 == null) {
                this.is_show_bawutask = DEFAULT_IS_SHOW_BAWUTASK;
            } else {
                this.is_show_bawutask = num29;
            }
            String str19 = builder.f_share_img;
            if (str19 == null) {
                this.f_share_img = "";
            } else {
                this.f_share_img = str19;
            }
            String str20 = builder.forum_share_link;
            if (str20 == null) {
                this.forum_share_link = "";
            } else {
                this.forum_share_link = str20;
            }
            String str21 = builder.risk_tip_pop;
            if (str21 == null) {
                this.risk_tip_pop = "";
            } else {
                this.risk_tip_pop = str21;
            }
            String str22 = builder.risk_tip_notice;
            if (str22 == null) {
                this.risk_tip_notice = "";
            } else {
                this.risk_tip_notice = str22;
            }
            String str23 = builder.risk_tip_pop_title;
            if (str23 == null) {
                this.risk_tip_pop_title = "";
            } else {
                this.risk_tip_pop_title = str23;
            }
            List<TipInfo> list7 = builder.tip_list;
            if (list7 == null) {
                this.tip_list = DEFAULT_TIP_LIST;
            } else {
                this.tip_list = Message.immutableCopyOf(list7);
            }
            Integer num30 = builder.is_show_forumrule;
            if (num30 == null) {
                this.is_show_forumrule = DEFAULT_IS_SHOW_FORUMRULE;
            } else {
                this.is_show_forumrule = num30;
            }
            this.deleted_reason_info = builder.deleted_reason_info;
            return;
        }
        this.id = builder.id;
        this.name = builder.name;
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
        this.is_exists = builder.is_exists;
        this.is_like = builder.is_like;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
        this.member_num = builder.member_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.has_frs_star = builder.has_frs_star;
        this.cur_score = builder.cur_score;
        this.levelup_score = builder.levelup_score;
        this.sign_in_info = builder.sign_in_info;
        this.zhibo = builder.zhibo;
        this.managers = Message.immutableCopyOf(builder.managers);
        this.forum_sign_calendar = Message.immutableCopyOf(builder.forum_sign_calendar);
        this.is_search_people = builder.is_search_people;
        this.tids = builder.tids;
        this.good_classify = Message.immutableCopyOf(builder.good_classify);
        this.is_readonly = builder.is_readonly;
        this.album_open_photo_frs = builder.album_open_photo_frs;
        this.avatar = builder.avatar;
        this.slogan = builder.slogan;
        this.has_postpre = builder.has_postpre;
        this.forum_button = builder.forum_button;
        this.top_notice = builder.top_notice;
        this.has_paper = builder.has_paper;
        this.is_stage_forum = builder.is_stage_forum;
        this.meizhi_tag = builder.meizhi_tag;
        this.banner = builder.banner;
        this.banner_list = builder.banner_list;
        this.badges = Message.immutableCopyOf(builder.badges);
        this.level_id = builder.level_id;
        this.is_forbidden = builder.is_forbidden;
        this.favo_type = builder.favo_type;
        this.tag_info = builder.tag_info;
        this.post_prefix = builder.post_prefix;
        this.superboy = builder.superboy;
        this.is_support_local = builder.is_support_local;
        this.is_local_effect = builder.is_local_effect;
        this.recommend_forum = Message.immutableCopyOf(builder.recommend_forum);
        this.anchor_power = builder.anchor_power;
        this.worldcupinfo = builder.worldcupinfo;
        this.has_game = builder.has_game;
        this.game_url = builder.game_url;
        this.recommend_user_info = builder.recommend_user_info;
        this.can_use_accelerate = builder.can_use_accelerate;
        this.accelerate_cotent = builder.accelerate_cotent;
        this.top_code = builder.top_code;
        this.news_info = builder.news_info;
        this.game_card = Message.immutableCopyOf(builder.game_card);
        this.game_name = builder.game_name;
        this.forumvip_show_icon = builder.forumvip_show_icon;
        this.adkiller_data = builder.adkiller_data;
        this.yule = builder.yule;
        this.realtime_data = builder.realtime_data;
        this.across_forum_show = builder.across_forum_show;
        this.post_topic = builder.post_topic;
        this.across_forum_hide = builder.across_forum_hide;
        this.is_live_game_forum = builder.is_live_game_forum;
        this.is_live_game = builder.is_live_game;
        this.is_new_game_forum = builder.is_new_game_forum;
        this.forum_game_label = builder.forum_game_label;
        this.warning_msg = builder.warning_msg;
        this.special_forum_type = builder.special_forum_type;
        this.topic_special_icon = builder.topic_special_icon;
        this.topic_special_icon_right = builder.topic_special_icon_right;
        this.is_brand_forum = builder.is_brand_forum;
        this.is_show_all_top_thread = builder.is_show_all_top_thread;
        this.theme_color = builder.theme_color;
        this.is_top_img = builder.is_top_img;
        this.is_private_forum = builder.is_private_forum;
        this.is_show_bawutask = builder.is_show_bawutask;
        this.f_share_img = builder.f_share_img;
        this.forum_share_link = builder.forum_share_link;
        this.risk_tip_pop = builder.risk_tip_pop;
        this.risk_tip_notice = builder.risk_tip_notice;
        this.risk_tip_pop_title = builder.risk_tip_pop_title;
        this.tip_list = Message.immutableCopyOf(builder.tip_list);
        this.is_show_forumrule = builder.is_show_forumrule;
        this.deleted_reason_info = builder.deleted_reason_info;
    }
}
