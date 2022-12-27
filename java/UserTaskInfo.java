package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserTaskInfo extends Message {
    public static final String DEFAULT_ACT_TYPE = "";
    public static final String DEFAULT_BRIEF = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_TASK_ICON_URL = "";
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String act_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer curr_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer target_num;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String target_scheme;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String task_icon_url;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer task_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer weight;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_TARGET_NUM = 0;
    public static final Integer DEFAULT_CURR_NUM = 0;
    public static final Integer DEFAULT_TASK_TYPE = 0;
    public static final Integer DEFAULT_WEIGHT = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserTaskInfo> {
        public String act_type;
        public String brief;
        public Integer curr_num;
        public Long id;
        public String name;
        public Integer status;
        public Integer target_num;
        public String target_scheme;
        public String task_icon_url;
        public Integer task_type;
        public Integer weight;

        public Builder() {
        }

        public Builder(UserTaskInfo userTaskInfo) {
            super(userTaskInfo);
            if (userTaskInfo == null) {
                return;
            }
            this.id = userTaskInfo.id;
            this.name = userTaskInfo.name;
            this.brief = userTaskInfo.brief;
            this.task_icon_url = userTaskInfo.task_icon_url;
            this.status = userTaskInfo.status;
            this.target_num = userTaskInfo.target_num;
            this.curr_num = userTaskInfo.curr_num;
            this.task_type = userTaskInfo.task_type;
            this.weight = userTaskInfo.weight;
            this.act_type = userTaskInfo.act_type;
            this.target_scheme = userTaskInfo.target_scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserTaskInfo build(boolean z) {
            return new UserTaskInfo(this, z);
        }
    }

    public UserTaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.brief;
            if (str2 == null) {
                this.brief = "";
            } else {
                this.brief = str2;
            }
            String str3 = builder.task_icon_url;
            if (str3 == null) {
                this.task_icon_url = "";
            } else {
                this.task_icon_url = str3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.target_num;
            if (num2 == null) {
                this.target_num = DEFAULT_TARGET_NUM;
            } else {
                this.target_num = num2;
            }
            Integer num3 = builder.curr_num;
            if (num3 == null) {
                this.curr_num = DEFAULT_CURR_NUM;
            } else {
                this.curr_num = num3;
            }
            Integer num4 = builder.task_type;
            if (num4 == null) {
                this.task_type = DEFAULT_TASK_TYPE;
            } else {
                this.task_type = num4;
            }
            Integer num5 = builder.weight;
            if (num5 == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num5;
            }
            String str4 = builder.act_type;
            if (str4 == null) {
                this.act_type = "";
            } else {
                this.act_type = str4;
            }
            String str5 = builder.target_scheme;
            if (str5 == null) {
                this.target_scheme = "";
                return;
            } else {
                this.target_scheme = str5;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.brief = builder.brief;
        this.task_icon_url = builder.task_icon_url;
        this.status = builder.status;
        this.target_num = builder.target_num;
        this.curr_num = builder.curr_num;
        this.task_type = builder.task_type;
        this.weight = builder.weight;
        this.act_type = builder.act_type;
        this.target_scheme = builder.target_scheme;
    }
}
