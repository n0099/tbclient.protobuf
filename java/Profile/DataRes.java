package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerImage;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.Highlist;
import tbclient.ModuleInfo;
import tbclient.PostInfoList;
import tbclient.SmartApp;
import tbclient.TbBookrack;
import tbclient.ThreadInfo;
import tbclient.UcCard;
import tbclient.User;
import tbclient.UserManChannelInfo;
import tbclient.UserMap;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 16)
    public final AlaLiveInfo ala_live_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 19)
    public final List<AlaLiveInfo> ala_live_record;
    @ProtoField(tag = 2)
    public final Anti anti_stat;
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<BannerImage> banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<ForumDynamic> concerned_forum_list;
    @ProtoField(tag = 24)
    public final Duxiaoman duxiaoman;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<DynamicInfo> dynamic_list;
    @ProtoField(tag = 10)
    public final Feedback feedback;
    @ProtoField(tag = 7)
    public final Highlist highs;
    @ProtoField(tag = 15)
    public final ModuleInfo module_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 25)
    public final List<ThreadInfo> newest_dynamic_list;
    @ProtoField(tag = 17)
    public final NicknameInfo nickname_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PostInfoList> post_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<SmartApp> recom_swan_list;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer show_answer;
    @ProtoField(tag = 3)
    public final TAInfo tainfo;
    @ProtoField(tag = 9)
    public final TbBookrack tbbookrack;
    @ProtoField(tag = 6)
    public final UcCard uc_card;
    @ProtoField(label = Message.Label.REPEATED, tag = 20)
    public final List<UserMap> url_map;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(tag = 14)
    public final UserAgreeInfo user_agree_info;
    @ProtoField(tag = 5)
    public final UserGodInfo user_god_info;
    @ProtoField(tag = 11)
    public final UserManChannelInfo video_channel_info;
    @ProtoField(tag = 8)
    public final DealWindow window;
    public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_RECORD = Collections.emptyList();
    public static final List<UserMap> DEFAULT_URL_MAP = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_ANSWER = 0;
    public static final List<BannerImage> DEFAULT_BANNER = Collections.emptyList();
    public static final List<SmartApp> DEFAULT_RECOM_SWAN_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_NEWEST_DYNAMIC_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.anti_stat = builder.anti_stat;
            this.tainfo = builder.tainfo;
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            this.user_god_info = builder.user_god_info;
            this.uc_card = builder.uc_card;
            this.highs = builder.highs;
            this.window = builder.window;
            this.tbbookrack = builder.tbbookrack;
            this.feedback = builder.feedback;
            this.video_channel_info = builder.video_channel_info;
            if (builder.dynamic_list == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = immutableCopyOf(builder.dynamic_list);
            }
            if (builder.concerned_forum_list == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
            } else {
                this.concerned_forum_list = immutableCopyOf(builder.concerned_forum_list);
            }
            this.user_agree_info = builder.user_agree_info;
            this.module_info = builder.module_info;
            this.ala_live_info = builder.ala_live_info;
            this.nickname_info = builder.nickname_info;
            if (builder.ala_live_record == null) {
                this.ala_live_record = DEFAULT_ALA_LIVE_RECORD;
            } else {
                this.ala_live_record = immutableCopyOf(builder.ala_live_record);
            }
            if (builder.url_map == null) {
                this.url_map = DEFAULT_URL_MAP;
            } else {
                this.url_map = immutableCopyOf(builder.url_map);
            }
            if (builder.show_answer == null) {
                this.show_answer = DEFAULT_SHOW_ANSWER;
            } else {
                this.show_answer = builder.show_answer;
            }
            if (builder.banner == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = immutableCopyOf(builder.banner);
            }
            if (builder.recom_swan_list == null) {
                this.recom_swan_list = DEFAULT_RECOM_SWAN_LIST;
            } else {
                this.recom_swan_list = immutableCopyOf(builder.recom_swan_list);
            }
            this.duxiaoman = builder.duxiaoman;
            if (builder.newest_dynamic_list == null) {
                this.newest_dynamic_list = DEFAULT_NEWEST_DYNAMIC_LIST;
                return;
            } else {
                this.newest_dynamic_list = immutableCopyOf(builder.newest_dynamic_list);
                return;
            }
        }
        this.user = builder.user;
        this.anti_stat = builder.anti_stat;
        this.tainfo = builder.tainfo;
        this.post_list = immutableCopyOf(builder.post_list);
        this.user_god_info = builder.user_god_info;
        this.uc_card = builder.uc_card;
        this.highs = builder.highs;
        this.window = builder.window;
        this.tbbookrack = builder.tbbookrack;
        this.feedback = builder.feedback;
        this.video_channel_info = builder.video_channel_info;
        this.dynamic_list = immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = immutableCopyOf(builder.concerned_forum_list);
        this.user_agree_info = builder.user_agree_info;
        this.module_info = builder.module_info;
        this.ala_live_info = builder.ala_live_info;
        this.nickname_info = builder.nickname_info;
        this.ala_live_record = immutableCopyOf(builder.ala_live_record);
        this.url_map = immutableCopyOf(builder.url_map);
        this.show_answer = builder.show_answer;
        this.banner = immutableCopyOf(builder.banner);
        this.recom_swan_list = immutableCopyOf(builder.recom_swan_list);
        this.duxiaoman = builder.duxiaoman;
        this.newest_dynamic_list = immutableCopyOf(builder.newest_dynamic_list);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public AlaLiveInfo ala_live_info;
        public List<AlaLiveInfo> ala_live_record;
        public Anti anti_stat;
        public List<BannerImage> banner;
        public List<ForumDynamic> concerned_forum_list;
        public Duxiaoman duxiaoman;
        public List<DynamicInfo> dynamic_list;
        public Feedback feedback;
        public Highlist highs;
        public ModuleInfo module_info;
        public List<ThreadInfo> newest_dynamic_list;
        public NicknameInfo nickname_info;
        public List<PostInfoList> post_list;
        public List<SmartApp> recom_swan_list;
        public Integer show_answer;
        public TAInfo tainfo;
        public TbBookrack tbbookrack;
        public UcCard uc_card;
        public List<UserMap> url_map;
        public User user;
        public UserAgreeInfo user_agree_info;
        public UserGodInfo user_god_info;
        public UserManChannelInfo video_channel_info;
        public DealWindow window;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.anti_stat = dataRes.anti_stat;
                this.tainfo = dataRes.tainfo;
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.user_god_info = dataRes.user_god_info;
                this.uc_card = dataRes.uc_card;
                this.highs = dataRes.highs;
                this.window = dataRes.window;
                this.tbbookrack = dataRes.tbbookrack;
                this.feedback = dataRes.feedback;
                this.video_channel_info = dataRes.video_channel_info;
                this.dynamic_list = DataRes.copyOf(dataRes.dynamic_list);
                this.concerned_forum_list = DataRes.copyOf(dataRes.concerned_forum_list);
                this.user_agree_info = dataRes.user_agree_info;
                this.module_info = dataRes.module_info;
                this.ala_live_info = dataRes.ala_live_info;
                this.nickname_info = dataRes.nickname_info;
                this.ala_live_record = DataRes.copyOf(dataRes.ala_live_record);
                this.url_map = DataRes.copyOf(dataRes.url_map);
                this.show_answer = dataRes.show_answer;
                this.banner = DataRes.copyOf(dataRes.banner);
                this.recom_swan_list = DataRes.copyOf(dataRes.recom_swan_list);
                this.duxiaoman = dataRes.duxiaoman;
                this.newest_dynamic_list = DataRes.copyOf(dataRes.newest_dynamic_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
