package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BubbleInfo extends Message {
    public static final Integer DEFAULT_BUBBLE_ID = 0;
    public static final String DEFAULT_BUBBLE_PIC = "";
    public static final String DEFAULT_BUBBLE_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer bubble_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bubble_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bubble_text;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BubbleInfo> {
        public Integer bubble_id;
        public String bubble_pic;
        public String bubble_text;

        public Builder() {
        }

        public Builder(BubbleInfo bubbleInfo) {
            super(bubbleInfo);
            if (bubbleInfo == null) {
                return;
            }
            this.bubble_id = bubbleInfo.bubble_id;
            this.bubble_text = bubbleInfo.bubble_text;
            this.bubble_pic = bubbleInfo.bubble_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BubbleInfo build(boolean z) {
            return new BubbleInfo(this, z);
        }
    }

    public BubbleInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.bubble_id;
            if (num == null) {
                this.bubble_id = DEFAULT_BUBBLE_ID;
            } else {
                this.bubble_id = num;
            }
            String str = builder.bubble_text;
            if (str == null) {
                this.bubble_text = "";
            } else {
                this.bubble_text = str;
            }
            String str2 = builder.bubble_pic;
            if (str2 == null) {
                this.bubble_pic = "";
                return;
            } else {
                this.bubble_pic = str2;
                return;
            }
        }
        this.bubble_id = builder.bubble_id;
        this.bubble_text = builder.bubble_text;
        this.bubble_pic = builder.bubble_pic;
    }
}
