package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ChatroomFrsRes extends Message {
    public static final List<Long> DEFAULT_HOT_LIST = Collections.emptyList();
    public static final List<ChatroomList> DEFAULT_ROOM_LIST = Collections.emptyList();
    @ProtoField(tag = 3)
    public final ChatroomGuide guide_config;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.INT64)
    public final List<Long> hot_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ChatroomList> room_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChatroomFrsRes> {
        public ChatroomGuide guide_config;
        public List<Long> hot_list;
        public List<ChatroomList> room_list;

        public Builder() {
        }

        public Builder(ChatroomFrsRes chatroomFrsRes) {
            super(chatroomFrsRes);
            if (chatroomFrsRes == null) {
                return;
            }
            this.hot_list = Message.copyOf(chatroomFrsRes.hot_list);
            this.room_list = Message.copyOf(chatroomFrsRes.room_list);
            this.guide_config = chatroomFrsRes.guide_config;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomFrsRes build(boolean z) {
            return new ChatroomFrsRes(this, z);
        }
    }

    public ChatroomFrsRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Long> list = builder.hot_list;
            if (list == null) {
                this.hot_list = DEFAULT_HOT_LIST;
            } else {
                this.hot_list = Message.immutableCopyOf(list);
            }
            List<ChatroomList> list2 = builder.room_list;
            if (list2 == null) {
                this.room_list = DEFAULT_ROOM_LIST;
            } else {
                this.room_list = Message.immutableCopyOf(list2);
            }
            this.guide_config = builder.guide_config;
            return;
        }
        this.hot_list = Message.immutableCopyOf(builder.hot_list);
        this.room_list = Message.immutableCopyOf(builder.room_list);
        this.guide_config = builder.guide_config;
    }
}
