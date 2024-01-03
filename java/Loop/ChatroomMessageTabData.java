package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChatroomMessageTabData extends Message {
    public static final Boolean DEFAULT_HAVE_NEW_MSG = Boolean.FALSE;
    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public final Boolean have_new_msg;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatroomMessageTabData> {
        public Boolean have_new_msg;

        public Builder() {
        }

        public Builder(ChatroomMessageTabData chatroomMessageTabData) {
            super(chatroomMessageTabData);
            if (chatroomMessageTabData == null) {
                return;
            }
            this.have_new_msg = chatroomMessageTabData.have_new_msg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomMessageTabData build(boolean z) {
            return new ChatroomMessageTabData(this, z);
        }
    }

    public ChatroomMessageTabData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Boolean bool = builder.have_new_msg;
            if (bool == null) {
                this.have_new_msg = DEFAULT_HAVE_NEW_MSG;
                return;
            } else {
                this.have_new_msg = bool;
                return;
            }
        }
        this.have_new_msg = builder.have_new_msg;
    }
}
