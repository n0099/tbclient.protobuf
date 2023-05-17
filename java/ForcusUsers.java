package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForcusUsers extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForcusUsers> {
        public String portrait;
        public Long thread_id;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(ForcusUsers forcusUsers) {
            super(forcusUsers);
            if (forcusUsers == null) {
                return;
            }
            this.thread_id = forcusUsers.thread_id;
            this.user_name = forcusUsers.user_name;
            this.user_id = forcusUsers.user_id;
            this.portrait = forcusUsers.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForcusUsers build(boolean z) {
            return new ForcusUsers(this, z);
        }
    }

    public ForcusUsers(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str2;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.portrait = builder.portrait;
    }
}
