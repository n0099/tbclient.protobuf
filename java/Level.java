package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Level extends Message {
    public static final String DEFAULT_EXPIRED_NOTIFY = "";
    public static final String DEFAULT_EXPIRING_NOTIFY = "";
    public static final String DEFAULT_MAX_FREE_SCORE = "";
    public static final String DEFAULT_OPEN_STATUS = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PROPS_CATEGORY = "";
    public static final String DEFAULT_PROPS_TYPE = "";
    public static final String DEFAULT_USED_STATUS = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String expired_notify;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String expiring_notify;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer left_num;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String max_free_score;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String open_status;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String props_category;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String props_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer update_time;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String used_status;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_LEFT_NUM = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Level> {
        public Integer end_time;
        public String expired_notify;
        public String expiring_notify;
        public Integer left_num;
        public String max_free_score;
        public String open_status;
        public String pic_url;
        public String props_category;
        public Integer props_id;
        public String props_type;
        public Integer update_time;
        public String used_status;

        public Builder() {
        }

        public Builder(Level level) {
            super(level);
            if (level == null) {
                return;
            }
            this.props_id = level.props_id;
            this.props_type = level.props_type;
            this.props_category = level.props_category;
            this.end_time = level.end_time;
            this.left_num = level.left_num;
            this.update_time = level.update_time;
            this.used_status = level.used_status;
            this.open_status = level.open_status;
            this.expiring_notify = level.expiring_notify;
            this.expired_notify = level.expired_notify;
            this.max_free_score = level.max_free_score;
            this.pic_url = level.pic_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Level build(boolean z) {
            return new Level(this, z);
        }
    }

    public Level(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            String str = builder.props_type;
            if (str == null) {
                this.props_type = "";
            } else {
                this.props_type = str;
            }
            String str2 = builder.props_category;
            if (str2 == null) {
                this.props_category = "";
            } else {
                this.props_category = str2;
            }
            Integer num2 = builder.end_time;
            if (num2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num2;
            }
            Integer num3 = builder.left_num;
            if (num3 == null) {
                this.left_num = DEFAULT_LEFT_NUM;
            } else {
                this.left_num = num3;
            }
            Integer num4 = builder.update_time;
            if (num4 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num4;
            }
            String str3 = builder.used_status;
            if (str3 == null) {
                this.used_status = "";
            } else {
                this.used_status = str3;
            }
            String str4 = builder.open_status;
            if (str4 == null) {
                this.open_status = "";
            } else {
                this.open_status = str4;
            }
            String str5 = builder.expiring_notify;
            if (str5 == null) {
                this.expiring_notify = "";
            } else {
                this.expiring_notify = str5;
            }
            String str6 = builder.expired_notify;
            if (str6 == null) {
                this.expired_notify = "";
            } else {
                this.expired_notify = str6;
            }
            String str7 = builder.max_free_score;
            if (str7 == null) {
                this.max_free_score = "";
            } else {
                this.max_free_score = str7;
            }
            String str8 = builder.pic_url;
            if (str8 == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = str8;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.props_type = builder.props_type;
        this.props_category = builder.props_category;
        this.end_time = builder.end_time;
        this.left_num = builder.left_num;
        this.update_time = builder.update_time;
        this.used_status = builder.used_status;
        this.open_status = builder.open_status;
        this.expiring_notify = builder.expiring_notify;
        this.expired_notify = builder.expired_notify;
        this.max_free_score = builder.max_free_score;
        this.pic_url = builder.pic_url;
    }
}
