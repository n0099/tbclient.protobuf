package tbclient.Profile;

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
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerImage;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.GoodsWin;
import tbclient.Highlist;
import tbclient.HotUserRankEntry;
import tbclient.ModuleInfo;
import tbclient.PostInfoList;
import tbclient.SmartApp;
import tbclient.TbBookrack;
import tbclient.ThreadInfo;
import tbclient.UcCard;
import tbclient.User;
import tbclient.UserManChannelInfo;
import tbclient.UserMap;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_RECORD;
    public static final List<BannerImage> DEFAULT_BANNER;
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST;
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST;
    public static final List<ThreadInfo> DEFAULT_NEWEST_DYNAMIC_LIST;
    public static final List<PostInfoList> DEFAULT_POST_LIST;
    public static final List<SmartApp> DEFAULT_RECOM_SWAN_LIST;
    public static final Integer DEFAULT_SHOW_ANSWER;
    public static final String DEFAULT_UK = "";
    public static final List<UserMap> DEFAULT_URL_MAP;
    public transient /* synthetic */ FieldHolder $fh;
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
    @ProtoField(tag = 26)
    public final GoodsWin goods_win;
    @ProtoField(tag = 7)
    public final Highlist highs;
    @ProtoField(tag = 15)
    public final ModuleInfo module_info;
    @ProtoField(tag = 27)
    public final HotUserRankEntry new_god_rankinfo;
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
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String uk;
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public AlaLiveInfo ala_live_info;
        public List<AlaLiveInfo> ala_live_record;
        public Anti anti_stat;
        public List<BannerImage> banner;
        public List<ForumDynamic> concerned_forum_list;
        public Duxiaoman duxiaoman;
        public List<DynamicInfo> dynamic_list;
        public Feedback feedback;
        public GoodsWin goods_win;
        public Highlist highs;
        public ModuleInfo module_info;
        public HotUserRankEntry new_god_rankinfo;
        public List<ThreadInfo> newest_dynamic_list;
        public NicknameInfo nickname_info;
        public List<PostInfoList> post_list;
        public List<SmartApp> recom_swan_list;
        public Integer show_answer;
        public TAInfo tainfo;
        public TbBookrack tbbookrack;
        public UcCard uc_card;
        public String uk;
        public List<UserMap> url_map;
        public User user;
        public UserAgreeInfo user_agree_info;
        public UserGodInfo user_god_info;
        public UserManChannelInfo video_channel_info;
        public DealWindow window;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.anti_stat = dataRes.anti_stat;
            this.tainfo = dataRes.tainfo;
            this.post_list = Message.copyOf(dataRes.post_list);
            this.user_god_info = dataRes.user_god_info;
            this.uc_card = dataRes.uc_card;
            this.highs = dataRes.highs;
            this.window = dataRes.window;
            this.tbbookrack = dataRes.tbbookrack;
            this.feedback = dataRes.feedback;
            this.video_channel_info = dataRes.video_channel_info;
            this.dynamic_list = Message.copyOf(dataRes.dynamic_list);
            this.concerned_forum_list = Message.copyOf(dataRes.concerned_forum_list);
            this.user_agree_info = dataRes.user_agree_info;
            this.module_info = dataRes.module_info;
            this.ala_live_info = dataRes.ala_live_info;
            this.nickname_info = dataRes.nickname_info;
            this.ala_live_record = Message.copyOf(dataRes.ala_live_record);
            this.url_map = Message.copyOf(dataRes.url_map);
            this.show_answer = dataRes.show_answer;
            this.banner = Message.copyOf(dataRes.banner);
            this.recom_swan_list = Message.copyOf(dataRes.recom_swan_list);
            this.duxiaoman = dataRes.duxiaoman;
            this.newest_dynamic_list = Message.copyOf(dataRes.newest_dynamic_list);
            this.goods_win = dataRes.goods_win;
            this.new_god_rankinfo = dataRes.new_god_rankinfo;
            this.uk = dataRes.uk;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1548228331, "Ltbclient/Profile/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1548228331, "Ltbclient/Profile/DataRes;");
                return;
            }
        }
        DEFAULT_POST_LIST = Collections.emptyList();
        DEFAULT_DYNAMIC_LIST = Collections.emptyList();
        DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
        DEFAULT_ALA_LIVE_RECORD = Collections.emptyList();
        DEFAULT_URL_MAP = Collections.emptyList();
        DEFAULT_SHOW_ANSWER = 0;
        DEFAULT_BANNER = Collections.emptyList();
        DEFAULT_RECOM_SWAN_LIST = Collections.emptyList();
        DEFAULT_NEWEST_DYNAMIC_LIST = Collections.emptyList();
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            this.user = builder.user;
            this.anti_stat = builder.anti_stat;
            this.tainfo = builder.tainfo;
            List<PostInfoList> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            this.user_god_info = builder.user_god_info;
            this.uc_card = builder.uc_card;
            this.highs = builder.highs;
            this.window = builder.window;
            this.tbbookrack = builder.tbbookrack;
            this.feedback = builder.feedback;
            this.video_channel_info = builder.video_channel_info;
            List<DynamicInfo> list2 = builder.dynamic_list;
            if (list2 == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = Message.immutableCopyOf(list2);
            }
            List<ForumDynamic> list3 = builder.concerned_forum_list;
            if (list3 == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
            } else {
                this.concerned_forum_list = Message.immutableCopyOf(list3);
            }
            this.user_agree_info = builder.user_agree_info;
            this.module_info = builder.module_info;
            this.ala_live_info = builder.ala_live_info;
            this.nickname_info = builder.nickname_info;
            List<AlaLiveInfo> list4 = builder.ala_live_record;
            if (list4 == null) {
                this.ala_live_record = DEFAULT_ALA_LIVE_RECORD;
            } else {
                this.ala_live_record = Message.immutableCopyOf(list4);
            }
            List<UserMap> list5 = builder.url_map;
            if (list5 == null) {
                this.url_map = DEFAULT_URL_MAP;
            } else {
                this.url_map = Message.immutableCopyOf(list5);
            }
            Integer num = builder.show_answer;
            if (num == null) {
                this.show_answer = DEFAULT_SHOW_ANSWER;
            } else {
                this.show_answer = num;
            }
            List<BannerImage> list6 = builder.banner;
            if (list6 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list6);
            }
            List<SmartApp> list7 = builder.recom_swan_list;
            if (list7 == null) {
                this.recom_swan_list = DEFAULT_RECOM_SWAN_LIST;
            } else {
                this.recom_swan_list = Message.immutableCopyOf(list7);
            }
            this.duxiaoman = builder.duxiaoman;
            List<ThreadInfo> list8 = builder.newest_dynamic_list;
            if (list8 == null) {
                this.newest_dynamic_list = DEFAULT_NEWEST_DYNAMIC_LIST;
            } else {
                this.newest_dynamic_list = Message.immutableCopyOf(list8);
            }
            this.goods_win = builder.goods_win;
            this.new_god_rankinfo = builder.new_god_rankinfo;
            String str = builder.uk;
            if (str == null) {
                this.uk = "";
                return;
            } else {
                this.uk = str;
                return;
            }
        }
        this.user = builder.user;
        this.anti_stat = builder.anti_stat;
        this.tainfo = builder.tainfo;
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.user_god_info = builder.user_god_info;
        this.uc_card = builder.uc_card;
        this.highs = builder.highs;
        this.window = builder.window;
        this.tbbookrack = builder.tbbookrack;
        this.feedback = builder.feedback;
        this.video_channel_info = builder.video_channel_info;
        this.dynamic_list = Message.immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = Message.immutableCopyOf(builder.concerned_forum_list);
        this.user_agree_info = builder.user_agree_info;
        this.module_info = builder.module_info;
        this.ala_live_info = builder.ala_live_info;
        this.nickname_info = builder.nickname_info;
        this.ala_live_record = Message.immutableCopyOf(builder.ala_live_record);
        this.url_map = Message.immutableCopyOf(builder.url_map);
        this.show_answer = builder.show_answer;
        this.banner = Message.immutableCopyOf(builder.banner);
        this.recom_swan_list = Message.immutableCopyOf(builder.recom_swan_list);
        this.duxiaoman = builder.duxiaoman;
        this.newest_dynamic_list = Message.immutableCopyOf(builder.newest_dynamic_list);
        this.goods_win = builder.goods_win;
        this.new_god_rankinfo = builder.new_god_rankinfo;
        this.uk = builder.uk;
    }
}
