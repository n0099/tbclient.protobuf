package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FeedContentIcon extends Message {
    public static final String DEFAULT_DAY_URL = "";
    public static final String DEFAULT_NIGHT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String day_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String night_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedContentIcon> {
        public String day_url;
        public Integer height;
        public String night_url;
        public Integer width;

        public Builder() {
        }

        public Builder(FeedContentIcon feedContentIcon) {
            super(feedContentIcon);
            if (feedContentIcon == null) {
                return;
            }
            this.day_url = feedContentIcon.day_url;
            this.night_url = feedContentIcon.night_url;
            this.width = feedContentIcon.width;
            this.height = feedContentIcon.height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedContentIcon build(boolean z) {
            return new FeedContentIcon(this, z);
        }
    }

    public FeedContentIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.day_url;
            if (str == null) {
                this.day_url = "";
            } else {
                this.day_url = str;
            }
            String str2 = builder.night_url;
            if (str2 == null) {
                this.night_url = "";
            } else {
                this.night_url = str2;
            }
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
                return;
            } else {
                this.height = num2;
                return;
            }
        }
        this.day_url = builder.day_url;
        this.night_url = builder.night_url;
        this.width = builder.width;
        this.height = builder.height;
    }
}
