package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FrsTabInfo extends Message {
    public static final String DEFAULT_TAB_CODE = "";
    public static final String DEFAULT_TAB_GID = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TITLE = "";
    public static final String DEFAULT_TAB_URL = "";
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_general_tab;
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

    private FrsTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tab_id == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = builder.tab_id;
            }
            if (builder.tab_type == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
            } else {
                this.tab_type = builder.tab_type;
            }
            if (builder.tab_name == null) {
                this.tab_name = "";
            } else {
                this.tab_name = builder.tab_name;
            }
            if (builder.tab_url == null) {
                this.tab_url = "";
            } else {
                this.tab_url = builder.tab_url;
            }
            if (builder.tab_gid == null) {
                this.tab_gid = "";
            } else {
                this.tab_gid = builder.tab_gid;
            }
            if (builder.tab_title == null) {
                this.tab_title = "";
            } else {
                this.tab_title = builder.tab_title;
            }
            if (builder.is_general_tab == null) {
                this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
            } else {
                this.is_general_tab = builder.is_general_tab;
            }
            if (builder.tab_code == null) {
                this.tab_code = "";
            } else {
                this.tab_code = builder.tab_code;
            }
            if (builder.tab_version == null) {
                this.tab_version = DEFAULT_TAB_VERSION;
            } else {
                this.tab_version = builder.tab_version;
            }
            if (builder.is_default == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
                return;
            } else {
                this.is_default = builder.is_default;
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
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsTabInfo> {
        public Integer is_default;
        public Integer is_general_tab;
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
            if (frsTabInfo != null) {
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTabInfo build(boolean z) {
            return new FrsTabInfo(this, z);
        }
    }
}
