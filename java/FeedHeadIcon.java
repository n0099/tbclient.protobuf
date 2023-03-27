package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeedHeadIcon extends Message {
    public static final String DEFAULT_DEGRADE_URL = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer can_degrade;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer degrade_height;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer degrade_priority;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String degrade_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer degrade_width;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer priority;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Integer DEFAULT_CAN_DEGRADE = 0;
    public static final Integer DEFAULT_DEGRADE_WIDTH = 0;
    public static final Integer DEFAULT_DEGRADE_HEIGHT = 0;
    public static final Integer DEFAULT_DEGRADE_PRIORITY = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedHeadIcon> {
        public Integer can_degrade;
        public Integer degrade_height;
        public Integer degrade_priority;
        public String degrade_url;
        public Integer degrade_width;
        public Integer height;
        public Integer priority;
        public String url;
        public Integer width;

        public Builder() {
        }

        public Builder(FeedHeadIcon feedHeadIcon) {
            super(feedHeadIcon);
            if (feedHeadIcon == null) {
                return;
            }
            this.url = feedHeadIcon.url;
            this.width = feedHeadIcon.width;
            this.height = feedHeadIcon.height;
            this.priority = feedHeadIcon.priority;
            this.can_degrade = feedHeadIcon.can_degrade;
            this.degrade_url = feedHeadIcon.degrade_url;
            this.degrade_width = feedHeadIcon.degrade_width;
            this.degrade_height = feedHeadIcon.degrade_height;
            this.degrade_priority = feedHeadIcon.degrade_priority;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedHeadIcon build(boolean z) {
            return new FeedHeadIcon(this, z);
        }
    }

    public FeedHeadIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
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
            } else {
                this.height = num2;
            }
            Integer num3 = builder.priority;
            if (num3 == null) {
                this.priority = DEFAULT_PRIORITY;
            } else {
                this.priority = num3;
            }
            Integer num4 = builder.can_degrade;
            if (num4 == null) {
                this.can_degrade = DEFAULT_CAN_DEGRADE;
            } else {
                this.can_degrade = num4;
            }
            String str2 = builder.degrade_url;
            if (str2 == null) {
                this.degrade_url = "";
            } else {
                this.degrade_url = str2;
            }
            Integer num5 = builder.degrade_width;
            if (num5 == null) {
                this.degrade_width = DEFAULT_DEGRADE_WIDTH;
            } else {
                this.degrade_width = num5;
            }
            Integer num6 = builder.degrade_height;
            if (num6 == null) {
                this.degrade_height = DEFAULT_DEGRADE_HEIGHT;
            } else {
                this.degrade_height = num6;
            }
            Integer num7 = builder.degrade_priority;
            if (num7 == null) {
                this.degrade_priority = DEFAULT_DEGRADE_PRIORITY;
                return;
            } else {
                this.degrade_priority = num7;
                return;
            }
        }
        this.url = builder.url;
        this.width = builder.width;
        this.height = builder.height;
        this.priority = builder.priority;
        this.can_degrade = builder.can_degrade;
        this.degrade_url = builder.degrade_url;
        this.degrade_width = builder.degrade_width;
        this.degrade_height = builder.degrade_height;
        this.degrade_priority = builder.degrade_priority;
    }
}
