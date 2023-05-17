package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ChatroomList extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    public static final Long DEFAULT_ROOM_ID = 0L;
    @ProtoField(tag = 5)
    public final ChatRoomAtInfo at_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 3)
    public final ChatroomMEMsgInfo msg_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long room_id;
    @ProtoField(tag = 2)
    public final ChatroomInfoBasic room_info;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ChatroomList> {
        public ChatRoomAtInfo at_info;
        public String jump_url;
        public ChatroomMEMsgInfo msg_info;
        public Long room_id;
        public ChatroomInfoBasic room_info;

        public Builder() {
        }

        public Builder(ChatroomList chatroomList) {
            super(chatroomList);
            if (chatroomList == null) {
                return;
            }
            this.room_id = chatroomList.room_id;
            this.room_info = chatroomList.room_info;
            this.msg_info = chatroomList.msg_info;
            this.jump_url = chatroomList.jump_url;
            this.at_info = chatroomList.at_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomList build(boolean z) {
            return new ChatroomList(this, z);
        }
    }

    public ChatroomList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l;
            }
            this.room_info = builder.room_info;
            this.msg_info = builder.msg_info;
            String str = builder.jump_url;
            if (str == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str;
            }
            this.at_info = builder.at_info;
            return;
        }
        this.room_id = builder.room_id;
        this.room_info = builder.room_info;
        this.msg_info = builder.msg_info;
        this.jump_url = builder.jump_url;
        this.at_info = builder.at_info;
    }
}
