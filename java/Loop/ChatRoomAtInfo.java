package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ChatRoomAtInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer at_all_msg_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<AtMsgBase> at_all_msg_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer at_count_all;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer at_single_msg_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<AtMsgBase> at_single_msg_list;
    public static final Integer DEFAULT_AT_COUNT_ALL = 0;
    public static final Integer DEFAULT_AT_ALL_MSG_COUNT = 0;
    public static final Integer DEFAULT_AT_SINGLE_MSG_COUNT = 0;
    public static final List<AtMsgBase> DEFAULT_AT_ALL_MSG_LIST = Collections.emptyList();
    public static final List<AtMsgBase> DEFAULT_AT_SINGLE_MSG_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatRoomAtInfo> {
        public Integer at_all_msg_count;
        public List<AtMsgBase> at_all_msg_list;
        public Integer at_count_all;
        public Integer at_single_msg_count;
        public List<AtMsgBase> at_single_msg_list;

        public Builder() {
        }

        public Builder(ChatRoomAtInfo chatRoomAtInfo) {
            super(chatRoomAtInfo);
            if (chatRoomAtInfo == null) {
                return;
            }
            this.at_count_all = chatRoomAtInfo.at_count_all;
            this.at_all_msg_count = chatRoomAtInfo.at_all_msg_count;
            this.at_single_msg_count = chatRoomAtInfo.at_single_msg_count;
            this.at_all_msg_list = Message.copyOf(chatRoomAtInfo.at_all_msg_list);
            this.at_single_msg_list = Message.copyOf(chatRoomAtInfo.at_single_msg_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatRoomAtInfo build(boolean z) {
            return new ChatRoomAtInfo(this, z);
        }
    }

    public ChatRoomAtInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.at_count_all;
            if (num == null) {
                this.at_count_all = DEFAULT_AT_COUNT_ALL;
            } else {
                this.at_count_all = num;
            }
            Integer num2 = builder.at_all_msg_count;
            if (num2 == null) {
                this.at_all_msg_count = DEFAULT_AT_ALL_MSG_COUNT;
            } else {
                this.at_all_msg_count = num2;
            }
            Integer num3 = builder.at_single_msg_count;
            if (num3 == null) {
                this.at_single_msg_count = DEFAULT_AT_SINGLE_MSG_COUNT;
            } else {
                this.at_single_msg_count = num3;
            }
            List<AtMsgBase> list = builder.at_all_msg_list;
            if (list == null) {
                this.at_all_msg_list = DEFAULT_AT_ALL_MSG_LIST;
            } else {
                this.at_all_msg_list = Message.immutableCopyOf(list);
            }
            List<AtMsgBase> list2 = builder.at_single_msg_list;
            if (list2 == null) {
                this.at_single_msg_list = DEFAULT_AT_SINGLE_MSG_LIST;
                return;
            } else {
                this.at_single_msg_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.at_count_all = builder.at_count_all;
        this.at_all_msg_count = builder.at_all_msg_count;
        this.at_single_msg_count = builder.at_single_msg_count;
        this.at_all_msg_list = Message.immutableCopyOf(builder.at_all_msg_list);
        this.at_single_msg_list = Message.immutableCopyOf(builder.at_single_msg_list);
    }
}
