package tbclient;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GameInfo extends Message {
    public static final String DEFAULT_ANDR_PK_NAME = "";
    public static final String DEFAULT_APPLE_ID = "";
    public static final String DEFAULT_BUNDLE_ID = "";
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_EDITOR_REC = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_LINK = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_INTRODUCE = "";
    public static final String DEFAULT_LAUNCH_COMPONENT = "";
    public static final String DEFAULT_PACKAGE_LINK = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_SCHEMA_URL = "";
    public static final String DEFAULT_SECRET_KEY = "";
    public static final String DEFAULT_SUPERSCRIPT_COLOR = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String andr_pk_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String apple_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String bundle_id;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer day_downloads;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GIFT_INFO, type = Message.Datatype.UINT64)
    public final Long deadline;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_NATIVE_BUY_TBEAN, type = Message.Datatype.STRING)
    public final String editor_rec;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String game_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 13, type = Message.Datatype.STRING)
    public final List<String> game_pic;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer game_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.STRING)
    public final String introduce;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String launch_component;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer mark;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_link;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_size;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer player_num;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String schema_url;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String secret_key;
    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer star;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String superscript_color;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String version;
    public static final Integer DEFAULT_GAME_TYPE = 0;
    public static final Integer DEFAULT_PLAYER_NUM = 0;
    public static final Integer DEFAULT_MARK = 0;
    public static final List<String> DEFAULT_GAME_PIC = Collections.emptyList();
    public static final Integer DEFAULT_DAY_DOWNLOADS = 0;
    public static final Integer DEFAULT_STAR = 0;
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final Long DEFAULT_DEADLINE = 0L;

    /* synthetic */ GameInfo(Builder builder, boolean z, GameInfo gameInfo) {
        this(builder, z);
    }

    private GameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.game_name == null) {
                this.game_name = "";
            } else {
                this.game_name = builder.game_name;
            }
            if (builder.game_type == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = builder.game_type;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.player_num == null) {
                this.player_num = DEFAULT_PLAYER_NUM;
            } else {
                this.player_num = builder.player_num;
            }
            if (builder.package_link == null) {
                this.package_link = "";
            } else {
                this.package_link = builder.package_link;
            }
            if (builder.package_size == null) {
                this.package_size = "";
            } else {
                this.package_size = builder.package_size;
            }
            if (builder.game_link == null) {
                this.game_link = "";
            } else {
                this.game_link = builder.game_link;
            }
            if (builder.mark == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = builder.mark;
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
            if (builder.game_pic == null) {
                this.game_pic = DEFAULT_GAME_PIC;
            } else {
                this.game_pic = immutableCopyOf(builder.game_pic);
            }
            if (builder.introduce == null) {
                this.introduce = "";
            } else {
                this.introduce = builder.introduce;
            }
            if (builder.launch_component == null) {
                this.launch_component = "";
            } else {
                this.launch_component = builder.launch_component;
            }
            if (builder.andr_pk_name == null) {
                this.andr_pk_name = "";
            } else {
                this.andr_pk_name = builder.andr_pk_name;
            }
            if (builder.day_downloads == null) {
                this.day_downloads = DEFAULT_DAY_DOWNLOADS;
            } else {
                this.day_downloads = builder.day_downloads;
            }
            if (builder.secret_key == null) {
                this.secret_key = "";
            } else {
                this.secret_key = builder.secret_key;
            }
            if (builder.superscript_color == null) {
                this.superscript_color = "";
            } else {
                this.superscript_color = builder.superscript_color;
            }
            if (builder.star == null) {
                this.star = DEFAULT_STAR;
            } else {
                this.star = builder.star;
            }
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            if (builder.category_name == null) {
                this.category_name = "";
            } else {
                this.category_name = builder.category_name;
            }
            if (builder.version == null) {
                this.version = "";
            } else {
                this.version = builder.version;
            }
            if (builder.deadline == null) {
                this.deadline = DEFAULT_DEADLINE;
            } else {
                this.deadline = builder.deadline;
            }
            if (builder.editor_rec == null) {
                this.editor_rec = "";
                return;
            } else {
                this.editor_rec = builder.editor_rec;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.game_name = builder.game_name;
        this.game_type = builder.game_type;
        this.icon_url = builder.icon_url;
        this.player_num = builder.player_num;
        this.package_link = builder.package_link;
        this.package_size = builder.package_size;
        this.game_link = builder.game_link;
        this.mark = builder.mark;
        this.apple_id = builder.apple_id;
        this.bundle_id = builder.bundle_id;
        this.schema_url = builder.schema_url;
        this.game_pic = immutableCopyOf(builder.game_pic);
        this.introduce = builder.introduce;
        this.launch_component = builder.launch_component;
        this.andr_pk_name = builder.andr_pk_name;
        this.day_downloads = builder.day_downloads;
        this.secret_key = builder.secret_key;
        this.superscript_color = builder.superscript_color;
        this.star = builder.star;
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.version = builder.version;
        this.deadline = builder.deadline;
        this.editor_rec = builder.editor_rec;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GameInfo> {
        public String andr_pk_name;
        public String apple_id;
        public String bundle_id;
        public Integer category_id;
        public String category_name;
        public Integer day_downloads;
        public Long deadline;
        public String editor_rec;
        public String game_id;
        public String game_link;
        public String game_name;
        public List<String> game_pic;
        public Integer game_type;
        public String icon_url;
        public String introduce;
        public String launch_component;
        public Integer mark;
        public String package_link;
        public String package_size;
        public Integer player_num;
        public String schema_url;
        public String secret_key;
        public Integer star;
        public String superscript_color;
        public String version;

        public Builder(GameInfo gameInfo) {
            super(gameInfo);
            if (gameInfo != null) {
                this.game_id = gameInfo.game_id;
                this.game_name = gameInfo.game_name;
                this.game_type = gameInfo.game_type;
                this.icon_url = gameInfo.icon_url;
                this.player_num = gameInfo.player_num;
                this.package_link = gameInfo.package_link;
                this.package_size = gameInfo.package_size;
                this.game_link = gameInfo.game_link;
                this.mark = gameInfo.mark;
                this.apple_id = gameInfo.apple_id;
                this.bundle_id = gameInfo.bundle_id;
                this.schema_url = gameInfo.schema_url;
                this.game_pic = GameInfo.copyOf(gameInfo.game_pic);
                this.introduce = gameInfo.introduce;
                this.launch_component = gameInfo.launch_component;
                this.andr_pk_name = gameInfo.andr_pk_name;
                this.day_downloads = gameInfo.day_downloads;
                this.secret_key = gameInfo.secret_key;
                this.superscript_color = gameInfo.superscript_color;
                this.star = gameInfo.star;
                this.category_id = gameInfo.category_id;
                this.category_name = gameInfo.category_name;
                this.version = gameInfo.version;
                this.deadline = gameInfo.deadline;
                this.editor_rec = gameInfo.editor_rec;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameInfo build(boolean z) {
            return new GameInfo(this, z, null);
        }
    }
}
