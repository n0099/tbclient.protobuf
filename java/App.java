package tbclient;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class App extends Message {
    public static final String DEFAULT_ABTEST = "";
    public static final String DEFAULT_AD_ID = "";
    public static final String DEFAULT_APK_NAME = "";
    public static final String DEFAULT_APK_URL = "";
    public static final String DEFAULT_APP_DESC = "";
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_EXT_INFO = "";
    public static final String DEFAULT_FIRST_NAME = "";
    public static final String DEFAULT_ICON_LINK = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_IOS_URL = "";
    public static final String DEFAULT_LOC_CODE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_POS_NAME = "";
    public static final String DEFAULT_PRICE = "";
    public static final String DEFAULT_P_NAME = "";
    public static final String DEFAULT_P_URL = "";
    public static final String DEFAULT_SECOND_NAME = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_USER_ID = "";
    public static final String DEFAULT_VERIFY = "";
    public static final String DEFAULT_WEB_URL = "";
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String abtest;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ad_id;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String apk_name;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String apk_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String app_desc;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_name;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer app_time;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer cpid;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_PUSH_RECOMMEND_PB, type = Message.Datatype.STRING)
    public final String ext_info;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String first_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 30)
    public final List<GoodsInfo> goods_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String ios_url;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String loc_code;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String p_name;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String p_url;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer plan_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pos;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String pos_name;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String price;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String second_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer url_type;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String user_id;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String verify;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String web_url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_POS = 0;
    public static final Integer DEFAULT_APP_TIME = 0;
    public static final Integer DEFAULT_URL_TYPE = 0;
    public static final Integer DEFAULT_CPID = 0;
    public static final Integer DEFAULT_PLAN_ID = 0;
    public static final List<GoodsInfo> DEFAULT_GOODS_INFO = Collections.emptyList();

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
            } else {
                this.web_url = builder.web_url;
            }
            if (builder.ad_id == null) {
                this.ad_id = "";
            } else {
                this.ad_id = builder.ad_id;
            }
            if (builder.id == null) {
                this.id = "";
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.url_type == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = builder.url_type;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.ios_url == null) {
                this.ios_url = "";
            } else {
                this.ios_url = builder.ios_url;
            }
            if (builder.apk_url == null) {
                this.apk_url = "";
            } else {
                this.apk_url = builder.apk_url;
            }
            if (builder.apk_name == null) {
                this.apk_name = "";
            } else {
                this.apk_name = builder.apk_name;
            }
            if (builder.pos_name == null) {
                this.pos_name = "";
            } else {
                this.pos_name = builder.pos_name;
            }
            if (builder.first_name == null) {
                this.first_name = "";
            } else {
                this.first_name = builder.first_name;
            }
            if (builder.second_name == null) {
                this.second_name = "";
            } else {
                this.second_name = builder.second_name;
            }
            if (builder.cpid == null) {
                this.cpid = DEFAULT_CPID;
            } else {
                this.cpid = builder.cpid;
            }
            if (builder.abtest == null) {
                this.abtest = "";
            } else {
                this.abtest = builder.abtest;
            }
            if (builder.plan_id == null) {
                this.plan_id = DEFAULT_PLAN_ID;
            } else {
                this.plan_id = builder.plan_id;
            }
            if (builder.user_id == null) {
                this.user_id = "";
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.price == null) {
                this.price = "";
            } else {
                this.price = builder.price;
            }
            if (builder.verify == null) {
                this.verify = "";
            } else {
                this.verify = builder.verify;
            }
            if (builder.ext_info == null) {
                this.ext_info = "";
            } else {
                this.ext_info = builder.ext_info;
            }
            if (builder.goods_info == null) {
                this.goods_info = DEFAULT_GOODS_INFO;
            } else {
                this.goods_info = immutableCopyOf(builder.goods_info);
            }
            if (builder.loc_code == null) {
                this.loc_code = "";
                return;
            } else {
                this.loc_code = builder.loc_code;
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
        this.ad_id = builder.ad_id;
        this.id = builder.id;
        this.name = builder.name;
        this.url_type = builder.url_type;
        this.url = builder.url;
        this.ios_url = builder.ios_url;
        this.apk_url = builder.apk_url;
        this.apk_name = builder.apk_name;
        this.pos_name = builder.pos_name;
        this.first_name = builder.first_name;
        this.second_name = builder.second_name;
        this.cpid = builder.cpid;
        this.abtest = builder.abtest;
        this.plan_id = builder.plan_id;
        this.user_id = builder.user_id;
        this.price = builder.price;
        this.verify = builder.verify;
        this.ext_info = builder.ext_info;
        this.goods_info = immutableCopyOf(builder.goods_info);
        this.loc_code = builder.loc_code;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<App> {
        public String abtest;
        public String ad_id;
        public String apk_name;
        public String apk_url;
        public String app_desc;
        public String app_name;
        public Integer app_time;
        public Integer cpid;
        public String ext_info;
        public String first_name;
        public List<GoodsInfo> goods_info;
        public String icon_link;
        public String icon_url;
        public String id;
        public String img_url;
        public String ios_url;
        public String loc_code;
        public String name;
        public String p_name;
        public String p_url;
        public Integer plan_id;
        public Integer pos;
        public String pos_name;
        public String price;
        public String second_name;
        public Integer type;
        public String url;
        public Integer url_type;
        public String user_id;
        public String verify;
        public String web_url;

        public Builder() {
        }

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
                this.ad_id = app.ad_id;
                this.id = app.id;
                this.name = app.name;
                this.url_type = app.url_type;
                this.url = app.url;
                this.ios_url = app.ios_url;
                this.apk_url = app.apk_url;
                this.apk_name = app.apk_name;
                this.pos_name = app.pos_name;
                this.first_name = app.first_name;
                this.second_name = app.second_name;
                this.cpid = app.cpid;
                this.abtest = app.abtest;
                this.plan_id = app.plan_id;
                this.user_id = app.user_id;
                this.price = app.price;
                this.verify = app.verify;
                this.ext_info = app.ext_info;
                this.goods_info = App.copyOf(app.goods_info);
                this.loc_code = app.loc_code;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public App build(boolean z) {
            return new App(this, z, null);
        }
    }
}
