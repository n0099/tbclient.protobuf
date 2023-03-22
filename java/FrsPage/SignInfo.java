package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ChatroomSignInfo;
/* loaded from: classes9.dex */
public final class SignInfo extends Message {
    public static final Integer DEFAULT_HAS_CHATROOM_SIGN = 0;
    @ProtoField(tag = 4)
    public final ChatroomSignInfo chatroom_sign_info;
    @ProtoField(tag = 2)
    public final SignForum forum_info;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_chatroom_sign;
    @ProtoField(tag = 1)
    public final SignUser user_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SignInfo> {
        public ChatroomSignInfo chatroom_sign_info;
        public SignForum forum_info;
        public Integer has_chatroom_sign;
        public SignUser user_info;

        public Builder() {
        }

        public Builder(SignInfo signInfo) {
            super(signInfo);
            if (signInfo == null) {
                return;
            }
            this.user_info = signInfo.user_info;
            this.forum_info = signInfo.forum_info;
            this.has_chatroom_sign = signInfo.has_chatroom_sign;
            this.chatroom_sign_info = signInfo.chatroom_sign_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignInfo build(boolean z) {
            return new SignInfo(this, z);
        }
    }

    public SignInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.forum_info = builder.forum_info;
            Integer num = builder.has_chatroom_sign;
            if (num == null) {
                this.has_chatroom_sign = DEFAULT_HAS_CHATROOM_SIGN;
            } else {
                this.has_chatroom_sign = num;
            }
            this.chatroom_sign_info = builder.chatroom_sign_info;
            return;
        }
        this.user_info = builder.user_info;
        this.forum_info = builder.forum_info;
        this.has_chatroom_sign = builder.has_chatroom_sign;
        this.chatroom_sign_info = builder.chatroom_sign_info;
    }
}
