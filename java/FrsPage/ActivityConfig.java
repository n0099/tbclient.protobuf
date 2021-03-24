package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ActivityConfig extends Message {
    public static final String DEFAULT_ADDTHREAD_ICON = "";
    public static final String DEFAULT_ADDTHREAD_TEXT = "";
    public static final String DEFAULT_AGREED_ICON = "";
    public static final String DEFAULT_AGREE_ICON = "";
    public static final String DEFAULT_NIGHT_ADDTHREAD_ICON = "";
    public static final String DEFAULT_NIGHT_AGREED_ICON = "";
    public static final String DEFAULT_NIGHT_AGREE_ICON = "";
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long activity_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String addthread_icon;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String addthread_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String agree_icon;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String agreed_icon;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String night_addthread_icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String night_agree_icon;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String night_agreed_icon;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_ACTIVITY_ID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ActivityConfig> {
        public Long activity_id;
        public String addthread_icon;
        public String addthread_text;
        public String agree_icon;
        public String agreed_icon;
        public String night_addthread_icon;
        public String night_agree_icon;
        public String night_agreed_icon;
        public Integer type;

        public Builder() {
        }

        public Builder(ActivityConfig activityConfig) {
            super(activityConfig);
            if (activityConfig == null) {
                return;
            }
            this.type = activityConfig.type;
            this.agree_icon = activityConfig.agree_icon;
            this.night_agree_icon = activityConfig.night_agree_icon;
            this.agreed_icon = activityConfig.agreed_icon;
            this.night_agreed_icon = activityConfig.night_agreed_icon;
            this.activity_id = activityConfig.activity_id;
            this.addthread_icon = activityConfig.addthread_icon;
            this.night_addthread_icon = activityConfig.night_addthread_icon;
            this.addthread_text = activityConfig.addthread_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityConfig build(boolean z) {
            return new ActivityConfig(this, z);
        }
    }

    public ActivityConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.agree_icon;
            if (str == null) {
                this.agree_icon = "";
            } else {
                this.agree_icon = str;
            }
            String str2 = builder.night_agree_icon;
            if (str2 == null) {
                this.night_agree_icon = "";
            } else {
                this.night_agree_icon = str2;
            }
            String str3 = builder.agreed_icon;
            if (str3 == null) {
                this.agreed_icon = "";
            } else {
                this.agreed_icon = str3;
            }
            String str4 = builder.night_agreed_icon;
            if (str4 == null) {
                this.night_agreed_icon = "";
            } else {
                this.night_agreed_icon = str4;
            }
            Long l = builder.activity_id;
            if (l == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l;
            }
            String str5 = builder.addthread_icon;
            if (str5 == null) {
                this.addthread_icon = "";
            } else {
                this.addthread_icon = str5;
            }
            String str6 = builder.night_addthread_icon;
            if (str6 == null) {
                this.night_addthread_icon = "";
            } else {
                this.night_addthread_icon = str6;
            }
            String str7 = builder.addthread_text;
            if (str7 == null) {
                this.addthread_text = "";
                return;
            } else {
                this.addthread_text = str7;
                return;
            }
        }
        this.type = builder.type;
        this.agree_icon = builder.agree_icon;
        this.night_agree_icon = builder.night_agree_icon;
        this.agreed_icon = builder.agreed_icon;
        this.night_agreed_icon = builder.night_agreed_icon;
        this.activity_id = builder.activity_id;
        this.addthread_icon = builder.addthread_icon;
        this.night_addthread_icon = builder.night_addthread_icon;
        this.addthread_text = builder.addthread_text;
    }
}
