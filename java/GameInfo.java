package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GameInfo extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ANDR_PK_NAME = "";
    public static final String DEFAULT_APPLE_ID = "";
    public static final String DEFAULT_BUNDLE_ID = "";
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_CATEGORY_NAME_SIM = "";
    public static final String DEFAULT_EDITOR_REC = "";
    public static final String DEFAULT_GAME_DESC = "";
    public static final String DEFAULT_GAME_DETAILS_URL = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_LINK = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final String DEFAULT_ICON_PIC1 = "";
    public static final String DEFAULT_ICON_PIC2 = "";
    public static final String DEFAULT_ICON_PIC3 = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_INTRODUCE = "";
    public static final String DEFAULT_LAUNCHCOMPONENT = "";
    public static final String DEFAULT_LAUNCH_COMPONENT = "";
    public static final String DEFAULT_PACKAGE_LINK = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_SCHEMA_URL = "";
    public static final String DEFAULT_SECRET_KEY = "";
    public static final String DEFAULT_SUBSCRIPT_COLOR = "";
    public static final String DEFAULT_SUPERSCRIPT_COLOR = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String andr_pk_name;
    @ProtoField(tag = 28, type = Message.Datatype.UINT32)
    public final Integer app_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String apple_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String bundle_id;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String category_name_sim;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer day_downloads;
    @ProtoField(tag = 24, type = Message.Datatype.UINT64)
    public final Long deadline;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String editor_rec;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String game_desc;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String game_details_url;
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
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String icon_pic1;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String icon_pic2;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String icon_pic3;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String introduce;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String launchComponent;
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
    @ProtoField(tag = 36, type = Message.Datatype.UINT32)
    public final Integer score;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String secret_key;
    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer star;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String subscript_color;
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
    public static final Integer DEFAULT_APP_ID = 0;
    public static final Integer DEFAULT_SCORE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GameInfo> {
        public String _abstract;
        public String andr_pk_name;
        public Integer app_id;
        public String apple_id;
        public String bundle_id;
        public Integer category_id;
        public String category_name;
        public String category_name_sim;
        public Integer day_downloads;
        public Long deadline;
        public String editor_rec;
        public String game_desc;
        public String game_details_url;
        public String game_id;
        public String game_link;
        public String game_name;
        public List<String> game_pic;
        public Integer game_type;
        public String icon_pic1;
        public String icon_pic2;
        public String icon_pic3;
        public String icon_url;
        public String introduce;
        public String launchComponent;
        public String launch_component;
        public Integer mark;
        public String package_link;
        public String package_size;
        public Integer player_num;
        public String schema_url;
        public Integer score;
        public String secret_key;
        public Integer star;
        public String subscript_color;
        public String superscript_color;
        public String version;

        public Builder() {
        }

        public Builder(GameInfo gameInfo) {
            super(gameInfo);
            if (gameInfo == null) {
                return;
            }
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
            this.game_pic = Message.copyOf(gameInfo.game_pic);
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
            this._abstract = gameInfo._abstract;
            this.game_details_url = gameInfo.game_details_url;
            this.app_id = gameInfo.app_id;
            this.icon_pic1 = gameInfo.icon_pic1;
            this.icon_pic2 = gameInfo.icon_pic2;
            this.icon_pic3 = gameInfo.icon_pic3;
            this.game_desc = gameInfo.game_desc;
            this.subscript_color = gameInfo.subscript_color;
            this.launchComponent = gameInfo.launchComponent;
            this.category_name_sim = gameInfo.category_name_sim;
            this.score = gameInfo.score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameInfo build(boolean z) {
            return new GameInfo(this, z);
        }
    }

    public GameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.game_id;
            if (str == null) {
                this.game_id = "";
            } else {
                this.game_id = str;
            }
            String str2 = builder.game_name;
            if (str2 == null) {
                this.game_name = "";
            } else {
                this.game_name = str2;
            }
            Integer num = builder.game_type;
            if (num == null) {
                this.game_type = DEFAULT_GAME_TYPE;
            } else {
                this.game_type = num;
            }
            String str3 = builder.icon_url;
            if (str3 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str3;
            }
            Integer num2 = builder.player_num;
            if (num2 == null) {
                this.player_num = DEFAULT_PLAYER_NUM;
            } else {
                this.player_num = num2;
            }
            String str4 = builder.package_link;
            if (str4 == null) {
                this.package_link = "";
            } else {
                this.package_link = str4;
            }
            String str5 = builder.package_size;
            if (str5 == null) {
                this.package_size = "";
            } else {
                this.package_size = str5;
            }
            String str6 = builder.game_link;
            if (str6 == null) {
                this.game_link = "";
            } else {
                this.game_link = str6;
            }
            Integer num3 = builder.mark;
            if (num3 == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = num3;
            }
            String str7 = builder.apple_id;
            if (str7 == null) {
                this.apple_id = "";
            } else {
                this.apple_id = str7;
            }
            String str8 = builder.bundle_id;
            if (str8 == null) {
                this.bundle_id = "";
            } else {
                this.bundle_id = str8;
            }
            String str9 = builder.schema_url;
            if (str9 == null) {
                this.schema_url = "";
            } else {
                this.schema_url = str9;
            }
            List<String> list = builder.game_pic;
            if (list == null) {
                this.game_pic = DEFAULT_GAME_PIC;
            } else {
                this.game_pic = Message.immutableCopyOf(list);
            }
            String str10 = builder.introduce;
            if (str10 == null) {
                this.introduce = "";
            } else {
                this.introduce = str10;
            }
            String str11 = builder.launch_component;
            if (str11 == null) {
                this.launch_component = "";
            } else {
                this.launch_component = str11;
            }
            String str12 = builder.andr_pk_name;
            if (str12 == null) {
                this.andr_pk_name = "";
            } else {
                this.andr_pk_name = str12;
            }
            Integer num4 = builder.day_downloads;
            if (num4 == null) {
                this.day_downloads = DEFAULT_DAY_DOWNLOADS;
            } else {
                this.day_downloads = num4;
            }
            String str13 = builder.secret_key;
            if (str13 == null) {
                this.secret_key = "";
            } else {
                this.secret_key = str13;
            }
            String str14 = builder.superscript_color;
            if (str14 == null) {
                this.superscript_color = "";
            } else {
                this.superscript_color = str14;
            }
            Integer num5 = builder.star;
            if (num5 == null) {
                this.star = DEFAULT_STAR;
            } else {
                this.star = num5;
            }
            Integer num6 = builder.category_id;
            if (num6 == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num6;
            }
            String str15 = builder.category_name;
            if (str15 == null) {
                this.category_name = "";
            } else {
                this.category_name = str15;
            }
            String str16 = builder.version;
            if (str16 == null) {
                this.version = "";
            } else {
                this.version = str16;
            }
            Long l = builder.deadline;
            if (l == null) {
                this.deadline = DEFAULT_DEADLINE;
            } else {
                this.deadline = l;
            }
            String str17 = builder.editor_rec;
            if (str17 == null) {
                this.editor_rec = "";
            } else {
                this.editor_rec = str17;
            }
            String str18 = builder._abstract;
            if (str18 == null) {
                this._abstract = "";
            } else {
                this._abstract = str18;
            }
            String str19 = builder.game_details_url;
            if (str19 == null) {
                this.game_details_url = "";
            } else {
                this.game_details_url = str19;
            }
            Integer num7 = builder.app_id;
            if (num7 == null) {
                this.app_id = DEFAULT_APP_ID;
            } else {
                this.app_id = num7;
            }
            String str20 = builder.icon_pic1;
            if (str20 == null) {
                this.icon_pic1 = "";
            } else {
                this.icon_pic1 = str20;
            }
            String str21 = builder.icon_pic2;
            if (str21 == null) {
                this.icon_pic2 = "";
            } else {
                this.icon_pic2 = str21;
            }
            String str22 = builder.icon_pic3;
            if (str22 == null) {
                this.icon_pic3 = "";
            } else {
                this.icon_pic3 = str22;
            }
            String str23 = builder.game_desc;
            if (str23 == null) {
                this.game_desc = "";
            } else {
                this.game_desc = str23;
            }
            String str24 = builder.subscript_color;
            if (str24 == null) {
                this.subscript_color = "";
            } else {
                this.subscript_color = str24;
            }
            String str25 = builder.launchComponent;
            if (str25 == null) {
                this.launchComponent = "";
            } else {
                this.launchComponent = str25;
            }
            String str26 = builder.category_name_sim;
            if (str26 == null) {
                this.category_name_sim = "";
            } else {
                this.category_name_sim = str26;
            }
            Integer num8 = builder.score;
            if (num8 == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = num8;
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
        this.game_pic = Message.immutableCopyOf(builder.game_pic);
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
        this._abstract = builder._abstract;
        this.game_details_url = builder.game_details_url;
        this.app_id = builder.app_id;
        this.icon_pic1 = builder.icon_pic1;
        this.icon_pic2 = builder.icon_pic2;
        this.icon_pic3 = builder.icon_pic3;
        this.game_desc = builder.game_desc;
        this.subscript_color = builder.subscript_color;
        this.launchComponent = builder.launchComponent;
        this.category_name_sim = builder.category_name_sim;
        this.score = builder.score;
    }
}
