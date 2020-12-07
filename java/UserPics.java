package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class UserPics extends Message {
    public static final String DEFAULT_BIG = "";
    public static final String DEFAULT_SMALL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String big;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String small;

    private UserPics(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.big == null) {
                this.big = "";
            } else {
                this.big = builder.big;
            }
            if (builder.small == null) {
                this.small = "";
                return;
            } else {
                this.small = builder.small;
                return;
            }
        }
        this.big = builder.big;
        this.small = builder.small;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<UserPics> {
        public String big;
        public String small;

        public Builder() {
        }

        public Builder(UserPics userPics) {
            super(userPics);
            if (userPics != null) {
                this.big = userPics.big;
                this.small = userPics.small;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPics build(boolean z) {
            return new UserPics(this, z);
        }
    }
}
