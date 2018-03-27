package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ActivityConfig extends Message {
    public static final String DEFAULT_AGREED_ICON = "";
    public static final String DEFAULT_AGREE_ICON = "";
    public static final String DEFAULT_NIGHT_AGREED_ICON = "";
    public static final String DEFAULT_NIGHT_AGREE_ICON = "";
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long activity_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String agree_icon;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String agreed_icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String night_agree_icon;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String night_agreed_icon;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_ACTIVITY_ID = 0L;

    private ActivityConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.agree_icon == null) {
                this.agree_icon = "";
            } else {
                this.agree_icon = builder.agree_icon;
            }
            if (builder.night_agree_icon == null) {
                this.night_agree_icon = "";
            } else {
                this.night_agree_icon = builder.night_agree_icon;
            }
            if (builder.agreed_icon == null) {
                this.agreed_icon = "";
            } else {
                this.agreed_icon = builder.agreed_icon;
            }
            if (builder.night_agreed_icon == null) {
                this.night_agreed_icon = "";
            } else {
                this.night_agreed_icon = builder.night_agreed_icon;
            }
            if (builder.activity_id == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
                return;
            } else {
                this.activity_id = builder.activity_id;
                return;
            }
        }
        this.type = builder.type;
        this.agree_icon = builder.agree_icon;
        this.night_agree_icon = builder.night_agree_icon;
        this.agreed_icon = builder.agreed_icon;
        this.night_agreed_icon = builder.night_agreed_icon;
        this.activity_id = builder.activity_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ActivityConfig> {
        public Long activity_id;
        public String agree_icon;
        public String agreed_icon;
        public String night_agree_icon;
        public String night_agreed_icon;
        public Integer type;

        public Builder() {
        }

        public Builder(ActivityConfig activityConfig) {
            super(activityConfig);
            if (activityConfig != null) {
                this.type = activityConfig.type;
                this.agree_icon = activityConfig.agree_icon;
                this.night_agree_icon = activityConfig.night_agree_icon;
                this.agreed_icon = activityConfig.agreed_icon;
                this.night_agreed_icon = activityConfig.night_agreed_icon;
                this.activity_id = activityConfig.activity_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityConfig build(boolean z) {
            return new ActivityConfig(this, z);
        }
    }
}
