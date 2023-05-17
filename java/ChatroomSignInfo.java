package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ChatroomSignInfo extends Message {
    public static final Long DEFAULT_CHATROOM_ID = 0L;
    public static final String DEFAULT_GUIDE_TEXT = "";
    public static final String DEFAULT_JUMP_SCHEME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long chatroom_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String guide_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_scheme;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ChatroomSignInfo> {
        public Long chatroom_id;
        public String guide_text;
        public String jump_scheme;

        public Builder() {
        }

        public Builder(ChatroomSignInfo chatroomSignInfo) {
            super(chatroomSignInfo);
            if (chatroomSignInfo == null) {
                return;
            }
            this.chatroom_id = chatroomSignInfo.chatroom_id;
            this.jump_scheme = chatroomSignInfo.jump_scheme;
            this.guide_text = chatroomSignInfo.guide_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomSignInfo build(boolean z) {
            return new ChatroomSignInfo(this, z);
        }
    }

    public ChatroomSignInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.chatroom_id;
            if (l == null) {
                this.chatroom_id = DEFAULT_CHATROOM_ID;
            } else {
                this.chatroom_id = l;
            }
            String str = builder.jump_scheme;
            if (str == null) {
                this.jump_scheme = "";
            } else {
                this.jump_scheme = str;
            }
            String str2 = builder.guide_text;
            if (str2 == null) {
                this.guide_text = "";
                return;
            } else {
                this.guide_text = str2;
                return;
            }
        }
        this.chatroom_id = builder.chatroom_id;
        this.jump_scheme = builder.jump_scheme;
        this.guide_text = builder.guide_text;
    }
}
