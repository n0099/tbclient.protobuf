package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer daily_privilege_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer free_user_level;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer in_use;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_finished;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_FREE_USER_LEVEL = 0;
    public static final Integer DEFAULT_IS_FINISHED = 0;
    public static final Integer DEFAULT_IN_USE = 0;
    public static final Integer DEFAULT_DAILY_PRIVILEGE_STATUS = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String activity_url;
        public Integer daily_privilege_status;
        public String description;
        public Integer free_user_level;
        public Integer in_use;
        public Integer is_finished;
        public String permission;
        public String pic_url;
        public String props_state_img;
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
            this.pic_url = dataRes.pic_url;
            this.props_state_img = dataRes.props_state_img;
            this.permission = dataRes.permission;
            this.free_user_level = dataRes.free_user_level;
            this.activity_url = dataRes.activity_url;
            this.is_finished = dataRes.is_finished;
            this.in_use = dataRes.in_use;
            this.daily_privilege_status = dataRes.daily_privilege_status;
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
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str3;
            }
            String str4 = builder.props_state_img;
            if (str4 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str4;
            }
            String str5 = builder.permission;
            if (str5 == null) {
                this.permission = "";
            } else {
                this.permission = str5;
            }
            Integer num = builder.free_user_level;
            if (num == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num;
            }
            String str6 = builder.activity_url;
            if (str6 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str6;
            }
            Integer num2 = builder.is_finished;
            if (num2 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
            } else {
                this.is_finished = num2;
            }
            Integer num3 = builder.in_use;
            if (num3 == null) {
                this.in_use = DEFAULT_IN_USE;
            } else {
                this.in_use = num3;
            }
            Integer num4 = builder.daily_privilege_status;
            if (num4 == null) {
                this.daily_privilege_status = DEFAULT_DAILY_PRIVILEGE_STATUS;
                return;
            } else {
                this.daily_privilege_status = num4;
                return;
            }
        }
        this.title = builder.title;
        this.description = builder.description;
        this.pic_url = builder.pic_url;
        this.props_state_img = builder.props_state_img;
        this.permission = builder.permission;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
        this.is_finished = builder.is_finished;
        this.in_use = builder.in_use;
        this.daily_privilege_status = builder.daily_privilege_status;
    }
}
