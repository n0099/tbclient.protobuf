package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class ProfileResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ ProfileResIdl(Builder builder, boolean z, ProfileResIdl profileResIdl) {
        this(builder, z);
    }

    private ProfileResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ProfileResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ProfileResIdl profileResIdl) {
            super(profileResIdl);
            if (profileResIdl != null) {
                this.error = profileResIdl.error;
                this.data = profileResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ProfileResIdl build(boolean z) {
            return new ProfileResIdl(this, z, null);
        }
    }
}
