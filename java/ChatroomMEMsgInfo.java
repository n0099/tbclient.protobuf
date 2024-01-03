package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChatroomMEMsgInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FROM_NAME = "";
    public static final Long DEFAULT_FROM_UID = 0L;
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final Long DEFAULT_MSG_TIME = 0L;
    public static final String DEFAULT_SPECIAL_MSG = "";
    public static final String DEFAULT_SPECIAL_MSG_TYPE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String from_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long from_uid;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long msg_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long msg_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String special_msg;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String special_msg_type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatroomMEMsgInfo> {
        public String content;
        public String from_name;
        public Long from_uid;
        public Long msg_id;
        public Long msg_time;
        public String special_msg;
        public String special_msg_type;

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
            this.special_msg = chatroomMEMsgInfo.special_msg;
            this.special_msg_type = chatroomMEMsgInfo.special_msg_type;
            this.msg_time = chatroomMEMsgInfo.msg_time;
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
            } else {
                this.msg_id = l2;
            }
            String str3 = builder.special_msg;
            if (str3 == null) {
                this.special_msg = "";
            } else {
                this.special_msg = str3;
            }
            String str4 = builder.special_msg_type;
            if (str4 == null) {
                this.special_msg_type = "";
            } else {
                this.special_msg_type = str4;
            }
            Long l3 = builder.msg_time;
            if (l3 == null) {
                this.msg_time = DEFAULT_MSG_TIME;
                return;
            } else {
                this.msg_time = l3;
                return;
            }
        }
        this.from_uid = builder.from_uid;
        this.from_name = builder.from_name;
        this.content = builder.content;
        this.msg_id = builder.msg_id;
        this.special_msg = builder.special_msg;
        this.special_msg_type = builder.special_msg_type;
        this.msg_time = builder.msg_time;
    }
}
