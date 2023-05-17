package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ConcernUser extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ConcernUser> {
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(ConcernUser concernUser) {
            super(concernUser);
            if (concernUser == null) {
                return;
            }
            this.user_name = concernUser.user_name;
            this.portrait = concernUser.portrait;
            this.user_id = concernUser.user_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConcernUser build(boolean z) {
            return new ConcernUser(this, z);
        }
    }

    public ConcernUser(Builder builder, boolean z) {
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
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = l;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.user_id = builder.user_id;
    }
}
