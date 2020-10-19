package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class YulePostActivity extends Message {
    public static final String DEFAULT_ACTIVITY_BANNER = "";
    public static final String DEFAULT_ACTIVITY_BUTTON = "";
    public static final String DEFAULT_ACTIVITY_DESC = "";
    public static final String DEFAULT_ACTIVITY_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String activity_banner;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_button;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String activity_desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;

    private YulePostActivity(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.activity_banner == null) {
                this.activity_banner = "";
            } else {
                this.activity_banner = builder.activity_banner;
            }
            if (builder.activity_url == null) {
                this.activity_url = "";
            } else {
                this.activity_url = builder.activity_url;
            }
            if (builder.activity_desc == null) {
                this.activity_desc = "";
            } else {
                this.activity_desc = builder.activity_desc;
            }
            if (builder.activity_button == null) {
                this.activity_button = "";
                return;
            } else {
                this.activity_button = builder.activity_button;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.activity_banner = builder.activity_banner;
        this.activity_url = builder.activity_url;
        this.activity_desc = builder.activity_desc;
        this.activity_button = builder.activity_button;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<YulePostActivity> {
        public String activity_banner;
        public String activity_button;
        public String activity_desc;
        public String activity_url;
        public Long end_time;
        public Long start_time;

        public Builder() {
        }

        public Builder(YulePostActivity yulePostActivity) {
            super(yulePostActivity);
            if (yulePostActivity != null) {
                this.start_time = yulePostActivity.start_time;
                this.end_time = yulePostActivity.end_time;
                this.activity_banner = yulePostActivity.activity_banner;
                this.activity_url = yulePostActivity.activity_url;
                this.activity_desc = yulePostActivity.activity_desc;
                this.activity_button = yulePostActivity.activity_button;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YulePostActivity build(boolean z) {
            return new YulePostActivity(this, z);
        }
    }
}
