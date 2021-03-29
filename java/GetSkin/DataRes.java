package tbclient.GetSkin;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_PACKAGE_KEY = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_PACKAGE_URL = "";
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer daily_previlege_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer free_user_level;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_finished;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String package_key;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_size;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String package_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> pic_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer props_version;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final List<String> DEFAULT_PIC_URL = Collections.emptyList();
    public static final Integer DEFAULT_PROPS_VERSION = 0;
    public static final Integer DEFAULT_FREE_USER_LEVEL = 0;
    public static final Integer DEFAULT_IS_FINISHED = 0;
    public static final Integer DEFAULT_DAILY_PREVILEGE_STATUS = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String activity_url;
        public Integer daily_previlege_status;
        public String description;
        public Integer free_user_level;
        public Integer is_finished;
        public String package_key;
        public String package_size;
        public String package_url;
        public String permission;
        public List<String> pic_url;
        public String props_state_img;
        public Integer props_version;
        public String title;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.title = dataRes.title;
            this.description = dataRes.description;
            this.pic_url = Message.copyOf(dataRes.pic_url);
            this.props_state_img = dataRes.props_state_img;
            this.package_url = dataRes.package_url;
            this.package_size = dataRes.package_size;
            this.permission = dataRes.permission;
            this.props_version = dataRes.props_version;
            this.free_user_level = dataRes.free_user_level;
            this.activity_url = dataRes.activity_url;
            this.is_finished = dataRes.is_finished;
            this.package_key = dataRes.package_key;
            this.daily_previlege_status = dataRes.daily_previlege_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.description;
            if (str2 == null) {
                this.description = "";
            } else {
                this.description = str2;
            }
            List<String> list = builder.pic_url;
            if (list == null) {
                this.pic_url = DEFAULT_PIC_URL;
            } else {
                this.pic_url = Message.immutableCopyOf(list);
            }
            String str3 = builder.props_state_img;
            if (str3 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str3;
            }
            String str4 = builder.package_url;
            if (str4 == null) {
                this.package_url = "";
            } else {
                this.package_url = str4;
            }
            String str5 = builder.package_size;
            if (str5 == null) {
                this.package_size = "";
            } else {
                this.package_size = str5;
            }
            String str6 = builder.permission;
            if (str6 == null) {
                this.permission = "";
            } else {
                this.permission = str6;
            }
            Integer num = builder.props_version;
            if (num == null) {
                this.props_version = DEFAULT_PROPS_VERSION;
            } else {
                this.props_version = num;
            }
            Integer num2 = builder.free_user_level;
            if (num2 == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num2;
            }
            String str7 = builder.activity_url;
            if (str7 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str7;
            }
            Integer num3 = builder.is_finished;
            if (num3 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
            } else {
                this.is_finished = num3;
            }
            String str8 = builder.package_key;
            if (str8 == null) {
                this.package_key = "";
            } else {
                this.package_key = str8;
            }
            Integer num4 = builder.daily_previlege_status;
            if (num4 == null) {
                this.daily_previlege_status = DEFAULT_DAILY_PREVILEGE_STATUS;
                return;
            } else {
                this.daily_previlege_status = num4;
                return;
            }
        }
        this.title = builder.title;
        this.description = builder.description;
        this.pic_url = Message.immutableCopyOf(builder.pic_url);
        this.props_state_img = builder.props_state_img;
        this.package_url = builder.package_url;
        this.package_size = builder.package_size;
        this.permission = builder.permission;
        this.props_version = builder.props_version;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
        this.is_finished = builder.is_finished;
        this.package_key = builder.package_key;
        this.daily_previlege_status = builder.daily_previlege_status;
    }
}