package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class User_Pic extends Message {
    public static final String DEFAULT_BIG = "";
    public static final String DEFAULT_SMALL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String big;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String small;

    private User_Pic(Builder builder, boolean z) {
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<User_Pic> {
        public String big;
        public String small;

        public Builder() {
        }

        public Builder(User_Pic user_Pic) {
            super(user_Pic);
            if (user_Pic != null) {
                this.big = user_Pic.big;
                this.small = user_Pic.small;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User_Pic build(boolean z) {
            return new User_Pic(this, z);
        }
    }
}
