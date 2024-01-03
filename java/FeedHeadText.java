package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FeedHeadText extends Message {
    public static final String DEFAULT_SUFFIX = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 9)
    public final BaseTextColor bg_color;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_degrade;
    @ProtoField(tag = 8)
    public final BaseTextColor color;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer degrade_len;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer degrade_priority;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer priority;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String suffix;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Integer DEFAULT_CAN_DEGRADE = 0;
    public static final Integer DEFAULT_DEGRADE_LEN = 0;
    public static final Integer DEFAULT_DEGRADE_PRIORITY = 0;
    public static final Integer DEFAULT_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedHeadText> {
        public BaseTextColor bg_color;
        public Integer can_degrade;
        public BaseTextColor color;
        public Integer degrade_len;
        public Integer degrade_priority;
        public Integer priority;
        public String suffix;
        public String text;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedHeadText feedHeadText) {
            super(feedHeadText);
            if (feedHeadText == null) {
                return;
            }
            this.text = feedHeadText.text;
            this.priority = feedHeadText.priority;
            this.can_degrade = feedHeadText.can_degrade;
            this.degrade_len = feedHeadText.degrade_len;
            this.degrade_priority = feedHeadText.degrade_priority;
            this.suffix = feedHeadText.suffix;
            this.type = feedHeadText.type;
            this.color = feedHeadText.color;
            this.bg_color = feedHeadText.bg_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadText build(boolean z) {
            return new FeedHeadText(this, z);
        }
    }

    public FeedHeadText(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            Integer num = builder.priority;
            if (num == null) {
                this.priority = DEFAULT_PRIORITY;
            } else {
                this.priority = num;
            }
            Integer num2 = builder.can_degrade;
            if (num2 == null) {
                this.can_degrade = DEFAULT_CAN_DEGRADE;
            } else {
                this.can_degrade = num2;
            }
            Integer num3 = builder.degrade_len;
            if (num3 == null) {
                this.degrade_len = DEFAULT_DEGRADE_LEN;
            } else {
                this.degrade_len = num3;
            }
            Integer num4 = builder.degrade_priority;
            if (num4 == null) {
                this.degrade_priority = DEFAULT_DEGRADE_PRIORITY;
            } else {
                this.degrade_priority = num4;
            }
            String str2 = builder.suffix;
            if (str2 == null) {
                this.suffix = "";
            } else {
                this.suffix = str2;
            }
            Integer num5 = builder.type;
            if (num5 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num5;
            }
            this.color = builder.color;
            this.bg_color = builder.bg_color;
            return;
        }
        this.text = builder.text;
        this.priority = builder.priority;
        this.can_degrade = builder.can_degrade;
        this.degrade_len = builder.degrade_len;
        this.degrade_priority = builder.degrade_priority;
        this.suffix = builder.suffix;
        this.type = builder.type;
        this.color = builder.color;
        this.bg_color = builder.bg_color;
    }
}
