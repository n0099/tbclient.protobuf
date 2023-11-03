package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChatroomInfoBasic extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_UNREAD_NUM = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer btn_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String unread_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_BTN_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChatroomInfoBasic> {
        public String avatar;
        public Integer btn_type;
        public Long forum_id;
        public String forum_name;
        public String name;
        public String unread_num;

        public Builder() {
        }

        public Builder(ChatroomInfoBasic chatroomInfoBasic) {
            super(chatroomInfoBasic);
            if (chatroomInfoBasic == null) {
                return;
            }
            this.forum_id = chatroomInfoBasic.forum_id;
            this.forum_name = chatroomInfoBasic.forum_name;
            this.avatar = chatroomInfoBasic.avatar;
            this.name = chatroomInfoBasic.name;
            this.unread_num = chatroomInfoBasic.unread_num;
            this.btn_type = chatroomInfoBasic.btn_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomInfoBasic build(boolean z) {
            return new ChatroomInfoBasic(this, z);
        }
    }

    public ChatroomInfoBasic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            String str3 = builder.name;
            if (str3 == null) {
                this.name = "";
            } else {
                this.name = str3;
            }
            String str4 = builder.unread_num;
            if (str4 == null) {
                this.unread_num = "";
            } else {
                this.unread_num = str4;
            }
            Integer num = builder.btn_type;
            if (num == null) {
                this.btn_type = DEFAULT_BTN_TYPE;
                return;
            } else {
                this.btn_type = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.name = builder.name;
        this.unread_num = builder.unread_num;
        this.btn_type = builder.btn_type;
    }
}
