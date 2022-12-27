package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ChatroomMEMsgInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FROM_NAME = "";
    public static final Long DEFAULT_FROM_UID = 0L;
    public static final Long DEFAULT_MSG_ID = 0L;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String from_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long from_uid;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long msg_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChatroomMEMsgInfo> {
        public String content;
        public String from_name;
        public Long from_uid;
        public Long msg_id;

        public Builder() {
        }

        public Builder(ChatroomMEMsgInfo chatroomMEMsgInfo) {
            super(chatroomMEMsgInfo);
            if (chatroomMEMsgInfo == null) {
                return;
            }
            this.from_uid = chatroomMEMsgInfo.from_uid;
            this.from_name = chatroomMEMsgInfo.from_name;
            this.content = chatroomMEMsgInfo.content;
            this.msg_id = chatroomMEMsgInfo.msg_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomMEMsgInfo build(boolean z) {
            return new ChatroomMEMsgInfo(this, z);
        }
    }

    public ChatroomMEMsgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.from_uid;
            if (l == null) {
                this.from_uid = DEFAULT_FROM_UID;
            } else {
                this.from_uid = l;
            }
            String str = builder.from_name;
            if (str == null) {
                this.from_name = "";
            } else {
                this.from_name = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            Long l2 = builder.msg_id;
            if (l2 == null) {
                this.msg_id = DEFAULT_MSG_ID;
                return;
            } else {
                this.msg_id = l2;
                return;
            }
        }
        this.from_uid = builder.from_uid;
        this.from_name = builder.from_name;
        this.content = builder.content;
        this.msg_id = builder.msg_id;
    }
}
