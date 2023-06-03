package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class YuleActivity extends Message {
    public static final String DEFAULT_ACTIVITY_ALL_ICON = "";
    public static final String DEFAULT_ACTIVITY_HALF_ICON = "";
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final Integer DEFAULT_ACTIVITY_TYPE = 0;
    public static final String DEFAULT_ACTIVITY_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String activity_all_icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String activity_half_icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long activity_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer activity_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String activity_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<YuleActivity> {
        public String activity_all_icon;
        public String activity_half_icon;
        public Long activity_id;
        public Integer activity_type;
        public String activity_url;

        public Builder() {
        }

        public Builder(YuleActivity yuleActivity) {
            super(yuleActivity);
            if (yuleActivity == null) {
                return;
            }
            this.activity_id = yuleActivity.activity_id;
            this.activity_type = yuleActivity.activity_type;
            this.activity_url = yuleActivity.activity_url;
            this.activity_all_icon = yuleActivity.activity_all_icon;
            this.activity_half_icon = yuleActivity.activity_half_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YuleActivity build(boolean z) {
            return new YuleActivity(this, z);
        }
    }

    public YuleActivity(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.activity_id;
            if (l == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l;
            }
            Integer num = builder.activity_type;
            if (num == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = num;
            }
            String str = builder.activity_url;
            if (str == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str;
            }
            String str2 = builder.activity_all_icon;
            if (str2 == null) {
                this.activity_all_icon = "";
            } else {
                this.activity_all_icon = str2;
            }
            String str3 = builder.activity_half_icon;
            if (str3 == null) {
                this.activity_half_icon = "";
                return;
            } else {
                this.activity_half_icon = str3;
                return;
            }
        }
        this.activity_id = builder.activity_id;
        this.activity_type = builder.activity_type;
        this.activity_url = builder.activity_url;
        this.activity_all_icon = builder.activity_all_icon;
        this.activity_half_icon = builder.activity_half_icon;
    }
}
