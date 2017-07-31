package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SignInfo extends Message {
    @ProtoField(tag = 2)
    public final SignForum forum_info;
    @ProtoField(tag = 1)
    public final SignUser user_info;

    private SignInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.forum_info = builder.forum_info;
            return;
        }
        this.user_info = builder.user_info;
        this.forum_info = builder.forum_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SignInfo> {
        public SignForum forum_info;
        public SignUser user_info;

        public Builder() {
        }

        public Builder(SignInfo signInfo) {
            super(signInfo);
            if (signInfo != null) {
                this.user_info = signInfo.user_info;
                this.forum_info = signInfo.forum_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignInfo build(boolean z) {
            return new SignInfo(this, z);
        }
    }
}
