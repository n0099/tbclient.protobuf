package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ChatroomGuide extends Message {
    public static final Integer DEFAULT_HOT_NUM = 0;
    @ProtoField(tag = 2)
    public final ChatroomGuideConfig hot_config;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer hot_num;
    @ProtoField(tag = 3)
    public final ChatroomGuideConfig manual_config;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChatroomGuide> {
        public ChatroomGuideConfig hot_config;
        public Integer hot_num;
        public ChatroomGuideConfig manual_config;

        public Builder() {
        }

        public Builder(ChatroomGuide chatroomGuide) {
            super(chatroomGuide);
            if (chatroomGuide == null) {
                return;
            }
            this.hot_num = chatroomGuide.hot_num;
            this.hot_config = chatroomGuide.hot_config;
            this.manual_config = chatroomGuide.manual_config;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomGuide build(boolean z) {
            return new ChatroomGuide(this, z);
        }
    }

    public ChatroomGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.hot_num;
            if (num == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num;
            }
            this.hot_config = builder.hot_config;
            this.manual_config = builder.manual_config;
            return;
        }
        this.hot_num = builder.hot_num;
        this.hot_config = builder.hot_config;
        this.manual_config = builder.manual_config;
    }
}
