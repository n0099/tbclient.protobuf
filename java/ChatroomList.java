package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChatroomList extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 5)
    public final ChatRoomAtInfo at_info;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_subscribe;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 3)
    public final ChatroomMEMsgInfo msg_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long room_id;
    @ProtoField(tag = 2)
    public final ChatroomInfoBasic room_info;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Integer DEFAULT_IS_SUBSCRIBE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatroomList> {
        public ChatRoomAtInfo at_info;
        public Integer is_subscribe;
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
            this.is_subscribe = chatroomList.is_subscribe;
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
            Integer num = builder.is_subscribe;
            if (num == null) {
                this.is_subscribe = DEFAULT_IS_SUBSCRIBE;
                return;
            } else {
                this.is_subscribe = num;
                return;
            }
        }
        this.room_id = builder.room_id;
        this.room_info = builder.room_info;
        this.msg_info = builder.msg_info;
        this.jump_url = builder.jump_url;
        this.at_info = builder.at_info;
        this.is_subscribe = builder.is_subscribe;
    }
}
