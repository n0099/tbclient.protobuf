package tbclient.GetGameCenter;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class RecommendGame extends Message {
    public static final String DEFAULT_ANDR_PK_NAME = "";
    public static final String DEFAULT_APPLE_ID = "";
    public static final String DEFAULT_BUNDLE_ID = "";
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
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String andr_pk_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String apple_id;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String bundle_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String game_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_name;
    @ProtoField(label = Message.Label.REPEATED, tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.STRING)
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
    public static final Integer DEFAULT_GAME_TYPE = 0;
    public static final Integer DEFAULT_PLAYER_NUM = 0;
    public static final Integer DEFAULT_MARK = 0;
    public static final List<String> DEFAULT_GAME_PIC = Collections.emptyList();

    /* synthetic */ RecommendGame(Builder builder, boolean z, RecommendGame recommendGame) {
        this(builder, z);
    }

    private RecommendGame(Builder builder, boolean z) {
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
            if (builder.secret_key == null) {
                this.secret_key = "";
            } else {
                this.secret_key = builder.secret_key;
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
                return;
            } else {
                this.andr_pk_name = builder.andr_pk_name;
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
        this.game_pic = immutableCopyOf(builder.game_pic);
        this.introduce = builder.introduce;
        this.launch_component = builder.launch_component;
        this.andr_pk_name = builder.andr_pk_name;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<RecommendGame> {
        public String andr_pk_name;
        public String apple_id;
        public String bundle_id;
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

        public Builder(RecommendGame recommendGame) {
            super(recommendGame);
            if (recommendGame != null) {
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
                this.game_pic = RecommendGame.copyOf(recommendGame.game_pic);
                this.introduce = recommendGame.introduce;
                this.launch_component = recommendGame.launch_component;
                this.andr_pk_name = recommendGame.andr_pk_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendGame build(boolean z) {
            return new RecommendGame(this, z, null);
        }
    }
}
