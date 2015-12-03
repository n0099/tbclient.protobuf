package tbclient.GetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Integer DEFAULT_FREE_USER_LEVEL = 0;
    public static final Integer DEFAULT_IS_FINISHED = 0;
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer free_user_level;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_finished;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

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
            if (builder.permission == null) {
                this.permission = "";
            } else {
                this.permission = builder.permission;
            }
            if (builder.props_state_img == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = builder.props_state_img;
            }
            if (builder.activity_url == null) {
                this.activity_url = "";
            } else {
                this.activity_url = builder.activity_url;
            }
            if (builder.free_user_level == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = builder.free_user_level;
            }
            if (builder.is_finished == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
                return;
            } else {
                this.is_finished = builder.is_finished;
                return;
            }
        }
        this.title = builder.title;
        this.description = builder.description;
        this.pic_url = builder.pic_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.activity_url = builder.activity_url;
        this.free_user_level = builder.free_user_level;
        this.is_finished = builder.is_finished;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String activity_url;
        public String description;
        public Integer free_user_level;
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
                this.permission = dataRes.permission;
                this.props_state_img = dataRes.props_state_img;
                this.activity_url = dataRes.activity_url;
                this.free_user_level = dataRes.free_user_level;
                this.is_finished = dataRes.is_finished;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
