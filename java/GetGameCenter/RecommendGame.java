package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class RecommendGame extends Message {
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
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String andr_pk_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String apple_id;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String bundle_id;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer day_downloads;
    @ProtoField(tag = 24, type = Message.Datatype.UINT64)
    public final Long deadline;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String editor_rec;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String game_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 14, type = Message.Datatype.STRING)
    public final List<String> game_pic;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer game_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String introduce;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String launch_component;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer mark;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_link;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String package_size;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer player_num;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String schema_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecommendGame> {
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

        public Builder() {
        }

        public Builder(RecommendGame recommendGame) {
            super(recommendGame);
            if (recommendGame == null) {
                return;
            }
            this.game_id = recommendGame.game_id;
            this.game_name = recommendGame.game_name;
            this.game_type = recommendGame.game_type;
            this.icon_url = recommendGame.icon_url;
            this.secret_key = recommendGame.secret_key;
            this.player_num = recommendGame.player_num;
            this.package_link = recommendGame.package_link;
            this.package_size = recommendGame.package_size;
            this.game_link = recommendGame.game_link;
            this.mark = recommendGame.mark;
            this.apple_id = recommendGame.apple_id;
            this.bundle_id = recommendGame.bundle_id;
            this.schema_url = recommendGame.schema_url;
            this.game_pic = Message.copyOf(recommendGame.game_pic);
            this.introduce = recommendGame.introduce;
            this.launch_component = recommendGame.launch_component;
            this.andr_pk_name = recommendGame.andr_pk_name;
            this.day_downloads = recommendGame.day_downloads;
            this.superscript_color = recommendGame.superscript_color;
            this.star = recommendGame.star;
            this.category_id = recommendGame.category_id;
            this.category_name = recommendGame.category_name;
            this.version = recommendGame.version;
            this.deadline = recommendGame.deadline;
            this.editor_rec = recommendGame.editor_rec;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendGame build(boolean z) {
            return new RecommendGame(this, z);
        }
    }

    public RecommendGame(Builder builder, boolean z) {
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
            String str4 = builder.secret_key;
            if (str4 == null) {
                this.secret_key = "";
            } else {
                this.secret_key = str4;
            }
            Integer num2 = builder.player_num;
            if (num2 == null) {
                this.player_num = DEFAULT_PLAYER_NUM;
            } else {
                this.player_num = num2;
            }
            String str5 = builder.package_link;
            if (str5 == null) {
                this.package_link = "";
            } else {
                this.package_link = str5;
            }
            String str6 = builder.package_size;
            if (str6 == null) {
                this.package_size = "";
            } else {
                this.package_size = str6;
            }
            String str7 = builder.game_link;
            if (str7 == null) {
                this.game_link = "";
            } else {
                this.game_link = str7;
            }
            Integer num3 = builder.mark;
            if (num3 == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = num3;
            }
            String str8 = builder.apple_id;
            if (str8 == null) {
                this.apple_id = "";
            } else {
                this.apple_id = str8;
            }
            String str9 = builder.bundle_id;
            if (str9 == null) {
                this.bundle_id = "";
            } else {
                this.bundle_id = str9;
            }
            String str10 = builder.schema_url;
            if (str10 == null) {
                this.schema_url = "";
            } else {
                this.schema_url = str10;
            }
            List<String> list = builder.game_pic;
            if (list == null) {
                this.game_pic = DEFAULT_GAME_PIC;
            } else {
                this.game_pic = Message.immutableCopyOf(list);
            }
            String str11 = builder.introduce;
            if (str11 == null) {
                this.introduce = "";
            } else {
                this.introduce = str11;
            }
            String str12 = builder.launch_component;
            if (str12 == null) {
                this.launch_component = "";
            } else {
                this.launch_component = str12;
            }
            String str13 = builder.andr_pk_name;
            if (str13 == null) {
                this.andr_pk_name = "";
            } else {
                this.andr_pk_name = str13;
            }
            Integer num4 = builder.day_downloads;
            if (num4 == null) {
                this.day_downloads = DEFAULT_DAY_DOWNLOADS;
            } else {
                this.day_downloads = num4;
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
                return;
            } else {
                this.editor_rec = str17;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.game_name = builder.game_name;
        this.game_type = builder.game_type;
        this.icon_url = builder.icon_url;
        this.secret_key = builder.secret_key;
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
        this.superscript_color = builder.superscript_color;
        this.star = builder.star;
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.version = builder.version;
        this.deadline = builder.deadline;
        this.editor_rec = builder.editor_rec;
    }
}
