package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CommonTaskInfo extends Message {
    public static final String DEFAULT_ACTIVATE_TOKEN = "";
    public static final String DEFAULT_ACT_TYPE = "";
    public static final String DEFAULT_BRIEF = "";
    public static final String DEFAULT_COMMENT = "";
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLAT_ACT_TOKEN = "";
    public static final String DEFAULT_PLAT_TASK_TOKEN = "";
    public static final String DEFAULT_SCENE_CALLBACK = "";
    public static final String DEFAULT_SCENE_SWITCH = "";
    public static final String DEFAULT_SCENE_TASK_KEY = "";
    public static final String DEFAULT_TASK_ICON_URL = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String act_type;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String activate_token;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer client_type;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String comment;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer complete_time;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer dotask_status;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_continuous;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_need_active;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_plat_task;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer month;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer plat_act_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String plat_act_token;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer plat_platform_type_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer plat_task_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String plat_task_token;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String scene_callback;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer scene_id;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String scene_switch;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String scene_task_key;
    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer start_time;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer target_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_icon_url;
    @ProtoField(tag = 34)
    public final TaskProgress task_progress;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer task_type;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer time_interval;
    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer update_time;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer week;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer weight;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_PLAT_ACT_ID = 0;
    public static final Integer DEFAULT_PLAT_TASK_ID = 0;
    public static final Integer DEFAULT_PLAT_PLATFORM_TYPE_ID = 0;
    public static final Integer DEFAULT_TASK_TYPE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_WEIGHT = 0;
    public static final Integer DEFAULT_IS_NEED_ACTIVE = 0;
    public static final Integer DEFAULT_IS_PLAT_TASK = 0;
    public static final Integer DEFAULT_TARGET_NUM = 0;
    public static final Integer DEFAULT_IS_CONTINUOUS = 0;
    public static final Integer DEFAULT_MONTH = 0;
    public static final Integer DEFAULT_WEEK = 0;
    public static final Integer DEFAULT_TIME_INTERVAL = 0;
    public static final Integer DEFAULT_CLIENT_TYPE = 0;
    public static final Integer DEFAULT_SCENE_ID = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_DOTASK_STATUS = 0;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_COMPLETE_TIME = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CommonTaskInfo> {
        public String act_type;
        public String activate_token;
        public String brief;
        public Integer client_type;
        public String comment;
        public Integer complete_time;
        public Integer create_time;
        public Integer dotask_status;
        public String ext;
        public Integer id;
        public Integer is_continuous;
        public Integer is_need_active;
        public Integer is_plat_task;
        public Integer month;
        public String name;
        public Integer plat_act_id;
        public String plat_act_token;
        public Integer plat_platform_type_id;
        public Integer plat_task_id;
        public String plat_task_token;
        public String scene_callback;
        public Integer scene_id;
        public String scene_switch;
        public String scene_task_key;
        public Integer start_time;
        public Integer status;
        public Integer target_num;
        public String task_icon_url;
        public TaskProgress task_progress;
        public Integer task_type;
        public Integer time_interval;
        public Integer update_time;
        public Integer week;
        public Integer weight;

        public Builder() {
        }

        public Builder(CommonTaskInfo commonTaskInfo) {
            super(commonTaskInfo);
            if (commonTaskInfo == null) {
                return;
            }
            this.id = commonTaskInfo.id;
            this.name = commonTaskInfo.name;
            this.task_icon_url = commonTaskInfo.task_icon_url;
            this.brief = commonTaskInfo.brief;
            this.plat_act_id = commonTaskInfo.plat_act_id;
            this.plat_task_id = commonTaskInfo.plat_task_id;
            this.plat_task_token = commonTaskInfo.plat_task_token;
            this.plat_platform_type_id = commonTaskInfo.plat_platform_type_id;
            this.plat_act_token = commonTaskInfo.plat_act_token;
            this.scene_task_key = commonTaskInfo.scene_task_key;
            this.task_type = commonTaskInfo.task_type;
            this.status = commonTaskInfo.status;
            this.weight = commonTaskInfo.weight;
            this.act_type = commonTaskInfo.act_type;
            this.is_need_active = commonTaskInfo.is_need_active;
            this.is_plat_task = commonTaskInfo.is_plat_task;
            this.target_num = commonTaskInfo.target_num;
            this.is_continuous = commonTaskInfo.is_continuous;
            this.month = commonTaskInfo.month;
            this.week = commonTaskInfo.week;
            this.time_interval = commonTaskInfo.time_interval;
            this.client_type = commonTaskInfo.client_type;
            this.scene_id = commonTaskInfo.scene_id;
            this.scene_switch = commonTaskInfo.scene_switch;
            this.scene_callback = commonTaskInfo.scene_callback;
            this.comment = commonTaskInfo.comment;
            this.ext = commonTaskInfo.ext;
            this.create_time = commonTaskInfo.create_time;
            this.update_time = commonTaskInfo.update_time;
            this.activate_token = commonTaskInfo.activate_token;
            this.dotask_status = commonTaskInfo.dotask_status;
            this.start_time = commonTaskInfo.start_time;
            this.complete_time = commonTaskInfo.complete_time;
            this.task_progress = commonTaskInfo.task_progress;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonTaskInfo build(boolean z) {
            return new CommonTaskInfo(this, z);
        }
    }

    public CommonTaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.task_icon_url;
            if (str2 == null) {
                this.task_icon_url = "";
            } else {
                this.task_icon_url = str2;
            }
            String str3 = builder.brief;
            if (str3 == null) {
                this.brief = "";
            } else {
                this.brief = str3;
            }
            Integer num2 = builder.plat_act_id;
            if (num2 == null) {
                this.plat_act_id = DEFAULT_PLAT_ACT_ID;
            } else {
                this.plat_act_id = num2;
            }
            Integer num3 = builder.plat_task_id;
            if (num3 == null) {
                this.plat_task_id = DEFAULT_PLAT_TASK_ID;
            } else {
                this.plat_task_id = num3;
            }
            String str4 = builder.plat_task_token;
            if (str4 == null) {
                this.plat_task_token = "";
            } else {
                this.plat_task_token = str4;
            }
            Integer num4 = builder.plat_platform_type_id;
            if (num4 == null) {
                this.plat_platform_type_id = DEFAULT_PLAT_PLATFORM_TYPE_ID;
            } else {
                this.plat_platform_type_id = num4;
            }
            String str5 = builder.plat_act_token;
            if (str5 == null) {
                this.plat_act_token = "";
            } else {
                this.plat_act_token = str5;
            }
            String str6 = builder.scene_task_key;
            if (str6 == null) {
                this.scene_task_key = "";
            } else {
                this.scene_task_key = str6;
            }
            Integer num5 = builder.task_type;
            if (num5 == null) {
                this.task_type = DEFAULT_TASK_TYPE;
            } else {
                this.task_type = num5;
            }
            Integer num6 = builder.status;
            if (num6 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num6;
            }
            Integer num7 = builder.weight;
            if (num7 == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num7;
            }
            String str7 = builder.act_type;
            if (str7 == null) {
                this.act_type = "";
            } else {
                this.act_type = str7;
            }
            Integer num8 = builder.is_need_active;
            if (num8 == null) {
                this.is_need_active = DEFAULT_IS_NEED_ACTIVE;
            } else {
                this.is_need_active = num8;
            }
            Integer num9 = builder.is_plat_task;
            if (num9 == null) {
                this.is_plat_task = DEFAULT_IS_PLAT_TASK;
            } else {
                this.is_plat_task = num9;
            }
            Integer num10 = builder.target_num;
            if (num10 == null) {
                this.target_num = DEFAULT_TARGET_NUM;
            } else {
                this.target_num = num10;
            }
            Integer num11 = builder.is_continuous;
            if (num11 == null) {
                this.is_continuous = DEFAULT_IS_CONTINUOUS;
            } else {
                this.is_continuous = num11;
            }
            Integer num12 = builder.month;
            if (num12 == null) {
                this.month = DEFAULT_MONTH;
            } else {
                this.month = num12;
            }
            Integer num13 = builder.week;
            if (num13 == null) {
                this.week = DEFAULT_WEEK;
            } else {
                this.week = num13;
            }
            Integer num14 = builder.time_interval;
            if (num14 == null) {
                this.time_interval = DEFAULT_TIME_INTERVAL;
            } else {
                this.time_interval = num14;
            }
            Integer num15 = builder.client_type;
            if (num15 == null) {
                this.client_type = DEFAULT_CLIENT_TYPE;
            } else {
                this.client_type = num15;
            }
            Integer num16 = builder.scene_id;
            if (num16 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num16;
            }
            String str8 = builder.scene_switch;
            if (str8 == null) {
                this.scene_switch = "";
            } else {
                this.scene_switch = str8;
            }
            String str9 = builder.scene_callback;
            if (str9 == null) {
                this.scene_callback = "";
            } else {
                this.scene_callback = str9;
            }
            String str10 = builder.comment;
            if (str10 == null) {
                this.comment = "";
            } else {
                this.comment = str10;
            }
            String str11 = builder.ext;
            if (str11 == null) {
                this.ext = "";
            } else {
                this.ext = str11;
            }
            Integer num17 = builder.create_time;
            if (num17 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num17;
            }
            Integer num18 = builder.update_time;
            if (num18 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num18;
            }
            String str12 = builder.activate_token;
            if (str12 == null) {
                this.activate_token = "";
            } else {
                this.activate_token = str12;
            }
            Integer num19 = builder.dotask_status;
            if (num19 == null) {
                this.dotask_status = DEFAULT_DOTASK_STATUS;
            } else {
                this.dotask_status = num19;
            }
            Integer num20 = builder.start_time;
            if (num20 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num20;
            }
            Integer num21 = builder.complete_time;
            if (num21 == null) {
                this.complete_time = DEFAULT_COMPLETE_TIME;
            } else {
                this.complete_time = num21;
            }
            this.task_progress = builder.task_progress;
            return;
        }
        this.id = builder.id;
        this.name = builder.name;
        this.task_icon_url = builder.task_icon_url;
        this.brief = builder.brief;
        this.plat_act_id = builder.plat_act_id;
        this.plat_task_id = builder.plat_task_id;
        this.plat_task_token = builder.plat_task_token;
        this.plat_platform_type_id = builder.plat_platform_type_id;
        this.plat_act_token = builder.plat_act_token;
        this.scene_task_key = builder.scene_task_key;
        this.task_type = builder.task_type;
        this.status = builder.status;
        this.weight = builder.weight;
        this.act_type = builder.act_type;
        this.is_need_active = builder.is_need_active;
        this.is_plat_task = builder.is_plat_task;
        this.target_num = builder.target_num;
        this.is_continuous = builder.is_continuous;
        this.month = builder.month;
        this.week = builder.week;
        this.time_interval = builder.time_interval;
        this.client_type = builder.client_type;
        this.scene_id = builder.scene_id;
        this.scene_switch = builder.scene_switch;
        this.scene_callback = builder.scene_callback;
        this.comment = builder.comment;
        this.ext = builder.ext;
        this.create_time = builder.create_time;
        this.update_time = builder.update_time;
        this.activate_token = builder.activate_token;
        this.dotask_status = builder.dotask_status;
        this.start_time = builder.start_time;
        this.complete_time = builder.complete_time;
        this.task_progress = builder.task_progress;
    }
}
