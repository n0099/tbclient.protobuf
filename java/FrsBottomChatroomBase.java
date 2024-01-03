package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FrsBottomChatroomBase extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer display_chatroom_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long mid_group_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long online_nums;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ChatroomList> room_list;
    public static final List<ChatroomList> DEFAULT_ROOM_LIST = Collections.emptyList();
    public static final Long DEFAULT_MID_GROUP_ID = 0L;
    public static final Integer DEFAULT_DISPLAY_CHATROOM_COUNT = 0;
    public static final Long DEFAULT_ONLINE_NUMS = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsBottomChatroomBase> {
        public Integer display_chatroom_count;
        public Long mid_group_id;
        public Long online_nums;
        public List<ChatroomList> room_list;

        public Builder() {
        }

        public Builder(FrsBottomChatroomBase frsBottomChatroomBase) {
            super(frsBottomChatroomBase);
            if (frsBottomChatroomBase == null) {
                return;
            }
            this.room_list = Message.copyOf(frsBottomChatroomBase.room_list);
            this.mid_group_id = frsBottomChatroomBase.mid_group_id;
            this.display_chatroom_count = frsBottomChatroomBase.display_chatroom_count;
            this.online_nums = frsBottomChatroomBase.online_nums;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsBottomChatroomBase build(boolean z) {
            return new FrsBottomChatroomBase(this, z);
        }
    }

    public FrsBottomChatroomBase(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ChatroomList> list = builder.room_list;
            if (list == null) {
                this.room_list = DEFAULT_ROOM_LIST;
            } else {
                this.room_list = Message.immutableCopyOf(list);
            }
            Long l = builder.mid_group_id;
            if (l == null) {
                this.mid_group_id = DEFAULT_MID_GROUP_ID;
            } else {
                this.mid_group_id = l;
            }
            Integer num = builder.display_chatroom_count;
            if (num == null) {
                this.display_chatroom_count = DEFAULT_DISPLAY_CHATROOM_COUNT;
            } else {
                this.display_chatroom_count = num;
            }
            Long l2 = builder.online_nums;
            if (l2 == null) {
                this.online_nums = DEFAULT_ONLINE_NUMS;
                return;
            } else {
                this.online_nums = l2;
                return;
            }
        }
        this.room_list = Message.immutableCopyOf(builder.room_list);
        this.mid_group_id = builder.mid_group_id;
        this.display_chatroom_count = builder.display_chatroom_count;
        this.online_nums = builder.online_nums;
    }
}
