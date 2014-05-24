package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class App extends Message {
    public static final String DEFAULT_APP_DESC = "";
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_ICON_LINK = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_P_NAME = "";
    public static final String DEFAULT_P_URL = "";
    public static final String DEFAULT_WEB_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String app_desc;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_name;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer app_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String p_name;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String p_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pos;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String web_url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_POS = 0;
    public static final Integer DEFAULT_APP_TIME = 0;

    /* synthetic */ App(Builder builder, boolean z, App app) {
        this(builder, z);
    }

    private App(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.pos == null) {
                this.pos = DEFAULT_POS;
            } else {
                this.pos = builder.pos;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.icon_link == null) {
                this.icon_link = "";
            } else {
                this.icon_link = builder.icon_link;
            }
            if (builder.app_name == null) {
                this.app_name = "";
            } else {
                this.app_name = builder.app_name;
            }
            if (builder.app_desc == null) {
                this.app_desc = "";
            } else {
                this.app_desc = builder.app_desc;
            }
            if (builder.p_name == null) {
                this.p_name = "";
            } else {
                this.p_name = builder.p_name;
            }
            if (builder.p_url == null) {
                this.p_url = "";
            } else {
                this.p_url = builder.p_url;
            }
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.app_time == null) {
                this.app_time = DEFAULT_APP_TIME;
            } else {
                this.app_time = builder.app_time;
            }
            if (builder.web_url == null) {
                this.web_url = "";
                return;
            } else {
                this.web_url = builder.web_url;
                return;
            }
        }
        this.type = builder.type;
        this.pos = builder.pos;
        this.icon_url = builder.icon_url;
        this.icon_link = builder.icon_link;
        this.app_name = builder.app_name;
        this.app_desc = builder.app_desc;
        this.p_name = builder.p_name;
        this.p_url = builder.p_url;
        this.img_url = builder.img_url;
        this.app_time = builder.app_time;
        this.web_url = builder.web_url;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<App> {
        public String app_desc;
        public String app_name;
        public Integer app_time;
        public String icon_link;
        public String icon_url;
        public String img_url;
        public String p_name;
        public String p_url;
        public Integer pos;
        public Integer type;
        public String web_url;

        public Builder(App app) {
            super(app);
            if (app != null) {
                this.type = app.type;
                this.pos = app.pos;
                this.icon_url = app.icon_url;
                this.icon_link = app.icon_link;
                this.app_name = app.app_name;
                this.app_desc = app.app_desc;
                this.p_name = app.p_name;
                this.p_url = app.p_url;
                this.img_url = app.img_url;
                this.app_time = app.app_time;
                this.web_url = app.web_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public App build(boolean z) {
            return new App(this, z, null);
        }
    }
}
