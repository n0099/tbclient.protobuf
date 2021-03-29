package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ProfileReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ProfileReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ProfileReqIdl profileReqIdl) {
            super(profileReqIdl);
            if (profileReqIdl == null) {
                return;
            }
            this.data = profileReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ProfileReqIdl build(boolean z) {
            return new ProfileReqIdl(this, z);
        }
    }

    public ProfileReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
