package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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
    public final Integer daily_previlege_status;
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
    public static final Integer DEFAULT_DAILY_PREVILEGE_STATUS = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.props_state_img == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = builder.props_state_img;
            }
            if (builder.permission == null) {
                this.permission = "";
            } else {
                this.permission = builder.permission;
            }
            if (builder.free_user_level == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = builder.free_user_level;
            }
            if (builder.activity_url == null) {
                this.activity_url = "";
            } else {
                this.activity_url = builder.activity_url;
            }
            if (builder.is_finished == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
            } else {
                this.is_finished = builder.is_finished;
            }
            if (builder.in_use == null) {
                this.in_use = DEFAULT_IN_USE;
            } else {
                this.in_use = builder.in_use;
            }
            if (builder.daily_previlege_status == null) {
                this.daily_previlege_status = DEFAULT_DAILY_PREVILEGE_STATUS;
                return;
            } else {
                this.daily_previlege_status = builder.daily_previlege_status;
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
        this.daily_previlege_status = builder.daily_previlege_status;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String activity_url;
        public Integer daily_previlege_status;
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
            if (dataRes != null) {
                this.title = dataRes.title;
                this.description = dataRes.description;
                this.pic_url = dataRes.pic_url;
                this.props_state_img = dataRes.props_state_img;
                this.permission = dataRes.permission;
                this.free_user_level = dataRes.free_user_level;
                this.activity_url = dataRes.activity_url;
                this.is_finished = dataRes.is_finished;
                this.in_use = dataRes.in_use;
                this.daily_previlege_status = dataRes.daily_previlege_status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
