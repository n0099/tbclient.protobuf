package tbclient.GetNewGameList;

import com.baidu.tbadk.TbConfig;
import com.baidu.tieba.r;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class NewGameInfo extends Message {
    public static final String DEFAULT_ANDR_PK_NAME = "";
    public static final String DEFAULT_API_KEY = "";
    public static final String DEFAULT_APPLE_ID = "";
    public static final String DEFAULT_APP_ID = "";
    public static final String DEFAULT_BUNDLE_ID = "";
    public static final String DEFAULT_CANVAS_NAME = "";
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_CATEGORY_NAME_SIM = "";
    public static final String DEFAULT_DEVELOPER = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_GAME_DESC = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_LINK = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final String DEFAULT_GIFT_CODE = "";
    public static final String DEFAULT_ICON_PIC1 = "";
    public static final String DEFAULT_ICON_PIC2 = "";
    public static final String DEFAULT_ICON_PIC3 = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_INTER_VERSION = "";
    public static final String DEFAULT_INTER_VERSION_IOS = "";
    public static final String DEFAULT_LAUNCHCOMPONENT = "";
    public static final String DEFAULT_PACKAGE_LINK = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_PRAISE = "";
    public static final String DEFAULT_SCHEMA_URL = "";
    public static final String DEFAULT_SECRET_KEY = "";
    public static final String DEFAULT_SERVER_ID = "";
    public static final String DEFAULT_SERVER_NAME = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_SUBSCRIPT_COLOR = "";
    public static final String DEFAULT_TEST_USERIDS = "";
    public static final String DEFAULT_THREAD_FORUM_NAME = "";
    public static final String DEFAULT_VERSION = "";
    public static final String DEFAULT_VERSION_IOS = "";
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
    @ProtoField(tag = r.l.PullToRefresh_headerTextColor, type = Message.Datatype.UINT32)
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
    @ProtoField(tag = r.l.PullToRefresh_headerBackground, type = Message.Datatype.INT32)
    public final Integer game_platform;
    @ProtoField(tag = r.l.PullToRefresh_adapterViewBackground, type = Message.Datatype.INT32)
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
    @ProtoField(tag = TbConfig.VIEW_IMAGE_QUALITY_LOW_VALUE, type = Message.Datatype.STRING)
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
    @ProtoField(tag = r.l.PullToRefresh_mode, type = Message.Datatype.STRING)
    public final String version;
    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String version_ios;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_SERVER_OPEN_TIME = 0;
    public static final Integer DEFAULT_SERVER_TYPE = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final List<String> DEFAULT_GAME_PIC = Collections.emptyList();
    public static final List<String> DEFAULT_RECOMMEND_PLATFORM = Collections.emptyList();
    public static final Long DEFAULT_THREAD_THEME_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_SCORE = 0;
    public static final Long DEFAULT_DEADLINE = 0L;
    public static final Integer DEFAULT_PLAY_COUNT = 0;
    public static final Integer DEFAULT_GAME_TYPE = 0;
    public static final Integer DEFAULT_GAME_PLATFORM = 0;
    public static final Integer DEFAULT_CHANNEL = 0;
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_MARK = 0;

    /* synthetic */ NewGameInfo(Builder builder, boolean z, NewGameInfo newGameInfo) {
        this(builder, z);
    }

    private NewGameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.server_id == null) {
                this.server_id = "";
            } else {
                this.server_id = builder.server_id;
            }
            if (builder.server_name == null) {
                this.server_name = "";
            } else {
                this.server_name = builder.server_name;
            }
            if (builder.server_open_time == null) {
                this.server_open_time = DEFAULT_SERVER_OPEN_TIME;
            } else {
                this.server_open_time = builder.server_open_time;
            }
            if (builder.server_type == null) {
                this.server_type = DEFAULT_SERVER_TYPE;
            } else {
                this.server_type = builder.server_type;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.gift_code == null) {
                this.gift_code = "";
            } else {
                this.gift_code = builder.gift_code;
            }
            if (builder.game_link == null) {
                this.game_link = "";
            } else {
                this.game_link = builder.game_link;
            }
            if (builder.praise == null) {
                this.praise = "";
            } else {
                this.praise = builder.praise;
            }
            if (builder.test_userids == null) {
                this.test_userids = "";
            } else {
                this.test_userids = builder.test_userids;
            }
            if (builder.game_desc == null) {
                this.game_desc = "";
            } else {
                this.game_desc = builder.game_desc;
            }
            if (builder.game_pic == null) {
                this.game_pic = DEFAULT_GAME_PIC;
            } else {
                this.game_pic = immutableCopyOf(builder.game_pic);
            }
            if (builder.game_name == null) {
                this.game_name = "";
            } else {
                this.game_name = builder.game_name;
            }
            if (builder.developer == null) {
                this.developer = "";
            } else {
                this.developer = builder.developer;
            }
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
            } else {
                this.recommend_platform = immutableCopyOf(builder.recommend_platform);
            }
            if (builder.package_name == null) {
                this.package_name = "";
            } else {
                this.package_name = builder.package_name;
            }
            if (builder.sign == null) {
                this.sign = "";
            } else {
                this.sign = builder.sign;
            }
            if (builder.launchComponent == null) {
                this.launchComponent = "";
            } else {
                this.launchComponent = builder.launchComponent;
            }
            if (builder.package_size == null) {
                this.package_size = "";
            } else {
                this.package_size = builder.package_size;
            }
            if (builder.apple_id == null) {
                this.apple_id = "";
            } else {
                this.apple_id = builder.apple_id;
            }
            if (builder.bundle_id == null) {
                this.bundle_id = "";
            } else {
                this.bundle_id = builder.bundle_id;
            }
            if (builder.schema_url == null) {
                this.schema_url = "";
            } else {
                this.schema_url = builder.schema_url;
            }
            if (builder.app_id == null) {
                this.app_id = "";
            } else {
                this.app_id = builder.app_id;
            }
            if (builder.canvas_name == null) {
                this.canvas_name = "";
            } else {
                this.canvas_name = builder.canvas_name;
            }
            if (builder.thread_forum_name == null) {
                this.thread_forum_name = "";
            } else {
                this.thread_forum_name = builder.thread_forum_name;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.icon_pic1 == null) {
                this.icon_pic1 = "";
            } else {
                this.icon_pic1 = builder.icon_pic1;
            }
            if (builder.icon_pic2 == null) {
                this.icon_pic2 = "";
            } else {
                this.icon_pic2 = builder.icon_pic2;
            }
            if (builder.icon_pic3 == null) {
                this.icon_pic3 = "";
            } else {
                this.icon_pic3 = builder.icon_pic3;
            }
            if (builder.secret_key == null) {
                this.secret_key = "";
            } else {
                this.secret_key = builder.secret_key;
            }
            if (builder.thread_theme_id == null) {
                this.thread_theme_id = DEFAULT_THREAD_THEME_ID;
            } else {
                this.thread_theme_id = builder.thread_theme_id;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = builder.score;
            }
            if (builder.deadline == null) {
                this.deadline = DEFAULT_DEADLINE;
            } else {
                this.deadline = builder.deadline;
            }
            if (builder.play_count == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = builder.play_count;
            }
            if (builder.game_type == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = builder.game_type;
            }
            if (builder.game_platform == null) {
                this.game_platform = DEFAULT_GAME_PLATFORM;
            } else {
                this.game_platform = builder.game_platform;
            }
            if (builder.channel == null) {
                this.channel = DEFAULT_CHANNEL;
            } else {
                this.channel = builder.channel;
            }
            if (builder.version == null) {
                this.version = "";
            } else {
                this.version = builder.version;
            }
            if (builder.api_key == null) {
                this.api_key = "";
            } else {
                this.api_key = builder.api_key;
            }
            if (builder.inter_version == null) {
                this.inter_version = "";
            } else {
                this.inter_version = builder.inter_version;
            }
            if (builder.version_ios == null) {
                this.version_ios = "";
            } else {
                this.version_ios = builder.version_ios;
            }
            if (builder.inter_version_ios == null) {
                this.inter_version_ios = "";
            } else {
                this.inter_version_ios = builder.inter_version_ios;
            }
            if (builder.subscript_color == null) {
                this.subscript_color = "";
            } else {
                this.subscript_color = builder.subscript_color;
            }
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.mark == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = builder.mark;
            }
            if (builder.package_link == null) {
                this.package_link = "";
            } else {
                this.package_link = builder.package_link;
            }
            if (builder.andr_pk_name == null) {
                this.andr_pk_name = "";
            } else {
                this.andr_pk_name = builder.andr_pk_name;
            }
            if (builder.category_name == null) {
                this.category_name = "";
            } else {
                this.category_name = builder.category_name;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.category_name_sim == null) {
                this.category_name_sim = "";
                return;
            } else {
                this.category_name_sim = builder.category_name_sim;
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
        this.game_pic = immutableCopyOf(builder.game_pic);
        this.game_name = builder.game_name;
        this.developer = builder.developer;
        this.recommend_platform = immutableCopyOf(builder.recommend_platform);
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

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<NewGameInfo> {
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
        }

        public Builder(NewGameInfo newGameInfo) {
            super(newGameInfo);
            if (newGameInfo != null) {
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
                this.game_pic = NewGameInfo.copyOf(newGameInfo.game_pic);
                this.game_name = newGameInfo.game_name;
                this.developer = newGameInfo.developer;
                this.recommend_platform = NewGameInfo.copyOf(newGameInfo.recommend_platform);
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
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewGameInfo build(boolean z) {
            return new NewGameInfo(this, z, null);
        }
    }
}
