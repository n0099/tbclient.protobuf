package tbclient.GetNewGameList;

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
/* loaded from: classes3.dex */
public final class NewGameInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ANDR_PK_NAME = "";
    public static final String DEFAULT_API_KEY = "";
    public static final String DEFAULT_APPLE_ID = "";
    public static final String DEFAULT_APP_ID = "";
    public static final String DEFAULT_BUNDLE_ID = "";
    public static final String DEFAULT_CANVAS_NAME = "";
    public static final Integer DEFAULT_CATEGORY_ID;
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_CATEGORY_NAME_SIM = "";
    public static final Integer DEFAULT_CHANNEL;
    public static final Long DEFAULT_DEADLINE;
    public static final String DEFAULT_DEVELOPER = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_GAME_DESC = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_LINK = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final List<String> DEFAULT_GAME_PIC;
    public static final Integer DEFAULT_GAME_PLATFORM;
    public static final Integer DEFAULT_GAME_TYPE;
    public static final String DEFAULT_GIFT_CODE = "";
    public static final String DEFAULT_ICON_PIC1 = "";
    public static final String DEFAULT_ICON_PIC2 = "";
    public static final String DEFAULT_ICON_PIC3 = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_INTER_VERSION = "";
    public static final String DEFAULT_INTER_VERSION_IOS = "";
    public static final String DEFAULT_LAUNCHCOMPONENT = "";
    public static final Integer DEFAULT_MARK;
    public static final String DEFAULT_PACKAGE_LINK = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final Integer DEFAULT_PLAY_COUNT;
    public static final String DEFAULT_PRAISE = "";
    public static final List<String> DEFAULT_RECOMMEND_PLATFORM;
    public static final String DEFAULT_SCHEMA_URL = "";
    public static final Integer DEFAULT_SCORE;
    public static final String DEFAULT_SECRET_KEY = "";
    public static final String DEFAULT_SERVER_ID = "";
    public static final String DEFAULT_SERVER_NAME = "";
    public static final Integer DEFAULT_SERVER_OPEN_TIME;
    public static final Integer DEFAULT_SERVER_TYPE;
    public static final String DEFAULT_SIGN = "";
    public static final Integer DEFAULT_STATUS;
    public static final String DEFAULT_SUBSCRIPT_COLOR = "";
    public static final String DEFAULT_TEST_USERIDS = "";
    public static final String DEFAULT_THREAD_FORUM_NAME = "";
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_THREAD_THEME_ID;
    public static final Integer DEFAULT_TIME;
    public static final String DEFAULT_VERSION = "";
    public static final String DEFAULT_VERSION_IOS = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String andr_pk_name;
    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String api_key;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String app_id;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String apple_id;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String bundle_id;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String canvas_name;
    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer category_id;
    @ProtoField(tag = 52, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = 54, type = Message.Datatype.STRING)
    public final String category_name_sim;
    @ProtoField(tag = 40, type = Message.Datatype.UINT32)
    public final Integer channel;
    @ProtoField(tag = 36, type = Message.Datatype.UINT64)
    public final Long deadline;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String developer;
    @ProtoField(tag = 34, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String game_desc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String game_link;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String game_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 13, type = Message.Datatype.STRING)
    public final List<String> game_pic;
    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer game_platform;
    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer game_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String gift_code;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String icon_pic1;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String icon_pic2;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String icon_pic3;
    @ProtoField(tag = 53, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 43, type = Message.Datatype.STRING)
    public final String inter_version;
    @ProtoField(tag = 45, type = Message.Datatype.STRING)
    public final String inter_version_ios;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String launchComponent;
    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer mark;
    @ProtoField(tag = 50, type = Message.Datatype.STRING)
    public final String package_link;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String package_size;
    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer play_count;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String praise;
    @ProtoField(label = Message.Label.REPEATED, tag = 16, type = Message.Datatype.STRING)
    public final List<String> recommend_platform;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String schema_url;
    @ProtoField(tag = 35, type = Message.Datatype.INT32)
    public final Integer score;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String secret_key;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String server_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String server_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer server_open_time;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer server_type;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 48, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String subscript_color;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String test_userids;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String thread_forum_name;
    @ProtoField(tag = 33, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 32, type = Message.Datatype.UINT64)
    public final Long thread_theme_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 41, type = Message.Datatype.STRING)
    public final String version;
    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String version_ios;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<NewGameInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String andr_pk_name;
        public String api_key;
        public String app_id;
        public String apple_id;
        public String bundle_id;
        public String canvas_name;
        public Integer category_id;
        public String category_name;
        public String category_name_sim;
        public Integer channel;
        public Long deadline;
        public String developer;
        public Long forum_id;
        public String forum_name;
        public String game_desc;
        public String game_id;
        public String game_link;
        public String game_name;
        public List<String> game_pic;
        public Integer game_platform;
        public Integer game_type;
        public String gift_code;
        public String icon_pic1;
        public String icon_pic2;
        public String icon_pic3;
        public String icon_url;
        public Long id;
        public String inter_version;
        public String inter_version_ios;
        public String launchComponent;
        public Integer mark;
        public String package_link;
        public String package_name;
        public String package_size;
        public Integer play_count;
        public String praise;
        public List<String> recommend_platform;
        public String schema_url;
        public Integer score;
        public String secret_key;
        public String server_id;
        public String server_name;
        public Integer server_open_time;
        public Integer server_type;
        public String sign;
        public Integer status;
        public String subscript_color;
        public String test_userids;
        public String thread_forum_name;
        public Long thread_id;
        public Long thread_theme_id;
        public Integer time;
        public String version;
        public String version_ios;

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
        public Builder(NewGameInfo newGameInfo) {
            super(newGameInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {newGameInfo};
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
            if (newGameInfo == null) {
                return;
            }
            this.id = newGameInfo.id;
            this.game_id = newGameInfo.game_id;
            this.server_id = newGameInfo.server_id;
            this.server_name = newGameInfo.server_name;
            this.server_open_time = newGameInfo.server_open_time;
            this.server_type = newGameInfo.server_type;
            this.time = newGameInfo.time;
            this.gift_code = newGameInfo.gift_code;
            this.game_link = newGameInfo.game_link;
            this.praise = newGameInfo.praise;
            this.test_userids = newGameInfo.test_userids;
            this.game_desc = newGameInfo.game_desc;
            this.game_pic = Message.copyOf(newGameInfo.game_pic);
            this.game_name = newGameInfo.game_name;
            this.developer = newGameInfo.developer;
            this.recommend_platform = Message.copyOf(newGameInfo.recommend_platform);
            this.package_name = newGameInfo.package_name;
            this.sign = newGameInfo.sign;
            this.launchComponent = newGameInfo.launchComponent;
            this.package_size = newGameInfo.package_size;
            this.apple_id = newGameInfo.apple_id;
            this.bundle_id = newGameInfo.bundle_id;
            this.schema_url = newGameInfo.schema_url;
            this.app_id = newGameInfo.app_id;
            this.canvas_name = newGameInfo.canvas_name;
            this.thread_forum_name = newGameInfo.thread_forum_name;
            this.forum_name = newGameInfo.forum_name;
            this.icon_pic1 = newGameInfo.icon_pic1;
            this.icon_pic2 = newGameInfo.icon_pic2;
            this.icon_pic3 = newGameInfo.icon_pic3;
            this.secret_key = newGameInfo.secret_key;
            this.thread_theme_id = newGameInfo.thread_theme_id;
            this.thread_id = newGameInfo.thread_id;
            this.forum_id = newGameInfo.forum_id;
            this.score = newGameInfo.score;
            this.deadline = newGameInfo.deadline;
            this.play_count = newGameInfo.play_count;
            this.game_type = newGameInfo.game_type;
            this.game_platform = newGameInfo.game_platform;
            this.channel = newGameInfo.channel;
            this.version = newGameInfo.version;
            this.api_key = newGameInfo.api_key;
            this.inter_version = newGameInfo.inter_version;
            this.version_ios = newGameInfo.version_ios;
            this.inter_version_ios = newGameInfo.inter_version_ios;
            this.subscript_color = newGameInfo.subscript_color;
            this.category_id = newGameInfo.category_id;
            this.status = newGameInfo.status;
            this.mark = newGameInfo.mark;
            this.package_link = newGameInfo.package_link;
            this.andr_pk_name = newGameInfo.andr_pk_name;
            this.category_name = newGameInfo.category_name;
            this.icon_url = newGameInfo.icon_url;
            this.category_name_sim = newGameInfo.category_name_sim;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewGameInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new NewGameInfo(this, z, null) : (NewGameInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1139645594, "Ltbclient/GetNewGameList/NewGameInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1139645594, "Ltbclient/GetNewGameList/NewGameInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_SERVER_OPEN_TIME = 0;
        DEFAULT_SERVER_TYPE = 0;
        DEFAULT_TIME = 0;
        DEFAULT_GAME_PIC = Collections.emptyList();
        DEFAULT_RECOMMEND_PLATFORM = Collections.emptyList();
        DEFAULT_THREAD_THEME_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_SCORE = 0;
        DEFAULT_DEADLINE = 0L;
        DEFAULT_PLAY_COUNT = 0;
        DEFAULT_GAME_TYPE = 0;
        DEFAULT_GAME_PLATFORM = 0;
        DEFAULT_CHANNEL = 0;
        DEFAULT_CATEGORY_ID = 0;
        DEFAULT_STATUS = 0;
        DEFAULT_MARK = 0;
    }

    public /* synthetic */ NewGameInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewGameInfo(Builder builder, boolean z) {
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
            String str = builder.game_id;
            if (str == null) {
                this.game_id = "";
            } else {
                this.game_id = str;
            }
            String str2 = builder.server_id;
            if (str2 == null) {
                this.server_id = "";
            } else {
                this.server_id = str2;
            }
            String str3 = builder.server_name;
            if (str3 == null) {
                this.server_name = "";
            } else {
                this.server_name = str3;
            }
            Integer num = builder.server_open_time;
            if (num == null) {
                this.server_open_time = DEFAULT_SERVER_OPEN_TIME;
            } else {
                this.server_open_time = num;
            }
            Integer num2 = builder.server_type;
            if (num2 == null) {
                this.server_type = DEFAULT_SERVER_TYPE;
            } else {
                this.server_type = num2;
            }
            Integer num3 = builder.time;
            if (num3 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num3;
            }
            String str4 = builder.gift_code;
            if (str4 == null) {
                this.gift_code = "";
            } else {
                this.gift_code = str4;
            }
            String str5 = builder.game_link;
            if (str5 == null) {
                this.game_link = "";
            } else {
                this.game_link = str5;
            }
            String str6 = builder.praise;
            if (str6 == null) {
                this.praise = "";
            } else {
                this.praise = str6;
            }
            String str7 = builder.test_userids;
            if (str7 == null) {
                this.test_userids = "";
            } else {
                this.test_userids = str7;
            }
            String str8 = builder.game_desc;
            if (str8 == null) {
                this.game_desc = "";
            } else {
                this.game_desc = str8;
            }
            List<String> list = builder.game_pic;
            if (list == null) {
                this.game_pic = DEFAULT_GAME_PIC;
            } else {
                this.game_pic = Message.immutableCopyOf(list);
            }
            String str9 = builder.game_name;
            if (str9 == null) {
                this.game_name = "";
            } else {
                this.game_name = str9;
            }
            String str10 = builder.developer;
            if (str10 == null) {
                this.developer = "";
            } else {
                this.developer = str10;
            }
            List<String> list2 = builder.recommend_platform;
            if (list2 == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
            } else {
                this.recommend_platform = Message.immutableCopyOf(list2);
            }
            String str11 = builder.package_name;
            if (str11 == null) {
                this.package_name = "";
            } else {
                this.package_name = str11;
            }
            String str12 = builder.sign;
            if (str12 == null) {
                this.sign = "";
            } else {
                this.sign = str12;
            }
            String str13 = builder.launchComponent;
            if (str13 == null) {
                this.launchComponent = "";
            } else {
                this.launchComponent = str13;
            }
            String str14 = builder.package_size;
            if (str14 == null) {
                this.package_size = "";
            } else {
                this.package_size = str14;
            }
            String str15 = builder.apple_id;
            if (str15 == null) {
                this.apple_id = "";
            } else {
                this.apple_id = str15;
            }
            String str16 = builder.bundle_id;
            if (str16 == null) {
                this.bundle_id = "";
            } else {
                this.bundle_id = str16;
            }
            String str17 = builder.schema_url;
            if (str17 == null) {
                this.schema_url = "";
            } else {
                this.schema_url = str17;
            }
            String str18 = builder.app_id;
            if (str18 == null) {
                this.app_id = "";
            } else {
                this.app_id = str18;
            }
            String str19 = builder.canvas_name;
            if (str19 == null) {
                this.canvas_name = "";
            } else {
                this.canvas_name = str19;
            }
            String str20 = builder.thread_forum_name;
            if (str20 == null) {
                this.thread_forum_name = "";
            } else {
                this.thread_forum_name = str20;
            }
            String str21 = builder.forum_name;
            if (str21 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str21;
            }
            String str22 = builder.icon_pic1;
            if (str22 == null) {
                this.icon_pic1 = "";
            } else {
                this.icon_pic1 = str22;
            }
            String str23 = builder.icon_pic2;
            if (str23 == null) {
                this.icon_pic2 = "";
            } else {
                this.icon_pic2 = str23;
            }
            String str24 = builder.icon_pic3;
            if (str24 == null) {
                this.icon_pic3 = "";
            } else {
                this.icon_pic3 = str24;
            }
            String str25 = builder.secret_key;
            if (str25 == null) {
                this.secret_key = "";
            } else {
                this.secret_key = str25;
            }
            Long l2 = builder.thread_theme_id;
            if (l2 == null) {
                this.thread_theme_id = DEFAULT_THREAD_THEME_ID;
            } else {
                this.thread_theme_id = l2;
            }
            Long l3 = builder.thread_id;
            if (l3 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l3;
            }
            Long l4 = builder.forum_id;
            if (l4 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l4;
            }
            Integer num4 = builder.score;
            if (num4 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = num4;
            }
            Long l5 = builder.deadline;
            if (l5 == null) {
                this.deadline = DEFAULT_DEADLINE;
            } else {
                this.deadline = l5;
            }
            Integer num5 = builder.play_count;
            if (num5 == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = num5;
            }
            Integer num6 = builder.game_type;
            if (num6 == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = num6;
            }
            Integer num7 = builder.game_platform;
            if (num7 == null) {
                this.game_platform = DEFAULT_GAME_PLATFORM;
            } else {
                this.game_platform = num7;
            }
            Integer num8 = builder.channel;
            if (num8 == null) {
                this.channel = DEFAULT_CHANNEL;
            } else {
                this.channel = num8;
            }
            String str26 = builder.version;
            if (str26 == null) {
                this.version = "";
            } else {
                this.version = str26;
            }
            String str27 = builder.api_key;
            if (str27 == null) {
                this.api_key = "";
            } else {
                this.api_key = str27;
            }
            String str28 = builder.inter_version;
            if (str28 == null) {
                this.inter_version = "";
            } else {
                this.inter_version = str28;
            }
            String str29 = builder.version_ios;
            if (str29 == null) {
                this.version_ios = "";
            } else {
                this.version_ios = str29;
            }
            String str30 = builder.inter_version_ios;
            if (str30 == null) {
                this.inter_version_ios = "";
            } else {
                this.inter_version_ios = str30;
            }
            String str31 = builder.subscript_color;
            if (str31 == null) {
                this.subscript_color = "";
            } else {
                this.subscript_color = str31;
            }
            Integer num9 = builder.category_id;
            if (num9 == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num9;
            }
            Integer num10 = builder.status;
            if (num10 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num10;
            }
            Integer num11 = builder.mark;
            if (num11 == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = num11;
            }
            String str32 = builder.package_link;
            if (str32 == null) {
                this.package_link = "";
            } else {
                this.package_link = str32;
            }
            String str33 = builder.andr_pk_name;
            if (str33 == null) {
                this.andr_pk_name = "";
            } else {
                this.andr_pk_name = str33;
            }
            String str34 = builder.category_name;
            if (str34 == null) {
                this.category_name = "";
            } else {
                this.category_name = str34;
            }
            String str35 = builder.icon_url;
            if (str35 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str35;
            }
            String str36 = builder.category_name_sim;
            if (str36 == null) {
                this.category_name_sim = "";
                return;
            } else {
                this.category_name_sim = str36;
                return;
            }
        }
        this.id = builder.id;
        this.game_id = builder.game_id;
        this.server_id = builder.server_id;
        this.server_name = builder.server_name;
        this.server_open_time = builder.server_open_time;
        this.server_type = builder.server_type;
        this.time = builder.time;
        this.gift_code = builder.gift_code;
        this.game_link = builder.game_link;
        this.praise = builder.praise;
        this.test_userids = builder.test_userids;
        this.game_desc = builder.game_desc;
        this.game_pic = Message.immutableCopyOf(builder.game_pic);
        this.game_name = builder.game_name;
        this.developer = builder.developer;
        this.recommend_platform = Message.immutableCopyOf(builder.recommend_platform);
        this.package_name = builder.package_name;
        this.sign = builder.sign;
        this.launchComponent = builder.launchComponent;
        this.package_size = builder.package_size;
        this.apple_id = builder.apple_id;
        this.bundle_id = builder.bundle_id;
        this.schema_url = builder.schema_url;
        this.app_id = builder.app_id;
        this.canvas_name = builder.canvas_name;
        this.thread_forum_name = builder.thread_forum_name;
        this.forum_name = builder.forum_name;
        this.icon_pic1 = builder.icon_pic1;
        this.icon_pic2 = builder.icon_pic2;
        this.icon_pic3 = builder.icon_pic3;
        this.secret_key = builder.secret_key;
        this.thread_theme_id = builder.thread_theme_id;
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.score = builder.score;
        this.deadline = builder.deadline;
        this.play_count = builder.play_count;
        this.game_type = builder.game_type;
        this.game_platform = builder.game_platform;
        this.channel = builder.channel;
        this.version = builder.version;
        this.api_key = builder.api_key;
        this.inter_version = builder.inter_version;
        this.version_ios = builder.version_ios;
        this.inter_version_ios = builder.inter_version_ios;
        this.subscript_color = builder.subscript_color;
        this.category_id = builder.category_id;
        this.status = builder.status;
        this.mark = builder.mark;
        this.package_link = builder.package_link;
        this.andr_pk_name = builder.andr_pk_name;
        this.category_name = builder.category_name;
        this.icon_url = builder.icon_url;
        this.category_name_sim = builder.category_name_sim;
    }
}
