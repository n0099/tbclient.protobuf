package tbclient.Cailist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class CaiUser extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CaiUser> {
        public String portrait;
        public String user_name;

        public Builder() {
        }

        public Builder(CaiUser caiUser) {
            super(caiUser);
            if (caiUser == null) {
                return;
            }
            this.user_name = caiUser.user_name;
            this.portrait = caiUser.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CaiUser build(boolean z) {
            return new CaiUser(this, z);
        }
    }

    public CaiUser(Builder builder, boolean z) {
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
                return;
            } else {
                this.portrait = str2;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
    }
}
