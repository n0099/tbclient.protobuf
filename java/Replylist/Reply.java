package tbclient.Replylist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Reply extends Message {
    public static final String DEFAULT_AT_UNAME = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_CREATE_TIME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long at_uid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String at_uname;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String create_time;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_AT_UID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Reply> {
        public Long at_uid;
        public String at_uname;
        public String content;
        public String create_time;
        public Long id;
        public String portrait;
        public String user_name;

        public Builder() {
        }

        public Builder(Reply reply) {
            super(reply);
            if (reply == null) {
                return;
            }
            this.user_name = reply.user_name;
            this.portrait = reply.portrait;
            this.content = reply.content;
            this.create_time = reply.create_time;
            this.id = reply.id;
            this.at_uid = reply.at_uid;
            this.at_uname = reply.at_uname;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Reply build(boolean z) {
            return new Reply(this, z);
        }
    }

    public Reply(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            String str4 = builder.create_time;
            if (str4 == null) {
                this.create_time = "";
            } else {
                this.create_time = str4;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Long l2 = builder.at_uid;
            if (l2 == null) {
                this.at_uid = DEFAULT_AT_UID;
            } else {
                this.at_uid = l2;
            }
            String str5 = builder.at_uname;
            if (str5 == null) {
                this.at_uname = "";
                return;
            } else {
                this.at_uname = str5;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.content = builder.content;
        this.create_time = builder.create_time;
        this.id = builder.id;
        this.at_uid = builder.at_uid;
        this.at_uname = builder.at_uname;
    }
}
