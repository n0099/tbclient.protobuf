package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FeedContentColor extends Message {
    public static final String DEFAULT_DAY = "";
    public static final String DEFAULT_NIGHT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String day;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String night;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeedContentColor> {
        public String day;
        public String night;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedContentColor feedContentColor) {
            super(feedContentColor);
            if (feedContentColor == null) {
                return;
            }
            this.type = feedContentColor.type;
            this.day = feedContentColor.day;
            this.night = feedContentColor.night;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedContentColor build(boolean z) {
            return new FeedContentColor(this, z);
        }
    }

    public FeedContentColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.day;
            if (str == null) {
                this.day = "";
            } else {
                this.day = str;
            }
            String str2 = builder.night;
            if (str2 == null) {
                this.night = "";
                return;
            } else {
                this.night = str2;
                return;
            }
        }
        this.type = builder.type;
        this.day = builder.day;
        this.night = builder.night;
    }
}
