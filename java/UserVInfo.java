package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class UserVInfo extends Message {
    public static final Integer DEFAULT_V_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer v_type;

    private UserVInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.v_type == null) {
                this.v_type = DEFAULT_V_TYPE;
                return;
            } else {
                this.v_type = builder.v_type;
                return;
            }
        }
        this.v_type = builder.v_type;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<UserVInfo> {
        public Integer v_type;

        public Builder() {
        }

        public Builder(UserVInfo userVInfo) {
            super(userVInfo);
            if (userVInfo != null) {
                this.v_type = userVInfo.v_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserVInfo build(boolean z) {
            return new UserVInfo(this, z);
        }
    }
}
