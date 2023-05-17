package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FrsTabInfo extends Message {
    public static final String DEFAULT_CLICK_MONITOR_URL = "";
    public static final String DEFAULT_DEMOTE_URL = "";
    public static final String DEFAULT_EXPOSURE_MONITOR_URL = "";
    public static final String DEFAULT_TAB_CODE = "";
    public static final String DEFAULT_TAB_GID = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TITLE = "";
    public static final String DEFAULT_TAB_URL = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String click_monitor_url;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String demote_url;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String exposure_monitor_url;
    @ProtoField(tag = 12)
    public final TabPic head_pics;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_general_tab;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer is_no_show_in_publisher;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_no_show_publisher;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer need_page;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String tab_code;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tab_gid;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tab_title;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tab_url;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer tab_version;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Integer DEFAULT_TAB_TYPE = 0;
    public static final Integer DEFAULT_IS_GENERAL_TAB = 0;
    public static final Integer DEFAULT_TAB_VERSION = 0;
    public static final Integer DEFAULT_IS_DEFAULT = 0;
    public static final Integer DEFAULT_NEED_PAGE = 0;
    public static final Integer DEFAULT_IS_NO_SHOW_PUBLISHER = 0;
    public static final Integer DEFAULT_IS_NO_SHOW_IN_PUBLISHER = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FrsTabInfo> {
        public String click_monitor_url;
        public String demote_url;
        public String exposure_monitor_url;
        public TabPic head_pics;
        public Integer is_default;
        public Integer is_general_tab;
        public Integer is_no_show_in_publisher;
        public Integer is_no_show_publisher;
        public Integer need_page;
        public String tab_code;
        public String tab_gid;
        public Integer tab_id;
        public String tab_name;
        public String tab_title;
        public Integer tab_type;
        public String tab_url;
        public Integer tab_version;

        public Builder() {
        }

        public Builder(FrsTabInfo frsTabInfo) {
            super(frsTabInfo);
            if (frsTabInfo == null) {
                return;
            }
            this.tab_id = frsTabInfo.tab_id;
            this.tab_type = frsTabInfo.tab_type;
            this.tab_name = frsTabInfo.tab_name;
            this.tab_url = frsTabInfo.tab_url;
            this.tab_gid = frsTabInfo.tab_gid;
            this.tab_title = frsTabInfo.tab_title;
            this.is_general_tab = frsTabInfo.is_general_tab;
            this.tab_code = frsTabInfo.tab_code;
            this.tab_version = frsTabInfo.tab_version;
            this.is_default = frsTabInfo.is_default;
            this.need_page = frsTabInfo.need_page;
            this.head_pics = frsTabInfo.head_pics;
            this.exposure_monitor_url = frsTabInfo.exposure_monitor_url;
            this.click_monitor_url = frsTabInfo.click_monitor_url;
            this.demote_url = frsTabInfo.demote_url;
            this.is_no_show_publisher = frsTabInfo.is_no_show_publisher;
            this.is_no_show_in_publisher = frsTabInfo.is_no_show_in_publisher;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTabInfo build(boolean z) {
            return new FrsTabInfo(this, z);
        }
    }

    public FrsTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            Integer num2 = builder.tab_type;
            if (num2 == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
            } else {
                this.tab_type = num2;
            }
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.tab_url;
            if (str2 == null) {
                this.tab_url = "";
            } else {
                this.tab_url = str2;
            }
            String str3 = builder.tab_gid;
            if (str3 == null) {
                this.tab_gid = "";
            } else {
                this.tab_gid = str3;
            }
            String str4 = builder.tab_title;
            if (str4 == null) {
                this.tab_title = "";
            } else {
                this.tab_title = str4;
            }
            Integer num3 = builder.is_general_tab;
            if (num3 == null) {
                this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
            } else {
                this.is_general_tab = num3;
            }
            String str5 = builder.tab_code;
            if (str5 == null) {
                this.tab_code = "";
            } else {
                this.tab_code = str5;
            }
            Integer num4 = builder.tab_version;
            if (num4 == null) {
                this.tab_version = DEFAULT_TAB_VERSION;
            } else {
                this.tab_version = num4;
            }
            Integer num5 = builder.is_default;
            if (num5 == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
            } else {
                this.is_default = num5;
            }
            Integer num6 = builder.need_page;
            if (num6 == null) {
                this.need_page = DEFAULT_NEED_PAGE;
            } else {
                this.need_page = num6;
            }
            this.head_pics = builder.head_pics;
            String str6 = builder.exposure_monitor_url;
            if (str6 == null) {
                this.exposure_monitor_url = "";
            } else {
                this.exposure_monitor_url = str6;
            }
            String str7 = builder.click_monitor_url;
            if (str7 == null) {
                this.click_monitor_url = "";
            } else {
                this.click_monitor_url = str7;
            }
            String str8 = builder.demote_url;
            if (str8 == null) {
                this.demote_url = "";
            } else {
                this.demote_url = str8;
            }
            Integer num7 = builder.is_no_show_publisher;
            if (num7 == null) {
                this.is_no_show_publisher = DEFAULT_IS_NO_SHOW_PUBLISHER;
            } else {
                this.is_no_show_publisher = num7;
            }
            Integer num8 = builder.is_no_show_in_publisher;
            if (num8 == null) {
                this.is_no_show_in_publisher = DEFAULT_IS_NO_SHOW_IN_PUBLISHER;
                return;
            } else {
                this.is_no_show_in_publisher = num8;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.tab_type = builder.tab_type;
        this.tab_name = builder.tab_name;
        this.tab_url = builder.tab_url;
        this.tab_gid = builder.tab_gid;
        this.tab_title = builder.tab_title;
        this.is_general_tab = builder.is_general_tab;
        this.tab_code = builder.tab_code;
        this.tab_version = builder.tab_version;
        this.is_default = builder.is_default;
        this.need_page = builder.need_page;
        this.head_pics = builder.head_pics;
        this.exposure_monitor_url = builder.exposure_monitor_url;
        this.click_monitor_url = builder.click_monitor_url;
        this.demote_url = builder.demote_url;
        this.is_no_show_publisher = builder.is_no_show_publisher;
        this.is_no_show_in_publisher = builder.is_no_show_in_publisher;
    }
}
